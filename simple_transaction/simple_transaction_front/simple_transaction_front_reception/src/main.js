//导入所需组件
import { createApp } from 'vue'
import App from './App.vue'
import router from "./router"
import axios from 'axios'
import qs from 'qs'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import {
    getSessionStorage,
    setSessionStorage,
    removeSessionStorage,
    getCurDate
} from "./common";

//设置axios的基础路径
axios.defaults.baseURL = "/api";
//创建vue实例
const app = createApp(App);
//使用插件
app.use(router);
app.use(ElementPlus);
//设置Vue的全局设置
app.config.globalProperties.$http = axios;
app.config.globalProperties.$qs = qs;
app.config.globalProperties.$getSessionStorage = getSessionStorage;
app.config.globalProperties.$setSessionStorage = setSessionStorage;
app.config.globalProperties.$removeSessionStorage = removeSessionStorage;
app.config.globalProperties.$getCurDate = getCurDate;
//挂载到id为app的组件上
app.mount("#app");