(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["authority-addAuthority"],{"2e18":function(t,e,a){e=t.exports=a("2350")(!1),e.push([t.i,".diaglog-btn-ctn{position:absolute!important;bottom:0;width:100%;right:0;border-top:1px solid #e5e5e5}.common-btn-focus{color:#fff}.common-btn-focus,.common-btn-normal{height:32px;line-height:32px;padding-top:0;padding-bottom:0}.common-btn-normal{border:1px solid #dcdfe6;color:#606266;background:#fff}.margin-right20{margin-right:20px!important}.form-user-info-wrapper{width:70%;margin-left:auto!important;margin-right:auto!important}.margin-bottom20{margin-bottom:20px}.form-textarea{width:100%;margin:0 0 20px 0!important}",""])},"6d08":function(t,e,a){"use strict";a.r(e);var i=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("v2container",{staticClass:"form-user-info-wrapper V2Container",staticStyle:{display:"flex","flex-direction":"column","align-items":"flex-start","align-self":"stretch","flex-shrink":"0","min-width":"50px","min-height":"50px","animation-duration":"1s"},attrs:{wid:"root"}},[a("v2-form-input",{ref:"v2-form-input_1580871567706",staticClass:"form-item-block V2Widget",style:{position:"relative","margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px","align-self":"auto",overflow:"hidden","animation-duration":"1s"},attrs:{wid:"1580871567706",labelWitdh:t.labelWidth,disabled:t.isDisabled,theme:{},label:"权限名称",placeholder:"请输入权限名称","title-mode":"col","label-witdh":t.labelWidth,"input-type":"text",rows:2,"show-word-limit":!1,clearable:!1,"is-required":!0,"auto-complete":!1,value:t.name},on:{"update:value":function(e){t.name=e}}}),a("v2-form-select",{ref:"v2-form-select_1580876549784",staticClass:"form-item-block V2Widget",style:{position:"relative","margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px","align-self":"auto",overflow:"hidden","animation-duration":"1s"},attrs:{wid:"1580876549784",optionConfig:t.authorityList,labelWitdh:t.labelWidth,theme:{},disabled:!1,"data-type":"def","option-config":t.authorityList,options:[{active:"true",label:"",value:""}],label:"父级权限",placeholder:"请选择父级权限","label-witdh":t.labelWidth,"title-mode":"col",clearable:!1,filterable:!0,"is-required":!1,value:t.parentId},on:{"update:value":function(e){t.parentId=e}}}),a("v2-form-input",{ref:"v2-form-input_1580871619270",staticClass:"form-textarea V2Widget",style:{position:"relative","margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px","align-self":"auto",overflow:"hidden","animation-duration":"1s"},attrs:{wid:"1580871619270",labelWitdh:t.labelWidth,theme:{},disabled:!1,label:"描述",placeholder:"请输入描述","title-mode":"col","label-witdh":t.labelWidth,"input-type":"textarea",rows:5,maxlength:200,"show-word-limit":!0,clearable:!1,"is-required":!1,"auto-complete":!1,value:t.desc},on:{"update:value":function(e){t.desc=e}}}),a("div",{ref:"v2Container_1580872309891",staticClass:"diaglog-btn-ctn V2Container",staticStyle:{position:"relative","box-sizing":"border-box","align-self":"stretch",overflow:"hidden",display:"flex","flex-direction":"row","justify-content":"flex-end","align-items":"flex-start","min-width":"50px","min-height":"50px","animation-duration":"1s"},attrs:{wid:"1580872309891"}},[a("v2-component-btn",{ref:"v2-component-btn_1580872264258",staticClass:"common-btn-normal V2Widget",style:{position:"relative","margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px","align-self":"auto",overflow:"hidden","animation-duration":"1s"},attrs:{wid:"1580872264258",theme:{btnType:"normal",size:""},disabled:!1,loading:!1,"btn-name":"取消",shape:"plain"},on:{"_op_component-btn_btn:click":t.v2_component_btn_1580875777000}}),a("v2-component-btn",{ref:"v2-component-btn_1580872338903",staticClass:"margin-right20 common-btn-focus V2Widget",style:{position:"relative","margin-top":"10px","margin-bottom":"10px","margin-left":"10px","margin-right":"10px","align-self":"auto","flex-shrink":"0",overflow:"hidden","animation-duration":"1s"},attrs:{wid:"1580872338903",theme:{btnType:"primary",size:""},disabled:!1,loading:!1,"btn-name":"提交",shape:"def"}})],1)],1)},o=[],n=(a("7f7f"),a("ac6a"),a("25f3")),l=a("a6fc"),r={mixins:[l["b"],n["d"]],components:{},data:function(){return{CONTENT:{forms_v2:{config:[{name:"authority_form_568",desc:"权限表单",validate_when:"blur",submit_emitters:[{widget_id:1580872338903,event:"(default)"}],inputs:{1580871619270:{desc:"描述",validation:{kind:"single-js",value:{value:"(value, vueIns, ctx) => value.length<=200",message:"权限描述长度限制为 0 到 200 个字符"}},name:"desc"},1580871567706:{desc:"权限名称",validation:{kind:"single-regexp",value:{value:"[a-zA-Z]{1,50}",message:"权限名长度限制为 1 到 50 个字符，且全为英文字符"}},name:"name"},1580872338903:{desc:"提交",validation:{kind:"dict",value:{ref:null,rules:[],disabled_rules:[]}},name:"提交"}}}],validate_callbacks:[function(t,e,a,i){console.log("字段:"),t.child_results.forEach((function(t){t.ok?console.log(t.fieldName,"输入正确"):console.log(t.fieldName,"输入不正确",t.message),t.vueIns.$showResult&&t.vueIns.$showResult(t)})),t.ok?(console.log("=> 表单输入正确，验证通过"),a()):(console.log("=> 表单输入不正确"),i())}],submit_callbacks:[function(t,e){var a={name:e.name,desc:e.desc,parentId:e.parentId};e.AParams.id&&(a.id=e.AParams.id),e.$root.confirm(a)}]},mapping:{1580871567706:[{id:1580871567706,modelValue:"labelWitdh",dataValue:"labelWidth",type:""},{id:1580871567706,modelValue:"disabled",dataValue:"isDisabled",type:"boolean"},{id:1580871567706,modelValue:"value",dataValue:"name",type:""}],1580871641330:[{id:1580871641330,modelValue:"value",dataValue:"parentId",type:""},{id:1580871641330,modelValue:"optionConfig",dataValue:"authorityList",type:""},{id:1580871641330,modelValue:"labelWitdh",dataValue:"labelWidth",type:""}],1580871619270:[{id:1580871619270,modelValue:"value",dataValue:"desc",type:""},{id:1580871619270,modelValue:"labelWitdh",dataValue:"labelWidth",type:""}],1580876549784:[{id:1580876549784,modelValue:"value",dataValue:"parentId",type:""},{id:1580876549784,modelValue:"optionConfig",dataValue:"authorityList",type:""},{id:1580876549784,modelValue:"labelWitdh",dataValue:"labelWidth",type:""}]}},labelWidth:"100px",name:"",parentId:"",desc:"",authorityList:[],isDisabled:!1,__VERSION:4}},props:{},computed:{},watch:{},methods:{getAuthorityList:function(){var t=this;t.$axios.get("".concat(axios.server,"/authority/list")).then((function(e){e.status&&e.success&&(t.authorityList=e.obj.map((function(t){return{value:t.id,label:t.name}})))})).catch((function(t){console.log(t)}))},setFormTips:function(){pipe.tooltip(this.__getVueIns("1580871567706").$refs._op_formInput_input,{content:"权限名长度限制为 1 到 50 个字符，且全为英文字符",placement:"top-start",style:{fontSize:"12px"}}),pipe.tooltip(this.__getVueIns("1580876549784").$refs._op_formSelect_select,{content:"请选择父级权限",placement:"top-start",style:{fontSize:"12px"}}),pipe.tooltip(this.__getVueIns("1580871619270").$refs._op_formInput_input,{content:"权限描述长度限制为 0 到 200 个字符",placement:"top-start",style:{fontSize:"12px"}})},v2_component_btn_1580875777000:function(t){var e=this;e.close()},getAuthorityDetail:function(){var t=this;t.$axios.get("".concat(axios.server,"/authority/get/").concat(t.AParams.id)).then((function(e){if(e.success&&e.status){var a=e.obj;t.name=a&&a.name,t.parentId=a&&a.parentId,t.desc=a&&a.desc}})).catch((function(t){console.log(t)}))}},beforeCreate:function(){},created:function(){},beforeMount:function(){},mounted:function(){var t=this;t.getAuthorityList(),t.AParams.id&&(t.isDisabled=!0,t.getAuthorityDetail()),t.setFormTips()},beforeUpdate:function(){},updated:function(){},beforeDestroy:function(){},destroyed:function(){},deactivated:function(){},activated:function(){}},s=r,d=(a("a08c"),a("2877")),u=Object(d["a"])(s,i,o,!1,null,null,null);e["default"]=u.exports},"7c41":function(t,e,a){var i=a("2e18");"string"===typeof i&&(i=[[t.i,i,""]]),i.locals&&(t.exports=i.locals);var o=a("499e").default;o("65a2e3fa",i,!0,{sourceMap:!1,shadowMode:!1})},a08c:function(t,e,a){"use strict";a("7c41")}}]);