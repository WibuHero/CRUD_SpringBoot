<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<html>
<head>
    <title>Quản lý chi tiết sp</title>
    <link href="../../css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <h1 style="line-height: 100px; text-align: center; color: red">
        Quản Lý Chi Tiết Sản Phẩm
    </h1>

    <div class="data">
        <table class="table table-hover">
            <thead>
            <tr>
                <th scope="col">Sản phẩm</th>
                <th scope="col">NSX</th>
                <th scope="col">Màu sắc</th>
                <th scope="col">Dòng SP</th>
                <th scope="col">Năm BH</th>
                <th scope="col">Mô tả</th>
                <th scope="col">SL tồn</th>
                <th scope="col">Giá nhập</th>
                <th scope="col">Giá bán</th>
                <th scope="col">Function</th>
            </tr>
            </thead>
            <tbody>
            <c:if test="${f:length(ds) == 0}">
                <span>Không có dữ liệu</span>
            </c:if>
            <c:if test="${f:length(ds) != 0}">
                <c:forEach items="${ds}" var="ctsp">
                    <tr>
                        <td>${ctsp.sp.ten} </td>
                        <td>${ctsp.nsx.ten}</td>
                        <td>${ctsp.ms.ten}</td>
                        <td>${ctsp.dsp.ten}</td>
                        <td>${ctsp.namBH}</td>
                        <td>${ctsp.moTa}</td>
                        <td>${ctsp.soLuongTon}</td>
                        <td>${ctsp.giaNhap}</td>
                        <td>${ctsp.giaBan}</td>
                        <td>
                            <a href="edit/${ctsp.id}" class="btn btn-primary">Cập nhật</a>
                            <a href="delete/${ctsp.id}" class="btn btn-danger">Xóa</a>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
            </tbody>
        </table>
    </div>
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

</div>

</body>
</html>
