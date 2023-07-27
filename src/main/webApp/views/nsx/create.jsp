
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

</head>
<body>
<h1 style="line-height: 100px; text-align: center; color: red">
    Thêm Nhà Sản Xuất
</h1>
<div class="container">
    <sf:form action="store" method="post" modelAttribute="nsx">
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Mã NSX</label>
            <div class="col-sm-10">
                <sf:input path="ma" class="form-control"></sf:input>
            </div>
            <div >
                <small >
                    <sf:errors path="ma" cssStyle="color: red"></sf:errors>
                </small>
            </div>
        </div>
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Tên NSX</label>
            <div class="col-sm-10">
                <sf:input path="ten" class="form-control"></sf:input>
            </div>
            <div >
                <small >
                    <sf:errors path="ten" cssStyle="color: red"></sf:errors>
                </small>
            </div>
        </div>
        <button class="btn btn-success">Thêm</button>
    </sf:form>
</div>
</body>
</html>
