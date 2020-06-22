<template>
  <div>
    <body>
    <section class="parallax section" style="background-image: url(http://static.ssgcdn.com/cmpt/edit/201803/14/182018031418464820347862039786_342.png);">
      <div class="wrapsection">
        <div class="parallax-overlay"></div>
        <div class="container">
          <div class="row">
            <div class="col-md-12 sol-sm-12">
              <div class="maintitle">
                <h1 class="section-title justtitle">
                  <input id="mainHome" type="button" value="후르츠바스켓"/>
                </h1>
                <nav class="collapse navbar-collapse bs-navbar-collapse navbar-right" role="navigation">
                  <ul class="nav navbar-nav">
                    <li>
                      <h3>
                        <h3> <router-link :to="{name: 'HelloWorld'}" type="button" class="nav-link" active-class="active">
                          홈으로
                        </router-link>
                        </h3>
                      </h3>
                    </li>
                    <li>
                      <h3> <router-link :to="{name: 'Login'}" type="button" class="nav-link" active-class="active">
                        로그인
                      </router-link>
                      </h3>
                    </li>
                    <li>
                      <h3> <router-link :to="{name: 'Join'}" type="button" class="nav-link" active-class="active">
                        회원가입
                      </router-link>
                      </h3>
                    </li>

                  </ul>
                </nav>
                <p class="lead bottom0 wow bounceInUp">

                </p>
                <div>
                  <input id="search" v-model="searchWord"
                         type="text" style=" background-repeat: no-repeat; background-position: 88% 50%, 98% 50%;"
                         title="검색"/>
                </div>
                <div id="box">
                  <input
                          @click="search"
                          id="google_search"
                          type="button"
                          value=" 검색"
                  />
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </section>
    </body>
  </div>
</template>

<script>
  export default {
    data( ){
      return{
        searchWord:""
      };
    },
    methods:{
      search(){
        alert('눌러짐')
        this.$store.dispatch("search/find",this.searchWord);
      }
    },
    inheritAttrs: false,
    props: {
      data: {
        type: Object,
        default: () => ({}),
      },
      eventHandlers: {
        type: Array,
        default: () => ([]),
      },
      options: {
        type: Object,
        default: () => ({}),
      },
      ratio: {
        type: String,
        default: undefined,
      },
      responsiveOptions: {
        type: Array,
        default: () => ([]),
      },
      type: {
        type: String,
        required: true,
        validator: v => ['Bar', 'Line', 'Pie'].includes(v),
      },
    },
  };
</script>

