<!--用例测试页面-->
<template>
  <button @click="change">change</button>
  <h1 v-show="flag.flag">出现/消息</h1>
</template>

<script setup>
import {getCurrentInstance, reactive} from "vue";
const {proxy} = getCurrentInstance()

let flag = reactive({
  flag: true
});

const change = ()=>{
  console.log(flag.flag)
  flag.flag = !flag.flag;
  console.log(flag.flag)
  proxy.$forceUpdate()
}
</script>