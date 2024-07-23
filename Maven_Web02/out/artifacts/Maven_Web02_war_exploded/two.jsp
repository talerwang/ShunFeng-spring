<%--
  Created by IntelliJ IDEA.
  User: 60445
  Date: 2024/7/12
  Time: 13:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="utf-8">
  <title></title>

  <!-- ZUI 标准版压缩后的 CSS 文件 -->
  <link rel="stylesheet" href="./dist/css/zui.min.css">
  <link rel="stylesheet" href="./css/style6.css" />
  <link rel="stylesheet" href="css/style9.css" />

  <!-- ZUI Javascript 依赖 jQuery -->
  <script src="//cdnjs.cloudflare.com/ajax/libs/zui/1.10.0/lib/jquery/jquery.js"></script>
  <script src="./js/TwoDemo.js"></script>
  <!-- ZUI 标准版压缩后的 JavaScript 文件 -->
  <script src="./dist/js/zui.min.js"></script>

</head>
<body style="background-color: #EFF1F4;" >
<%
  String username = (String)session.getAttribute("username");
  if (username != null)
  {
%>
<%
  }else {
    response.sendRedirect("index.jsp");
  }
%>
<nav class="navbar navbar-default" role="navigation"  style="margin: 0;">
  <div class="container-fluid">
    <!-- 导航头部 -->
    <div class="navbar-header" >
      <img src="./img/navbar-header.png"  height="50px" width="50px"/>
    </div>
    <!-- end -->
    <!-- 导航项目 -->
    <div class="collapse navbar-collapse navbar-collapse-example" class="col-sm-3 col col-sm-3 col-md-3 col-lg-3" >
      <ul class="nav nav-default navbar-left" >
        <li class="active"><a href="your/noce/url">首页</a></li>
        <li><a href="your/nice/url" class="dropdown-toggle" data-toggle="dropdown">物流服务 <b class="caret"></b></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="your/nice/url">即时配</a></li>
            <li><a href="your/nice/url">快递服务</a></li>
            <li><a href="your/nice/url">快运服务</a></li>
            <li><a href="your/nice/url">冷运服务</a></li>
            <li><a href="your/nice/url">医药服务</a></li>
            <li><a href="your/nice/url">国际服务</a></li>
            <li><a href="your/nice/url">增值服务</a></li>
            <li><a href="your/nice/url">附加费</a></li>
          </ul>
        </li>
        <li><a href="your/nice/url" class="dropdown-toggle" data-toggle="dropdown">智慧科技 <b class="caret"></b></a>
          <ul class="dropdown-menu" role="menu">

            <li><a href="your/nice/url">产品＆方案</a></li>
          </ul>
        </li>
        <li><a href="your/nice/url" class="dropdown-toggle" data-toggle="dropdown">服务支持 <b class="caret"></b></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="your/nice/url">寄件</a></li>
            <li><a href="your/nice/url">查件</a></li>
            <li><a href="your/nice/url">服务查询</a></li>
            <li><a href="your/nice/url">会员权益</a></li>
            <li><a href="your/nice/url">顺丰企业服务平台</a></li>
            <li><a href="your/nice/url">顺丰科技开放平台</a></li>
          </ul>
        </li>
        <li><a href="your/nice/url" class="dropdown-toggle" data-toggle="dropdown">可持续发展 <b class="caret"></b></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="your/nice/url">企业治理</a></li>
            <li><a href="your/nice/url">零碳未来</a></li>
            <li><a href="your/nice/url">人才伙伴</a></li>
            <li><a href="your/nice/url">社会关怀</a></li>
          </ul>
        </li>
        <li><a href="your/noce/url">投资者关系 </a></li>
        <li><a href="your/nice/url" class="dropdown-toggle" data-toggle="dropdown">关于我们 <b class="caret"></b></a>
          <ul class="dropdown-menu" role="menu">
            <li><a href="your/nice/url">关于顺丰</a></li>
            <li><a href="your/nice/url">新闻咨询</a></li>
            <li><a href="your/nice/url">服务公告</a></li>
            <li><a href="your/nice/url">人才招聘</a></li>
            <li><a href="your/nice/url">集团采购</a></li>
          </ul>
        </li>
      </ul>
      <!-- end -->
      <!-- 右侧的导航项目 -->
      <ul class="nav navbar-nav navbar-right">
        <li><a href="your/nice/url">无障碍浏览</a></li>
        <li><a data-toggle="modal" data-target="#myModal" >快速登录/注册</a></li>
        <!-- 对话框内容 -->
        <div class="modal fade" id="myModal">
          <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">关闭</span></button>
                <h4 class="modal-title">请登录</h4>
              </div>
              <div class="modal-body">
                <div class="input-control has-icon-left">
                  <input id="inputAccountExample1" type="text" class="form-control" placeholder="用户名">
                  <label for="inputAccountExample1" class="input-control-icon-left"><i class="icon icon-user "></i></label>
                </div>
                <div>&nbsp</div>
                <div class="input-control has-icon-right">
                  <input id="inputPasswordExample1" type="password" class="form-control" placeholder="密码">
                  <label for="inputPasswordExample1" class="input-control-icon-right"><i class="icon icon-key"></i></label>
                </div>
                <a href="www.zhuce.com">
                  <p>没有用户？点击注册</p></a>
              </div>
              <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                <button type="button" class="btn btn-primary">登录</button>

              </div>
            </div>
          </div>
        </div>
        <!-- END -->
      </ul>
      </li>
      </ul>
    </div>
  </div>
