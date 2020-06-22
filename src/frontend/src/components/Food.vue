<template>
    <div>
       <body>
        <h1>검색결과</h1>
        <thead>
        <tr>
            <th class="text-left">No.</th>
            <th class="text-left">작물</th>
            <th class="text-left">아</th>


        </tr>
        </thead>
        <tbody>
        <tr v-for="item of list" :key="item.seq">
            <td>{{ item.seq }}</td>
            <td><a id='sw' @click="foodclick(item.seq)" href="#">{{ item.productName }}</a></td>
            <td>{{ item.productClsName }}</td>
            <td>{{ item.categoryName }}</td>
            <td>{{ item.productno }}</td>
            <td>{{ item.unit }}</td>
            <td>{{ item.day1 }}</td>
            <td>{{ item.dpr1 }}</td>
            <td>{{ item.day2 }}</td>
            <td>{{ item.dpr2 }}</td>
            <td>{{ item.day3 }}</td>
            <td>{{ item.dpr3 }}</td>
            <td>{{ item.day4 }}</td>
            <td>{{ item.dpr4 }}</td>
            <td>{{ item.direction }}</td>
            <td>{{ item.price }}</td>
            <td>{{ item.lastestDay }}</td>



        </tr>
        </tbody>
        <div class="text-center" >
            <div >
                <span @click="testClick(pager.prevBlock)" v-if='pager.existPrev' class="pagenation" >PREV</span>
                <span @click="testClick(n)" v-for="n of pages" :key="n" class="pagenation">{{n}}</span>
                <span @click="testClick(pager.nextBlock)" v-if='pager.existNext' class="pagenation" >NEXT</span>

            </div>

        </div>
       </body>
    </div>

</template>

<script>
    import { mapState } from "vuex";
    import {proxy} from "./mixins/proxy"
    export default {
        mixins:[proxy],
        created() {
            console.log('페이징 가기전 :')
            let json = proxy.methods.paging(`${this.$store.state.search.context}/food/null/0`)
            this.$store.state.search.list = json.food
            this.$store.state.search.pages = json.pages
            this.$store.state.search.pager = json.temp
            console.log('페이징 다녀온 다음  :' +json.temp.pageSize)
        },

        computed: {
            ...mapState({
                list: state => state.search.list,
                pages: state => state.search.pages,
                pager:state=>state.search.pager
            })
        },
        methods:{
            testClick(d){
                proxy.methods.tester(d)
                this.$store.dispatch("search/testClick",
                    {cate:'food',searchWord:null,pageNumber:d-1})
            },
            tester(){
                // let s= document.getElementById('searchWord')
                //  let v=s.value
                //  proxy.methods.tester()          원래는 이런상태

                let searchWord=document.getElementById('searchWord').value
                if(searchWord ==='') searchWord ='null'
                this.$store.dispatch("search/testClick",
                    {cate:'food',searchWord:document.getElementById('searchWord').value,pageNumber:0})

            },
            foodclick(searchWord){
                //let seq= document.getElementById('seq').value
                this.$store.dispatch("search/foodclick",
                    {cate:'food',searchWord:searchWord})
                //   proxy.methods.foodclick(seq)
            }
        }
    }

</script>

<style scoped>
    .text-center{
        margin: 0 auto;
        width: 500px;
        height: 100px
    }
    .pagenation{
        width: 50px;
        height: 50px;
        border: 1px solid palevioletred;
        margin-right: 5px
    }
</style>