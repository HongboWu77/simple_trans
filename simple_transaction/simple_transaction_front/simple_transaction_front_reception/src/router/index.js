import {createRouter,createWebHistory} from 'vue-router'

//定义页面路由
const routes = [
    //登录页面
    {
        path: '/login',
        name: 'login',
        component: ()=>import('../views/LoginUser')
    },
    //注册页面
    {
        path: '/registry',
        name: 'registry',
        component: ()=>import('../views/RegistryUser')
    },
    //user的维护页面
    {
        path: '/',
        name: 'trans',
        component: () => import('../views/Trans')
    },
    {
        path: '/list',
        name: 'list',
        component: () => import('../views/List')
    }
]
//生成路由管理对象
const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})
//导出路由管理对象
export default router