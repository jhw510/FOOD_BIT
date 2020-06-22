import axios from "axios";
import router from "@/router";


const state = {
    context: "http://localhost:3000/",
    price: [],
    count: 0
};
const actions = {
    async search({commit}, searchWord) {

        if (searchWord == '도매'){
            axios
                    .post(state.context + `price`,searchWord, {
                        authorization: "JWT fefege..",
                        Accept: "application/json",
                        "Content-Type": "application/json"
                    })
                    .then(({ data }) => {
                        commit("SEARCH", data);
                        router.push("/searchPage");
                    })
                    .catch(() => {
                        alert("통신 실패 !");
                    });

        }
    }
};
const mutations = {
    SEARCH(state, data) {
        alert("뮤데이션에서 결과 수 : " + data.count);
        state.price = [];
        state.count = data.count;
        data.list.forEach(item => {
            state.price.push({
                seq: item.seq,
                productClsCode: item.productClsCode,
                productClsName: item.productClsName,

            });
        });
    },

};
const getters = {
    price: state => state.price,
    count: state => state.count,

};

export default {
    name: "crawling",
    namespaced: true,
    state,
    actions,
    mutations,
    getters
};