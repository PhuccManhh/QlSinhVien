package qlsinhvien;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class QuanLyTheMuon {
    public TheMuon[] danhSachTheMuon;
    private  int soLuongCacTheDangMuon;
    private int tongSoCacThe;

    public QuanLyTheMuon() {
        this.tongSoCacThe = 100;
        this.danhSachTheMuon = new TheMuon[this.tongSoCacThe];
        this.soLuongCacTheDangMuon = 0;
    }

    public void themTheMuon(){
        if(this.soLuongCacTheDangMuon == this.tongSoCacThe -1){
            System.out.println("danh Sách đã đầy");
            return;
        }

        System.out.println("Nhập vào thong tin thẻ mượn");
        TheMuon theMuon = new TheMuon();
        theMuon.nhapThongTinSinhVien();
        System.out.println("Thông tin thẻ mượn là");
        theMuon.hienThiThongTin();
        //thêm thẻ mượn vào danh sách thẻ mượn
        this.danhSachTheMuon[this.soLuongCacTheDangMuon] = theMuon;
        this.soLuongCacTheDangMuon++;
    }

    public void hienThongTinCacTheDaMuon(){
        System.out.println("thông tin thẻ mượn là");
        for (int i = 0; i < this.soLuongCacTheDangMuon; i++){
            TheMuon theMuon = this.danhSachTheMuon[i];
            theMuon.hienThiThongTin();
        }

    }

    public void xoaTheoMaThe(){
        boolean xoathanhcong = false;
        System.out.println("nhập vào mã thé muốn xóa");
        String maThe = new Scanner(System.in).nextLine();
        for (int i = 0; i < this.soLuongCacTheDangMuon; i++){
            TheMuon theMuon = this.danhSachTheMuon[i];
            if (maThe.equalsIgnoreCase(theMuon.getMaPhieuMuon())){
                for (int j = i; j < this.soLuongCacTheDangMuon; j ++){
                    this.danhSachTheMuon[j] = this.danhSachTheMuon[j + 1];
                }
                this.soLuongCacTheDangMuon++;
                xoathanhcong = true;
            }
        }
        if (xoathanhcong){
            System.out.println("đã xóa thành công" + maThe);
        }else{
            System.out.println("thẻ không tồn tại" + maThe);
        }
    }

    public void khoiTaoTheMuon(){
       SimpleDateFormat simpleDateFormat = new SimpleDateFormat("");
       Date currentDate = new Date();
       String currentDateString = simpleDateFormat.format(currentDate);
       for (int i = 0; i < 3; i++){
           TheMuon theMuon = new TheMuon(
                   "Nguyễn Văn A" + i,
                   i + 20,
                   " lop " + (i + 5),
                   " P" + i,
                   currentDateString,
                   currentDateString,
                   " B_" + i);
           danhSachTheMuon[soLuongCacTheDangMuon] = theMuon;
           soLuongCacTheDangMuon++;
       }
    }
}
