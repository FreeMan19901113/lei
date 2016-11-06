<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/includes/common-bootstrap.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bootstrap web framework</title>
</head>
<body>
	<div id="jwindow" class="jwindow">
		<div class="navbar navbar-fixed-top navbar-inverse" role="navigation">
			<div class="container">
				<div class="navbar-header" style="height: 50px;">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target=".navbar-collapse">
						<span class="sr-only">Toggle navigation</span> <span
							class="icon-bar"></span> <span class="icon-bar"></span> <span
							class="icon-bar"></span>
					</button>
					<a hfre="javascript:void(0);" class="navbar-brand" href="#">雷振洋</a>
				</div>
				<div class="collapse navbar-collapse">
					<ul id="jModelsBar" class="nav navbar-nav">
						<li onclick="chooseModels([1,1],this)" class="active"><a
							hfre="javascript:void(0);"> <span
								class="glyphicon glyphicon-home">1</span>
						</a></li>
						<li onclick="chooseModels([2,1],this)"><a
							hfre="javascript:void(0);"> <span
								class="glyphicon glyphicon-shopping-cart">2</span>
						</a></li>
						<li onclick="chooseModels([1,2],this)"><a
							hfre="javascript:void(0);"> <span
								class="glyphicon glyphicon-headphones">3</span>
						</a></li>
						<li onclick="chooseModels([2,2],this)"><a
							hfre="javascript:void(0);"> <span
								class="glyphicon glyphicon-flash">4</span>
						</a></li>
					</ul>
				</div>
			</div>
		</div>
		<div id="jModelBackgroud" class="jModelBackgroud">
			<div class="jModel">
				<div class="jModelBody">
					<div class="row-fluid">
						<div class="span6">
							<p>
								<em>Git</em>是一个分布式的版本控制系统，最初由<strong>Linus Torvalds</strong>编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在Ruby社区中。
							</p>
						</div>
					</div>
					<div class="row-fluid">
						<div class="span6">
							<p>
								<em>Git</em>是一个分布式的版本控制系统，最初由<strong>Linus Torvalds</strong>编写，用作Linux内核代码的管理。在推出后，Git在其它项目中也取得了很大成功，尤其是在Ruby社区中。
							</p>
						</div>
					</div>
				</div>
			</div>
			<div class="jModel">
				<div class="jModelBody">
					<div>1</div>
					<div>2</div>
				</div>
			</div>
			<div class="jModel">
				<div class="jModelBody">
					<div>1</div>
					<div>2</div>
				</div>
			</div>
			<div class="jModel">
				<div class="jModelBody">
					<div>1</div>
					<div>2</div>
				</div>
			</div>
		</div>
	</div>
	<form id="test" action="test.html" method="post">
		<table>
			<thead>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
				</tr>
			</thead>
			<tfoot>
				<tr>
					<td colspan="2"><input type="submit" value="Save" /></td>
				</tr>
			</tfoot>
			<tbody>
				<tr>
					<td><input name="aa" value="aaa" /></td>
				</tr>
			</tbody>
		</table>
	</form>
</body>
</html>
<style>
.jwindow {
	height: 100%;
	width: 100%;
	overflow: hidden;
	border: 0;
}

.jModelBackgroud {
	border: 0;
}

.jModel {
	float: left;
	border: 0;
}

.jModelBody {
	padding-top: 80px;
	padding-left: 50px;
}
</style>
<script>
	var colors = [ "#0093C0", "#00B0AF", "#00A38D", "#0062B2" ];//, "#DF4348", "#E38135"
	var models = $(".jModel");
	var sizeX = 1600;
	var sizeY = 800;
	var speed = 5;//移动距离倍数
	var spaceX = 2;//X移动距离
	var spaceY = 1;//Y移动距离
	var isMoving = false; //正在移动中标识符
	var moveTimer; //移动对象
	$.fn.serializeJson = function() {
		var serializeObj = {};
		var array = this.serializeArray();
		$(array).each(
				function() {
					if (serializeObj[this.name]) {
						if ($.isArray(serializeObj[this.name])) {
							serializeObj[this.name].push(this.value);
						} else {
							serializeObj[this.name] = [
									serializeObj[this.name], this.value ];
						}
					} else {
						serializeObj[this.name] = this.value;
					}
				});
		return serializeObj;
	};
	$(function() {
		init();
		var a = $("#test").serializeJson();
		a.aa = "aa";
		a.blist = [ {
			ba : "ba",
			bb : "bb",
			bc : "bc",
			clist : [ {
				ca : "ca",
				cb : "cb",
				cc : "cc"
			} ]
		} ];
		console.log(a);
		$.ajax({
			type : "post",
			url : "test.html",
			contentType : "application/json",
			data : JSON.stringify(a)
		});

		/* 		{
		 aa : "aa",
		 blist : [ {
		 ba : "ba",
		 bb : "bb",
		 bc : "bc",
		 clist : [ {
		 ca : "ca",
		 cb : "cb",
		 cc : "cc"
		 } ]
		 } ]
		 } */
	});
	function init() {
		$("#jwindow").scrollLeft(0);
		$("#jwindow").scrollTop(0);
		$("#jModelBackgroud").width(sizeX * 2);
		$("#jModelBackgroud").height(sizeY * 2);
		$.each(models, function(i, element) {
			//各模块颜色赋值及大小
			$(this).width(sizeX);
			$(this).height(sizeY);
			$(this).css("background-color", colors[i]);
		});
	}
	function chooseModels(position, element) {
		if (!isMoving) {
			isMoving = true;//移动开始
			refreshModelsBar(element);
			moving(position);
		}
	}
	function refreshModelsBar(element) {
		var models = $("#jModelsBar li")
		$.each(models, function(i, element) {
			$(element).attr("class", "");
		});
		$(element).attr("class", "active");
	}
	function moving(position) {
		var currentX = $("#jwindow").scrollLeft();//当前X所在位置
		var currentY = $("#jwindow").scrollTop();//当前Y所在位置
		var lastX = (position[0] - 1) * sizeX;//X结束移动点
		var lastY = (position[1] - 1) * sizeY;//Y结束移动点
		var x, y, tagX, tagY;
		x = lastX - currentX;//X轴移动的距离
		y = lastY - currentY;//Y轴移动的距离
		tagX = x >= 0 ? 1 : -1;//正数 负数
		tagY = y >= 0 ? 1 : -1;//正数 负数
		/* 	console.log(" currentX:"  + currentX + " currentY:"  + currentY+" lastX:"+lastX + " lastY" + lastY); */

		moveTimer = setInterval(function() {
			if (currentX != lastX) {
				currentX += tagX * spaceX * speed;
				$("#jwindow").scrollLeft(currentX);
			}
			if (currentY != lastY) {
				currentY += tagY * spaceY * speed;
				$("#jwindow").scrollTop(currentY);
			}
			/* 		console.log(" X:"+currentX + " Y" + currentY); */
			if (currentX == lastX && currentY == lastY) {
				/*  		console.log(currentX + "  "  + currentY);  */
				clearInterval(moveTimer);
				isMoving = false; //移动结束
			}
		}, 1);
	}
</script>