</nav><!-- END .navbar-collapse -->


<div class="panel-group col-lg-3 col-md-3 col-sm-3 col-xs-3" id="accordionPanels" aria-multiselectable="true">
  <div class="panel panel-default">
    <div class="panel-heading" id="headingOne">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordionPanels" href="#collapseOne">
          我要寄件<b class="caret"></b></a>
        </a>
      </h4>
    </div>
    <div id="collapseOne" class="panel-collapse collapse ">
      <div class="panel-body">寄快递<br />批量寄<br />寄大件(20kg+)<br />同城急送<br />寄国际</div>
    </div>
  </div>
  <div class="panel panel-default">
    <div class="panel-heading" id="headingTwo">
      <h4 class="panel-title">
        <a class="collapsed" data-toggle="collapse" data-parent="#accordionPanels" href="#collapseTwo">
          运单查询
        </a>
      </h4>
    </div>
    <div id="collapseTwo" class="panel-collapse collapse in">

    </div>
  </div>
  <div class="panel panel-default">
    <div class="panel-heading" id="headingThree">
      <h4 class="panel-title">
        <a class="collapsed" data-toggle="collapse" data-parent="#accordionPanels" href="#collapseThree">
          服务查询<b class="caret"></b></a>
        </a>
      </h4>
    </div>
    <div id="collapseThree" class="panel-collapse collapse">
      <div class="panel-body">运费时效<br />服务网点<br />收寄标准<br />服务范围<br />更多服务</div>
    </div>
  </div>
  <div class="panel panel-default">
    <div class="panel-heading" id="headingFour">
      <h4 class="panel-title">
        <a class="collapsed" data-toggle="collapse" data-parent="#accordionPanels" href="#collapseFour">
          我的资料<b class="caret"></b></a>
        </a>
      </h4>
    </div>
    <div id="collapseFour" class="panel-collapse collapse">
      <div class="panel-body">个人信息<br />地址簿<br />优惠劵</div>
    </div>
  </div>
  <div class="panel panel-default">
    <div class="panel-heading" id="headingFive">
      <h4 class="panel-title">
        <a class="collapsed" data-toggle="collapse" data-parent="#accordionPanels" href="#collapseFive">
          问题反馈<b class="caret"></b></a>
        </a>
      </h4>
    </div>
    <div id="collapseFive" class="panel-collapse collapse">
      <div class="panel-body">我有建议<br />快递投诉</div>
    </div>
  </div>
  <div class="panel panel-default">
    <div class="panel-heading" id="headingSix">
      <h4 class="panel-title">
        <a class="collapsed" data-toggle="collapse" data-parent="#accordionPanels" href="#collapseSix">
          发票管理
        </a>
      </h4>
    </div>
    <div id="collapseSix" class="panel-collapse collapse">

    </div>
  </div>
</div>
<!-- END导航栏 -->
<div class="col-lg-8 col-md-8 col-sm-8 col-xs-8 " style="background-color:white; margin: 10px; "><h1>运单查询</h1></div>
<!-- END运单查询 -->

<!-- 查询 -->
<div class="input-group col-lg-8 col-md-8 col-sm-8 col-xs-8  " style="background-color: white; margin-top: 70px;">
  <div class="input-control search-box search-box has-icon-left has-icon-right search-example" id="searchboxExample">
    <input id="inputSearchExample3" type="search" class="form-control search-input" style="border-radius: 0; margin-left: 10px;" placeholder="最多可查询20条,多条以逗号/空格隔开">
    <label for="inputSearchExample3" class="input-control-icon-left search-icon"><i class="icon icon-search"></i></label>
  </div>

  <span class="input-group-btn">
	    <button class="btn btn-primary" type="button" style="background-color: red; margin-left: 5px; border-radius: 0;">查询</button>
	  </span>

</div>
<!-- END -->
<div class="col-lg-8 col-md-8 col-sm-8 col-xs-8">
  <ul class="nav nav-tabs navnav-justified " style="background-color: white; margin-top: 10px;">
    <li></li>
    <li  class="active"><a data-tab href="#tabContent1" ><h3>我寄的</h3></a></li>

    <li><a data-tab href="#tabContent2"><h3>我收的</h3></a></li>
    <li><a data-tab href="#tabContent3"><h3>批量订单</h3></a></li>

    <li></li>
  </ul>
</div>
<div class="tab-content ">
  <!-- 标签切换 -->
  <div class="col-lg-8 col-md-8 col-sm-8 col-xs-8">&nbsp</div>
  <div class="col-lg-8 col-md-8 col-sm-8 col-xs-8">
    <table id="orderTable">
      <thead>
      <tr>
        <th>订单ID</th>
        <th>下单日期</th>
        <th>订单价格</th>
        <th>用户姓名</th>
        <th>用户电话</th>
        <th>发货地址</th>
        <th>收货地址</th>

      </tr>
      </thead>
      <tbody id="orderTableBody">
      </tbody>
    </table>
    <div class="pageination" id="pageination">
      <button class="prev" id="prev"> 上一页</button>
      <button class="next" id="next"> 下一页</button>
    </div></div></div>

 </body>
</html>
