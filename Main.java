package qlsinhvien;
/**
 Bài 4)
 Thư viện trung tâm đại học quốc gia có nhu cầu quản lý việc mượn, trả sách.
 Sinh viên đăng ký tham gia mượn sách thông qua thẻ mà thư viện cung cấp.

 Với mỗi thẻ sẽ lưu các thông tin sau:
 Mã phiếu mượn,
 ngày mượn,
 hạn trả,
 số hiệu sách,
 và các thông tin cá nhân của sinh viên mượn sách.
 Các thông tin của sinh viên mượn sách bao gồm:
 Họ tên, tuổi, lớp.

 Để đơn giản cho ứng dụng console. Chúng ta mặc định ngày mượn, ngày trả là số nguyên dương.

 Yêu cầu 1: Xây dựng lớp SinhVien để quản lý thông tin của mỗi sinh viên.

 Yêu cầu 2: Xây dựng lớp TheMuon để quản lý việc mượn trả sách của các sinh viên.

 Yêu cầu 3: Xây dựng các phương thức: Thêm, xoá theo mã phiếu mượn và hiển thị thông tin các thẻ mượn.

 Phân tích:
 3 class chính:
 Sinh Viên: chưa các thông tin sinh viên
 thuộc tính: tên, tuổi, lớp
 constrcutor: không tham số, đầy đủ tham số
 method: nhập thông tin, hiển thị thông tin
 Thẻ Mượn kế thừa lớp Sinh Vien
 thuộc tính:
 Mã phiếu mượn,
 ngày mượn,
 hạn trả,
 danh sách số hiệu sách,
 constructor: không tham số, đầy đủ tham số
 method:
 nhập thông tin thẻ mượn
 hiển thị thông tin thẻ mượn

 Quản lý thẻ mượn
 thuộc tính:
 danh sách các thẻ mượn
 số lượng các thẻ
 tổng số các thẻ
 method:

 thêm thẻ mượn
 xóa theo mã phiếu
 hiển thị thông tin
 khởi tạo thẻ mượn

 Main
 chạy chương trình
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chucNang;
        QuanLyTheMuon quanLyTheMuon = new QuanLyTheMuon();
        quanLyTheMuon.khoiTaoTheMuon();
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.println("Nhập số để vào chức năng");
            System.out.println(
                    " 1.Thêm thẻ mượn \n" +
                    " 2. xóa thẻ mươn \n" +
                    " 3. hiển thị thông tin \n" +
                    " 4 thoát trương trình");
            chucNang = scanner.nextInt();
            switch (chucNang){
                case 1:
                    quanLyTheMuon.themTheMuon();
                    break;
                case 2:
                    quanLyTheMuon.xoaTheoMaThe();
                    break;
                case 3:
                    quanLyTheMuon.hienThongTinCacTheDaMuon();
                    break;
                default:
                    System.out.println("thoát chương trình");
            }
//            if (chucNang == 4){
//                System.out.println("Thoát Trương Trình");
//            }
        }while (chucNang != 4);
    }
}

