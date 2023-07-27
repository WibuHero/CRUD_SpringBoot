
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../../css/bootstrap.min.css">
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>

</head>
<body>
<h1 style="line-height: 100px; text-align: center; color: red">
    Thêm Cửa Hàng
</h1>
    <div class="container">
        <sf:form action="store" method="post" modelAttribute="ch">
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Mã cửa hàng</label>
            <div class="col-sm-10">
                <sf:input path="ma" class="form-control"></sf:input>
            </div>
            <div >
                <small >
                    <sf:errors path="ma" cssStyle="color: red"></sf:errors>
                </small>
            </div>
        </div>
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Tên cửa hàng</label>
            <div class="col-sm-10">
                <sf:input path="ten" class="form-control"></sf:input>
            </div>
            <div >
                <small >
                    <sf:errors path="ten" cssStyle="color: red"></sf:errors>
                </small>
            </div>
        </div>
        <div class="mb-3 row">
            <label class="col-sm-2 col-form-label">Địa chỉ</label>
            <div class="col-sm-10">
                <sf:input path="diaChi" class="form-control"></sf:input>
            </div>
            <div >
                <small >
                    <sf:errors path="diaChi" cssStyle="color: red"></sf:errors>
                </small>
            </div>
        </div>
            <div class="mb-3 row">
                <label class="col-sm-2 col-form-label">Thành phố</label>
                <div class="col-sm-10">
                    <sf:select path="thanhPho" cssClass="form-select">
                        <sf:option value="Hà Nội" >Hà Nội</sf:option>
                        <sf:option value="Đà Nẵng" >Đà Nẵng</sf:option>
                        <sf:option value="New York" >New York</sf:option>
                    </sf:select>

                </div>
            </div>
            <div class="mb-3 row">
                <label class="col-sm-2 col-form-label">Thành phố</label>
                <div class="col-sm-10">
                    <sf:select path="quocGia" cssClass="form-select">
                        <sf:option value="Việt Nam" >Việt Nam</sf:option>
                        <sf:option value="USA" >USA</sf:option>
                    </sf:select>

                </div>
            </div>
        <button class="btn btn-success">Add</button>
    </sf:form>
    </div>




<%--<div class="container">--%>
<%--    <form method="POST" action="store" class="was-validated">--%>
<%--        <div class="mb-3 row">--%>
<%--            <label for="inputMa" class="col-sm-2 col-form-label">Mã cửa hàng</label>--%>
<%--            <div class="col-sm-10">--%>
<%--                <input type="text" class="form-control" id="inputMa" name="ma" required>--%>
<%--            </div>--%>
<%--            <div class="invalid-feedback">--%>
<%--                Cần nhập mã--%>
<%--            </div>--%>
<%--        </div>--%>

<%--        <div class="mb-3 row">--%>
<%--            <label for="inputTen" class="col-sm-2 col-form-label">Tên cửa hàng</label>--%>
<%--            <div class="col-sm-10">--%>
<%--                <input type="text" class="form-control" id="inputTen" name="ten" required>--%>
<%--            </div>--%>
<%--            <div class="invalid-feedback">--%>
<%--                Cần nhập tên cửa hàng--%>
<%--            </div>--%>
<%--        </div>--%>

<%--        <div class="mb-3 row">--%>
<%--            <label for="inputDiaChi" class="col-sm-2 col-form-label">Địa chỉ</label>--%>
<%--            <div class="col-sm-10">--%>
<%--                <input type="text" class="form-control" id="inputDiaChi" name="diaChi" required>--%>
<%--            </div>--%>
<%--            <div class="invalid-feedback">--%>
<%--                Cần nhập địa chỉ--%>
<%--            </div>--%>
<%--        </div>--%>

<%--        <div class="mb-3 row">--%>
<%--            <label class="col-sm-2 col-form-label">Thành phố</label>--%>
<%--            <div class="col-sm-10">--%>
<%--                <select name="thanhPho" class="form-select" aria-label="Default select example" required>--%>
<%--                    <option selected>Hà Nội</option>--%>
<%--                    <option>Đà Nẵng</option>--%>
<%--                </select>--%>
<%--                <div class="invalid-feedback">--%>
<%--                    Cần chọn thành phố--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>

<%--        <div class="mb-3 row">--%>
<%--            <label class="col-sm-2 col-form-label">Quốc gia</label>--%>
<%--            <div class="col-sm-10">--%>
<%--                <select name="quocGia" class="form-select" aria-label="Default select example" required>--%>
<%--                    <option selected>Việt Nam</option>--%>
<%--                    <option>Japan</option>--%>

<%--                </select>--%>
<%--                <div class="invalid-feedback">--%>
<%--                    Cần chọn quốc gia--%>
<%--                </div>--%>
<%--            </div>--%>
<%--        </div>--%>
<%--        <button class="btn btn-success">Add</button>--%>
<%--    </form>--%>
<%--</div>--%>

</body>
</html>
