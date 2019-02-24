<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title></title>
    <link type="text/css" rel="stylesheet" href="/css/style.css"/>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
</head>
<body>
<jsp:include page="top.jsp"/>
<div id="vote" class="wrap">
    <h2>查看投票</h2>
    <ul class="list">
        <li>
            <h4>${requestScope.map.sub.vsTitle}</h4>
            <p class="info">共有 ${requestScope.map.sub.children.size()} 个选项，已有 ${requestScope.map.sub.count}
                个网友参与了投票。</p>
            <ol style="list-style: none">
                <%-- <s:iterator value="subject.options" status="status"> --%>
                <c:forEach items="${requestScope.map.option}" var="p">

                    <li><%--s:property value="option.name"/>--%>
                        <div>
                            <div style="float: left;margin-right: 30px;width: 100%">${p.voOption}</div>
                            <div style="float: left" class="rate">
                                <div class="ratebg" data="${p.count/requestScope.map.count*100}"></div>
                                <p>${p.count}票<span>(
							<fmt:formatNumber type="number" value="${p.count/requestScope.map.count*100}" pattern="0.00"
                                              maxFractionDigits="2"/>
								%)</span></p>
                            </div>
                        </div>
                        <br>
                    </li>

                </c:forEach>

                <%--			  </s:iterator>	--%>
            </ol>
            <br><br>
            <div class="goback"><a href="/subject/getSubjectById?id=${requestScope.map.sub.vsId}">返回投票列表</a></div>
        </li>
    </ul>
</div>
<div id="footer" class="wrap">
    百知 &copy; 版权所有
</div>
<link type="text/css" rel="stylesheet" href="/js/jqueryui/themes/base/jquery-ui.css"/>
<script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="/js/jqueryui/jquery-ui.js"></script>
<script>
    $(".ratebg").each(function (i, ele) {
        var v = parseInt($(ele).attr("data"));
        $(ele).progressbar({
            value: v
        });
    });
</script>
</body>
</html>
