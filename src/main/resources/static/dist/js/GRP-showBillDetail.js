(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["GRP-showBillDetail"],{eca8:function(e,t,o){"use strict";o.r(t);var n=function(){var e=this,t=e.$createElement,o=e._self._c||t;return o("v2container",{staticClass:"V2Container",staticStyle:{height:"450px",width:"400px","box-sizing":"border-box","align-self":"auto","border-right-width":"0","border-left-width":"0","border-top-width":"0","border-bottom-width":"0","margin-top":"10px","margin-bottom":"10px","flex-shrink":"0"},attrs:{wid:"root"}},[o("div",{ref:"v2Container_1",staticClass:"v2Container-1614697445658 V2Container",staticStyle:{"box-sizing":"border-box","align-self":"stretch",display:"flex","flex-direction":"column","align-items":"flex-start",height:"390.00px",width:"724.00px"},attrs:{wid:"1614697445658",if:!0}},[o("v2-component-text-value",{ref:"v2ComponentTextValue_6",staticClass:"v2-component-text-value-1614697534034 V2Widget",style:{"align-self":"auto",width:"322.00px","flex-shrink":0,height:"56.6px"},attrs:{wid:"1614697534034",title:"订单编号",overflow:"normal","overflow-line":3,"text-break":!0,type:"text",direction:"text-value-col",if:!0,value:e.order_id},on:{"update:value":function(t){e.order_id=t}}}),o("v2-component-text-value",{ref:"v2ComponentTextValue_7",staticClass:"v2-component-text-value-1614697534034 V2Widget",style:{"align-self":"auto",width:"322.00px","flex-shrink":0,height:"53.6px"},attrs:{wid:"1614697544289",title:"下单用户",overflow:"normal","overflow-line":3,"text-break":!0,type:"text",direction:"text-value-col",if:!0,value:e.loginName},on:{"update:value":function(t){e.loginName=t}}}),o("v2-component-text-value",{ref:"v2ComponentTextValue_8",staticClass:"v2-component-text-value-1614697534034 V2Widget",style:{"align-self":"auto",height:"81.00px",width:"322.00px","flex-shrink":0},attrs:{wid:"1614697453934",title:"寄件地址",overflow:"normal","overflow-line":3,"text-break":!0,type:"text",direction:"text-value-col",if:!0,value:e.sender},on:{"update:value":function(t){e.sender=t}}}),o("v2-component-text-value",{ref:"v2ComponentTextValue_9",staticClass:"v2-component-text-value-1614697534034 V2Widget",style:{"align-self":"auto",height:"85.00px",width:"322.00px","flex-shrink":0},attrs:{wid:"1614697672395",title:"收件地址",overflow:"normal","overflow-line":3,"text-break":!0,type:"text",direction:"text-value-col",if:!0,value:e.reciver},on:{"update:value":function(t){e.reciver=t}}}),o("v2-component-text-value",{ref:"v2ComponentTextValue_10",staticClass:"v2-component-text-value-1614697534034 V2Widget",style:{"align-self":"auto",height:"50.00px",width:"322.00px","flex-shrink":0},attrs:{wid:"1614697706848",title:"物品信息",overflow:"normal","overflow-line":3,"text-break":!0,type:"text",direction:"text-value-col",if:!0,value:e.stuffInfo},on:{"update:value":function(t){e.stuffInfo=t}}}),o("v2-component-text-value",{ref:"v2ComponentTextValue_11",staticClass:"v2-component-text-value-1614697534034 V2Widget",style:{"align-self":"auto",height:"56.00px",width:"322.00px","flex-shrink":0},attrs:{wid:"1614697671782",title:"下单时间",overflow:"normal","overflow-line":3,"text-break":!0,type:"text",direction:"text-value-col",if:!0,value:e.orderTime},on:{"update:value":function(t){e.orderTime=t}}})],1)])},a=[],i=o("a6fc"),l=o("25f3"),r={mixins:[i["b"],l["d"]],components:{},data:function(){return{CONTENT:{forms_v2:{config:[],validate_callbacks:[],submit_callbacks:[]},mapping:{1614693570282:[],1614696808267:[],1614696761906:[],1614696892928:[{id:1614696892928,modelValue:"value",dataValue:"order_id",type:""}],1614697123184:[{id:1614697123184,modelValue:"value",dataValue:"你好",type:""}],1614697378341:[{id:1614697378341,modelValue:"value",dataValue:"order_id",type:""}],1614697534034:[{id:1614697534034,modelValue:"value",dataValue:"order_id",type:""}],1614697544289:[{id:1614697544289,modelValue:"value",dataValue:"loginName",type:""}],1614697453934:[{id:1614697453934,modelValue:"value",dataValue:"sender",type:""}],1614697672395:[{id:1614697672395,modelValue:"value",dataValue:"reciver",type:""}],1614697706848:[{id:1614697706848,modelValue:"value",dataValue:"stuffInfo",type:""}],1614697671782:[{id:1614697671782,modelValue:"value",dataValue:"orderTime",type:""}]}},order_id:"",__VERSION:4}},props:{loginName:{default:function(){return""}},sender:{default:function(){return""}},reciver:{default:function(){return""}},stuffInfo:{default:function(){return""}},orderTime:{default:function(){return""}}},computed:{},watch:{},methods:{getOrderInfo:function(){var e=this;e.$axios.get("".concat(axios.server,"/orderInfo/get/").concat(e.order_id)).then((function(t){if(t.success&&t.status){var o=t.obj;console.log(o.stuffInfo),e.loginName=o.loginName,e.sender="寄件人:"+o.sender+"\n"+o.senderPhone+"\n"+o.senderAddress,e.reciver="收件人:"+o.receiver+"\n"+o.receiverPhone+"\n"+o.receivingAddress,e.stuffInfo=o.resSort+"\n重量:"+o.weight+"\n"+e.checkInsured(o.insuredPrice)+"\n运费:"+o.freight+"元\n"+o.paymentMethod,e.orderTime=String(o.orderTime)}})).catch((function(e){console.log(e)}))},checkInsured:function(e){return 1==e?"已保价":0==e?"未保价":void 0}},beforeCreate:function(){},created:function(){},beforeMount:function(){},mounted:function(){var e=this;e.getOrderInfo()},beforeUpdate:function(){},updated:function(){},beforeDestroy:function(){},destroyed:function(){},deactivated:function(){},activated:function(){}},u=r,d=o("2877"),s=Object(d["a"])(u,n,a,!1,null,null,null);t["default"]=s.exports}}]);