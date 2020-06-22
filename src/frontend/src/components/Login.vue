<template>
    <div class="login" id="login">
        <a href="javascript:;" class="log-close"><i class="icons close"></i></a>
        <div class="log-road">
            <div class="log-move move2"></div>
            <div class="log-move move3"></div>
            <div class="log-move move4"></div>
            <div class="log-move move5"></div>
            <div class="log-logo">후르츠 바스켓</div>
            <div class="log-text">환영합니다</div>
        </div>
        <div class="log-email">
            <input type="text"  placeholder="ID" :class="'log-input' + (account==''?' log-input-empty':'')" v-model="account">
            <input type="password" placeholder="Password" :class="'log-input' + (password==''?' log-input-empty':'')"  v-model="password">
            <button type="button"  class="log-btn" @click="login">Login</button>
        </div>
        <Loading v-if="isLoging" marginTop="-30%"></Loading>
    </div>
</template>

<script>
    export default {
        name: 'Login',
        data(){
            return {
                isLoging: false,
                account: '',
                password: ''
            }
        },
        components:{
        },
        methods:{
            login(){
                alert("로그인 누름" )
                this.$store.dispatch('player/login',{playerId:this.account,passwd:this.password})
            },
            toLogin(){
                this.isLoging = true;
                setTimeout(()=>{
                    let expireDays = 1000 * 60 * 60 * 24 * 15;
                    this.setCookie('session','blablablablabla...', expireDays);
                    this.isLoging = false;
                    this.$router.push('/user_info/');
                },3000)
            }
        }
    }
</script>

<style scoped>
    .login{position: fixed; overflow: hidden;left: 50%; margin-left: -250px; top:50%; margin-top: -350px; width: 500px; min-height: 655px; z-index: 10; right: 140px; background: #fff;-webkit-border-radius: 5px;
        -moz-border-radius: 5px;
        -ms-border-radius: 5px;
        -o-border-radius: 5px;
        border-radius: 5px; -webkit-box-shadow:  0px 3px 16px -5px #070707; box-shadow:  0px 3px 16px -5px #070707}
    .log-close{display: block; position: absolute; top:12px; right: 12px; opacity: 1;}
    .log-close:hover .icons{transform: rotate(180deg);}
    .log-close .icons{opacity: 1; transition: all .3s}
    .log-move{background-image: url(../images/movee.png); width: 64px ;height: 60px; position: absolute; z-index: 1}
    .login move1{top:21px; left: -30px; transform: scale(.6); animation: move1 10s linear infinite;}
    .login .move2{top:87px; right: 20px; animation: move2 19s linear infinite;}
    .login .move3{top:160px; left: 5px;transform: scale(.8);animation: move3 21s linear infinite;}
    .login .move4{top:150px; left: -40px;transform: scale(.4);animation: move4 19s linear infinite;}
    .login .move5{top:230px; left: 500px;transform: scale(.8);animation: move5 20s linear infinite;}
    .log-road{background: url(../images/road.png); width: 100%; height: 500px; overflow: hidden;}
    .log-logo{height: 80px; margin: 120px auto 25px; text-align: center; color: rgba(31, 68, 202, 0.93); font-weight: bold; font-size: 40px;}
    .log-text{color: rgba(87, 89, 212, 0.97); font-size: 13px; text-align: center; margin: 0 auto;}
    .log-logo,.log-text{z-index: 2}
    .icons{background:url(../images/icons.png) no-repeat; display: inline-block;}
    .close{height:16px;width:16px;background-position:-13px 0;}
    .login-email{height:17px;width:29px;background-position:-117px 0;}
    .log-btns{padding: 15px 0; margin: 0 auto;}
    .log-btn{width:402px; display: block; text-align: left; line-height: 50px;margin:0 auto 15px; height:50px; color:#fff; font-size:13px;-webkit-border-radius: 5px; background-color: #3B5999;
        -moz-border-radius: 5px;
        -ms-border-radius: 5px;
        -o-border-radius: 5px;
        border-radius: 5px;
        position: relative;}
    .log-btn.tw{background-color: #13B4E9}
    .log-btn.email{background-color: #50E3CE}
    .log-btn:hover,.log-btn:focus{color: #fff; opacity: .8;}
    .log-email{text-align: center; margin-top: 20px;}
    .log-email .log-btn{background-color: #50E3CE;text-align: center;}
    .log-input-empty{border: 1px solid #f37474 !important;}
    .isloading{background: #d6d6d6}
    .log-btn .icons{margin-left: 30px; vertical-align: middle;}
    .log-btn .text{left: 95px; line-height: 50px; text-align: left; position: absolute;}
    .log-input{width: 370px;overflow: hidden; padding: 0 15px;font-size: 13px; border: 1px solid #EBEBEB; margin:0 auto 15px; height: 48px; line-height: 48px; -webkit-border-radius: 5px;
        -moz-border-radius: 5px;
        -ms-border-radius: 5px;
        -o-border-radius: 5px;
        border-radius: 5px;}
    .log-input.warn{border: 1px solid #f88787}
    @-webkit-keyframes move1 {
        0%{left: 200px}
        100%{left:-130px;}
    }
    @keyframes move1{
        0%{left: 200px}
        100%{left:-130px;}
    }
    @-webkit-keyframes move2 {
        0%{left:300px;}
        100%{left:-90px;}
    }
    @keyframes move2{
        0%{left:300px;}
        100%{left:-90px;}
    }
    @-webkit-keyframes move3 {
        0%{left:620px;}
        100%{left:-70px;}
    }
    @keyframes move3{
        0%{left:620px;}
        100%{left:-70px;}
    }@-webkit-keyframes move4 {
         0%{left:100px;}
         100%{left:-70px;}
     }
    @keyframes move4{
        0%{left:100px;}
        100%{left:-70px;}
    }
    @-webkit-keyframes move5 {
        0%{left:100px;}
        100%{left:-70px;}
    }
    @keyframes move5{
        0%{left:400px;}
        100%{left:-70px;}
    }
</style>