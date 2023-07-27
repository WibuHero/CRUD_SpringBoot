<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<html>
<head>
    <title>Sản phẩm</title>
    <link rel="stylesheet" href="../../css/bootstrap.min.css" />
</head>
<body>

<h1 style="line-height: 100px; text-align: center; color: red">
    Bán Hàng
</h1>

<section class="container">
    <h5 style="background-color: yellow; color: red; padding-left: 20px">
        Danh sách sản phẩm
    </h5>
    <br>
    <table class="table  table-hover" style="text-align: center">
        <thead>
        <tr>
            <th scope="col">STT</th>
            <th scope="col">Tên</th>
            <th scope="col">Nhà sản xuất</th>
            <th scope="col">Màu sắc</th>
            <th scope="col">Dòng SP</th>
            <th scope="col">Số lượng tồn</th>
            <th scope="col">Đơn giá</th>
            <th scope="col">Mô tả</th>
            <th scope="col">Function</th>
        </tr>
        </thead>
        <tbody>

        <c:if test="${f:length(ds)==0}">
            <span>Hãy chọn sản phẩm</span>
        </c:if>
        <c:if test="${f:length(ds)!=0}">
            <c:forEach items="${ds}" var="dssp" varStatus="status">
                <tr>
                    <td>${status.index+1}</td>
                    <td>${dssp.sp.ten}</td>
                    <td>${dssp.nsx.ten}</td>
                    <td>${dssp.ms.ten}</td>
                    <td>${dssp.dsp.ten}</td>
                    <td>${dssp.soLuongTon}</td>
                    <td>${dssp.giaBan}</td>
                    <td>${dssp.moTa}</td>
                    <td>
                        <a href="add/${sp.id}" class="btn btn-primary">Thêm vào giỏ hàng</a>
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
        <a href="gioHang" class="btn btn-primary">Giỏ Hàng</a>
    </p>

</section>

</body>
</html>
