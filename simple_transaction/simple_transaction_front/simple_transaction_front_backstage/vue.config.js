const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: false,
  //定义前端服务器
  devServer:{
    //ip
    host:"127.0.0.1",
    //端口
    port:8082,
    //是否支持https
    https:false,
    //是否支持热更新
    hot:true,
    //运行项目后自动访问
    open:true,
    //通过代理服务器配置跨域访问
    proxy:{
      "/api":{
        //目标服务器
        target:"http://localhost:8080",
        //是否支持跨域
        changeOrigin:true,
        //路径重写
        pathRewrite:{
          "^/api":"/"
        }
      }
    }
  }
})
