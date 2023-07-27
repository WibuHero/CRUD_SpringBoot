<%@ page pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Nhân viên</title>
    <link rel="stylesheet" href="../../css/bootstrap.min.css" />
</head>
<body>
<h1 style="text-align: center; line-height: 100px; color: red">Danh Sách Nhân Viên</h1>
<section class="container">
    <table class="table table-hover">
        <thead>
        <tr>
            <th scope="col">STT</th>
            <th scope="col">Mã</th>
            <th scope="col">Họ và tên</th>
            <th scope="col">Giới tính</th>
            <th scope="col">Ngày sinh</th>
            <th scope="col">Địa chỉ</th>
            <th scope="col">SĐT</th>
            <th scope="col">Mật khẩu</th>
            <th scope="col">Cửa hàng</th>
            <th scope="col">Chức vụ</th>
            <th scope="col">Trạng thái</th>
            <th scope="col">Function</th>
        </tr>
        </thead>
        <tbody>
        <c:if test="${f:length(ds) == 0}">
            <span>Không có dữ liệu</span>
        </c:if>
        <c:if test="${f:length(ds) !=0}">
            <c:forEach items="${ds}" var="nv" varStatus="status">
                <tr>
                    <th scope="row">${status.index+1}</th>
                    <td>${nv.ma}</td>
                    <td>${nv.ho} ${nv.tenDem} ${nv.ten}</td>
                    <td>${nv.gioiTinh}</td>
                    <td>${nv.ngaySinh}</td>
                    <td>${nv.diaChi}</td>
                    <td>${nv.sdt}</td>
                    <td>${nv.matKhau}</td>
                    <td>${nv.tenCH}</td>
                    <td>${nv.tenCV}</td>
                    <td>${nv.trangThai}</td>
                    <td>
                        <a href="edit/${nv.ma}" class="btn btn-primary">Sửa</a>
                        <a href="delete/${nv.ma}" class="btn btn-danger">Xóa</a>
                    </td>
                </tr>
            </c:forEach>
        </c:if>


        </tbody>
    </table>
    <a href="create" class="btn btn-primary">Thêm</a>
</section>
</body>
</html>
