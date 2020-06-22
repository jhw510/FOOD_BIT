<template>
  <v-app>
    <div v-if="auth">
      <v-app-bar
              app
              color="#FF97DC"
              dark
      >
        <div class="d-flex align-center">
          <v-img
                  alt="Vuetify Logo"
                  class="shrink mr-2"
                  contain

                  transition="scale-transition"
                  width="40"
          />

          <v-img
                  alt="Vuetify Name"
                  class="shrink mt-1 hidden-sm-and-down"
                  contain
                  min-width="100"
                  width="100"
          />
        </div>

        <v-spacer></v-spacer>

        <v-btn
                target="_blank"
                text
        >
          <span >"도매"를 검색해 주세요 </span>

        </v-btn>
      </v-app-bar>
    </div>
    <div v-else>
      <v-app-bar
              app
              color="#8E89FF"
              dark
      >
        <div class="d-flex align-center">
          <v-img
                  alt="Vuetify Logo"
                  class="shrink mr-2"
                  transition="scale-transition"
                  width="40"
          />

          <v-img
                  alt="Vuetify Name"
                  class="shrink mt-1 hidden-sm-and-down"

                  min-width="100"

                  width="100"
          />
        </div>

        <v-spacer></v-spacer>

        <v-btn
                target="_blank"
                text
        >

          <d id="mainName">후르츠 바스켓</d>

        </v-btn>
      </v-app-bar>
    </div>
    <v-content>
      <router-view/>
    </v-content>
  </v-app>
</template>
<script>
  import {mapState} from 'vuex'
  export default {
    computed: {
      ...mapState({
        auth: state => state.player.auth
      })
    }
  }
</script>
<style scoped>
  .mainName {
    color:#4641D9
  }

</style>