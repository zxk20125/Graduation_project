(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["main-main"],{"12f0":function(e,t,a){var o=a("2e07");"string"===typeof o&&(o=[[e.i,o,""]]),o.locals&&(e.exports=o.locals);var n=a("499e").default;n("17b1d30a",o,!0,{sourceMap:!1,shadowMode:!1})},"2e07":function(e,t,a){t=e.exports=a("2350")(!1),t.push([e.i,".v2-order-ctn{background:#fff;border:1px solid #ebeef5;border-radius:4px}.template-ctt-ctn{margin:5px!important;background:#fff;border:1px solid #ebeef5;border-radius:8px 8px 4px 4px}.template-ctt-header{background:#f5f7fa;border-bottom:2px solid #ebeef5;font-size:15px;font-weight:700;color:#666}.template-sub-ctt-ctn{margin:10px!important;border:1px solid #ebeef5;border-radius:4px}.template-sub-ctt-header{background:#f5f7fa;border-bottom:1px solid #ebeef5;font-size:14px;font-weight:700;color:#666}.template-tabs .el-tabs--border-card{border:none}.template-tabs .el-tabs__header{margin-bottom:0}.template-tabs .el-tabs__content{display:none}.template-userInfo-item{margin:5px 20px!important;font-size:15px;color:#888}.template-eventsInfo-item{border-radius:4px;background:#f5f7fa;font-size:15px;color:#888}.el-table th{background:#f5f7fa;color:#555}.tooltip-list{line-height:30px;margin:0 25px}.tooltip-list li{list-style:circle;font-size:14px;color:#888}.fx-tabs-ctt{overflow-x:hidden!important}",""])},"85d4":function(e,t,a){"use strict";a.r(t);var o=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("v2container",{staticClass:"V2Container",staticStyle:{display:"flex","align-items":"flex-start","align-self":"stretch",height:"100%","box-sizing":"border-box","flex-direction":"column","min-width":"50px","min-height":"50px","animation-duration":"1s","background-color":"rgba(0, 0, 0, 0)","flex-shrink":"0"},attrs:{wid:"root"}},[a("div",{ref:"v2Container_1580961183461",staticClass:"v2Container-1616835949341 V2Container",staticStyle:{height:"90%",width:"90%",background:"url('img/跑腿login.jpg')","box-sizing":"border-box","align-self":"auto"},attrs:{wid:"1616835949341",if:!0}})])},n=[],l=a("a6fc"),s=a("25f3"),i={mixins:[l["b"],s["d"]],components:{},data:function(){return{CONTENT:{forms_v2:{config:[],validate_callbacks:[],submit_callbacks:[]},mapping:{1579156958748:[{id:1579156958748,modelValue:"tableData",dataValue:"tableData",type:""}],1579154143412:[{id:1579154143412,modelValue:"customClass",dataValue:"pageSearchCtnClass",type:""}],1580806210155:[{id:1580806210155,modelValue:"tableData",dataValue:"tableData",type:""}],1580806814168:[{id:1580806814168,modelValue:"tableData",dataValue:"tableData",type:""}],1580830334970:[{id:1580830334970,modelValue:"tableData",dataValue:"eventsDetail",type:""}],1580866289081:[{id:1580866289081,modelValue:"tabs",dataValue:"todoUI.tabs",type:""}],1580867861641:[{id:1580867861641,modelValue:"page",dataValue:"todoPagePath",type:""}],1580889307649:[{id:1580889307649,modelValue:"src",dataValue:"userInfo.avatar",type:""}],1580889285169:[{id:1580889285169,modelValue:"text",dataValue:"userInfo.name",type:""}],1580889353973:[{id:1580889353973,modelValue:"text",dataValue:"userInfo.tel",type:""}],1580889264666:[{id:1580889264666,modelValue:"text",dataValue:"userInfo.userName",type:""}],1580889270385:[{id:1580889270385,modelValue:"text",dataValue:"userInfo.workNum",type:""}],1580889206815:[{id:1580889206815,modelValue:"text",dataValue:"userInfo.mail",type:""}],1580889617913:[{id:1580889617913,modelValue:"text",dataValue:"eventsInfo.eventStage.undo",type:""}],1580889605719:[{id:1580889605719,modelValue:"text",dataValue:"eventsInfo.eventStage.done",type:""}],1580889683798:[{id:1580889683798,modelValue:"text",dataValue:"eventsInfo.eventImportance.common",type:""}],1580889712266:[{id:1580889712266,modelValue:"text",dataValue:"eventsInfo.eventImportance.serious",type:""}],1580889695152:[{id:1580889695152,modelValue:"text",dataValue:"eventsInfo.eventImportance.emergency",type:""}]}},tableData:[{date:"2016-05-01",name:"王小虎",address:"上海市普陀区金沙江路 1111 弄",title:"页面1",path:"spa/newPage"},{date:"2016-05-02",name:"王小虎",address:"上海市普陀区金沙江路 2222 弄",title:"页面2",path:"spa/newSubPage"},{date:"2016-05-03",name:"王小虎",address:"上海市普陀区金沙江路 3333 弄",title:"页面3",path:"spa/open"},{date:"2016-05-04",name:"王小虎",address:"上海市普陀区金沙江路 4444 弄",title:"页面4",path:"spa/spa"}],todoUI:{tabs:[{icon:"el-icon-knife-fork",text:"待办事项",badge:{val:"10",type:"danger"}},{icon:"el-icon-cold-drink",text:"已取消待办",badge:{val:"20",type:"primary"}},{icon:"el-icon-chat-line-round",text:"最新公告",badge:{val:"30",type:"success"}}],btns:[{icon:"",text:"更多"}]},userInfo:{avatar:"img/user.png",name:"张三",tel:"12345678910",userName:"觉得你就爱看",workNum:"2020",mail:"aaa@bbb.cn"},eventsInfo:{eventStage:{undo:242,done:210},eventImportance:{common:54,serious:124,emergency:64}},eventsDetail:[{item:"协议支付",unprocessed:20,processed:11,processStatus:{auto:1,manual:10},processRate:"50%",unsolved:10},{item:"付款",unprocessed:20,processed:12,processStatus:{auto:2,manual:10},processRate:"50%",unsolved:10},{item:"退款",unprocessed:20,processed:13,processStatus:{auto:3,manual:10},processRate:"50%",unsolved:10}],__VERSION:4}},props:{todoPagePath:{default:function(){return"_customWidget/fxTodos/undo"}}},computed:{},watch:{},methods:{openSubPage:function(e,t,a){var o=this;o.open({status:!0,title:t.title,path:t.path,page:t.path,type:"SUB",params:{}})},tooltipCallback:function(e,t,a){var o=document.createElement("ul");return o.className="tooltip-list",o.innerHTML="<li>自动处理 : ".concat(t.processStatus.auto,"</li><li>人工处理 : ").concat(t.processStatus.manual,"</li>"),{dom:o}},testEv:function(e){console.log("param: ",e),alert("已处理 "+e.processed)}},beforeCreate:function(){},created:function(){},beforeMount:function(){},mounted:function(){},beforeUpdate:function(){},updated:function(){},beforeDestroy:function(){},destroyed:function(){},deactivated:function(){},activated:function(){}},d=i,r=(a("c165"),a("2877")),u=Object(r["a"])(d,o,n,!1,null,null,null);t["default"]=u.exports},c165:function(e,t,a){"use strict";a("12f0")}}]);