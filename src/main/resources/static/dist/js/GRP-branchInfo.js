(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["GRP-branchInfo"],{fa38:function(t,e,a){"use strict";a.r(e);var n=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("v2container",{staticClass:"V2Container",staticStyle:{"flex-shrink":"0","box-sizing":"border-box"},attrs:{wid:"root"}},[a("div",{ref:"v2Container_1",staticClass:"v2Container-1612854178100 V2Container",staticStyle:{"box-sizing":"border-box","align-self":"stretch",display:"flex","flex-direction":"row","align-items":"flex-start",height:"auto"},attrs:{wid:"1612854178100",if:!0}},[a("v2-form-input",{ref:"v2FormInput_4",staticClass:"v2-form-input-1612854599723 V2Widget",style:{position:"relative","align-self":"auto","padding-left":0,"flex-shrink":0},attrs:{wid:"1612854599723",theme:{size:""},disabled:!1,label:"网点名",placeholder:"请输入","title-mode":"col","label-witdh":"80px","input-type":"text",rows:2,"show-word-limit":!1,clearable:!1,"is-required":!1,"auto-complete":!1,if:!0,value:t.dot_name},on:{"update:value":function(e){t.dot_name=e}}}),a("v2-component-btn",{ref:"v2ComponentBtn_1",staticClass:"v2-component-btn-1612855111983 V2Widget",style:{"align-self":"auto"},attrs:{wid:"1612855111983",theme:{btnType:"primary",size:""},disabled:!1,loading:!1,"btn-name":"查询",shape:"def",if:!0},on:{"_op_component-btn_btn:undefined":t.v2_component_btn_1613138459846}})],1),a("v2-component-table",{ref:"v2ComponentTable_1",staticClass:"v2-component-table-1612854187456 V2Widget",style:{"align-self":"auto",height:"816.00px","margin-left":"0",width:"calc(100% - 20px)","flex-shrink":0},attrs:{wid:"1612854187456",setPageCallback:t.setPageCallback,toolBar:!0,tableData:t.branchList,pageSize:t.pageSize,totalCount:t.branchTotalCount,theme:{tableType:"border",size:""},"tooltip-effect":"dark",columns:[{active:!0,type:"text",prop:"dot_name",label:"网点名",handleLink:!0,handleLinkCB:"handleLinkCallback",linkTarget:"_blank",openTooltip:!1,handleTooltip:!0,tooltipContent:"提示",tooltipContentCallback:"tooltipContentCallback",useMinWidth:!0,headerAlign:"left",align:"left",sortable:!1,openFilter:!1,combi:[],tagMap:[],textMap:[],iconMap:[],filterMap:[]},{active:!0,type:"text",prop:"dot_city",label:"网点所在城市",handleLink:!0,handleLinkCB:"handleLinkCallback",linkTarget:"_blank",openTooltip:!1,handleTooltip:!0,tooltipContent:"提示",tooltipContentCallback:"tooltipContentCallback",useMinWidth:!0,headerAlign:"left",align:"left",sortable:!1,openFilter:!1,combi:[],tagMap:[],textMap:[],iconMap:[],filterMap:[]},{active:!0,type:"text",prop:"dot_address",label:"网点地址",handleLink:!0,handleLinkCB:"handleLinkCallback",linkTarget:"_blank",openTooltip:!1,handleTooltip:!0,tooltipContent:"提示",tooltipContentCallback:"tooltipContentCallback",useMinWidth:!0,headerAlign:"left",align:"left",sortable:!1,openFilter:!1,combi:[],tagMap:[],textMap:[],iconMap:[],filterMap:[]},{active:!0,type:"text",prop:"dot_phone",label:"联系号码",handleLink:!0,handleLinkCB:"handleLinkCallback",linkTarget:"_blank",openTooltip:!1,handleTooltip:!0,tooltipContent:"提示",tooltipContentCallback:"tooltipContentCallback",useMinWidth:!0,headerAlign:"left",align:"left",sortable:!1,openFilter:!1,combi:[],tagMap:[],textMap:[],iconMap:[],filterMap:[]},{active:!0,type:"text",prop:"id",handleLink:!0,handleLinkCB:"handleLinkCallback",linkTarget:"_blank",openTooltip:!1,handleTooltip:!0,tooltipContent:"提示",tooltipContentCallback:"tooltipContentCallback",useMinWidth:!0,headerAlign:"left",align:"left",sortable:!1,openFilter:!1,combi:[],tagMap:[],textMap:[],iconMap:[],filterMap:[]}],"table-data":t.branchList,"selection-location":"left","t-height":"100%","t-max-height":"100%","open-index":!1,loading:!1,"index-location":"left","open-page":!0,"page-size":t.pageSize,"open-set-page-callback":!0,"set-page-callback":"getbranchInfo","total-count":t.branchTotalCount,"tool-bar":!0,"tool-title":"操作","tool-header-align":"left","tool-location":"right","tool-width":100,"tool-btns":[{active:!0,btnName:"编辑",type:"primary",handler:"openEditBranchPage",rowName:" ",toolIcon:" ",rowValue:" "}],expand:!1,if:!0}})],1)},o=[],l=a("ade3"),i=a("a6fc"),c=a("25f3"),r={mixins:[i["b"],c["d"]],components:{},data:function(){return{CONTENT:{forms_v2:{config:[],validate_callbacks:[],submit_callbacks:[]},mapping:{1612854187456:[{id:1612854187456,modelValue:"setPageCallback",dataValue:"setPageCallback",type:""},{id:1612854187456,modelValue:"toolBar",dataValue:"true",type:""},{id:1612854187456,modelValue:"tableData",dataValue:"branchList",type:""},{id:1612854187456,modelValue:"pageSize",dataValue:"pageSize",type:""},{id:1612854187456,modelValue:"totalCount",dataValue:"branchTotalCount",type:""}],1612854599723:[{id:1612854599723,modelValue:"value",dataValue:"dot_name",type:""}]}},dot_name:"",__VERSION:4}},props:{pageSize:{default:function(){return 10}},branchTotalCount:{default:function(){return 1}},branchList:{default:function(){return[]}}},computed:{},watch:{},methods:{getbranchInfo:function(t,e){var a=this;t&&(a.currentPage=t),!t&&(a.currentPage=1),e&&(a.pageSize=e),!e&&(a.pageSize=10);var n={pageNum:a.currentPage,pageSize:a.pageSize,orders:[],query:{dotName:a.dot_name},ranges:[]};a.$axios.post("".concat(axios.server,"/branchInfo/list"),n).then((function(t){if(t.success&&t.status){var e=t.obj&&t.obj.records||[];a.branchList=e.map((function(t){return{dot_name:t.dotName,dot_city:t.dotCity,dot_address:t.dotAddress,dot_phone:t.dotPhone,id:t.dotId}})),a.branchTotalCount=t.obj&&t.obj.total}})).catch((function(t){}))},v2_component_btn_1613138459846:function(t){arguments.length>1&&void 0!==arguments[1]||this.$refs["v2ComponentBtn_1"];var e=this;e.getStaffInfo()},openEditBranchPage:function(t,e){var a,n=this;console.log(e.staff_id),n.open((a={title:"编辑网点信息",path:"/edit/Branch",component:"GRP/editBranchSubPage",type:"SUB",closeOnClickModal:!1,params:{id:e.id},hideConfirmBtn:!0,hideCancelBtn:!0,width:"650px",height:"550px"},Object(l["a"])(a,"closeOnClickModal",!0),Object(l["a"])(a,"confirmCallback",(function(t){n.$axios.post("".concat(axios.server,"/branchInfo/update"),t).then((function(t){t.success?(n.$notify({title:"编辑网点信息成功",type:"success"}),n.getStaffInfo(n.currentPage)):n.$notify({title:t.msg,type:"error"})})).catch((function(t){console.log(t),n.$notify({title:t.msg||"编辑失败",type:"error"})}))})),Object(l["a"])(a,"cancelCallback",(function(t){console.log("点击取消")})),a))}},beforeCreate:function(){},created:function(){},beforeMount:function(){},mounted:function(){},beforeUpdate:function(){},updated:function(){},beforeDestroy:function(){},destroyed:function(){},deactivated:function(){},activated:function(){}},p=r,d=a("2877"),s=Object(d["a"])(p,n,o,!1,null,null,null);e["default"]=s.exports}}]);