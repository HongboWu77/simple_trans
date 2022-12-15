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
          </li>
          <li v-if="login_status.login_status==='login'">
            <a href="#">小白 </a>
            <button v-on:click="layout" class="style-red" style="font-size:10px">退出登录</button>
          </li>
        </ul>
      </div>
      <div class="fr">
        <ul>
          <li><a href="#">我的订单</a></li>
          <li></li>
          <li class="arrow-icon"><a href="#">我的小白之家</a></li>
          <li></li>
          <li><a href="#">小白之家会员</a></li>
          <li></li>
          <li><a href="#">企业采购</a></li>
          <li></li>
          <li class="arrow-icon"><a href="#">关注品优购</a></li>
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
    <div class="search">
      <input type="search" name="" id="" placeholder="语言开发">
      <button>搜索</button>
    </div>
    <div class="hotwords">
      <ul>
        <li><a href="#" class="style-red">优惠购首发</a></li>
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
      <div class="dropdown">
        <div class="dt">
          全部商品分类
        </div>
        <div class="dd">
          <ul>
            <li><a href="#">家用电器</a></li>
            <li><a href="#">手机、数码、通信</a></li>
            <li><a href="#">电脑、办公</a></li>
            <li><a href="#">家具、家具、家装、厨具</a></li>
            <li><a href="#">男装、女装、童装、内衣</a></li>
            <li><a href="#">个户化妆、清洁用品、宠物</a></li>
            <li><a href="#">鞋靴、箱包、珠宝、奢侈品</a></li>
            <li><a href="#">运动户外、钟表</a></li>
            <li><a href="#">汽车、汽车用品</a></li>
            <li><a href="#">母婴、玩具乐器</a></li>
            <li><a href="#">食品、酒类、生鲜、特产</a></li>
            <li><a href="#">医药保健</a></li>
            <li><a href="#">图书、音像、电子书</a></li>
            <li><a href="#">彩票、旅行、充值、票务</a></li>
            <li><a href="#">理财、众筹、白条、保险</a></li>
          </ul>
        </div>
      </div>
      <div class="navitems">
        <ul>
          <li><a href="">服装城</a></li>
          <li><a href="">服装城</a></li>
          <li><a href="">服装城</a></li>
          <li><a href="">服装城</a></li>
          <li><a href="">服装城</a></li>
          <li><a href="">服装城</a></li>
          <li><a href="">服装城</a></li>
          <li><a href="">服装城</a></li>
        </ul>
      </div>
    </div>
  </nav>
  <!--nav模块 end-->

  <!--main模块  start-->
  <div class="w">
    <div class="main">
      <div class="focus">
        <ul>
          <li>
            <img src="./upload/focus1.png" alt="" v-on:click="list">
          </li>
        </ul>
      </div>
      <div class="newsflash">
        <div class="news">
          <div class="news_hd">
            <h5>小白快报</h5>
            <a href="#" class="more">更多</a>
          </div>
          <div class="news_bd">
            <ul>
              <li><a href="#"><strong>[特惠]</strong>小白小白小小白小白小白小小白小白小白小小白</a></li>
              <li><a href="#"><strong>[特惠]</strong>小白小白小小白</a></li>
              <li><a href="#"><strong>[特惠]</strong>小白小白小小白</a></li>
              <li><a href="#"><strong>[特惠]</strong>小白小白小小白</a></li>
              <li><a href="#"><strong>[特惠]</strong>小白小白小小白</a></li>
            </ul>
          </div>
        </div>
        <div class="lifeservice">
          <ul>
            <li>
              <i></i>
              <p>话费</p>
            </li>
            <li>
              <img src="./images/减.png" alt="">
              <i></i>
              <p>话费</p>
            </li>
            <li>
              <i></i>
              <p>话费</p>
            </li>
            <li>
              <i></i>
              <p>话费</p>
            </li>
            <li>
              <i></i>
              <p>话费</p>
            </li>
            <li>
              <i></i>
              <p>话费</p>
            </li>
            <li>
              <i></i>
              <p>话费</p>
            </li>
            <li>
              <i></i>
              <p>话费</p>
            </li>
            <li>
              <i></i>
              <p>话费</p>
            </li>
            <li>
              <i></i>
              <p>话费</p>
            </li>
            <li>
              <i></i>
              <p>话费</p>
            </li>
            <li>
              <i></i>
              <p>话费</p>
            </li>
          </ul>
        </div>
        <div class="bargain">
          <img src="./upload/bargain.png" alt="">
        </div>
      </div>
    </div>
  </div>
  <!--main模块 end-->

  <!--recom推荐模块 start-->
  <div class="w recom">
    <div class="recom_hd">
      <img src="./images/recom.png" alt="">
    </div>
    <div class="recom_bd">
      <ul>
        <li><img src="./upload/recom_03.jpg" alt=""></li>
        <li></li>
        <li><img src="./upload/recom_03.jpg" alt=""></li>
        <li></li>
        <li><img src="./upload/recom_03.jpg" alt=""></li>
        <li></li>
        <li><img src="./upload/recom_03.jpg" alt=""></li>
      </ul>
    </div>
  </div>
  <!--recom推荐模块 end-->

  <!--glikes猜你喜欢模块 start-->
  <div class="glikes w">
    <div class="glikes_hd">
      <h5>猜你喜欢</h5>
      <a href="#" class="change">换一批</a>
    </div>
    <div class="glikes_bd">
      <ul>
        <li>
          <img src="./upload/glikes_03.png" alt="">
        </li>
        <li></li>
        <li>
          <img src="./upload/glikes_03.png" alt="">
        </li>
        <li></li>
        <li>
          <img src="./upload/glikes_03.png" alt="">
        </li>
        <li></li>
        <li>
          <img src="./upload/glikes_03.png" alt="">
        </li>
        <li></li>
        <li>
          <img src="./upload/glikes_03.png" alt="">
        </li>
        <li></li>
        <li>
          <img src="./upload/glikes_03.png" alt="">
        </li>
      </ul>
    </div>
  </div>
  <!--glikes猜你喜欢模块 end-->

  <!--floor楼层模块 start-->
  <div class="floor">
    <div class="w jiadian">
      <div class="box_hd">
        <h3>家用电器</h3>
        <div class="tab_list">
          <ul>
            <li><a href="#" class="style-red">热门</a></li>
            <li><a href="#">大家电</a></li>
            <li><a href="#">生活电器</a></li>
            <li><a href="#">厨房电器</a></li>
            <li><a href="#">个护健康</a></li>
            <li><a href="#">应季电器</a></li>
            <li><a href="#">空气/净水</a></li>
            <li><a href="#">新奇特</a></li>
            <li><a href="#">高端电器</a></li>
          </ul>
        </div>
      </div>
      <div class="box_bd">
        <div class="tab_content">
          <div class="tab_list_item">
            <div class="col_210">
              <ul>
                <li><a href="#">节能补贴</a></li>
                <li><a href="#">节能补贴</a></li>
                <li><a href="#">节能补贴</a></li>
                <li><a href="#">节能补贴</a></li>
                <li><a href="#">节能补贴</a></li>
                <li><a href="#">节能补贴</a></li>
              </ul>
              <a href="#">
                <img src="./upload/floor-1-1.png" alt="">
              </a>
            </div>
            <div class="col_329">
              <a href="#">
                <img src="./upload/floor-1-b01.png" alt="">
              </a>
            </div>
            <div class="col_221">
              <a href="#">
                <img src="./upload/floor-1-2.png" alt="">
                <img src="./upload/floor-1-3.png" alt="">
              </a>
            </div>
            <div class="col_221">
              <a href="#">
                <img src="./upload/floor-1-4.png" alt="">
              </a>
            </div>
            <div class="col_219">
              <a href="#">
                <img src="./upload/floor-1-5.png" alt="">
                <img src="./upload/floor-1-6.png" alt="">
              </a>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="w shouji">
      <div class="box_hd">
        <h3>手机通讯</h3>
        <div class="tab_list">
          <ul>
            <li><a href="#" class="style-red">热门</a></li>
            <li><a href="#">大家电</a></li>
            <li><a href="#">生活电器</a></li>
            <li><a href="#">厨房电器</a></li>
            <li><a href="#">个护健康</a></li>
            <li><a href="#">应季电器</a></li>
            <li><a href="#">空气/净水</a></li>
            <li><a href="#">新奇特</a></li>
            <li><a href="#">高端电器</a></li>
          </ul>
        </div>
      </div>
      <div class="box_bd">
        <div class="tab_content">
          <div class="tab_list_item">
            <div class="col_210">
              <ul>
                <li><a href="#">节能补贴</a></li>
                <li><a href="#">节能补贴</a></li>
                <li><a href="#">节能补贴</a></li>
                <li><a href="#">节能补贴</a></li>
                <li><a href="#">节能补贴</a></li>
                <li><a href="#">节能补贴</a></li>
              </ul>
              <a href="#">
                <img src="./upload/floor-1-1.png" alt="">
              </a>
            </div>
            <div class="col_329">
              <a href="#">
                <img src="./upload/floor-1-b01.png" alt="">
              </a>
            </div>
            <div class="col_221">
              <a href="#">
                <img src="./upload/floor-1-2.png" alt="">
                <img src="./upload/floor-1-3.png" alt="">
              </a>
            </div>
            <div class="col_221">
              <a href="#">
                <img src="./upload/floor-1-4.png" alt="">
              </a>
            </div>
            <div class="col_219">
              <a href="#">
                <img src="./upload/floor-1-5.png" alt="">
                <img src="./upload/floor-1-6.png" alt="">
              </a>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!--floor楼层模块 end-->

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
  login_status: 'layout'
})
const refresh = ()=>{
  proxy.$forceUpdate()
}
const layout = ()=>{
  login_status.login_status = 'layout'
  proxy.$router.push({
    path: '/',
    query: {
      login_status: login_status.login_status
    }
  })
}
const list = ()=>{
  proxy.$router.push({
    path: '/list',
    query: {
      login_status: login_status.login_status
    }
  })
}


if(proxy.$route.query.login_status==='login'){
  login_status.login_status = proxy.$route.query.login_status
}
</script>

<style scoped>
  @import './css/base.css';
  @import './css/common.css';
  @import './css/index.css';
</style>