<template>
  <div id="app">
    <router-view />
    <!-- 加载路由视图 -->
  </div>
</template>
<script>
import '@/assets/font/font.css'
export default {
  name: 'App'
}
</script>

<style>
html,
body {
  margin: 0;
  padding: 0;
}

#app {
  color: #2c3e50;
  height: 100vh;
}
</style>
