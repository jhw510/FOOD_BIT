<template>
    <div>
        <div id="contents">
            <div class="user_content">

                <div class="user_info">
                    <table width="100%" class="t_user01">
                        <tbody>
                        <tr>
                            <th><label>아이디</label></th>
                            <td colspan="3">
                                <input type="text" v-model="playerId" @keyup="IdCheck" maxlength="12"  class="user_input02" value="">
                                <b class="user_num_check mt5" id="id_result">{{idCheckmsg}}</b>
                                <p class="mt5" >* 4~12이내  영문, 숫자 혼합</p>
                            </td>
                        </tr>
                        <tr>
                            <th><label for="i_sPassWord">비밀번호입력</label></th>
                            <td colspan="3">
                                <input type="password" v-model="passwd" id="i_sPassWord" maxlength="20" class="user_input02 am" value=""> &nbsp;&nbsp;&nbsp;
                                <span>* 영문 대/소문자, 숫자, 특수문자(`~!@#$%^*+=-_만 허용)를 조합하여 8~20자로 입력해 주세요.</span>
                            </td>
                        </tr>
                        <tr>
                            <th> <label for="i_sMemberName">이름</label></th>
                            <td colspan="3"><input type="text" v-model="playerName" id="i_sMemberName" maxlength="20" class="user_input02" value=""></td>
                        </tr>
                        <tr>
                            <th> <label for="addrs">주소</label></th>
                            <td colspan="3"><input type="text" v-model="addrs" id="addrs" maxlength="20" class="user_input02" value=""></td>
                        </tr>
                        </tbody></table>
                    <table width="100%" class="t_user01">
                        <colgroup>
                            <col width="18%">
                            <col width="*">
                            <col width="13%">
                            <col width="30%">
                        </colgroup>
                    </table>
                </div>
                <div class="btn_formbts">
                    <button type="button" @click="join" class="btn_form_r"><b>회원가입</b></button>
                    <button type="button" @click="cancel" class="btn_form_g"><b>취소</b></button>
                </div>

            </div>
        </div>
    </div>
</template>
<script>
    export default {
        name: 'Join',
        data() {
            return {
                playerId: '',
                passwd: '',
                playerName:'',
                addrs:'',

                confirm: false
            }
        },
        methods: {
            join () {
                //alert('회원님 환영합니다.')
                this.$store.dispatch('player/joinSuccess',{playerId:this.playerId,passwd:this.passwd,playerName:this.playerName,addrs:this.addrs})
            }
        }
    }
</script>
<style scoped>
    #contents{
        float: none;
        margin: auto;
    background-image: url(../images/b.png); width: 100%;height: 800px; overflow: hidden;

    }
    input {
        margin-right: 3px;
    }

    .btn_form_r {
        display: inline-block;
        height: 20px;
        margin-right: 10px;
        padding: 4px 16px 1px 17px;
        background: #f14f22;
        border: 1px solid #bebebe;
        color: #fff;
    }
    .btn_formbts{
        width: 45%;   margin: auto;height: 100px;
    }
    form {border: 3px solid #f1f1f1;}
    input[type=text], input[type=password] {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        box-sizing: border-box;
    }
</style>