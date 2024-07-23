<%--
  Created by IntelliJ IDEA.
  User: 60445A
  Date: 2024/7/8
  Time: 11:22
  To change this template use File | Settings | File Templates.
--%><%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title></title>
    <!-- ZUI 标准版压缩后的 CSS 文件 -->
    <link rel="stylesheet" href="./dist/css/zui.min.css">
    <link rel="stylesheet" href="./css/style5.css" />
    <!-- ZUI Javascript 依赖 jQuery -->
    <script src="//cdnjs.cloudflare.com/ajax/libs/zui/1.10.0/lib/jquery/jquery.js"></script>
    <!-- ZUI 标准版压缩后的 JavaScript 文件 -->
    <script src="./dist/js/zui.min.js"></script>
    <script src="./js/index.js"></script>
<%--    <script src="./js/TwoDemo.js"></script>--%>
</head>
<body >

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
                <div class="modal fade" id="myModal"  >
                    <div class="modal-dialog">
                        <div class="modal-content">


                            <ul class="nav nav-tabs nav-justified">
                                <li class="active"><a data-tab href="#tabContentlog">登录</a></li>
                                <li><a data-tab href="#tabContentreg">注册</a></li>

                            </ul>
                            <div class="tab-content">
                                <div class="tab-pane active" id="tabContentlog" name="loginli">
                                    <form action="/Maven_Web02/LoginServlet" method="post">
                                        <div class="form-group">
                                        <label for="username">Username:</label>
                                        <input type="text" class="form-control" id="username" name="username"><br><br>
                                        </div>
                                        <div class="form-group">
                                        <label for="password">Password:</label>
                                        </div>
                                        <input type="password" class="form-control" id="password" name="password"><br><br>
                                        <input type="checkbox"  id="remember" name="remember">记住我
                                        <button type="submit" id="loginbtn" class="btn btn-primary" value="登录" > 登录 </button>
                                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

                                    </form>
                                </div>
                                <div class="tab-pane" id="tabContentreg">
                                        <form action="/Maven_Web02/LoginServlet" method="post">
                                            <div class="form-group">
                                        <label for="username_reg">Username:</label>
                                        <input type="text" id="username_reg" class="form-control" placeholder="电子邮箱/用户名/手机号"><br><br>
                                            </div>
                                            <div class="form-group">
                                        <label for="password_reg" >输入密码</label>
                                        <input type="password" id="password_reg" class="form-control" placeholder="请输入密码"><br><br>
                                            </div>
                                            <div class="form-group">
                                                <label for="username_reg">确定密码</label>
                                            </div>
                                            <div class="form-group">
                                                <input type="password" id="password_repet" class="form-control" placeholder="请再次输入密码"><br><br>
                                            </div>
                                                <button type="button" class="btn btn-primary" id="registerBtn" value="确定注册" > 确定注册</button>

                                    </form>

                                </div>
                            </div>


                            <div class="modal-body">
                                <div class="input-control has-icon-left">
                                </div>
                                <div>&nbsp</div>

                            </div>

                        </div>
                    </div>
                </div>
            </ul>
            </li>
            </ul>
        </div>
    </div>
</nav><!-- END .navbar-collapse -->
<div id="myNiceCarousel" class="carousel slide" data-ride="carousel">
    <!-- end -->
    <!-- 圆点指示器 -->
    <ol class="carousel-indicators">
        <li data-target="#myNiceCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myNiceCarousel" data-slide-to="1"></li>
        <li data-target="#myNiceCarousel" data-slide-to="2"></li>
        <li data-target="#myNiceCarousel" data-slide-to="3"></li>
        <li data-target="#myNiceCarousel" data-slide-to="4"></li>
        <li data-target="#myNiceCarousel" data-slide-to="5"></li>
    </ol>

    <!-- 轮播项目 -->
    <div  class="carousel-inner">
        <div class="item active">
            <img src="./img/carousel0.jpg" alt="carousel0"  />
            <div class="carousel-caption">

                <p>:)</p>
            </div>
        </div>
        <div class="item">
            <img src="./img/carousel1.jpg" alt="carousel1" />
            <div class="carousel-caption">
                <p>0.0</p>
            </div>
        </div>
        <div class="item">
            <img src="./img/carousel2.jpg" alt="carousel2" />
            <div class="carousel-caption">
            </div>
        </div>
        <div class="item">
            <img src="./img/carousel3.jpg" alt="carousel3" />
            <div class="carousel-caption">
            </div>
        </div>
        <div class="item">
            <img src="./img/carousel4.jpg" alt="carousel4" />
            <div class="carousel-caption">
            </div>
        </div>
        <div class="item">
            <img src="./img/carousel5.jpg" alt="carousel5" />
            <div class="carousel-caption">
            </div>
        </div>
    </div>
    <!-- 项目切换按钮 -->
    <a class="left carousel-control" href="#myNiceCarousel" data-slide="prev">
        <span class="icon icon-chevron-left"></span>
    </a>
    <a class="right carousel-control" href="#myNiceCarousel" data-slide="next">
        <span class="icon icon-chevron-right"></span>
    </a>
