package qlsinhvien;

import java.util.Scanner;

public class TheMuon extends  SinhVien{
    private String maPhieuMuon;
    private String ngayMuon;
    private String hanTra;
    private String soHieuSach;
    public TheMuon(){

    }

    public TheMuon(String maPhieuMuon, String ngayMuon, String hanTra, String soHieuSach) {
        this.maPhieuMuon = maPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public TheMuon(String ten,
                   int tuoi,
                   String lop,
                   String maPhieuMuon,
                   String ngayMuon,
                   String hanTra,
                   String soHieuSach) {
        super(ten, tuoi, lop);
        this.maPhieuMuon = maPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public String getMaPhieuMuon() {
        return maPhieuMuon;
    }

    public void setMaPhieuMuon(String maPhieuMuon) {
        this.maPhieuMuon = maPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public void thongTinTheMuon(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã phiếu mượn");
        maPhieuMuon = sc.nextLine();
        System.out.println("nhập vào ngày mượn");
        ngayMuon = sc.nextLine();
        System.out.println("nhập vào hạn trả");
        hanTra = sc.nextLine();
        System.out.println("nhập số hiệu sách");
        soHieuSach = sc.nextLine();
        System.out.println("nhập thông tin sinh viên");
        super.nhapThongTinSinhVien();
    }

  public void hienThiThongTin(){
      System.out.println(this.toStringTheMuon());
      //hiện thi thong tin sinh viên
      super.hienThiThongTin();
  }

    public String toStringTheMuon() {
        return "TheMuon{" +
                "maPhieuMuon='" + maPhieuMuon + '\'' +
                ", ngayMuon='" + ngayMuon + '\'' +
                ", hanTra='" + hanTra + '\'' +
                ", soHieuSach='" + soHieuSach + '\'' +
                '}';
    }
}
