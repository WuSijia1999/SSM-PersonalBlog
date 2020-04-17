<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>Insert title here</title>
    <link href="css/index.css" rel="stylesheet"/>
    <link href="css/about.css" rel="stylesheet"/>
    <script type="text/javascript" src="js/alert.js"></script>
</head>
<body>
<header>
    <div id="logo"><a href="/"></a></div>
    <nav class="topnav" id="topnav">
        <a href="selectAllBlog"><span>Home</span><span class="en">主页</span></a>
        <a href="about.jsp"><span>About</span><span class="en">关于我</span></a>
        <a href="selectAllDiary"><span>Diary</span><span class="en">日记心得</span></a>
        <a href="#" onclick="fun1()"><span>Admin</span><span class="en">管理</span></a>
    </nav>
</header>
<article class="aboutcon">
    <h1 class="t_nav"><span>道阻且长，行者将至。</span></h1><br/>
    <div class="about">
        <h2>About me</h2><br/>
        <div id="me_text">
            <p> 一个不断学习java和web开发的人。</p>
            <p>喜欢研究算法，每天刷leetcode让我对数据结构和算法有了更深的了解。</p>
            <p>责任心强，能快速学习需要的知识：进实验室的时候对图像处理不了解，为了完成导师给我的任务，用了两周入门图形处理，
            最后完成了我的任务。</p>
            <p>感谢那些曾经帮助过我的人，因为有你们我才会变得如此的优秀。</p>
        </div>

    </div>
    <aside class="right">
        <div class="about_c">
            <br/>
            <p>伍思佳</p>
            <p>学校：西南大学</p>
            <p>学历：本科</p>
            <p>专业：计算机科学与技术</p>
            <p>年龄：20</p>
            <p>现居：重庆市</p>
            <p>leetcode：<a href="https://leetcode-cn.com/u/wusijia/" target="_blank">我的leetcode</a></p>
            <p>喜欢的书：《大话数据结构》《Java核心技术卷一》</p>
        </div>
    </aside>
</article>
<footer>
    <p><span>Design By:<a href="www.duanliang920.com" target="_blank">伍思佳</a></span><span>网站地图</span><span><a href="/">网站统计</a></span>
    </p>
</footer>
<script src="js/nav.js"></script>
</body>
<script type="text/javascript" src="js/alert.js"></script>
</html>
