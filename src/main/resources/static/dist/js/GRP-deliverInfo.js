(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["GRP-deliverInfo"],{ed48:function(t,e,a){"use strict";a.r(e);var n=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("v2container",{staticClass:"V2Container",staticStyle:{"flex-shrink":"0","box-sizing":"border-box"},attrs:{wid:"root"}},[a("div",{ref:"v2Container_1",staticClass:"v2Container-1612854178100 V2Container",staticStyle:{"box-sizing":"border-box","align-self":"stretch",display:"flex","flex-direction":"row","align-items":"flex-start",height:"auto"},attrs:{wid:"1612854178100",if:!0}},[a("v2-form-input",{ref:"v2FormInput_4",staticClass:"v2-form-input-1612854599723 V2Widget",style:{position:"relative","align-self":"auto","padding-left":0,"flex-shrink":0},attrs:{wid:"1612854599723",theme:{size:""},disabled:!1,label:"员工账号",placeholder:"请输入","title-mode":"col","label-witdh":"80px","input-type":"text",rows:2,"show-word-limit":!1,clearable:!1,"is-required":!1,"auto-complete":!1,if:!0,value:t.staff_name},on:{"update:value":function(e){t.staff_name=e}}}),a("v2-component-btn",{ref:"v2ComponentBtn_1",staticClass:"v2-component-btn-1612855111983 V2Widget",style:{"align-self":"auto","flex-shrink":0,"margin-left":"10px"},attrs:{wid:"1612855111983",theme:{btnType:"primary",size:""},disabled:!1,loading:!1,"btn-name":"查询","right-icon":"el-icon-search",shape:"def",if:!0},on:{"_op_component-btn_btn:click":t.v2_component_btn_1614091887290}}),a("v2-component-btn",{ref:"v2ComponentBtn_3",staticClass:"v2-component-btn-1614086695490 V2Widget",style:{"align-self":"auto","margin-left":"20px","flex-shrink":0},attrs:{wid:"1614086695490",theme:{btnType:"primary",size:""},disabled:!1,loading:!1,"btn-name":"新增","right-icon":"el-icon-plus",shape:"def",if:!0},on:{"_op_component-btn_btn:click":t.v2_component_btn_1614086629526}})],1),a("v2-component-table",{ref:"v2ComponentTable_1",staticClass:"v2-component-table-1612854187456 V2Widget",style:{"align-self":"auto",height:"816.00px","margin-left":"0",width:"calc(100% - 20px)","flex-shrink":0},attrs:{wid:"1612854187456",setPageCallback:t.setPageCallback,toolBar:!0,tableData:t.staffList,pageSize:t.pageSize,currentPage:t.currentPage,totalCount:t.staffTotalCount,theme:{tableType:"border",size:""},"tooltip-effect":"dark",columns:[{active:!0,type:"text",prop:"staff_id",label:"员工编号",handleLink:!0,handleLinkCB:"handleLinkCallback",linkTarget:"_blank",openTooltip:!1,handleTooltip:!0,tooltipContent:"提示",tooltipContentCallback:"tooltipContentCallback",useMinWidth:!0,headerAlign:"left",align:"left",sortable:!1,openFilter:!1,combi:[],tagMap:[],textMap:[],iconMap:[],filterMap:[]},{active:!0,type:"text",prop:"staff_name",label:"姓名",handleLink:!0,handleLinkCB:"handleLinkCallback",linkTarget:"_blank",openTooltip:!1,handleTooltip:!0,tooltipContent:"提示",tooltipContentCallback:"tooltipContentCallback",useMinWidth:!0,headerAlign:"left",align:"left",sortable:!1,openFilter:!1,combi:[],tagMap:[],textMap:[],iconMap:[],filterMap:[]},{active:!0,type:"text",prop:"staff_sex",label:"性别",handleLink:!0,handleLinkCB:"handleLinkCallback",linkTarget:"_blank",openTooltip:!1,handleTooltip:!0,tooltipContent:"提示",tooltipContentCallback:"tooltipContentCallback",useMinWidth:!0,headerAlign:"left",align:"left",sortable:!1,openFilter:!1,combi:[],tagMap:[],textMap:[],iconMap:[],filterMap:[]},{active:!0,type:"text",prop:"staff_age",label:"年龄",handleLink:!0,handleLinkCB:"handleLinkCallback",linkTarget:"_blank",openTooltip:!1,handleTooltip:!0,tooltipContent:"提示",tooltipContentCallback:"tooltipContentCallback",useMinWidth:!0,headerAlign:"left",align:"left",sortable:!1,openFilter:!1,combi:[],tagMap:[],textMap:[],iconMap:[],filterMap:[]},{active:!0,type:"text",prop:"staff_phone",label:"联系号码",handleLink:!0,handleLinkCB:"handleLinkCallback",linkTarget:"_blank",openTooltip:!1,handleTooltip:!0,tooltipContent:"提示",tooltipContentCallback:"tooltipContentCallback",useMinWidth:!0,headerAlign:"left",align:"left",sortable:!1,openFilter:!1,combi:[],tagMap:[],textMap:[],iconMap:[],filterMap:[]},{active:!0,type:"text",prop:"dot_id",label:"所属网点",handleLink:!0,handleLinkCB:"handleLinkCallback",linkTarget:"_blank",openTooltip:!1,handleTooltip:!0,tooltipContent:"提示",tooltipContentCallback:"tooltipContentCallback",useMinWidth:!0,headerAlign:"left",align:"left",sortable:!1,openFilter:!1,combi:[],tagMap:[],textMap:[],iconMap:[],filterMap:[]},{active:!0,type:"text",prop:"hiredate",label:"入职时间",handleLink:!0,handleLinkCB:"handleLinkCallback",linkTarget:"_blank",openTooltip:!1,handleTooltip:!0,tooltipContent:"提示",tooltipContentCallback:"tooltipContentCallback",useMinWidth:!0,headerAlign:"left",align:"left",sortable:!1,openFilter:!1,combi:[],tagMap:[],textMap:[],iconMap:[],filterMap:[]}],"table-data":t.staffList,"selection-location":"left","t-height":"100%","t-max-height":"100%","open-index":!1,loading:!1,"index-location":"left","open-page":!0,"page-size":t.pageSize,"open-set-page-callback":!0,"set-page-callback":"getStaffInfo","current-page":t.currentPage,"total-count":t.staffTotalCount,"tool-bar":!0,"tool-title":"操作","tool-header-align":"left","tool-location":"right","tool-width":100,"tool-btns":[{active:!0,btnName:"编辑",type:"primary",handler:"editStaff",rowName:" ",toolIcon:" ",rowValue:" "}],expand:!1,if:!0}})],1)},o=[],l=a("ade3"),i=a("a6fc"),c=a("25f3"),f={mixins:[i["b"],c["d"]],components:{},data:function(){return{CONTENT:{forms_v2:{config:[],validate_callbacks:[],submit_callbacks:[]},mapping:{1612854187456:[{id:1612854187456,modelValue:"setPageCallback",dataValue:"setPageCallback",type:""},{id:1612854187456,modelValue:"toolBar",dataValue:"true",type:""},{id:1612854187456,modelValue:"tableData",dataValue:"staffList",type:""},{id:1612854187456,modelValue:"pageSize",dataValue:"pageSize",type:""},{id:1612854187456,modelValue:"currentPage",dataValue:"currentPage",type:""},{id:1612854187456,modelValue:"totalCount",dataValue:"staffTotalCount",type:""}],1612854599723:[{id:1612854599723,modelValue:"value",dataValue:"staff_name",type:""}]}},staff_name:"",__VERSION:4}},props:{pageSize:{default:function(){return 10}},staffList:{default:function(){return[]}},staffTotalCount:{default:function(){return 1}},currentPage:{default:function(){return 1}}},computed:{},watch:{},methods:{getStaffInfo:function(t,e){var a=this;t&&(a.currentPage=t),!t&&(a.currentPage=1),e&&(a.pageSize=e),!e&&(a.pageSize=10);var n={pageNum:a.currentPage,pageSize:a.pageSize,orders:[],query:{staffName:a.staff_name},ranges:[]};a.$axios.post("".concat(axios.server,"/staffInfo/list"),n).then((function(t){if(t.success&&t.status){var e=t.obj&&t.obj.records||[];a.staffList=e.map((function(t){return{staff_name:t.staffName,staff_age:t.staffAge,staff_sex:t.staffSex,staff_id:t.staffId,staff_phone:t.staffPhone,hiredate:t.hiredate,dot_id:a.getDotName(t.dotId)}})),a.staffTotalCount=t.obj&&t.obj.total}})).catch((function(t){}))},v2_component_btn_1613138459846:function(t,e){var a=this;a.getStaffInfo()},openEditStaffPage:function(){var t,e=this;e.open((t={title:"新增配送员",path:"/add/authority",component:"GRP/editdeliverSubPage",type:"SUB",closeOnClickModal:!1,hideConfirmBtn:!0,hideCancelBtn:!0,width:"650px",height:"550px"},Object(l["a"])(t,"closeOnClickModal",!0),Object(l["a"])(t,"confirmCallback",(function(t){e.$axios.post("".concat(axios.server,"/staffInfo/add"),t).then((function(t){t.success?(e.$notify({title:"新增权限成功",type:"success"}),e.getStaffInfo(e.currentPage)):e.$notify({title:t.msg,type:"error"})})).catch((function(t){console.log(t),e.$notify({title:t.msg||"新增失败",type:"error"})}))})),Object(l["a"])(t,"cancelCallback",(function(t){console.log("点击取消")})),t))},editStaff:function(t,e){var a,n=this;console.log(e.staff_id),n.open((a={title:"编辑配送员信息",path:"/edit/Staff",component:"GRP/editdeliverSubPage",type:"SUB",closeOnClickModal:!1,params:{staffId:e.staff_id},width:"650px",height:"550px",hideConfirmBtn:!0,hideCancelBtn:!0},Object(l["a"])(a,"closeOnClickModal",!0),Object(l["a"])(a,"confirmCallback",(function(t){n.$axios.post("".concat(axios.server,"/staffInfo/update"),t).then((function(t){t.success?(n.$notify({title:"编辑配送员成功",type:"success"}),n.getStaffInfo(n.currentPage)):n.$notify({title:t.msg,type:"error"})})).catch((function(t){console.log(t),n.$notify({title:t.msg||"编辑失败",type:"error"})}))})),Object(l["a"])(a,"cancelCallback",(function(t){console.log("点击取消")})),a))},v2_component_btn_1614086629526:function(t){arguments.length>1&&void 0!==arguments[1]||this.$refs["v2ComponentBtn_3"];var e=this;e.openEditStaffPage()},v2_component_btn_1614091887290:function(t){arguments.length>1&&void 0!==arguments[1]||this.$refs["v2ComponentBtn_1"];var e=this;e.getStaffInfo(e.currentPage)},getDotName:function(t){switch(t){case 1:return"从化总部";case 2:return"海珠分部";case 4:return"荔湾分部";case 5:return"天河分部";case 6:return"白云分部";case 7:return"越秀分部";case 8:return"花都分部";case 9:return"增城分部";case 10:return"番禺分部"}}},beforeCreate:function(){},created:function(){},beforeMount:function(){},mounted:function(){},beforeUpdate:function(){},updated:function(){},beforeDestroy:function(){},destroyed:function(){},deactivated:function(){},activated:function(){}},r=f,p=a("2877"),s=Object(p["a"])(r,n,o,!1,null,null,null);e["default"]=s.exports}}]);