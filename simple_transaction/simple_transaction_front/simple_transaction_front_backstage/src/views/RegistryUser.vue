<!--注册页面-->
<template>
  <el-form :model="form" label-width="120px">
    <div class="registry">
      <el-form-item label="User name">
        <el-input v-model="form.name" />
      </el-form-item>
      <el-form-item label="User password">
        <el-input type="password" v-model="form.password"></el-input>
      </el-form-item>
      <el-form-item label="User sex">
        <el-radio-group v-model="form.resource">
          <el-radio label="Male" />
          <el-radio label="Female" />
        </el-radio-group>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="onSubmit">Create</el-button>
        <el-button>Cancel</el-button>
      </el-form-item>
    </div>
  </el-form>
</template>

<script setup>
//导入所需组件
import {getCurrentInstance, reactive} from 'vue'
//获取当前Vue实例
const {proxy} = getCurrentInstance()
//创建可交互表单数据载体
const form = reactive({
  name: '',
  password: '',
  sex: ''
})
//注册按钮对应的时间
const onSubmit = () => {
  //向服务器提交注册请求：本质为增加用户
  proxy.$http.post('/user',{
    userName: form.name,
    userPassword: form.password,
    userSex: form.sex
  }).then(function (response){
    if(response.data.data){
      //注册成功的处理
      console.log(response.data.data)
      window.alert('注册成功，id如下：'+response.data.data.userId)
      //进行路由切换
      proxy.$router.push({
        path: '/userget'
      })
    }else{
      //注册失败的处理
      window.alert('注册失败！')
    }
  }).catch(function (){

  })
}
</script>

<style>
.registry {
  width: 400px;
  margin: 0 auto;
}
</style>