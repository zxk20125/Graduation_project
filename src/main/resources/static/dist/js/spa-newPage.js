(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["spa-newPage"],{"0aac":function(a,e,t){"use strict";t.r(e);var n=function(){var a=this,e=a.$createElement,t=a._self._c||e;return t("div",{staticClass:"app-container"},[t("el-row",{staticClass:"aweb-app-info"},[t("h3",[a._v("跨Tab页面传参")]),t("pre",[a._v("    \t   let id = this.AParams.id //从this中获取传递的参数'\n\n\t\t")])]),t("el-row",{staticClass:"aweb-app-btn-ctn"},[t("el-button",{attrs:{type:"success"},on:{click:a.closeCurrentPage}},[a._v("关闭当前页")]),t("span",[a._v("参数结果:"+a._s(a.AParams.role||a.AParams.id))])],1)],1)},o=[],s={data:function(){return{}},created:function(){},methods:{closeCurrentPage:function(a){this.$root.close()}},mounted:function(){console.log("当前页面参数",this.AParams.role||this.AParams.id)},resume:function(){console.log("子页面resume")},pause:function(){console.log("子页面pause")}},r=s,c=(t("f25b"),t("2877")),p=Object(c["a"])(r,n,o,!1,null,"83afe16c",null);e["default"]=p.exports},a7f6:function(a,e,t){e=a.exports=t("2350")(!1),e.push([a.i,".aweb-app-info[data-v-83afe16c]{padding:20px;width:100%;margin:20px 0}.aweb-app-info>h3[data-v-83afe16c]{margin-bottom:12px}pre[data-v-83afe16c]{color:#666;padding:12px;border:1px dashed #ddd;border-left:4px solid #bbb;background:#fafafa;white-space:pre-wrap;word-wrap:break-word;letter-spacing:1.5px;font:14px/25px Comic Sans MS,courier new;line-height:22px;background-size:100% 44px}.aweb-app-btn-ctn[data-v-83afe16c]{padding-left:20px}.aweb-app-btn-ctn.last[data-v-83afe16c]{padding-bottom:20px}",""])},d7e1:function(a,e,t){var n=t("a7f6");"string"===typeof n&&(n=[[a.i,n,""]]),n.locals&&(a.exports=n.locals);var o=t("499e").default;o("7083cf2d",n,!0,{sourceMap:!1,shadowMode:!1})},f25b:function(a,e,t){"use strict";t("d7e1")}}]);