(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["spa-open"],{"0c5a":function(e,t,a){"use strict";a.r(t);var o=function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"aweb-open-page"},[a("h3",[e._v("打开指定页面")]),a("el-row",{staticClass:"aweb-open-page-form"},[a("el-form",{ref:"form",attrs:{model:e.form,"label-width":"100px"}},[a("el-form-item",{attrs:{label:"页面标题"}},[a("el-input",{attrs:{placeholder:"请输入",clearable:""},model:{value:e.form.title,callback:function(t){e.$set(e.form,"title",t)},expression:"form.title"}})],1),a("el-form-item",{attrs:{label:"页面路径"}},[a("el-input",{attrs:{placeholder:"请输入views文件夹往下的页面路径",clearable:""},model:{value:e.form.component,callback:function(t){e.$set(e.form,"component",t)},expression:"form.component"}})],1),a("el-form-item",{attrs:{label:"自定义路由"}},[a("el-input",{attrs:{placeholder:"请输入自定义路由（相当于页面实例ID）",clearable:""},model:{value:e.form.path,callback:function(t){e.$set(e.form,"path",t)},expression:"form.path"}})],1),a("el-form-item",{attrs:{label:"是否其他项目"}},[a("el-switch",{attrs:{"active-color":"#13ce66","inactive-color":"#dcdfe6"},model:{value:e.form.other,callback:function(t){e.$set(e.form,"other",t)},expression:"form.other"}})],1),a("el-form-item",{attrs:{label:"传参"}},[a("el-input",{attrs:{placeholder:"请输入JSON字符串",clearable:""},model:{value:e.form.params,callback:function(t){e.$set(e.form,"params",t)},expression:"form.params"}})],1),a("el-form-item",{attrs:{label:"类型"}},[a("el-radio-group",{model:{value:e.form.type,callback:function(t){e.$set(e.form,"type",t)},expression:"form.type"}},[a("el-radio",{attrs:{label:"BLANK"}},[e._v("新页面")]),a("el-radio",{attrs:{label:"SUB"}},[e._v("子页面")]),a("el-radio",{attrs:{label:"SELF"}},[e._v("自身页面")]),a("el-radio",{attrs:{label:"WINDOW"}},[e._v("新窗口页面")])],1)],1),a("el-form-item",[a("el-button",{attrs:{type:"primary"},on:{click:e.openPage}},[e._v("打开")])],1)],1)],1)],1)},r=[],l={data:function(){return{form:{component:"",type:"BLANK",path:"",params:"",title:"",other:!1}}},methods:{beforeClose:function(){return console.log("open"),!0},openPage:function(){var e=this.form;this.open({title:e.title,component:e.component,path:e.path,type:e.type,other:e.other,params:e.params?JSON.parse(e.params):"",confirmCallback:function(){console.log("点击确定")},cancelCallback:function(e){console.log("点击取消")}})}}},n=l,s=(a("4d45"),a("2877")),i=Object(s["a"])(n,o,r,!1,null,"e8c3f66e",null);t["default"]=i.exports},"4d45":function(e,t,a){"use strict";a("e7b4")},5745:function(e,t,a){t=e.exports=a("2350")(!1),t.push([e.i,".aweb-open-page[data-v-e8c3f66e]{padding:12px}.aweb-open-page-form[data-v-e8c3f66e]{padding:20px;margin:0 20px;border-radius:3px;-webkit-transition:.2s;-o-transition:.2s;transition:.2s}.aweb-open-page-form form[data-v-e8c3f66e]{width:600px}",""])},e7b4:function(e,t,a){var o=a("5745");"string"===typeof o&&(o=[[e.i,o,""]]),o.locals&&(e.exports=o.locals);var r=a("499e").default;r("fea59e68",o,!0,{sourceMap:!1,shadowMode:!1})}}]);