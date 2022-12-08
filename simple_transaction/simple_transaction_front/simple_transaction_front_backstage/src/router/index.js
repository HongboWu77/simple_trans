import {createRouter,createWebHistory} from 'vue-router'

//定义页面路由
const routes = [
    //登录页面
    {
        path: '/',
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
        path: '/userget',
        name: 'userget',
        component: () => import('../views/User/UserList')
    },
    //order的维护页面
    {
        path: '/orderget',
        name: 'orderget',
        component: ()=> import('../views/Order/OrderList')
    },
    //shop的维护页面
    {
        path: '/shopget',
        name: 'shopget',
        component: ()=> import('../views/Shop/ShopList')
    },
    {
        path: '/example',
        name: 'example',
        component: ()=> import('../views/VueExample')
    }
]
//生成路由管理对象
const router = createRouter({
    history: createWebHistory(process.env.BASE_URL),
    routes
})
//导出路由管理对象
export default router
