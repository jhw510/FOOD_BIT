import axios from 'axios'
import router from '../router'
const state = {
    context: 'http://localhost:5000/',
    player : {},
    fail : false,
    auth : false
}
const getters = {
}
const actions = {
    async login({commit}, loginData){
        const url = state.context + `players/${loginData.playerId}/access`
        const headers = {
            authorization: 'JWT fefege..',
            Accept : 'application/json',
            'Content-Type': 'application/json'
        }
        axios.post(url, loginData, headers)
            .then(({data})=>{
                if(data.result){
                    commit('LOGIN_COMMIT', data)

                }else{
                    commit('FAIL_COMMIT')
                }
            })
            .catch(()=>{
                alert('서버 전송 실패')
                state.fail = true
            })

    },
    joinSuccess({commit},payload){
        const url= state.context +`players/${payload.playerId}/join`
        const headers = {
            authorization: 'JWT fefege..',
            Accept : 'application/json',
            'Content-Type': 'application/json'
        }
        axios.post(url, payload, headers)
            .then(({data})=>{
                alert("회원님을 환영합니다")
                commit('JOIN')
                console.log(data)
            })
            .catch(()=>{
                alert("서버통신 실패!")
            })
    },
    async logout(){
        alert("로그아웃")
    },

}
const mutations = {
    LOGIN_COMMIT(state, data){
        state.auth = true
        state.player = data.player
        localStorage.setItem('token', data.token)
        localStorage.setItem('playerId', data.player.playerId)
        if(data.player.teamId !== 'K01'){
            alert(data.player.playerName+'님이 로그인 하셨습니다')
            router.push('/')
        }else{
            alert('관리자')
            /* 관리자 */
        }
    },
    FAIL_COMMIT(state){
        state.fail =true
    },
    LOGOUT_COMMIT(state){
        localStorage.clear()
        state.auth = false
        state.player= {}
        router.push('/')
    },
    join(){
      //  alert("회원가입")
    },
    JOIN(){
        //alert('1')
        router.push('/login')
    }
}
export default {

    namespaced : true,
    state,
    actions,
    mutations,
    getters
}