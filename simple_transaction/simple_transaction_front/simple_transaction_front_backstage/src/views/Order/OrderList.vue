<!--order的维护页面-->
<template>
  <div class="showOrder">
    <h1>订单列表</h1>
    <div>
      <span style="float: left">
        <el-input v-model="input.orderId" placeholder="请输入orderId"></el-input>
      </span>
      <span style="float: left">
        <el-button type="primary" @click="getById">查询</el-button>
      </span>
      <span style="float: right">
        <el-button type="primary" @click="clearForm();flag.flag=1;dialogFormVisible=true;">新增</el-button>
        <el-button type="primary" @click="get">获取</el-button>
        <el-button type="primary" @click="refresh">刷新</el-button>
      </span>
    </div>
    <el-table :data="hh.tableData" stripe style="width: 100%" type="index">
      <el-table-column prop="orderId" label="orderId" width="180" />
      <el-table-column prop="orderName" label="orderName" width="180" />
      <el-table-column prop="orderTime" label="orderTime" width="180" />
      <el-table-column prop="shopId" label="shopId" width="180" />
      <el-table-column label="operations">
        <template v-slot="scope">
          <el-button size="small" @click="key.key=scope.$index;initialForm();flag.flag=0;dialogFormVisible=true">edit</el-button>
          <el-button type="danger" size="small" @click="key.key=scope.$index;remove(key.key)"> delete</el-button>
        </template>
      </el-table-column>
    </el-table>
  </div>
  <el-dialog v-model="dialogFormVisible" title="增加/修改订单信息">
    <el-form :model="form">
      <el-form-item label="Order name" label-width="140px">
        <el-input v-model="form.orderName" autocomplete="off"/>
      </el-form-item>
      <el-form-item label="Order time" label-width="140px">
        <el-input v-model="form.orderTime" autocomplete="off"/>
      </el-form-item>
      <el-form-item label="Shop id" label-width="140px">
        <el-input v-model="form.shopId" autocomplete="off"/>
      </el-form-item>
    </el-form>
    <template #footer>
      <span>
        <el-button @click="dialogFormVisible=false;get()">Cancel</el-button>
        <el-button type="primary" @click="dialogFormVisible=false;addOrEdit(key.key)">Confirm</el-button>
      </span>
    </template>
  </el-dialog>
</template>

<script setup>
//导入所需组件
import {getCurrentInstance, reactive, ref} from "vue"
//获取当前Vue实例
const {proxy} = getCurrentInstance()
//将window对象赋给hh，供在template中使用
let hh = window
//el-table展示数据的载体
window.tableData = []
//add/edit的标志位
let flag = reactive({
  flag: 0
})
//查询输入框的数据载体
let input = reactive({
  orderId: undefined
})
//el-table的row标志
let key = reactive({
  key: 0
})
//el-dialog是否显示的数据载体
let dialogFormVisible = ref(false)
//创建可交互的表单数据载体
const form = reactive({
  orderName: '',
  orderTime: '',
  shopId: undefined
})
//刷新按钮对应的事件
const refresh = ()=> {
  console.log('页面刷新，重新渲染！')
  //强制进行页面刷新
  proxy.$forceUpdate()
}
//获取按钮对应的事件
const get = ()=>{
  proxy.$http.get('/order').then((response) => {
    if (response.data.data) {
      console.log('获取订单信息成功，为：')
      console.log(response.data.data)
      window.tableData = response.data.data
      refresh()
    } else {
      window.alert("获取订单信息失败!")
    }
  }).catch( ()=>{

  })
}
//delete按钮对应的事件
const remove = (row)=>{
  proxy.$http.delete('/order/'+hh.tableData[row].orderId).then((response)=>{
    if(response.data.data){
      console.log('删除订单信息成功，orderId为：'+response.data.data)
      get()
      refresh()
    }else{
      window.alert('删除订单信息失败！');
    }
  }).catch(()=>{

  })
}
//初始化form操作，用于edit时获取初始值
const initialForm = ()=>{
  proxy.$http.get('/order/'+hh.tableData[key.key].orderId).then((response)=>{
    if(response.data.data){
      window.tableData = [response.data.data]
      form.orderName = window.tableData[0].orderName
      form.orderTime = window.tableData[0].orderTime
      form.shopId = window.tableData[0].shopId
      get()
    }else {
      window.alert('查询订单信息失败！')
    }
  }).catch(()=>{

  })
}
//格式化form操作，用于add时清空初始值
const clearForm = ()=>{
  form.orderName = ''
  form.orderTime = ''
  form.shopId = undefined
}
//confirm按钮对应的事件：即为add和edit对应的事件
const addOrEdit = (row)=>{
  //flag为1，对应add操作
  if(flag.flag === 1){
    proxy.$http.post('/order',{
      orderName: form.orderName,
      orderTime: form.orderTime,
      shopId: form.shopId
    }).then((response)=>{
      if(response.data.data){
        console.log('增加订单信息成功，为：')
        console.log(response.data.data)
        get()
        refresh()
      }else{
        window.alert('增加订单信息失败！')
      }
    }).catch(()=>{

    })
  }
  //flag为0，对应edit操作
  else if(flag.flag === 0){
    proxy.$http.put('/order/'+hh.tableData[row].orderId,{
      orderName: form.orderName,
      orderTime: form.orderTime,
      shopId: form.shopId
    }).then((response)=>{
      if(response.data.data){
        console.log('修改订单信息成功，为：')
        console.log(response.data.data)
        get()
        refresh()
      }else{
        window.alert('修改订单信息失败！')
      }
    }).catch(()=>{

    })
  }
}
//查询按钮对应的事件
const getById = ()=>{
  if(input.orderId === undefined){
    input.orderId = -1
  }
  proxy.$http.get('/order/'+input.orderId).then((response) => {
    console.log(response.data)
    if (response.data.data) {
      console.log('查询订单信息成功，为：')
      console.log(response.data.data)
      window.tableData = [response.data.data]
      refresh()
    } else {
      window.alert("查询订单信息失败!")
    }
    input.orderId = undefined
  }).catch( ()=>{

  })
}
//执行get(),为页面数据获取初始值
get()
</script>

<style>
.showOrder {
  width: 857px;
  margin: 0 auto;
}
</style>