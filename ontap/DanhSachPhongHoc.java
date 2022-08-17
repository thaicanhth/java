//package ontap;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//interface IFruit{
//    String priceForSale();
//}
//class Main{
//    public static void main(String[] args) {
//        FruitList fruitList = new FruitList();
//        int choice;
//        while (true){
//            choice = Menu.menu();
//            switch (choice) {
//                case 1:
//                    dsPhonghoc.themPhong();
//                    break;
//                case 2:
//                    dsPhonghoc.hienThi();
//                case 6:
//                    return;
//                default:
//                    System.out.println("Invalid");
//            }
//        }
//    }
//}
//class Validation {
//    public static Scanner sc = new Scanner(System.in);
//
//    public static String checkInputString() {
//        while (true) {
//            String result = sc.nextLine().trim();
//            if (result.isEmpty()){
//                System.out.println("Not Empty");
//                System.out.println("Enter again: ");
//            } else {
//                return result;
//            }
//        }
//    }
//    public static int checkInputInt() {
//        while (true) {
//            try {
//                int result = Integer.parseInt(sc.nextLine().trim());
//                return result;
//            } catch (NumberFormatException e) {
//                System.out.println("Please input number integer");
//                System.out.println("Enter again: ");
//            }
//        }
//    }
//    public static double checkInputDouble() {
//        while (true) {
//            try {
//                double result = Double.parseDouble(sc.nextLine().trim());
//                return result;
//            } catch (NumberFormatException e) {
//                System.out.println("Please input number integer");
//                System.out.println("Enter again: ");
//            }
//        }
//    }
//}
//
//class Fruit extends PhongHoc {
//    private boolean mayChieu;
//
//    public PhongLyThuyet() {
//
//    }
//    public PhongLyThuyet(boolean mayChieu, String maPhong, String dayNha, double dienTich, int soBongDen) {
//        super(maPhong, dayNha, dienTich, soBongDen);
//        this.mayChieu = mayChieu;
//    }
//    public static int menu() {
//        int useChoice;
//
//        System.out.println("Press 1: Tao ");
//        System.out.println("Press 2: In ");
//        System.out.println("Press 3: Tim kiem theo ma");
//        System.out.println("Enter your choice: ");
//        useChoice = Validation.checkInputInt();
//        return useChoice;
//    }
//
//    @Override
//    public String danhGia() {
//        String tinhTrang = "Khong dat chuan";
//        double duAnhSang = dienTich / soBongDen;
//        if (duAnhSang <= 10 && mayChieu == true) {
//            tinhTrang = "Dat Chuan";
//        }
//        return tinhTrang;
//    }
//
//    @Override
//    public String toString() {
//        return "PhongLyThuyet{" +
//                super.toString() +
//                "mayChieu=" + mayChieu +
//                '}';
//    }
//}
//class PhongThucHanh extends  PhongHoc{
//    protected int soLuongMay;
//
//    public PhongThucHanh() {
//
//    }
//
//    public PhongThucHanh(int soLuongMay, String maPhong, String dayNha, double dienTich, int soBongDen) {
//        super(ma, ten, gia, soluong);
//        this.soLuongMay = soLuongMay;
//    }
//
//    @Override
//    public String danhGia() {
//        String tinhTrang = "Khong dat chuan";
//        double duMay = dienTich / soLuongMay;
//        if (duMay <= 1.5) {
//            tinhTrang = "Dat Chuan";
//        }
//        return tinhTrang;
//    }
//
//    @Override
//    public String toString() {
//        return "PhongThucHanh{" +
//                super.toString() +
//                "soLuongMay=" + soLuongMay +
//                '}';
//    }
//}
//class Menu {
//    public static int menu() {
//        int useChoice = 0;
//        System.out.println("Press1: Tao Phong");
//        System.out.println("Press2: In Phong");
//        System.out.println("Bam 6: Thoat Chuong Trinh");
//        System.out.println("Moi Nhap: ");
//        return useChoice;
//    }
//}
//
//class Fruit  {
//    protected String ma;
//    protected String ten;
//    protected double gia;
//    protected int soluong;
//
//    public Fruit () {
//    }
//
//    public Fruit (String ma, String ten, double gia, int soluong) {
//        this.ma = ma;
//        this.ten = ten;
//        this.gia = gia;
//        this.soluong = soluong;
//    }
//
//    public String getMaPhong() {
//        return ma;
//    }
//
//    public void setMaPhong(String ma) {
//        this.ma = ma;
//    }
//
//    public String getDayNha() {
//        return ten;
//    }
//
//    public void setDayNha(String dayNha) {
//        this.ten = dayNha;
//    }
//
//    public double getDienTich() {
//        return gia;
//    }
//
//    public void setDienTich(double dienTich) {
//        this.gia = dienTich;
//    }
//
//    public int getSoBongDen() {
//        return soluong;
//    }
//
//    public void setSoBongDen(int soBongDen) { this.soluong = soBongDen;
//    }
//
//    public String priceForSale() {
//        return "unknowwn";
//    }
//
//    @Override
//    public String toString() {
//        return "PhongHoc{"+"maPhong=" + ma + ",dayNha=" + dayNha +",dienTich=" + dienTich +",soBongDen=" + soBongDen+'}';
//    }
//}
//public class Fruit{
//    private ArrayList<Fruit > phonghoc = new ArrayList<>();
//
//    public void DanhSachPhong() {
//        Fruit  phonglt1 = new PhongLyThuyet(true, "A", "AA", 20, 5);
//        phonghoc.add(phonglt1);
//        Fruit phonglt2 = new PhongLyThuyet(true, "B", "BB", 100, 5);
//        phonghoc.add(phonglt2);
//        Fruit  phonglt3 = new PhongLyThuyet(true, "C", "CC", 60, 3);
//        phonghoc.add(phonglt3);
//        Fruit  phongth1 = new PhongThucHanh(10, "DD", "DD", 200, 20);
//        phonghoc.add(phongth1);
//        Fruit  phongth2 = new PhongThucHanh(60, "GG", "GG", 90, 10);
//        phonghoc.add(phongth2);
//        Fruit  phongth3 = new PhongThucHanh(100, "EE", "EE", 100, 15);
//        phonghoc.add(phongth1);
//    }
//
//    public void themPhong() {
//        char nhapNua = 'N';
//        do {
//            System.out.println("Press T: Tao Phong Thuc Hanh");
//            System.out.println("Press L: Tao Phong Ly Thuyet");
//            System.out.println("Press E: Thoat");
//            System.out.println("Enter your choice T/L/E: ");
//            char opt = Validation.sc.nextLine().charAt(0);
//            Fruit phongHocTam = new Fruit();
//            switch (opt) {
//                case 'T':
//                    System.out.println("Nhap so may tinh: ");
//                    int smt = Validation.checkInputInt();
//                    System.out.println("Nhap Ma phong: ");
//                    String mpth = Validation.checkInputString();
//                    System.out.println("Nhap day nha: ");
//                    String dnth = Validation.checkInputString();
//                    System.out.println("Nhap Dien Tich: ");
//                    double dtth = Validation.checkInputDouble();
//                    System.out.println("Nhap so bong den: ");
//                    int sbd = Validation.checkInputInt();
//                    phongHocTam = new PhongThucHanh(smt, mpth, dnth, dtth, sbd);
//                    break;
//                case 'L':
//                    System.out.println("Co May Chieu: ");
//                    boolean mc = Validation.sc.nextBoolean();
//                    Validation.sc.nextLine();
//                    System.out.println("Nhap Ma Phong: ");
//                    String mplt = Validation.checkInputString();
//                    System.out.println("Nhap day nha: ");
//                    String dn = Validation.checkInputString();
//                    System.out.println("Nhap dien tich: ");
//                    double dtlt = Validation.checkInputDouble();
//                    System.out.println("Nhap so bong den: ");
//                    int bd = Validation.checkInputInt();
//                    break;
//                case 'E':
//                    return;
//                default:
//                    System.out.println("Invalid");
//            }
//            phonghoc.add(phongHocTam);
//
//            System.out.println("Muon nhap nua hay khong Y/N: ");
//            nhapNua = Validation.sc.nextLine().charAt(0);
//        } while (nhapNua == 'Y');
//    }
//
//    public void hienThi() {
//        for (Fruit mine : phonghoc) {
//            System.out.println("" + mine.toString());
//            System.out.println("" + mine.danhGia());
//            System.out.println("");
//        }
//    }
//    public Fruit hienThiTheoMa(String maPhong) {
//        for (Fruit ph : phonghoc) {
//            if (ph.getMaPhong().equals(maPhong)) {
//                return ph;
//            }
//        }
//        return null;
//    }
//    public void hienThiDatChuan(){
//        for (Fruit ph : phonghoc){
//            if (ph.danhGia().equals("Dat Chuan")) {
//                System.out.println(""+ph.toString());
//            }
//        }
//    }
//}
//class Main01 {
//    public static void main(String[] args){
//        DanhSachPhongHoc dsphong = new DanhSachPhongHoc();
//        int choice;
//        while (true) {
//            choice = Menu.menu();
//            switch (choice) {
//                case 1:
//                    dsphong.themPhong();
//                    break;
//                case 2:
//                    dsphong.hienThi();
//                    break;
//                case 3:
//                    System.out.println("Nhap ma de tim: ");
//                    String maTam = Validation.checkInputString();
//                    Fruit = dsphong.hienThiTheoMa(maTam);
//                    if(Fruit instanceof PhongLyThuyet) {
//                        Fruit = (PhongLyThuyet) Fruit;
//                        System.out.println("" + Fruit);
//                    } else if (Fruit instanceof PhongThucHanh){
//                        Fruit = (PhongThucHanh) Fruit;
//                        System.out.println("" + Fruit);
//                    }
//                    if (Fruit == null) {
//                        System.out.println("Khong co phong hoc voi ma " + maTam);
//                    }
//                    break;
//                case 4:
//                    dsphong.hienThiDatChuan();
//                    break;
////                case 5:
////                    dsphong.hienThiPhongMayTren40();
////                    break;
//                case 6:
//
//                    return;
//                default:
//                    System.out.println("Invalid");
//            }
//        }
//    }
//}
//
//
