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
                    <td>${nv.ch.ten}</td>
                    <td>${nv.cv.ten}</td>
                    <td>${nv.trangThai}</td>
                    <td>
                        <a href="edit/${nv.id}" class="btn btn-primary">Sửa</a>
                        <a href="delete/${nv.id}" class="btn btn-danger">Xóa</a>
                    </td>
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
</section>
</body>
</html>
