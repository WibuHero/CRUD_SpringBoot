<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
    <title>Thêm mới khách hàng</title>
    <link rel="stylesheet" href="../../css/bootstrap.min.css" />
</head>
<body>
<div class="col-8 offset-2 mt-3">
    <sf:form method="POST"
          action="store" modelAttribute="kh">
        <div class="row">
            <div class="col-6">
                <label>Mã</label>
                <sf:input path="ma" class="form-control"></sf:input>
                <div>
                    <sf:errors path="ma" cssStyle="color: red"></sf:errors>
                </div>
            </div>
            <div class="col-6">
                <label>Tên</label>
                <sf:input  path="ten" class="form-control"></sf:input>
                <div>
                    <sf:errors path="ten" cssStyle="color: red"></sf:errors>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <label>Tên đệm</label>
                <sf:input path="tenDem" class="form-control"></sf:input>
                <div>
                    <sf:errors path="tenDem" cssStyle="color: red"></sf:errors>
                </div>
            </div>
            <div class="col-6">
                <label>Họ</label>
                <sf:input  path="ho" class="form-control"></sf:input>
                <div>
                    <sf:errors path="ho" cssStyle="color: red"></sf:errors>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <label>Ngày sinh</label>
                <sf:input  path="ngaySinh" class="form-control"></sf:input>
                <div>
                    <sf:errors path="ngaySinh" cssStyle="color: red"></sf:errors>
                </div>
            </div>
            <div class="col-6">
                <label>SDT</label>
                <sf:input  path="sdt" class="form-control"></sf:input>
                <div>
                    <sf:errors path="sdt" cssStyle="color: red"></sf:errors>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <label>Địa chỉ</label>
                <sf:input path="diaChi" class="form-control" ></sf:input>
                <div>
                    <sf:errors path="diaChi" cssStyle="color: red"></sf:errors>
                </div>
            </div>
            <div class="col-6">
                <label>Mật khẩu</label>
                <sf:input  path="mk" class="form-control"></sf:input>
                <div>
                    <sf:errors path="mk" cssStyle="color: red"></sf:errors>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <label>Quốc gia</label>
                <sf:select path="quocGia" class="form-select">
                    <sf:option value="Việt Nam">Việt Nam</sf:option>
                    <sf:option value="Lào">Lào</sf:option>
                    <sf:option value="Campuchia">Campuchia</sf:option>
                </sf:select>
                <div>
                    <sf:errors path="quocGia" cssStyle="color: red"></sf:errors>
                </div>
            </div>
            <div class="col-6">
                <label>Thành phố</label>
                <sf:select path="thanhPho" class="form-select">
                    <sf:option value="Hà Nội">Hà Nội</sf:option>
                    <sf:option value="Đà Nẵng">Đà Nẵng</sf:option>
                </sf:select>
                <div>
                    <sf:errors path="thanhPho" cssStyle="color: red"></sf:errors>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-6">
                <button class="btn btn-primary">Thêm mới</button>
            </div>
            <div class="col-6"></div>
        </div>
    </sf:form>
</div>

</body>
</html>
