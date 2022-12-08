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
    proxy: {
      "/api":{
        target: "http://localhost:8080",
        changeOrigin: true,
        pathRewrite: {
          "^/api":"/"
        }
      }
    }
  }
})
