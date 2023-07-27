<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Khách hàng</title>
    <link rel="stylesheet" href="../../css/bootstrap.min.css" />
</head>
<body>
<table class="table table-hover">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">Mã</th>
        <th scope="col">Họ</th>
        <th scope="col">Tên đệm</th>
        <th scope="col">Tên</th>
        <th scope="col">Ngày sinh</th>
        <th scope="col">SDT</th>
        <th scope="col">Địa chỉ</th>
        <th scope="col">Thành phố</th>
        <th scope="col">Quốc gia</th>
        <th scope="col">Mật khẩu</th>
        <th scope="col">Function</th>
    </tr>
    </thead>
    <tbody>
    <c:if test="${f:length(ds) == 0}">
        <span>Không có dữ liệu</span>
    </c:if>
    <c:if test="${f:length(ds) != 0}">

        <c:forEach items="${ ds }" var="kh" varStatus="status">
            <tr>
                <td>${status.index + 1}</td>
                <td>${ kh.ma }</td>
                <td>${kh.ho}</td>
                <td>${kh.tenDem}</td>
                <td>${ kh.ten }</td>
                <td>${kh.ngaySinh}</td>
                <td>${kh.sdt}</td>
                <td>${kh.diaChi}</td>
                <td>${kh.thanhPho}</td>
                <td>${kh.quocGia}</td>
                <td>${kh.mk}</td>
                <td>
                    <a href="edit/${kh.ma}" class="btn btn-primary">Cập nhật</a>
                    <a href="delete/${kh.ma}" class="btn btn-danger">Xóa</a>
                </td>

            </tr>
        </c:forEach>
    </c:if>

    </tbody>
</table>
<center><a href="create" class="btn btn-primary">Thêm</a></center>
</body>
</html>
