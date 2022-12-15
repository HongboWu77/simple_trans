<template>
  <div class="w">
    <header>
      <div class="logo">
        <a href="/"><img src="./images/logo.png" alt=""></a>
      </div>
    </header>
    <div class="registerarea">
      <h3>
        注册新用户
        <div class="login">
          我有账号，去<a href="/login" class="style_red">登录</a>
        </div>
      </h3>
      <div class="red_form">
        <form action="">
          <ul>
            <li>
              <label for="phone_number">手机号：</label>
              <input type="text" id="phone_number" class="inp">
              <span class="error">
                            <i class="error_icon"></i>
                            手机号码格式不正确，请重新输入
                        </span>
            </li>
            <li>
              <label for="check_number">短信验证码：</label>
              <input type="text" id="check_number" class="inp">
              <span class="success">
                            <i class="success_icon"></i>
                            短信验证码输入正确
                        </span>
            </li>
            <li>
              <label for="secret">登陆密码：</label>
              <input type="password" id="secret" class="inp">
              <span class="error">
                            <i class="error_icon"></i>
                            密码格式不正确，请重新输入
                        </span>
            </li>
            <li class="safe">
              安全程度
              <em class="ruo">弱</em>
              <em class="zhong">中</em>
              <em class="qiang">强</em>
            </li>
            <li>
              <label for="re_secret">确认密码：</label>
              <input type="password" id="re_secret" class="inp">
              <span class="error">
                            <i class="error_icon"></i>
                            确认密码格式不正确，请重新输入
                        </span>
            </li>
            <li class="agree">
              <input type="checkbox" name="" id="" >
              同意协议并注册
              <a href="#">《知晓用户协议》</a>
            </li>
            <li>
              <input type="button" value="完成注册" class="btn" v-on:click="registry">
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
import {getCurrentInstance} from "vue";

const {proxy} = getCurrentInstance()
const registry = ()=>{
  proxy.$router.push({
    path: '/'
  })
}
</script>

<style scoped>
  @import './css/register.css';
  @import './css/base.css';
</style>