<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script type="text/javascript">
    const i18n = [];
    <%-- user.add / user.edit ir meal.add/meal.edit --%>
    i18n["addTitle"] = '<spring:message code="meal.add"/>';
    i18n["editTitle"] = '<spring:message code="meal.edit"/>';

    <c:forEach var='key' items='<%=new String[]{"common.deleted", "common.saved", "common.enabled", "common.disabled", "common.errorStatus"}%>'>
    i18n['${key}'] = '<spring:message code="${key}"/>';
    </c:forEach>
</script>