<%--
  Created by IntelliJ IDEA.
  User: Ngọc Thanh
  Date: 3/12/2023
  Time: 11:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="../../css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <form action="update/${ch.ma}" method="post" class="was-validated">
        <div class="mb-3 row">
            <label for="inputMa" class="col-sm-2 col-form-label">Mã cửa hàng</label>
            <div class="col-sm-10">
                <input type="text" name="ma" class="form-control" id="inputMa" value="${ch.ma}" disabled>
            </div>
        </div>

        <div class="mb-3 row">
            <label for="inputTen" class="col-sm-2 col-form-label">Tên cửa hàng</label>
            <div class="col-sm-10">
                <input type="text" name="ten" class="form-control" id="inputTen" value="${ch.ten}" required>
            </div>
            <div class="invalid-feedback">
                Cần nhập tên cửa hàng
            </div>
        </div>

        <div class="mb-3 row">
            <label for="inputDiaChi" class="col-sm-2 col-form-label">Địa chỉ</label>
            <div class="col-sm-10">
                <input type="text" name="diaChi" class="form-control" id="inputDiaChi" value="${ch.diaChi}" required>
            </div>
            <div class="invalid-feedback">
                Cần nhập địa chỉ
            </div>
        </div>

        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Thành phố</label>
            <div class="col-sm-10">
                <select name="thanhPho" class="form-select" aria-label="Default select example" required>
                    <option selected value="Hà Nội" ${ch.thanhPho == "Hà Nội" ? 'selected' : ''}>Hà Nội</option>
                    <option value="Hồ Chí Minh" ${ch.thanhPho == "Hồ Chí Minh" ? 'selected' : ''}>Hồ Chí Minh</option>
                    <option value="Hải Phòng" ${ch.thanhPho == "Hải Phòng" ? 'selected' : ''}>Hải Phòng</option>
                    <option value="Đà Lạt" ${ch.thanhPho == "Đà Lạt" ? 'selected' : ''}>Đà Lạt</option>
                </select>
            </div>
            <div class="invalid-feedback">
                Cần chọn thành phố
            </div>
        </div>

        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Quốc gia</label>
            <div class="col-sm-10">
                <select name="quocGia" class="form-select" aria-label="Default select example" required>
                    <option value="Việt Nam" selected ${ch.quocGia == "Việt Nam" ? 'selected' : ''}>Việt Nam</option>
                    <option value="Japan" ${ch.quocGia == "Japan" ? "selected" : ""}>Japan</option>
                    <option value="Korea" ${ch.quocGia == "Korea" ? 'selected' : ''}>Korea</option>
                    <option value="America" ${ch.quocGia == "America" ? 'selected' : ''}>America</option>
                </select>
                <div class="invalid-feedback">
                    Cần chọn quốc gia
                </div>
            </div>
        </div>
        <p style="text-align: center">
            <button class="btn btn-success">Update</button>
        </p>
    </form>
</div>

</body>
</html>