</div>
<!-- end轮播 -->
<div id="query" class="col-sm-3 col col-sm-3 col-md-3 col-lg-3" >
    <input  class="form-control input-lg" type="text" placeholder="请输入运单号进行查询">
    <a href="two.jsp"><button style="margin-top: 10px; margin-bottom: 20px; width: 250px; background-color: red;" class="btn btn-primary" type="button">马上查单</button></a>

</div>
<!-- END查单 -->
<div id="a">
    <nav class="navbar navbar-default" role="navigation">
        <ul class="nav navbar-nav nav-justified">
            <li><a href="your/nice/url/1">订单追踪</a></li>
            <li><a href="your/nice/url/2">我要寄件</a></li>
            <li><a href="your/nice/url/2">运费时效查询</a></li>
            <li><a href="your/nice/url/2">服务网点查询</a></li>
            <li><a href="your/nice/url/2">收费范围查询</a></li>
        </ul>
    </nav>
</div>
<!-- END查询导航 -->
<div class="title" class="col-sm-12 col col-sm-12 col-md-12 col-lg-12">
    <h1>物流服务介绍</h1>
</div>
<!-- ENDtitle标题 -->
<div id="b">
    <ul class="nav nav-tabs navnav-justified nav-justified">
        <li></li>
        <li  class="active"><a data-tab href="#tabContent1" ><h3>快递服务</h3></a></li>
        <li><a data-tab href="#tabContent2"><h3>快运服务</h3></a></li>
        <li><a data-tab href="#tabContent3"><h3>冷运服务</h3></a></li>
        <li><a data-tab href="#tabContent4"><h3>医药服务</h3></a></li>
        <li><a data-tab href="#tabContent5"><h3>国际服务</h3></a></li>
        <li></li>
    </ul>
    <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1 ">&nbsp</div>
    <div class="tab-content ">
        <!-- 标签切换 -->
        <div class="tab-pane active col-lg-12 col-md-12 col-sm-12 col-xs-12" id="tabContent1">
            <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1 "></div>
            <div	class="col-lg-5 col-md-5 col-sm-5 col-xs-5  ">
                <a href="www.baidu.com" class="card">
                    <img src="./img/tabs1-1jpg.jpg" class="img-rounded" alt="tab1.1" />

                    <div class="card-heading"><h2>顺丰特快</h2></div>
                    <div class="card-content text-muted"><h5>为您提供“快速、准时、稳定”的高品质、门到门的标准快递服务</h5></div>
                </a>

            </div>
            <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                <a href="www.baidu.com" class="card">
                    <img src="./img/tabs1-2.png" class="img-rounded" alt="tab1.2" />

                    <div class="card-heading"><h2>顺丰标快</h2></div>
                    <div class="card-content text-muted"><h5>为您提供“价格更优、时效稳定、托寄无忧、服务范围广”门到门的标准快递服务</h5></div>
                </a>
            </div>
        </div>
        <div class="tab-pane  col-lg-12 col-md-12 col-sm-12 col-xs-12" id="tabContent2">
            <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1  "></div>
            <div	class="col-lg-5 col-md-5 col-sm-5 col-xs-5">	<a href="www.baidu.com" class="card">
                <img src="./img/tabs2-1.png" class="img-rounded" alt="tab2.1" />
                <div class="card-heading"><h2>顺丰卡航</h2></div>
                <div class="card-content text-muted"><h5  >提供单票20KG+大件托运服务，满足个人、B2C电商大包裹、B2B门店调拨场景、B2B零担托盘货与批量件场景发货需求，全程提供高品质物流服务</h5></div>
            </a>
            </div>
            <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                <a href="www.baidu.com" class="card">
                    <img src="./img/tabs2-2.png" class="img-rounded" alt="tab2.2" />
                    <div class="card-heading"><h2>整车直达</h2></div>
                    <div class="card-content text-muted"><h5 >满足客户一辆或多辆整车发货需求的定制的整车直达产品</h5></div>
                </a>
            </div>
        </div>
        <div class="tab-pane  col-lg-12 col-md-12 col-sm-12 col-xs-12" id="tabContent3">
            <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1  "></div>
            <div	class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                <a href="www.baidu.com" class="card">
                    <img src="./img/tabs3-1.png" class="img-rounded" alt="tab3.1" />
                    <div class="card-heading"><h2>冷运标快</h2></div>
                    <div class="card-content text-muted"><h5 >基于冷仓，对有温度控制要求的食品，提供陆运冷链运输，末端优先派送的专属冷运快递服务</h5></div>
                </a>
            </div>
            <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                <a href="www.baidu.com" class="card">
                    <img src="./img/tabs3-2.png" class="img-rounded" alt="tab3.2" />
                    <div class="card-heading"><h2>冷运大件标快</h2></div>
                    <div class="card-content text-muted"><h5 >针对中小公斤段的食品发运需求，提供响应快速、时效稳定、服务范围广、包接包送的高品质冷链运输服务</h5></div>
                </a>
            </div>
        </div>
        <div class="tab-pane  col-lg-12 col-md-12 col-sm-12 col-xs-12" id="tabContent4">
            <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1 "></div>
            <div	class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                <a href="www.baidu.com" class="card">
                    <img src="./img/tabs4-1.png" class="img-rounded" alt="tab4.1" />
                    <div class="card-heading"><h2>精温专递</h2></div>
                    <div class="card-content text-muted"><h5 >为医疗保健行业客户的冷链药品（如胰岛素、血液制品、抗癌药品）、诊断试剂、生物样本等提供多种温区运输（0~30℃、2~25℃、2~8℃、15~25℃、-15~-25℃、-40~-90℃等）、全生命周期精准温控的物流服务</h5></div>
                </a>
            </div>
            <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                <a href="www.baidu.com" class="card">
                    <img src="./img/tabs4-2.png" class="img-rounded" alt="tab4.2" />
                    <div class="card-heading"><h2>精温定航</h2></div>
                    <div class="card-content text-muted"><h5 >为满足小批量多批次的医疗保健行业客户冷链药械配送需求，根据药品的属性和温度要求，通过集拼或分拨、多产品配载等技术和管理手段，为客户提供2-8℃精准温区的零担物流服务</h5></div>
                </a>
            </div>
        </div>
        <div class="tab-pane  col-lg-12 col-md-12 col-sm-12 col-xs-12" id="tabContent5">
            <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1  "></div>
            <div	class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                <a href="www.baidu.com" class="card">
                    <img src="./img/tabs5-1.png" class="img-rounded" alt="tab5.1" />
                    <div class="card-heading"><h2>国际标快</h2></div>
                    <div class="card-content text-muted"><h5>为满足客户紧急物品寄递需求，各环节均以最快速度进行发运、中转和派送的高品质门到门国际快件服务</h5></div>
                </a>
            </div>
            <div class="col-lg-5 col-md-5 col-sm-5 col-xs-5">
                <a href="www.baidu.com" class="card">
                    <img src="./img/tabs5-2.jpg" class="img-rounded" alt="tab5.2" />
                    <div class="card-heading"><h2>国际特惠</h2></div>
                    <div class="card-content text-muted"><h5>为满足客户非紧急物品寄递需求而推出的经济型国际快件服务</h5></div>
                </a>
            </div>
        </div>
        <!-- 展位居中 -->
        <div class="col-lg-1 col-md-1 col-sm-1 col-xs-1"></div>
    </div>
</div>
<!-- 物流服务介绍END! -->
</body>
</html>
