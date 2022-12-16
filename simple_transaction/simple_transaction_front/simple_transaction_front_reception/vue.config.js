const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true,
  lintOnSave: false,
  devServer: {
    host: "127.0.0.1",
    port: 8083,
    https: false,
    hot: true,
    open: true,
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
