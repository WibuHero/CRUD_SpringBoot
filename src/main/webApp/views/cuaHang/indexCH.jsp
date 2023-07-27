<%@ page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Index</title>
    <link rel="stylesheet" href="../../css/bootstrap.min.css" />

</head>
<body class="container">
    <h1 style="line-height: 100px; text-align: center; color: red">
        Cửa Hàng
    </h1>
    <table class="table  table-hover" style="text-align: center">
        <thead>
        <tr>
            <th scope="col">STT</th>
            <th scope="col">Mã</th>
            <th scope="col">Tên</th>
            <th scope="col">Địa chỉ</th>
            <th scope="col">Thành phố</th>
            <th scope="col">Quốc gia</th>
            <th scope="col">Function</th>
        </tr>
        </thead>
        <tbody>
        <c:if test="${f:length(ds)==0}">
            <span>Không có dữ liệu</span>
        </c:if>
        <c:if test="${f:length(ds)!=0}">
            <c:forEach items="${ds}" var="ch" varStatus="status">
                <tr>
                    <td>${status.index+1}</td>
                    <td>${ch.ma}</td>
                    <td>${ch.ten}</td>
                    <td>${ch.diaChi}</td>
                    <td>${ch.thanhPho}</td>
                    <td>${ch.quocGia}</td>
                    <td><a href="edit/${ch.id}" class="btn btn-primary">Cập nhật</a>
                        <a href="delete/${ch.id}" class="btn btn-danger">Xóa</a></td>
                </tr>
            </c:forEach>
        </c:if>

        </tbody>
    </table>
    <c:if test="${totalPages>1}">
        <nav aria-label="Page navigation example">
            <ul class="pagination">
                <li class="page-item ${isFirst?'disabled':''}"><a class="page-link" href="?page=0">First</a></li>
                <li class="page-item ${not hasPrevious?'disabled':''}" ><a class="page-link" href="?page=${currentPage-1}" >Previous</a></li>
                <li class="page-item ${not hasNext?'disabled':''}"><a class="page-link" href="?page=${currentPage+1}">Next</a></li>
                <li class="page-item ${isLast?'disabled':''}"><a class="page-link" href="?page=${totalPages-1}">Last</a></li>
            </ul>
        </nav>
        ${currentPage+1}/${totalPages}
    </c:if>
    <p style="text-align: right; bottom: 0px">
        <a href="create" class="btn btn-primary">Thêm</a>
    </p>
</body>
</html>