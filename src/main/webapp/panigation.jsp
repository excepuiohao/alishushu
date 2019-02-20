<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/7/25
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/chindex.css"/>
<div class="panigation" >
    当前页${requestScope.page}/<span id="totalPage">${requestScope.totalPage==0?1:requestScope.totalPage}</span>
    <a href="javascript:void(0)" onclick="mysplit('first')">首页</a>

    <a href="javascript:void(0)" onclick="mysplit('pre')">
        &lt;上一页
    </a>
    <%--总页数为0--%>
    <c:if test="${totalPage==0}">
        <a class="act">1</a>
    </c:if>
    <%--小于5页，直接显示1-n页--%>
    <c:if test="${totalPage <= 5}">
        <c:forEach var="currentPage" begin="1" end="${totalPage}">
            <c:if test="${currentPage == page}">
                <a class="act" onclick="getPage('page', ${currentPage})">${currentPage}</a>
            </c:if>
            <c:if test="${currentPage != page}">
                <a onclick="getPage('page', ${currentPage})">${currentPage}</a>
            </c:if>
        </c:forEach>
    </c:if>
    <%--大于5页--%>
    <c:if test="${totalPage > 5}">

        <%--page小于等于3，由于总页数大于5，所以显示1-5页--%>
        <c:if test="${page <= 3}">
            <c:forEach var="currentPage" begin="1" end="5" step="1">
                <c:if test="${currentPage == page}">
                    <a class="act" onclick="getPage('page', ${currentPage})">${currentPage}</a>
                </c:if>
                <c:if test="${currentPage != page}">
                    <a onclick="getPage('page', ${currentPage})">${currentPage}</a>
                </c:if>
            </c:forEach>
        </c:if>
        <%--page大于3，总页数大于5，显示page-2——page+2页
        注意page+2不能大于totalPage--%>
        <c:if test="${page > 3}">
            <%--page+2小于等于totalPage的情况--%>
            <c:if test="${(page+2) <= totalPage}">
                <%--输出page-2——page+2的页码--%>
                <a onclick="getPage('page', ${page - 2})">${page - 2}</a>
                <a onclick="getPage('page', ${page - 1})">${page - 1}</a>
                <a class="act" onclick="getPage('page', ${page})">${page}</a>
                <a onclick="getPage('page', ${page + 1})">${page + 1}</a>
                <a onclick="getPage('page', ${page + 2})">${page + 2}</a>
            </c:if>
            <%-- 如果page+2 > totalPage：显示totalPage-4——totalPage--%>
            <c:if test="${(page+2) > totalPage}">
                <c:if test="${page == (totalPage - 1)}">
                    <a onclick="getPage('page', ${page - 3})">${page - 3}</a>
                    <a onclick="getPage('page', ${page - 2})">${page - 2}</a>
                    <a onclick="getPage('page', ${page - 1})">${page - 1}</a>
                    <a class="act" onclick="getPage('page', ${page})">${page}</a>
                    <a onclick="getPage('page', ${page + 1})">${page + 1}</a>
                </c:if>
                <c:if test="${page == totalPage}">
                    <a onclick="getPage('page', ${page - 4})">${page - 4}</a>
                    <a onclick="getPage('page', ${page - 3})">${page - 3}</a>
                    <a onclick="getPage('page', ${page - 2})">${page - 2}</a>
                    <a onclick="getPage('page', ${page - 1})">${page - 1}</a>
                    <a class="act" onclick="getPage('page', ${page})">${page}</a>
                </c:if>
            </c:if>

        </c:if>

    </c:if>
    <a href="javascript:void(0)" onclick="mysplit('next')">下一页></a>
    <a href="javascript:void(0)" onclick="mysplit('last')">尾页</a>
    <a>go<input type="text" id="go" onchange="mysplit('go')" size="4">页</a>

    <form action="<%=request.getParameter("formUrl")%>" method="post" name="myform">
        <input type="hidden" name="page" id="myPage" value="${requestScope.page == null? 1 : requestScope.page}"/>
        <%--<input type="hidden" name="pageSize" value="5"/>--%>
    </form>

</div>

<script type="text/javascript">

    function mysplit(obj) {
        var cpNode = document.getElementById("myPage");
        var tpNode = document.getElementById("totalPage");
        if (parseInt(tpNode.innerHTML) === 1) {
            return false;
        } else {
            var totalPage = tpNode.innerHTML;
            if (obj == "first") {
                cpNode.value = 1;
            } else if (obj == "last") {
                cpNode.value = totalPage;
            } else if (obj == "pre") {
                var myPage = parseInt(cpNode.value);
                var tmp = myPage - 1;
                if (tmp == 0) {
                    tmp = 1;
                }
                cpNode.value = tmp;
            } else if (obj == "next") {
                var myPage = parseInt(cpNode.value);
                var tmp = myPage + 1;
                if (tmp > parseInt(totalPage)) {
                    tmp = parseInt(totalPage);
                }
                cpNode.value = tmp;
            } else if (obj == "go") {
                var regex = /^[1-9]\d{0,}$/;
                var value = document.getElementById("go").value;
                var num = parseInt(value);
                var flag = regex.test(num);
                if (!flag) {
                    document.getElementById("go").value = '';
                    return false;
                } else {
                    if (document.getElementById("go").value > parseInt(totalPage)) {
                        cpNode.value = totalPage;
                    } else if (document.getElementById("go").value < parseInt(1)) {
                        cpNode.value = 1;
                    } else {
                        cpNode.value = document.getElementById("go").value;
                    }
                }
            }
			
            document.myform.submit();
        }
    }

    function getPage(obj, pageNum) {
        var cpNode = document.getElementById("myPage");
        if (obj == 'page') {
            cpNode.value = pageNum;
        }
        document.myform.submit();
    }
</script>
