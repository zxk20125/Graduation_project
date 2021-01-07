<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="ctx" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>反馈信息信息列表</title>

<link rel="shortcut icon" href="${ctx}/houtai/favicon.ico">
<link href="${ctx}/static/houtai/css/bootstrap.min.css?v=3.3.5"
	rel="stylesheet">
<link href="${ctx}/static/houtai/css/font-awesome.min.css?v=4.4.0"
	rel="stylesheet">

<!-- Data Tables -->
<link
	href="${ctx}/static/houtai/css/plugins/dataTables/dataTables.bootstrap.css"
	rel="stylesheet">

<link href="${ctx}/static/houtai/css/animate.min.css" rel="stylesheet">
<link href="${ctx}/static/houtai/css/style.min.css?v=4.0.0" rel="stylesheet">
<base target="_blank">

</head>

<body class="gray-bg">

	<div class="wrapper wrapper-content animated fadeInRight">
		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>
							<small>反馈信息信息列表</small>
						</h5>
						<div class="ibox-tools">
							<a class="collapse-link"> <i class="fa fa-chevron-up"></i>
							</a> <a class="close-link"> <i class="fa fa-times"></i>
							</a>
						</div>
					</div>
					<div class="ibox-content">

						<table class="table table-striped  table-hover dataTables-example">
							<thead>
								<tr>
									<!-- <th>用户编号</th> -->
									<th>反馈客户</th>
									<th>反馈内容</th>
									<th>客户联系号码</th>
									<th>客户联系邮箱</th>
									<th>操作</th>
									<!-- <th>操作</th> -->
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${feedbacks}" var="feedback">
									<tr class="gradeX">
										<td>${feedback.customer.customerLoginName}</td>
										<td>${feedback.feedbackContent}</td>
										<td>${feedback.customer.customerPhone}</td>
										<td>${feedback.mailxbox}</td>
										
											<td><botton class="btn btn-danger btn-xs"
													onclick="deletefeedback(${feedback.feedbackId})"> <span
													class="glyphicon glyphicon-remove"></span> 删除</botton>
												</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>

					


						<!-- 修改弹出框 -->

						<div class="modal inmodal" id="myModal" tabindex="-1"
							role="dialog" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content animated bounceInRight">

									<div class="modal-header">
										<button type="button" class="close" data-dismiss="modal">
											<span aria-hidden="true">&times;</span><span class="sr-only">关闭</span>
										</button>
										<!-- <i class="fa fa-laptop modal-icon"></i> -->
										<h5 class="modal-title">修改用户基本信息</h5>
										<small class="font-bold"> <!-- 这里可以显示副标题。 -->
									</div>

									<form id="updateform" onsubmit="return doupdate()"
										name="updatefrom">
										<div class="modal-body">
											<!-- <p><strong>H+</strong> 是一个完全响应式，基于Bootstrap3.3.5最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术，她提供了诸多的强大的可以重新组合的UI组件，并集成了最新的jQuery版本(v2.1.1)，当然，也集成了很多功能强大，用途广泛的jQuery插件，她可以用于所有的Web应用程序，如网站管理后台，网站会员中心，CMS，CRM，OA等等，当然，您也可以对她进行深度定制，以做出更强系统。</p> -->

											<div class="form-group">
												<input type="hidden" class="form-control" id="dot_id"
													required="" name="dotId">
											</div>

											<div class="form-group">
												<label>网点名</label> <input type="text" placeholder="网点名"
													class="form-control" id="dot_name" name="dotName">
											</div>

											<div class="form-group">
												<label>网点所在城市</label> <input type="text" placeholder="网点所在城市"
													class="form-control" id="dot_city" name="dotCity" required="" >
											</div>
											
											<div class="form-group">
												<label>网点地址</label> <input type="text" placeholder="网点地址"
													class="form-control" id="dot_address" name="dotAddress" required="">
											</div>

											<div class="form-group">
												<label>联系号码</label> <input type="number" required="required"
													placeholder="请输入电话号码" class="form-control"
													id="dot_phone" name="dotPhone">
											</div>

										
										</div>

										<div class="modal-footer">

											<button type="button" class="btn btn-white"
												data-dismiss="modal">关闭</button>
											<button type="submit" class="btn btn-primary">保存</button>
										</div>

									</form>
								</div>

							</div>
						</div>

						<!-- end -->


					</div>
				</div>
			</div>
		</div>

	</div>



	<script src="${ctx}/static/houtai/js/jquery.min.js?v=2.1.4"></script>
	<script src="${ctx}/static/houtai/js/bootstrap.min.js?v=3.3.5"></script>
	<script src="${ctx}/static/houtai/js/plugins/jeditable/jquery.jeditable.js"></script>
	<script src="${ctx}/static/houtai/js/plugins/dataTables/jquery.dataTables.js"></script>
	<script
		src="${ctx}/static/houtai/js/plugins/dataTables/dataTables.bootstrap.js"></script>
	<script src="${ctx}/static/houtai/js/content.min.js?v=1.0.0"></script>
	<script>
			$(document).ready(function() {
				$(".dataTables-example").dataTable();
				var oTable = $("#editable").dataTable();
				oTable.$("td").editable("../example_ajax.php", {
					"callback": function(sValue, y) {
						var aPos = oTable.fnGetPosition(this);
						oTable.fnUpdate(sValue, aPos[0], aPos[1])
					},
					"submitdata": function(value, settings) {
						return {
							"row_id": this.parentNode.getAttribute("id"),
							"column": oTable.fnGetPosition(this)[2]
						}
					},
					"width": "90%",
					"height": "100%"
				})
			});

			function fnClickAddRow() {
				$("#editable").dataTable().fnAddData(["Custom row", "New row", "New row", "New row", "New row"])
			};
		</script>
	<script type="text/javascript"
		src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>

	<script>
			document.write('<script src="//' + (location.host || 'localhost').split(':')[0] +
				':35929/livereload.js?snipver=1"></' + 'script>')
		</script>
	<script>
			document.addEventListener('LiveReloadDisconnect', function() {
				setTimeout(function() {
					window.location.reload();
				}, 500);
			})

			
			//提交修改数据	
			function doupdate() {
			
    		//JSON数据结构数据
    		var sta = $("#updateform").serializeArray();
    		//将序列化数据转为对象
    		var formObject = {};
    		for (var item in sta) {
       			 formObject[sta[item].name] = sta[item].value;
    			}
    
    		var formJSON = {data:JSON.stringify(formObject)};
    		console.log(formJSON);
  
    		// jquery 表单提交
   			$.post(getContextPath()+"/houtai/dot/doupdate.do",formJSON,function(msg){ 
					console.log(msg);
					if(msg == 1){
						window.location.href = getContextPath()+"/houtai/dot/list.do"; 
					}
			  	});
    			return false; // 必须返回false，否则表单会自己再做一次提交操作，并且页面跳转
			};

			
			//时间戳转年月日格式
			function timestampToTime(timestamp) {
		        var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
		        var Y = date.getFullYear() + '-';
		        var M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
		        var D = date.getDate();
		        return Y+M+D;
		    };
			
			//修改模态窗口显示
			function update(id){
				console.log(id)
				$.post(getContextPath()+"/houtai/dot/update.do",
						{id:id},
						function(msg){	
							/*  console.log(msg)
							 console.log(msg.hiredate)
  
   							 console.log(timestampToTime(msg.hiredate)); */
							 
							 $("#dot_id").val(msg.dotId);
   							$("#dot_name").val(msg.dotName);
							$("#dot_city").val(msg.dotCity);
							$("#dot_address").val(msg.dotAddress);
							$("#dot_phone").val(msg.dotPhone);
							
						
						
						}
						);
				
			};
		
			
			//删除
			function deletefeedback(id){
				$.post(getContextPath()+"/houtai/feedback/delete.do",{id:id},
						function(msg){	
					if(msg==1){
						alert("删除成功");
						location.reload();
					}
				});
				
				
			}
			
			/**
			 * 封装获取上下文路径的方法 
			 * @returns {String}
			 */
			function getContextPath(){
				var local = window.location;
				//获取 pathname 属性的值 
				var pathname = local.pathname;
				//将字符串以 斜杠/切割成数组
				var  arr = pathname.split("/");
				//获取上下文路径
				var contextPath = arr[1];
				return "/"+contextPath;// : /ajax
			};
		</script>
</body>

</html>
