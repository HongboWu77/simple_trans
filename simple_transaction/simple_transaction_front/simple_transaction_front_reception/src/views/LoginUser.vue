<template>
  <div class="w">
    <header>
      <div class="logo">
        <a href="/"><img src="./images/logo.png" alt=""></a>
      </div>
    </header>
    <div class="registerarea">
      <h3>
        用户登录
        <div class="login">
          没有账号，去<a href="/registry" class="style_red">注册</a>
        </div>
      </h3>
      <div class="red_form">
        <form action="">
          <ul>
            <li>
              <label for="phone_number">用户名：</label>
              <input type="text" id="phone_number" class="inp" v-model="form.id">
              <span class="error">
                <i class="error_icon"></i>
                用户名格式不正确，请重新输入
              </span>
            </li>
            <li>
              <label for="re_secret">密码：</label>
              <input type="password" id="re_secret" class="inp" v-model="form.password">
              <span class="error">
                <i class="error_icon"></i>
                密码格式不正确，请重新输入
              </span>
            </li>
            <li class="agree">
              <input type="checkbox" name="" id="" >
              同意协议并登录
              <a href="#">《知晓用户协议》</a>
            </li>
            <li>
              <input type="button" value="登录" class="btn" v-on:click="login">
            </li>
          </ul>
        </form>
      </div>
    </div>
    <footer class="footer">
      <div class="w">
        <div class="mod_copyright">
          <div class="links">
            <a href="#">关于我们</a>  |
            <a href="#">联系我们</a>  |
            <a href="#">联系客服</a>  |
            <a href="#">商家入驻</a>  |
            <a href="#">营销中心</a>  |
            <a href="#">手机优购</a>  |
            <a href="#">友情链接</a>  |
            <a href="#">销售联盟</a>  |
            <a href="#">小白社区</a>  |
            <a href="#">小白公益</a>  |
            <a href="#">English Site</a>  |
            <a href="#">Contact U</a>
          </div>
          <div class="copyright">
            地址：云南省昆明市呈贡区 邮编：201118 电话：666-666-666
            传真：666-66666666 邮箱: whb@ynu.edu.com<br/>
            京ICP备********号京公网安备************
          </div>
        </div>
      </div>
    </footer>
  </div>
</template>

<script setup>
import {getCurrentInstance, reactive} from "vue";

let form = reactive({
  id: '',
  password: ''
})
const {proxy} = getCurrentInstance()
const login = ()=>{
  proxy.$http.post('/login',{
    userId:form.id,
    userPassword:form.password
  }).then(function(response){
    if(response.data.data === 1){
      //登陆成功的处理
      console.log("登陆成功，进行路由切换:/")
      window.alert("登陆成功！")
      //进行路由切换
      proxy.$router.push({
        path: '/',
        query: {
          login_status: 'login'
        }
      })
    }else{
      console.log(response.data.data)
      console.log("登陆失败，Id或密码错误！")
      window.alert("登陆失败，Id或密码错误！")
    }
  }).catch(function (){

  });
}
</script>

<style scoped>
@import './css/register.css';
@import './css/base.css';
</style>