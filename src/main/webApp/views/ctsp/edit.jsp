<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
    <title>
        Chi tiết Sản phẩm
    </title>
    <link rel="stylesheet" href="../../css/bootstrap.min.css" >
</head>
<body >
<h1 style="line-height: 100px; text-align: center; color: red">
    Sửa Chi Tiết Sản Phẩm
</h1>
<div class="container">
    <sf:form action="${action}" method="post" modelAttribute="ctsp">
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Sản Phẩm</label>
            <div class="col-sm-10">
                <sf:select path="idSP" cssClass="form-select">
                    <c:forEach items="${sp}" var = "sp">
                        <sf:option value="${sp.id}" >${sp.ten}</sf:option>
                    </c:forEach>
                </sf:select>

            </div>
        </div>
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Nhà Sản Xuất</label>
            <div class="col-sm-10">
                <sf:select path="idNsx" cssClass="form-select">
                    <c:forEach items="${nsx}" var = "nsx">
                        <sf:option value="${nsx.id}" >${nsx.ten}</sf:option>
                    </c:forEach>
                </sf:select>

            </div>
        </div>
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Màu Sắc</label>
            <div class="col-sm-10">
                <sf:select path="idMs" cssClass="form-select">
                    <c:forEach items="${ms}" var = "ms">
                        <sf:option value="${ms.id}" >${ms.ten}</sf:option>
                    </c:forEach>
                </sf:select>

            </div>
        </div>
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Dòng Sản Phẩm</label>
            <div class="col-sm-10">
                <sf:select path="idDsp" cssClass="form-select">
                    <c:forEach items="${dsp}" var = "dsp">
                        <sf:option value="${dsp.id}" >${dsp.ten}</sf:option>
                    </c:forEach>
                </sf:select>

            </div>
        </div>
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Năm Bảo Hành</label>
            <div class="col-sm-10">
                <sf:input path="namBH" class="form-control"></sf:input>
            </div>
            <div >
                <small >
                    <sf:errors path="namBH" cssStyle="color: red"></sf:errors>
                </small>
            </div>
        </div>
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Mô tả</label>
            <div class="col-sm-10">
                <sf:textarea path="moTa" class="form-control"></sf:textarea>
            </div>
            <div >
                <small >
                    <sf:errors path="moTa" cssStyle="color: red"></sf:errors>
                </small>
            </div>
        </div>
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Số Lượng Tồn</label>
            <div class="col-sm-10">
                <sf:input path="soLuongTon" class="form-control"></sf:input>
            </div>
            <div >
                <small >
                    <sf:errors path="soLuongTon" cssStyle="color: red"></sf:errors>
                </small>
            </div>
        </div>
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Giá Nhập</label>
            <div class="col-sm-10">
                <sf:input path="giaNhap" class="form-control"></sf:input>
            </div>
            <div >
                <small >
                    <sf:errors path="giaNhap" cssStyle="color: red"></sf:errors>
                </small>
            </div>
        </div>
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Giá Bán</label>
            <div class="col-sm-10">
                <sf:input path="giaBan" class="form-control"></sf:input>
            </div>
            <div >
                <small >
                    <sf:errors path="giaBan" cssStyle="color: red"></sf:errors>
                </small>
            </div>
        </div>

        <button class="btn btn-success">Sửa</button>
    </sf:form>
</div>
</body>
</html>