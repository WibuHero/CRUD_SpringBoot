
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<html>
<head>
    <title>Thêm nhân viên</title>
    <link rel="stylesheet" href="../../css/bootstrap.min.css" />
</head>
<body>
<section class="container">
    <h5 style="text-align: center">Thêm nhân Viên</h5>
    <sf:form action="store" method="post" modelAttribute="nv">
        <div class="row">
            <div class="col-6">
                <label>Mã</label>
                <sf:input  path="ma" class="form-control"></sf:input>
                <div>
                    <sf:errors path="ma" cssStyle="color: red"></sf:errors>
                </div>
            </div>
            <div class="col-6">
                <label>Họ</label>
                <sf:input path="ho" class="form-control"></sf:input>
                <div>
                    <sf:errors path="ho" cssStyle="color: red"></sf:errors>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-6">
                <label>Tên đệm</label>
                <sf:input  path="tenDem" class="form-control"></sf:input>
                <div>
                    <sf:errors path="tenDem" cssStyle="color: red"></sf:errors>
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
                <label>Giới tính</label>
                <div style="margin-top: 8px">
                    <div class="form-check form-check-inline">
                        <sf:radiobutton class="form-check-input" path="gioiTinh" id="inlineRadio1" ></sf:radiobutton>
                        <label class="form-check-label" for="inlineRadio1">Nam</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <sf:radiobutton class="form-check-input" path="gioiTinh" id="inlineRadio2" ></sf:radiobutton>
                        <label class="form-check-label" for="inlineRadio2">Nữ</label>
                    </div>
                </div>
                <div>
                    <small><sf:errors path="gioiTinh" cssStyle="color: red"></sf:errors></small>
                </div>
            </div>
            <div class="col-6">
                <label>Ngày sinh</label>
                <sf:input path="ngaySinh" class="form-control"></sf:input>
                <div>
                    <sf:errors path="ngaySinh" cssStyle="color: red"></sf:errors>
                </div>
            </div>

        </div>
        <div class="row">
            <div class="col-6">
                <label>Địa chỉ</label>
                <sf:input path="diaChi" class="form-control"></sf:input>
                <div>
                    <sf:errors path="diaChi" cssStyle="color: red"></sf:errors>
                </div>
            </div>
            <div class="col-6">
                <label>SĐT</label>
                <sf:input path="sdt" class="form-control"></sf:input>
                <div>
                    <sf:errors path="sdt" cssStyle="color: red"></sf:errors>
                </div>
            </div>

        </div>
        <div class="row">
            <div class="col-6">
                <label>Mật khẩu</label>
                <sf:input path="matKhau" class="form-control"></sf:input>
                <div>
                    <sf:errors path="matKhau" cssStyle="color: red"></sf:errors>
                </div>
            </div>
            <div class="col-6">
                <label>Trạng thái</label>
                <div style="margin-top: 8px">
                    <div class="form-check form-check-inline">
                        <sf:radiobutton class="form-check-input" path="trangThai"  value="OK"></sf:radiobutton>
                        <label class="form-check-label" for="inlineRadio1">Đang làm</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <sf:radiobutton class="form-check-input" path="trangThai" value="Not OK"></sf:radiobutton>
                        <label class="form-check-label" for="inlineRadio2">Đã nghỉ</label>
                    </div>

                </div>
                <div>
                    <small><sf:errors path="trangThai" cssStyle="color: red"></sf:errors></small>
                </div>
            </div>
        </div>

        <div class="row">
            <div class="col-6">
                <label class="col-sm-2 col-form-label">Chức vụ</label>

                <sf:select path="tenCV" class="form-select" aria-label="Default select example">
                    <sf:option value="Quản lý">Quản lý</sf:option>
                    <sf:option value="Quản lý">Nhân Viên</sf:option>
                </sf:select>
            </div>
            <div class="col-6">
                <label class="col-sm-2 col-form-label">Cửa hàng</label>
                <sf:select path="tenCH" class="form-select" aria-label="Default select example">
                    <sf:option value="SamSung">SamSung</sf:option>
                    <sf:option value="Apple">Apple</sf:option>
                </sf:select>

            </div>
        </div>

        <br>
        <p style="text-align: right">
            <button class="btn btn-primary" style="height: 50px; width: 100px;font-size: 20px">Thêm</button>
        </p>

    </sf:form>
</section>
</body>
</html>
