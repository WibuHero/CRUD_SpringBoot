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
    <table class="table  table-hover">
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
                    <td><a href="edit/${ch.ma}" class="btn btn-primary">Cập nhật</a>
                        <a href="delete/${ch.ma}" class="btn btn-danger">Xóa</a></td>
                </tr>
            </c:forEach>
        </c:if>

        </tbody>
    </table>
    <p style="text-align: right">
        <a href="create" class="btn btn-primary" >Thêm</a>
    </p>
</body>
</html>