<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        /*body{*/
        /*    margin-left: 350px;*/
        /*}*/
        h3{
            margin-left: 600px;
        }
        #form {
            position: relative;
            width: 500px;
            border-radius: 5px;
            background-color: #f2f2f2;
            padding: 20px;
            margin-left: 400px;
        }
        button[type=submit] {
            width: 300px;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            text-align: center;
            position: absolute;
            margin-left: 20%;
        }

        button[type=submit]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
<h3><strong>Tờ khai y tế</strong></h3>
<div id="form">
    <form:form modelAttribute="toKhaiYTe" action="/created" method="post" >

            <tr>
                <td><p>Họ tên(ghi chữ IN HOA)</p></td>
                <form:input path="ten" />
            </tr>
            <tr>
                <td><p>Năm Sinh</p>
                    <form:input path="namSinh"/>
                </td>
                <td><p>Giới tính</p>
                    <form:select path="gioiTinh">
                        <form:option value="-1" label="Chọn"/>
                        <form:option value="0" label="Nam"/>
                        <form:option value="1"  label="Nữ"/>
                    </form:select></td>
                <td>
                    <p>Quốc tịnh</p>
                    <form:input path="quocTinh"/>
                </td>
            </tr>
            <tr>
                <td>
                    <p>Số hộ chiếu hoặc số CMND hoặc giấy thông hành hợp pháp khác</p>
                    <form:input path="cmnd"/>
                </td>

            </tr>
            <tr>
                <td>
                    <p>Thông tin đi lại</p>
                    <form:radiobuttons path="thongTinDiLai" items="${thongTinDiLaiList}"/>
                </td>
            </tr>
            <tr>
                <td>
                    <p>Số hiệu phương tiện</p>
                    <form:input path="soHieu"/>
                </td>
                <td>
                    <p>Số ghế</p>
                    <form:input path="soGhe"/>
                </td>
            </tr>
            <tr>
                <td>
                    <p>Ngày khởi hành</p>
                    <form:input path="ngayKhoiHanh"/>
                </td>
                <td>
                    <p>Ngày kết thúc</p>
                    <form:input path="ngayKetThuc"/>
                </td>
            </tr>
            <tr>
                <td>
                    <p>Trong vòng 14 ngày qua, Anh/Chị có đến tỉnh/thành nào?</p>
                    <form:input path="diaDiemDaDen"/>
                </td>
            </tr>
            <tr>
                <td>
                    <p>Địa chỉ liên lạc</p>
                    <p>Tỉnh / thành</p>
                    <form:input path="tinhThanhLienLac"/>
                </td>
                <td>
                    <p>Quận / huyện</p>
                    <form:input path="quanHuyenLienLac"/>
                </td>
                <td>
                    <p>Phường / xã</p>
                    <form:input path="phuongXaLienLac"/>
                </td>
            </tr>
            <tr>
                <td>
                    <p>Địa chỉ nơi ở</p>
                    <form:input path="diaChiNoiO"/>
                </td>
            </tr>
            <tr>
                <td>
                    <p>Điện thoại</p>
                    <form:input path="sdt"/>
                </td>
                <td>
                    <p>Email</p>
                    <form:input path="email"/>
                </td>
            </tr>
            <tr>
                <td>
                    <p>Trong vòng 14 ngày qua, Anh/Chị có thấy xuất hiện dấu hiệu nào sau đây không?</p>
                    <table border="1">
                        <tr>
                            <th>Triệu chứng</th>
                            <th>Có</th>
                            <th>Không</th>
                            <th>Triệu chứng</th>
                            <th>Có</th>
                            <th>Không</th>
                        </tr>
                        <tr>
                            <td>Sốt</td>
                            <td><form:radiobutton path="sot"/></td>
                            <td><form:radiobutton path="sot"/></td>
                            <td>Nôn/buồn nôn</td>
                            <td><form:radiobutton path="buonNon"/></td>
                            <td><form:radiobutton path="buonNon"/></td>
                        </tr>
                        <tr>
                            <td>Ho</td>
                            <td><form:radiobutton path="ho"/></td>
                            <td><form:radiobutton path="ho"/></td>
                            <td>Tiêu chảy</td>
                            <td><form:radiobutton path="tieuChay"/></td>
                            <td><form:radiobutton path="tieuChay"/></td>
                        </tr>
                        <tr>
                            <td>Khó thở</td>
                            <td><form:radiobutton path="khoTho"/></td>
                            <td><form:radiobutton path="khoTho"/></td>
                            <td>Xuất huyết ngoài da</td>
                            <td><form:radiobutton path="xuatHuyetNgoaiDa"/></td>
                            <td><form:radiobutton path="xuatHuyetNgoaiDa"/></td>
                        </tr>
                        <tr>
                            <td>Đau họng</td>
                            <td><form:radiobutton path="dauHong"/></td>
                            <td><form:radiobutton path="dauHong"/></td>
                            <td>Nổi ban ngoài da</td>
                            <td><form:radiobutton path="noiBanNgoaiDa"/></td>
                            <td><form:radiobutton path="noiBanNgoaiDa"/></td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td>
                    <p>Lịch sử phơi nhiễm: Trong vòng 14 ngày qua, Anh/Chị có</p>
                    <table border="1">
                        <tr>
                            <th></th>
                            <th>Có</th>
                            <th>Không</th>
                        </tr>
                        <tr>
                            <td>Đến trang trại chăn nuôi / chợ buôn bán động vật</td>
                            <td><form:radiobutton path="denTrangTrai"/> </td>
                            <td><form:radiobutton path="denTrangTrai"/> </td>
                        </tr>
                        <tr>
                            <td>Tiếp xúc gần người mắc bệnh viêm đường hô hấp do nCoV</td>
                            <td><form:radiobutton path="tiepXucGan"/> </td>
                            <td><form:radiobutton path="tiepXucGan"/> </td>
                        </tr>
                    </table>
                </td>
            </tr>
        <button type="submit">Gửi tờ khai</button>
    </form:form>
</div>

</body>
</html>
