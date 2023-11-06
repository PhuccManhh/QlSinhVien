package qlsinhvien;


import java.util.Scanner;

public abstract class SinhVien {
    private String ten;
    private int tuoi;
    private String lop;


    public void nhapThongTinSinhVien(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên sinh viên");
        this.ten = sc.nextLine();
        System.out.println("nhập vào tuổi");
        this.tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("nhập thông tin lớp");
        this.lop = sc.nextLine();
    }

    public SinhVien() {
    }

    public SinhVien(String ten, int tuoi, String lop) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    void hienThiThongTin(){
        System.out.println(this.toString());
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;

    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", lop='" + lop + '\'' +
                '}';
    }
}
