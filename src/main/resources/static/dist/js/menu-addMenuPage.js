(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["menu-addMenuPage"],{"0a46":function(e,t,i){var a=i("cdbf");"string"===typeof a&&(a=[[e.i,a,""]]),a.locals&&(e.exports=a.locals);var o=i("499e").default;o("96520ba4",a,!0,{sourceMap:!1,shadowMode:!1})},"23a3":function(e,t,i){"use strict";i.r(t);var a=function(){var e=this,t=e.$createElement,i=e._self._c||t;return i("v2container",{staticClass:"form-user-info-wrapper V2Container",staticStyle:{"flex-direction":"column","min-width":"50px","min-height":"50px","animation-duration":"1s","flex-shrink":"0"},attrs:{wid:"root"}},[i("v2-form-input",{ref:"v2-form-input_1578989229995",staticClass:"form-item-block V2Widget",style:{position:"relative","margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px",overflow:"hidden","animation-duration":"1s"},attrs:{wid:"1578989229995",labelWitdh:e.labelWidth,theme:{},disabled:!1,label:"名称",placeholder:"请输入名称","title-mode":"col","label-witdh":e.labelWidth,"input-type":"text",rows:2,"show-word-limit":!1,clearable:!1,"is-required":!0,"auto-complete":!1,visible:!0,"custom-class":["form-item-block"],value:e.menuObj.name},on:{"update:value":function(t){return e.$set(e.menuObj,"name",t)}}}),i("v2-form-input",{ref:"v2-form-input_1578989270974",staticClass:"form-item-block V2Widget",style:{position:"relative","margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px",overflow:"hidden","animation-duration":"1s"},attrs:{wid:"1578989270974",labelWitdh:e.labelWidth,theme:{},disabled:!1,label:"标题",placeholder:"请输入标题","title-mode":"col","label-witdh":e.labelWidth,"input-type":"text",rows:2,"show-word-limit":!1,clearable:!1,"is-required":!0,"auto-complete":!1,visible:!0,"custom-class":["form-item-block"],value:e.menuObj.title},on:{"update:value":function(t){return e.$set(e.menuObj,"title",t)}}}),i("v2-form-input",{ref:"v2-form-input_1578989245653",staticClass:"form-item-block V2Widget",style:{position:"relative","margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px",overflow:"hidden","animation-duration":"1s"},attrs:{wid:"1578989245653",labelWitdh:e.labelWidth,theme:{},disabled:!1,label:"路径",placeholder:"请输入路径","title-mode":"col","label-witdh":e.labelWidth,"input-type":"text",rows:2,"show-word-limit":!1,clearable:!1,"is-required":!1,"auto-complete":!1,visible:!0,"custom-class":["form-item-block"],value:e.menuObj.path},on:{"update:value":function(t){return e.$set(e.menuObj,"path",t)}}}),i("v2-form-select",{ref:"v2-form-select_1578991541023",staticClass:"form-item-block v2-form-select-1578991541023 V2Widget",style:{position:"relative","margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px",overflow:"hidden","animation-duration":"1s","flex-shrink":0},attrs:{wid:"1578991541023",labelWitdh:e.labelWidth,optionConfig:e.menuList,theme:{size:""},disabled:!1,"data-type":"def","option-config":e.menuList,options:[{active:"true",label:"",value:""},{active:!0,label:"",value:""}],label:"父级菜单",placeholder:"请选择父级菜单","label-witdh":e.labelWidth,"title-mode":"col",clearable:!1,filterable:!0,"is-required":!1,visible:!0,"custom-class":["form-item-block","v2-form-select-1578991541023"],value:e.menuObj.parentId},on:{"update:value":function(t){return e.$set(e.menuObj,"parentId",t)}}}),i("v2-form-select",{ref:"v2FormSelect_1",staticClass:"form-item-block v2-form-select-1578991541023 v2-form-select-1598930198699 V2Widget",style:{position:"relative","margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px",overflow:"hidden","animation-duration":"1s"},attrs:{wid:"1598930198699",labelWitdh:e.labelWidth,optionConfig:e.iconList,theme:{size:""},disabled:!1,"data-type":"def","option-config":e.iconList,options:[{active:"true",label:"",value:""},{active:!0,label:"",value:""}],label:"图标",placeholder:"请选择图标","label-witdh":e.labelWidth,"title-mode":"col",clearable:!0,filterable:!0,"is-required":!1,visible:!0,"custom-class":["form-item-block","v2-form-select-1578991541023","v2-form-select-1598930198699"],value:e.menuObj.icon},on:{"update:value":function(t){return e.$set(e.menuObj,"icon",t)}}}),i("v2-form-input",{ref:"v2-form-input_1578989273015",staticClass:"form-item-block V2Widget",style:{position:"relative","margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px",overflow:"hidden","animation-duration":"1s"},attrs:{wid:"1578989273015",labelWitdh:e.labelWidth,theme:{size:""},disabled:!1,label:"排序",placeholder:"请输入排序","title-mode":"col","label-witdh":e.labelWidth,"input-type":"text",rows:2,"show-word-limit":!1,clearable:!1,"is-required":!1,"auto-complete":!1,visible:!0,"custom-class":["form-item-block"],value:e.menuObj.order},on:{"update:value":function(t){return e.$set(e.menuObj,"order",t)}}}),i("v2-form-input",{ref:"v2-form-input_1578989373807",staticClass:"form-textarea V2Widget",style:{position:"relative","margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px",overflow:"hidden","animation-duration":"1s"},attrs:{wid:"1578989373807",labelWitdh:e.labelWidth,theme:{size:""},disabled:!1,label:"描述",placeholder:"请填写描述","title-mode":"col","label-witdh":e.labelWidth,"input-type":"textarea",rows:5,maxlength:200,"show-word-limit":!0,clearable:!1,"is-required":!1,"auto-complete":!1,visible:!0,"custom-class":["form-textarea"],value:e.menuObj.desc},on:{"update:value":function(t){return e.$set(e.menuObj,"desc",t)}}}),i("v2-form-switch",{ref:"form-switch-1",staticClass:"V2Widget",style:{"margin-left":"10px","margin-right":"10px"},attrs:{wid:"1596089189700",labelWitdh:e.labelWidth,disabled:!1,label:"增量部署","label-witdh":e.labelWidth,"title-mode":"col","is-required":!1,visible:!0,"custom-class":[],value:e.menuObj.deploy},on:{"update:value":function(t){return e.$set(e.menuObj,"deploy",t)}}}),i("div",{ref:"v2Container_1580814894142",staticClass:"diaglog-btn-ctn V2Container",style:{position:"relative",overflow:"hidden","justify-content":"flex-end","min-width":"50px","min-height":"50px","animation-duration":"1s"},attrs:{wid:"1580814894142","custom-class":["diaglog-btn-ctn","V2Container"],component:"v2Container"}},[i("v2-component-btn",{ref:"v2-component-btn_1580814867006",staticClass:"common-btn-normal V2Widget",style:{position:"relative","margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px","flex-shrink":"0",overflow:"hidden","animation-duration":"1s"},attrs:{wid:"1580814867006",theme:{btnType:"normal",size:""},disabled:!1,loading:!1,"btn-name":"取消",shape:"plain",visible:!0,"custom-class":["common-btn-normal"]},on:{"_op_componentbtn_btn:click":e.v2_component_btn_1580814836000}}),i("v2-component-btn",{ref:"v2-component-btn_1580814895794",staticClass:"common-btn-focus margin-right20 V2Widget",style:{"margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px",overflow:"hidden","animation-duration":"1s"},attrs:{wid:"1580814895794",theme:{btnType:"primary",size:""},disabled:!1,loading:!1,"btn-name":"提交",shape:"def",visible:!0,"custom-class":["common-btn-focus","margin-right20"]}})],1)],1)},o=[],n=(i("456d"),i("55dd"),i("7f7f"),i("ac6a"),i("25f3")),l=i("a6fc"),r={mixins:[l["b"],n["d"]],components:{},data:function(){return{CONTENT:{forms_v2:{config:[{name:"menuForm",desc:"菜单表单",validate_when:"blur",submit_emitters:[{widget_id:1580814895794,event:"(default)"}],inputs:{1578989229995:{desc:"名称",validation:{kind:"single-regexp",value:{value:"[a-zA-Z]+",message:"名称为英文字符"}},name:"name"},1578989270974:{desc:"标题",validation:{kind:"single-regexp",value:{value:"\\S+",message:"标题不能为空"}},name:"标题"},1580814895794:{desc:"提交",validation:{kind:"dict",value:{ref:null,rules:[],disabled_rules:[]}},name:"submitBtn"}}}],validate_callbacks:[function(e,t,i,a){console.log("字段:"),e.child_results.forEach((function(e){e.ok?console.log(e.fieldName,"输入正确"):console.log(e.fieldName,"输入不正确",e.message),e.vueIns.$showResult&&e.vueIns.$showResult(e)})),e.ok?(console.log("=> 表单输入正确，验证通过"),i()):(console.log("=> 表单输入不正确"),a())}],submit_callbacks:[function(e,t){var i={name:t.menuObj.name,desc:t.menuObj.desc,title:t.menuObj.title,path:t.menuObj.path,icon:t.menuObj.icon,parentId:t.menuObj.parentId,order:t.menuObj.order,deploy:t.menuObj.deploy};t.AParams.id&&(i.id=t.AParams.id),t.$root.confirm(i)}]},mapping:{1578989229995:[{id:1578989229995,modelValue:"value",dataValue:"menuObj.name",type:""},{id:1578989229995,modelValue:"labelWitdh",dataValue:"labelWidth",type:""}],1578989270974:[{id:1578989270974,modelValue:"value",dataValue:"menuObj.title",type:""},{id:1578989270974,modelValue:"labelWitdh",dataValue:"labelWidth",type:""}],1578989245653:[{id:1578989245653,modelValue:"value",dataValue:"menuObj.path",type:""},{id:1578989245653,modelValue:"labelWitdh",dataValue:"labelWidth",type:""}],1578989303711:[{id:1578989303711,modelValue:"value",dataValue:"selectedMenuTree",type:""},{id:1578989303711,modelValue:"labelWitdh",dataValue:"labelWidth",type:""},{id:1578989303711,modelValue:"optionConfig",dataValue:"menuTreeData",type:""}],1578989273015:[{id:1578989273015,modelValue:"labelWitdh",dataValue:"labelWidth",type:""},{id:1578989273015,modelValue:"value",dataValue:"menuObj.order",type:""}],1578989373807:[{id:1578989373807,modelValue:"value",dataValue:"menuObj.desc",type:""},{id:1578989373807,modelValue:"labelWitdh",dataValue:"labelWidth",type:""}],1578991541023:[{id:1578991541023,modelValue:"value",dataValue:"menuObj.parentId",type:""},{id:1578991541023,modelValue:"labelWitdh",dataValue:"labelWidth",type:""},{id:1578991541023,modelValue:"optionConfig",dataValue:"menuList",type:""}],1580801069334:[{id:1580801069334,modelValue:"value",dataValue:"menuObj.icon",type:""},{id:1580801069334,modelValue:"labelWitdh",dataValue:"labelWidth",type:""}],1596089189700:[{id:1596089189700,modelValue:"labelWitdh",dataValue:"labelWidth",type:""},{id:1596089189700,modelValue:"value",dataValue:"menuObj.deploy",type:""}],1598930198699:[{id:1598930198699,modelValue:"labelWitdh",dataValue:"labelWidth",type:""},{id:1598930198699,modelValue:"value",dataValue:"menuObj.icon",type:""},{id:1598930198699,modelValue:"optionConfig",dataValue:"iconList",type:""}]}},labelWidth:"100px",menuList:[],__VERSION:4}},props:{menuObj:{default:function(){return{name:"",title:"",desc:"",path:"",order:"",icon:"",parentId:"",deploy:!1}}}},computed:{iconList:function(){var e=this;return e.$root.__parent.$root.$store.state.icon.icons||[]}},watch:{},methods:{getMenuList:function(){var e=this;e.$axios.get("".concat(axios.server,"/menu/list")).then((function(t){t.status&&t.success&&(e.menuList=t.obj.sort((function(e,t){return parseInt(e.order,10)-parseInt(t.order,10)})).map((function(e){return{value:e.id,label:e.title}})))})).catch((function(e){console.log(e)}))},transformMenu:function(e){var t=this,i={},a=e||[];return e&&e.length?(a.sort((function(e,t){return parseInt(e.order,10)-parseInt(t.order,10)})).map((function(e){!e.parentId&&(e.parentId="");var t=i[e.parentId];t?!t.children&&(t.children=[]):t=i[e.parentId]={value:e.parentId,id:e.parentId,children:[]};var a=i[e.id]||{id:e.id,value:e.id};a.label=e.title,a.parentId=e.parentId||"",i[e.id]=a,t.children.push(a)})),t.menuTreeObj=i,Object.keys(i).filter((function(e){return!i[e].children})).map((function(e){return delete i[e]})),i[""].children):[]},setFormTips:function(){pipe.tooltip(this.__getVueIns("1578989229995").$refs._op_formInput_input,{content:"菜单名称为英文字符",placement:"top-start",style:{fontSize:"12px"}}),pipe.tooltip(this.__getVueIns("1578989270974").$refs._op_formInput_input,{content:"请输入菜单标题",placement:"top-start",style:{fontSize:"12px"}}),pipe.tooltip(this.__getVueIns("1578989245653").$refs._op_formInput_input,{content:"请填写菜单路径",placement:"top-start",style:{fontSize:"12px"}}),pipe.tooltip(this.__getVueIns("1578991541023").$refs._op_formSelect_select,{content:"请选择父级菜单",placement:"top-start",style:{fontSize:"12px"}}),pipe.tooltip(this.__getVueIns("1580801069334").$refs._op_formInput_input,{content:"请填写菜单图标类名，如el-icon-menu",placement:"top-start",style:{fontSize:"12px"}}),pipe.tooltip(this.__getVueIns("1578989273015").$refs._op_formInput_input,{content:"请输入排序，为整数",placement:"top-start",style:{fontSize:"12px"}}),pipe.tooltip(this.__getVueIns("1578989373807").$refs._op_formInput_input,{content:"菜单描述长度限制为 0 到 200 个字符",placement:"top-start",style:{fontSize:"12px"}})},v2_component_btn_1580802220000:function(e){var t=this;t.close()},getMenuDetail:function(){var e=this;e.$axios.get("".concat(axios.server,"/menu/get/").concat(e.AParams.id)).then((function(t){t.status&&t.success&&(e.menuObj.name=t.obj.name,e.menuObj.title=t.obj.title,e.menuObj.desc=t.obj.desc,e.menuObj.path=t.obj.path,e.menuObj.order=t.obj.order,e.menuObj.icon=t.obj.icon,e.menuObj.parentId=t.obj.parentId,e.menuObj.deploy=t.obj.deploy)})).catch((function(e){console.log(e)}))},v2_component_btn_1580814836000:function(e){arguments.length>1&&void 0!==arguments[1]||this.$refs["v2-component-btn_1580814867006"];var t=this;t.close()}},beforeCreate:function(){},created:function(){},beforeMount:function(){},mounted:function(){var e=this;e.getMenuList(),e.AParams.id&&e.getMenuDetail(),e.setFormTips()},beforeUpdate:function(){},updated:function(){},beforeDestroy:function(){},destroyed:function(){},deactivated:function(){},activated:function(){}},s=r,d=(i("f3a3"),i("5cfa"),i("d8f4"),i("2877")),u=Object(d["a"])(s,a,o,!1,null,"2f7d6300",null);t["default"]=u.exports},"4c68":function(e,t,i){t=e.exports=i("2350")(!1),t.push([e.i,"",""])},"551b":function(e,t,i){var a=i("8374");"string"===typeof a&&(a=[[e.i,a,""]]),a.locals&&(e.exports=a.locals);var o=i("499e").default;o("54afb2bc",a,!0,{sourceMap:!1,shadowMode:!1})},"5cfa":function(e,t,i){"use strict";i("0a46")},7002:function(e,t,i){var a=i("4c68");"string"===typeof a&&(a=[[e.i,a,""]]),a.locals&&(e.exports=a.locals);var o=i("499e").default;o("02b07459",a,!0,{sourceMap:!1,shadowMode:!1})},8374:function(e,t,i){t=e.exports=i("2350")(!1),t.push([e.i,".diaglog-btn-ctn{position:absolute!important;bottom:0;width:100%;right:0;border-top:1px solid #e5e5e5}.common-btn-focus{color:#fff}.common-btn-focus,.common-btn-normal{height:32px;line-height:32px;padding-top:0;padding-bottom:0}.common-btn-normal{border:1px solid #dcdfe6}.margin-right20{margin-right:20px!important}.form-user-info-wrapper{width:70%;margin-left:auto!important;margin-right:auto!important}.margin-bottom20{margin-bottom:20px}.form-textarea{width:100%;margin:0 0 20px 0!important}",""])},cdbf:function(e,t,i){t=e.exports=i("2350")(!1),t.push([e.i,".V2Container[data-v-2f7d6300],.V2Widget[data-v-2f7d6300]{-webkit-box-sizing:border-box;box-sizing:border-box}.V2Container[data-v-2f7d6300]{display:-webkit-box;display:-ms-flexbox;display:flex;-webkit-box-align:start;-ms-flex-align:start;align-items:flex-start;-ms-flex-item-align:stretch;align-self:stretch;height:auto}",""])},d8f4:function(e,t,i){"use strict";i("7002")},f3a3:function(e,t,i){"use strict";i("551b")}}]);