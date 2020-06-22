import Vue from "vue";
import VueRouter from "vue-router";
import Join from "../components/Join";
import Login from "../components/Login";
import HelloWorld from "../components/HelloWorld";
import Food from "../components/Food";



Vue.use(VueRouter);

export  default  new VueRouter({
    mode:"history",
    base:process.env.BASE_URL,
    routes:[
        {path:"/join",name :'Join',component: Join},
        {path:"/",name:'HelloWorld',component: HelloWorld},
        {path:"/login",name:'Login',component: Login},
        {path:"/food", name:'Food',component: Food},

    ]
});