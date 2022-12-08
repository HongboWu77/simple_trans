<!--登录页面-->
<template>
  <el-form :model="form" label-width="120px">
    <div class="login">
      <el-form-item label="User Id">
        <el-input v-model="form.id" />
      </el-form-item>
      <el-form-item label="User password">
        <el-input type="password" v-model="form.password"></el-input>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" v-on:click="onSubmit">Login</el-button>
        <el-button>Cancel</el-button>
        <el-button v-on:click="Registry">Registry</el-button>
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
  id: '',
  password: ''
});
//登录按钮对应的事件
const onSubmit = ()=>{
  //向服务器提交登录请求
  proxy.$http.post('/login',{
    userId:form.id,
    userPassword:form.password
  }).then(function (response){
    if(response.data.data === 1){
      //登陆成功的处理
      console.log("登陆成功，进行路由切换:/userget")
      window.alert("登陆成功！")
      //进行路由切换
      proxy.$router.push({
        path: '/userget'
      })
    }else{
      //登陆失败的处理
      console.log(response.data.data)
      console.log("登陆失败，Id或密码错误！")
      window.alert("登陆失败，Id或密码错误！")
    }
  }).catch(function (){

  });
}
//注册按钮的对应事件
const Registry = ()=>{
  //进行路由切换
  proxy.$router.push({
    path: '/registry'
  })
};
</script>

<style>
.login {
  width: 400px;
  margin: 0 auto;
}
</style>