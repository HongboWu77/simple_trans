<template>
  <!--快捷导航模块 start-->
  <section class="shortcut">
    <div class="w">
      <div class="fl">
        <ul>
          <li>小白之家欢迎您！&nbsp;</li>
          <li v-if="login_status.login_status==='layout'">
            <a href="/login">请登录&nbsp;</a>
            <a href="/registry" class="style-red">免费注册</a>
            <a href="/">&nbsp;&nbsp;&nbsp;退回首页</a>
          </li>
          <li v-if="login_status.login_status==='login'">
            <a href="#">{{ login_status.login_name }}&nbsp;&nbsp;&nbsp;</a>
            <button v-on:click="layout" class="style-red" style="font-size:10px">退出登录</button>
            <a href="" v-on:click="trans">&nbsp;&nbsp;&nbsp;退回首页</a>
          </li>
        </ul>
      </div>
      <div class="fr">
        <ul>
          <li><a href="#">我的订单</a></li>
          <li></li>
          <li class="arrow-icon"><a href="#">我的小白</a></li>
          <li></li>
          <li><a href="#">小白会员</a></li>
          <li></li>
          <li><a href="#">企业采购</a></li>
          <li></li>
          <li class="arrow-icon"><a href="#">关注小白</a></li>
          <li></li>
          <li class="arrow-icon"><a href="#">客户服务</a></li>
          <li></li>
          <li class="arrow-icon"><a href="#">网站导航</a></li>
        </ul>
      </div>
    </div>
  </section>
  <!--快捷导航模块 end-->

  <!--header头部模块 start-->
  <header class="header w">
    <div class="logo">
      <h1>
        <a href="#" title="小白之家">小白之家</a>
      </h1>
    </div>
    <div class="sk">
      <img src="./images/sk.png" alt="">
    </div>
    <div class="search">
      <input type="search" name="" id="" placeholder="语言开发">
      <button>搜索</button>
    </div>
    <div class="hotwords">
      <ul>
        <li><a href="#" class="style-red">小白首发</a></li>
        <li><a href="#">亿元优惠</a></li>
        <li><a href="#">9.9元团购</a></li>
        <li><a href="#">每满99减30</a></li>
        <li><a href="#">办公用品</a></li>
        <li><a href="#">电脑</a></li>
        <li><a href="#">通信</a></li>
      </ul>
    </div>
    <div class="shopcar">
      <a href="#">我的购物车</a>
      <i class="count">88</i>
    </div>
  </header>
  <!--header头部模块 end-->

  <!--nav模块 start-->
  <nav class="nav">
    <div class="w">
      <div class="sk_list">
        <ul>
          <li><a href="#">小白秒杀</a></li>
          <li><a href="#">小白秒杀</a></li>
          <li><a href="#">小白秒杀</a></li>
        </ul>
      </div>
      <div class="sk_con">
        <ul>
          <li><a href="#">女装</a></li>
          <li><a href="#" class="style-red">女鞋</a></li>
          <li><a href="#">女装</a></li>
          <li><a href="#">女装</a></li>
          <li><a href="#">女装</a></li>
          <li><a href="#">女装</a></li>
          <li><a href="#">女装</a></li>
          <li><a href="#">女装</a></li>
          <li><a href="#">更多分类</a></li>
        </ul>
      </div>
    </div>
  </nav>
  <!--nav模块 end-->

  <!--sk_container列表页 start-->
  <div class="sk_container w">
    <div class="sk_hd">
      <img src="./upload/bg_03.png" alt="">
    </div>
    <div class="sk_bd">
      <ul class="clearfix">
        <li><img src="./upload/list.jpg" alt=""></li>
        <li><img src="./upload/list.jpg" alt=""></li>
        <li><img src="./upload/list.jpg" alt=""></li>
        <li><img src="./upload/list.jpg" alt=""></li>
        <li><img src="./upload/list.jpg" alt=""></li>
        <li><img src="./upload/list.jpg" alt=""></li>
        <li><img src="./upload/list.jpg" alt=""></li>
        <li><img src="./upload/list.jpg" alt=""></li>
      </ul>
    </div>
  </div>
  <!--sk_container列表页 end-->

  <!--底部模块 start-->
  <footer class="footer">
    <div class="w">
      <div class="mod_service">
        <ul>
          <li>
            <h5></h5>
            <div class="service_txt">
              <h4>正品保障</h4>
              <p>正品保障，提供发票</p>
            </div>
          </li>
          <li>
            <h5></h5>
            <div class="service_txt">
              <h4>正品保障</h4>
              <p>正品保障，提供发票</p>
            </div>
          </li>
          <li>
            <h5></h5>
            <div class="service_txt">
              <h4>正品保障</h4>
              <p>正品保障，提供发票</p>
            </div>
          </li>
          <li>
            <h5></h5>
            <div class="service_txt">
              <h4>正品保障</h4>
              <p>正品保障，提供发票</p>
            </div>
          </li>
        </ul>
      </div>
      <div class="mod_help">
        <dl>
          <dt>服务指南</dt>
          <dd><a href="#">购物流程</a></dd>
          <dd><a href="#">会员介绍</a></dd>
          <dd><a href="#">生活旅游/团购</a></dd>
          <dd><a href="#">常见问题</a></dd>
          <dd><a href="#">大家电</a></dd>
          <dd><a href="#">联系客服</a></dd>
        </dl>
        <dl>
          <dt>服务指南</dt>
          <dd><a href="#">购物流程</a></dd>
          <dd><a href="#">会员介绍</a></dd>
          <dd><a href="#">生活旅游/团购</a></dd>
          <dd><a href="#">常见问题</a></dd>
          <dd><a href="#">大家电</a></dd>
          <dd><a href="#">联系客服</a></dd>
        </dl>
        <dl>
          <dt>服务指南</dt>
          <dd><a href="#">购物流程</a></dd>
          <dd><a href="#">会员介绍</a></dd>
          <dd><a href="#">生活旅游/团购</a></dd>
          <dd><a href="#">常见问题</a></dd>
          <dd><a href="#">大家电</a></dd>
          <dd><a href="#">联系客服</a></dd>
        </dl>
        <dl>
          <dt>服务指南</dt>
          <dd><a href="#">购物流程</a></dd>
          <dd><a href="#">会员介绍</a></dd>
          <dd><a href="#">生活旅游/团购</a></dd>
          <dd><a href="#">常见问题</a></dd>
          <dd><a href="#">大家电</a></dd>
          <dd><a href="#">联系客服</a></dd>
        </dl>
        <dl>
          <dt>服务指南</dt>
          <dd><a href="#">购物流程</a></dd>
          <dd><a href="#">会员介绍</a></dd>
          <dd><a href="#">生活旅游/团购</a></dd>
          <dd><a href="#">常见问题</a></dd>
          <dd><a href="#">大家电</a></dd>
          <dd><a href="#">联系客服</a></dd>
        </dl>
        <dl>
          <dt>帮助中心</dt>
          <dd>
            <img src="./images/wx_cz.jpg" alt="">
            小白之家
          </dd>
        </dl>
      </div>
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
  <!--底部模块 end-->
</template>

<script setup>
import {getCurrentInstance, reactive} from "vue";

const {proxy} = getCurrentInstance()
let login_status = reactive({
  login_status: 'layout',
  login_name: ''
})
const refresh = ()=>{
  this.$forceUpdate()
}
const layout = ()=>{
  login_status.login_status = 'layout'
  login_status.login_name = ''
  proxy.$router.push({
    path: '/list',
    query: {
      login_status: login_status.login_status,
      login_name: login_status.login_name
    }
  })
}
const trans = ()=>{
  proxy.$router.push({
    path: '/',
    query: {
      login_status: login_status.login_status,
      login_name: login_status.login_name
    }
  })
}

if(proxy.$route.query.login_status==='login'){
  login_status.login_status = proxy.$route.query.login_status
  login_status.login_name = proxy.$route.query.login_name
}
</script>

<style scoped>
  @import './css/base.css';
  @import './css/common.css';
  @import './css/list.css';
</style>