<style scoped>
  #search {
    display: block;
    margin: 0 auto;
    width: 550px;
    height: 50px;
    font-size: 15pt;
    box-shadow: 3px 3px 5px #c3c3c3;
    border: 1px solid #eaeaea;
  }
  #box {
    text-align: center;
  }
  body {
    color:#444;
    font:normal 16px "Raleway","Helvetica Neue",Helvetica,Arial,sans-serif;
    font-weight:300;
    background-color:#fff;
    overflow-x:hidden;
    line-height:1.5;
  }
  a {
    color:#3498db;
    cursor:pointer;
    text-decoration:none;
    -moz-transition:all .2s;
    -o-transition:all .2s;
    -webkit-transition:all .2s;
    transition:all .2s;
  }
  a:hover,a:focus {
    color:#3498db;
    outline:none;
    text-decoration:none;
  }
  h1,h2,h3,h4,h5,h6,.h1,.h2,.h3,.h4,.h5,.h6 {
    font-family:"Raleway","Helvetica Neue",Helvetica,Arial,sans-serif;
    font-weight:bold;
    margin-bottom:15px;
    margin-top:0;
  }
  h1 {
    font-size:38px;
  }
  h2 {
    font-size:32px;
  }
  h3 {
    font-size:24px;
    display:block;
  }
  h4 {
    font-size:20px;
  }
  h5 {
    font-size:18px;
  }
  h6 {
    font-size:16px;
  }
  p.lead {
    font-size:24px;
    font-weight:200;
  }
  p {
    margin-bottom:20px;
  }
  p:last-child {
    margin-bottom:0;
  }
  ul,ol {
    margin-bottom:20px;
  }
  blockquote {
    padding-top:0;
    padding-bottom:0;
    border-color:#1ABC9C;
  }
  blockquote small {
    color:inherit;
  }
  pre {
    background-color:rgba(255,255,255,.5);
    border-color:rgba(0,0,0,.1);
    margin-bottom:20px;
  }

  img {
    max-width: 100%;
  }

  .section-title {
    text-transform:uppercase;
    font-size:30px;
    letter-spacing:5px;
  }
  [class^="alert-"] .alert-link,[class*=" alert-"] .alert-link {
    color:#FFF;
    font-weight:300;
    text-decoration:underline;
  }
  .nav-tabs>li>a {
    padding:10px 0;
    margin-right:30px;
    color:inherit;
    font-size:16px;
    border:none;
    border-bottom:1px solid rgba(255,255,255,0);
  }
  .nav .open>a,.nav .open>a:hover,.nav .open>a:focus {
    background:transparent;
    border:none;
    border-color:rgba(255,255,255,0);
  }
  .nav>li>a:hover,.nav>li>a:focus {
    background-color:#ecf0f1;
  }
  .nav-tabs>li>a:hover,.nav-tabs>li>a:focus {
    color:#1abc9c;
    background:transparent;
  }
  .nav-tabs>li.active>a,.nav-tabs>li.active>a:hover,.nav-tabs>li.active>a:focus {
    background:transparent;
    border:none;
    color:#1abc9c;
    border-bottom:1px solid #1abc9c;
  }
  .nav-pills>li.active>a,.nav-pills>li.active>a:hover,.nav-pills>li.active>a:focus {
    background-color:#1abc9c;
  }
  .nav .caret,.nav a:hover .caret {
    border-top-color:#1abc9c;
    border-bottom-color:#1abc9c;
  }
  .dropdown-menu>.active>a,.dropdown-menu>.active>a:hover,.dropdown-menu>.active>a:focus {
    background-color:#1abc9c;
  }
  .navbar-inverse .navbar-collapse,.navbar-inverse .navbar-form {
    border-color:#bdc3c7;
  }
  .navbar-inverse .navbar-toggle {
    background-color:#34495e;
    border-color:#2c3e50;
    margin-top:23px;
  }
  .navbar-inverse .navbar-toggle:focus {
    outline:none;
  }

  .panel-default>.panel-heading {
    background:#fff;
    color:#444;
  }

  .panel-default>.panel-heading a:hover {
    color:#01b0d1;
  }
  .panel-default>.panel-heading+.panel-collapse .panel-body {
    border-top:1px solid #eee;
  }
  .panel-group .panel {
    border-radius: 0;
  }
  /*	Form	==================================================*/
  label {
    font-weight:300;
  }

  [class^="has-"] .form-control,[class*=" has-"] .form-control {
    color:#FFF;
  }
  .has-success .help-block,.has-success .control-label,.has-success .radio,.has-success .checkbox,.has-success .radio-inline,.has-success .checkbox-inline {
    color:#2ecc71;
  }
  .has-success .form-control {
    border-color:#2ecc71;
    background-color:#2ecc71;
  }
  .has-success .form-control:hover,.has-success .form-control:focus {
    border-color:#2ecc71;
    background-color:#FFF;
    color:#2ecc71;
    box-shadow:none;
    -webkit-box-shadow:none;
    -moz-box-shadow:none;
  }
  .has-warning .help-block,.has-warning .control-label,.has-warning .radio,.has-warning .checkbox,.has-warning .radio-inline,.has-warning .checkbox-inline {
    color:#e67e22;
  }
  .has-warning .form-control {
    border-color:#e67e22;
    background-color:#e67e22;
  }
  .has-warning .form-control:hover,.has-warning .form-control:focus {
    background-color:#FFF;
    border-color:#e67e22;
    color:#e67e22;
    box-shadow:none;
    -webkit-box-shadow:none;
    -moz-box-shadow:none;
  }
  .has-error .help-block,.has-error .control-label,.has-error .radio,.has-error .checkbox,.has-error .radio-inline,.has-error .checkbox-inline {
    color:#e74c3c;
  }
  .has-error .form-control {
    border-color: #efeae9;
    background-color:#e74c3c;
  }
  .has-error .form-control:hover,.has-error .form-control:focus {
    background-color: #ffffff;
    border-color:#e74c3c;
    color:#e74c3c;
    box-shadow:none;
    -webkit-box-shadow:none;
    -moz-box-shadow: none;
  }

  .navbar-inverse .navbar-brand {
    padding:30px 15px;
    margin-right:30px;
    color:inherit;
    text-transform:uppercase;
    font-weight:bold;
  }
  .navbar-inverse .navbar-brand:hover,.navbar-inverse .navbar-brand:focus {
    color:#000;
  }

  .navbar-right button {
    margin:23px 0;
  }
  .navbar-nav>li>a {
    padding:30px 0;
    margin:0 15px;
  }
  .navbar-inverse .navbar-nav>li>a {
    color:inherit;
    text-transform:uppercase;
    font-size:12px;
    font-weight:bold;
  }
  .navbar-inverse .navbar-nav>li>a:hover,.navbar-inverse .navbar-nav>li>a:focus,.navbar-inverse .navbar-nav>.active>a,.navbar-inverse .navbar-nav>.active>a:hover,.navbar-inverse .navbar-nav>.active>a:focus {
    background-color:transparent;
    background-color:rgba(255,255,255,0);
    color:#01b0d1;
  }

  #hero .herotext {
    padding:160px 0px;
  }
  #hero h1 {
    font-size:50px;
  }
  #hero p.lead {
    font-size:1.4em;
  }
  #hero .btn {
    font-size:12px;
  }

  .maintitle h1 {
    text-transform:uppercase;
  }
  .maintitle,.service-box {
    text-align:center;
  }
  .maintitle .lead {
    max-width:840px;
    margin:0px auto;
    margin-bottom:80px;
    padding-left:20px;
    padding-right:20px;
  }

  .service-box .glyphicon {
    font-size:60px;
    margin-bottom:20px;
  }
  .service-box img {
    margin-bottom: 29px;
  }
  /*	Gallery	==================================================*/
  #gallery img {
    width:100%;
    height:auto;
    transition:all .3s ease-in-out;
  }
  #gallery img:hover {
    transform:scale(1.3);
  }
  #gallery a {
    display:block;
    overflow:hidden;
    margin-bottom:30px;
  }
  #gallery a img {
    margin-bottom:0px;
    display:block;
    width:100%;
    max-width:100%;
  }
  #gallery .description {
    background-color:#fff;
    display:block;
    padding:20px 15px;
    color:#333;
    text-transform:uppercase;
    clear:both;
    position: relative;
  }
  #gallery .caption {
    float:left;
  }
  #gallery .camera {
    float:right;
  }
  #gallery a.btn {
    display:inline-block;
  }

  .carousel-indicators li {
    border-color:#FFF;
    margin:0 2px;
    height:15px;
    width:15px;
    border-radius:10px;
    -webkit-border-radius:10px;
    -moz-border-radius:10px;
    margin:0 2px;
    -moz-transition:all .2s;
    -o-transition:all .2s;
    -webkit-transition:all .2s;
    transition:all .2s;
  }
  .carousel-indicators .active {
    height:15px;
    width:15px;
    border-radius:10px;
    -webkit-border-radius:10px;
    -moz-border-radius:10px;
    margin:0 2px;
    background-color:#FFF;
    border:1px solid #FFF;
  }


  .carousel-inner blockquote {
    border:none;
    text-align:center;
    padding:40px 10%;
  }
  .carousel-inner blockquote small {
    font-size:14px;
    text-transform:uppercase;
    font-weight:400;
  }
  .carousel-inner blockquote p {
    font-size:36px;
  }
  .carousel-control .glyphicon {
    left:50%;
    margin-top:-10px;
    margin-left:-10px;
    font-size:20px;
  }

  #contactarea .maintitle p.lead {
    margin-bottom:40px;
  }
  #contactarea form {
    max-width:800px;
    margin:0px auto;
  }
  #contactarea .input-lg,#contactarea .btn-lg {
    padding:20px 25px;
    height:65px;
  }
  #contact label {
    text-transform:uppercase;
    font-weight:300;
    letter-spacing:3px;
    font-size:13px;
  }
  #contact input,#contact select,#contact textarea {
    font-family:inherit;
    font-size:inherit;
    line-height:inherit;
    width:100%;
    border:0px;
    color:#333;
    background-color:#fff;
    border:0;
  }
  #contact input,#contact select {
    height:40px;
    margin-bottom:0px;
  }
  #contact input#submit {
    width:auto;
    margin-top:20px;
    background-color:rgba(0,0,0,0.3);
    border:0;
    color:#fff;
    padding:0px 20px;
    font-weight:400;
    text-transform:uppercase;
    letter-spacing:3px;
    font-size:14px;
  }
  #contact textarea {
    height:180px;
  }

  #success span,#erro span {
    display:block;
    position:absolute;
    top:0;
    width:100%
  }
  #success span p,#error span p {
    margin-top:6em
  }
  #success span p {
    color:#9bd32d;
  }
  #error span p {
    color:#c0392b;
  }

  .footer ul.social-icons li {
    width:20px;
    height:20px;
    position:relative;
    background:#fff;
    border:2px solid #ccc;
    border-radius:50%;
  }
  .footer ul.social-icons li a {
    color:#666;
  }

  #credits a {
    color:inherit;
  }
  #credits .social i {
    border:1px solid #ccc;
    height:30px;
    width:30px;
    line-height:30px;
    border-radius:50%;
    margin-left:2px;
    color:#999;
    text-align:center;
    margin-bottom:15px;
    display:inline-block;
  }
  #credits .social i:hover {
    color: #333;
  }

  .mfp-container:before {
    content:'';
    display:inline-block;
    height:100%;
    vertical-align:middle;
  }
  .mfp-align-top .mfp-container:before {
    display:none;
  }

  .mfp-inline-holder .mfp-content,.mfp-ajax-holder .mfp-content {
    width:100%;
    cursor:auto;
  }

  .mfp-auto-cursor .mfp-content {
    cursor:auto;
  }

  .mfp-preloader a {
    color:#CCC;
  }
  .mfp-preloader a:hover {
    color:#FFF;
  }
  .mfp-s-ready .mfp-preloader {
    display:none;
  }
  .mfp-s-error .mfp-content {
    display:none;
  }
  button.mfp-close,button.mfp-arrow {
    overflow:visible;
    cursor:pointer;
    background:transparent;
    border:0;
    -webkit-appearance:none;
    display:block;
    outline:none;
    padding:0;
    z-index:1046;
    -webkit-box-shadow:none;
    box-shadow:none;
  }
  button::-moz-focus-inner {
    padding:0;
    border:0;
  }
  .mfp-close {
    width:44px;
    height:44px;
    line-height:44px;
    position:absolute;
    right:0;
    top:0;
    text-decoration:none;
    text-align:center;
    opacity:0.65;
    filter:alpha(opacity=65);
    padding:0 0 18px 10px;
    color:#FFF;
    font-style:normal;
    font-size:28px;
    font-family:Arial,Baskerville,monospace;
  }
  .mfp-close:hover,.mfp-close:focus {
    opacity:1;
    filter:alpha(opacity=100);
  }
  .mfp-close:active {
    top:1px;
  }
  .mfp-close-btn-in .mfp-close {
    color:#333;
  }
  .mfp-image-holder .mfp-close,.mfp-iframe-holder .mfp-close {
    color:#FFF;
    right:-6px;
    text-align:right;
    padding-right:6px;
    width:100%;
  }

  .mfp-iframe-holder .mfp-content {
    line-height:0;
    width:100%;
    max-width:900px;
  }
  .mfp-iframe-holder .mfp-close {
    top:-40px;
  }

  .mfp-iframe-scaler iframe {
    position:absolute;
    display:block;
    top:0;
    left:0;
    width:100%;
    height:100%;
    box-shadow:0 0 8px rgba(0,0,0,0.6);
    background: #000;
  }
  /* Main image in popup */
  img.mfp-img {
    width:auto;
    max-width:100%;
    height:auto;
    display:block;
    line-height:0;
    -webkit-box-sizing:border-box;
    -moz-box-sizing:border-box;
    box-sizing:border-box;
    padding:40px 0 40px;
    margin: 0 auto;
  }

  .mfp-figure small {
    color:#BDBDBD;
    display:block;
    font-size:12px;
    line-height:14px;
  }
  .mfp-figure figure {
    margin:0;
  }
  .mfp-image-holder .mfp-content {
    max-width:100%;
  }
  .mfp-gallery .mfp-image-holder .mfp-figure {
    cursor: pointer;
  }
  @media screen and (max-width:800px) and (orientation:landscape),screen and (max-height:300px) {
    /** * Remove all paddings around the image on small screen */
    .mfp-img-mobile .mfp-image-holder {
      padding-left:0;
      padding-right:0;
    }
    .mfp-img-mobile img.mfp-img {
      padding:0;
    }
    .mfp-img-mobile .mfp-figure:after {
      top:0;
      bottom:0;
    }
    .mfp-img-mobile .mfp-figure small {
      display:inline;
      margin-left:5px;
    }
    .mfp-img-mobile .mfp-bottom-bar {
      background:rgba(0,0,0,0.6);
      bottom:0;
      margin:0;
      top:auto;
      padding:3px 5px;
      position:fixed;
      -webkit-box-sizing:border-box;
      -moz-box-sizing:border-box;
      box-sizing:border-box;
    }
    .mfp-img-mobile .mfp-bottom-bar:empty {
      padding:0;
    }
    .mfp-img-mobile .mfp-counter {
      right:5px;
      top:3px;
    }
    .mfp-img-mobile .mfp-close {
      top:0;
      right:0;
      width:35px;
      height:35px;
      line-height:35px;
      background:rgba(0,0,0,0.6);
      position:fixed;
      text-align:center;
      padding:0;
    }
  }

  /*	Common	==================================================*/
  .section {
  }
  .wrapsection {
    padding-top:140px;
    padding-bottom:140px;
    position: relative;
  }
  .parallax.section .container{
    position: relative;
    z-index: 4;
  }
  .justtitle {
    margin-top:80px;
  }
  .parallax {
    background-repeat: no-repeat;
    background-attachment: fixed;
    background-size: cover;
    overflow: hidden;
    z-index: 1;
    color:#fff;
  }
  .parallax-overlay {
    position: absolute;
    top: 0;
    bottom: 0;
    right: 0;
    left: 0;
    z-index: 2;
  }
  /*	Responsive	==================================================*/
  @media (max-width:991px) {

    #image img.img-responsive {
      margin-left:auto;
      margin-right:auto;
    }
    .navbar-nav>li>a {
      margin:0 7px;
    }
  }
  @media (max-width:767px) {
    .section,.parallax.section .container {
      padding-top:30px;
      padding-bottom:30px;
    }

    .maintitle .lead {
      margin-left:0;
      margin-right:0;
    }
    .container {
      max-width:690px;
      padding-left:30px;
      padding-right:30px;
    }
    .navbar-nav>li>a {
      padding:10px;
    }

    #hero .herotext {
      padding: 90px 0px;
    }
  }
  @media (max-width:767px) {
    body {
      font-size:14px;
    }
    h1 {
      font-size:28px;
    }
    h2,.carousel-inner blockquote p {
      font-size:24px;
    }
    h3 {
      font-size:20px;
    }
    h4 {
      font-size:18px;
    }
    h5 {
      font-size:16px;
    }
    h6 {
      font-size:14px;
    }
    p.lead {
      font-size:18px;
    }
    .section {
      padding:60px 0;
    }
    .maintitle p.lead {
      margin-bottom:40px;
    }

    .maintitle .lead {
      margin-left:0;
      margin-right:0;
    }
    .container {
      max-width:690px;
      padding-left:30px;
      padding-right:30px;
    }
  }
  @media (max-width:490px) {
    .wow {
      visibility: visible !important;
      -webkit-animation: none !important;
      -moz-animation: none !important;
      -o-animation: none !important;
      -ms-animation: none !important;
      animation: none !important;
    }
    .container {
      max-width:430px;
      padding-left:30px;
      padding-right:30px;
    }
    #hero h1 {
      font-size:38px;
    }
    #hero p.lead {
      font-size:1.5em;
    }

  }
</style>