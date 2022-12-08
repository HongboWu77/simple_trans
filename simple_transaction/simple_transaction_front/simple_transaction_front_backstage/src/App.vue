<template>
  <div class="main">
    <nav>

    </nav>
    <header>
      <h1>后台管理系统</h1>
      <router-link to="/userget">User</router-link> |
      <router-link to="/orderget">Order</router-link> |
      <router-link to="/shopget">Shop</router-link><br/>
      <img alt="Vue logo" src="./assets/logo.png">
    </header>
    <router-view/>
  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

header {
  padding: 30px;
}

header a {
  font-weight: bold;
  color: #2c3e50;
}

header a.router-link-exact-active {
  color: #42b983;
}

.main {
  background-color: ;
}
</style>
