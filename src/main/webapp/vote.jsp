<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>参与投票</title>
    <link type="text/css" rel="stylesheet" href="/css/style.css"/>
    <link type="text/css" rel="stylesheet" href="/js/jqueryui/themes/base/jquery-ui.css"/>
    <script type="text/javascript" src="/js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="/js/jqueryui/jquery-ui.js"></script>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<jsp:include page="top.jsp"/>
<div id="vote" class="wrap">
    <h2>参与投票</h2>
    <ul class="list">
        <li>
            <h4>${requestScope.subject.vsTitle}</h4>
            <p class="info">共有 ${requestScope.subject.children.size()} 个选项，已有${requestScope.subject.count} 个网友参与了投票。</p>
            <form method="post" action="/item/addItem" onsubmit="return validate();">
                <input type="hidden" name="vsId" value="${requestScope.subject.vsId}"/>
                <ol>
                    <c:forEach items="${requestScope.subject.children}" var="p">
                        <li>
                            <c:if test="${requestScope.subject.vsType==1}">
                                <input name="voId" type="radio" value="${p.voId}"/> ${p.voOption}
                            </c:if>
                            <c:if test="${requestScope.subject.vsType==2}">
                                <input name="voId" type="checkbox" value="${p.voId}"/> ${p.voOption}
                            </c:if>

                        </li>
                    </c:forEach>
                </ol>
                <p class="voteView">
                    <button>投票</button>
                    <a href="/subject/showSunjectVote?vsId=${requestScope.subject.vsId}">查看</a>
                </p>
            </form>
        </li>
    </ul>
</div>
<div id="footer" class="wrap">
    百知 &copy; 版权所有
</div>

<script>
    $(function () {
        $(".voteView").children("button").button({
            icons: {
                primary: "ui-icon-locked"
            }
        }).next().button({
            icons: {
                primary: "ui-icon-locked"
            }
        });
    })

    function validate() {
        var options = $("input[name='voId']:checked").val();
        if (options == null || options == "undefined" || options.length == 0) {
            alert("请至少选择一个投票项！");
            return false;
        }
        return true;
    }
</script>
</body>
</html>
