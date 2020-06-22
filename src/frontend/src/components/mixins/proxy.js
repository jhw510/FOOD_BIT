import axios from "axios";


export  const  proxy = {
    methods: {
        tester(d){
            alert(d)

        },
        foodclick(seq){
            alert(seq)
        },

        paging(url) {
            const food = []
            const pages = []
            let temp = {}
            axios.get(url)
                .then(({data}) => {
                    data.list.forEach(elem => {
                        food.push(elem)
                    })
                    let pager = data.pager

                    let i = pager.pageStart + 1

                    for (; i <= pager.pageEnd + 1; i++) {
                        pages.push(i)
                    }
                    temp.rowCount = pager.rowCount
                    temp.existPrev = pager.existPrev
                    temp.existNext = pager.existNext
                    temp.nextBlock=pager.nextBlock
                    temp.prevBlock=pager.prevBlock
                })
                .catch(err => {
                    alert(`실패? ${err}`)
                })
            return {food, pages, temp}
        }
    }
}
