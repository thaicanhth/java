//package ontap;
//
//import java.util.Scanner;
//
//interface IPhongHoc {
//    String danhGia();
//    class Validation {
//        public static Scanner sc = new Scanner(System.in);
//
//        public static String checkInputString() {
//            while (true) {
//                String result = sc.nextLine().trim();
//                if (result.isEmpty()){
//                    System.out.println("Not Empty");
//                    System.out.println("Enter again: ");
//                } else {
//                    return result;
//                }
//            }
//        }
//        public static int checkInputInt() {
//            while (true) {
//                try {
//                    int result = Integer.parseInt(sc.nextLine().trim());
//                    return result;
//                } catch (NumberFormatException e) {
//                    System.out.println("Please input number integer");
//                    System.out.println("Enter again: ");
//                }
//            }
//        }
//        public static double checkInputDouble() {
//            while (true) {
//                try {
//                    double result = Double.parseDouble(sc.nextLine().trim());
//                    return result;
//                } catch (NumberFormatException e) {
//                    System.out.println("Please input number integer");
//                    System.out.println("Enter again: ");
//                }
//            }
//        }
//    }
//public class Menu {
//    public static int menu() {
//        int useChoice;
//        System.out.println("Press 1: Tao Phong");
//        System.out.println("Press 2: In phong");
//        System.out.println("Bam 6: Thoat Chuong trinh");
//        System.out.println("Moi Nhap: ");
//        useChoice = Validation.checkInputInt();
//        return useChoice;
//    }
//}
//class PhongHoc implements IPhongHoc{
//    protected String maPhong;
//    protected String dayNha;
//    protected double dienTich;
//    protected int soBongDen;
//    public PhongHoc(){
//    }
//    public PhongHoc(String maPhong, String dayNha, double dienTich,int soBongDen) {
//        this.maPhong = maPhong;
//        this.dayNha = dayNha;
//        this.dienTich = dienTich;
//        this.soBongDen = soBongDen;
//    }
//    public String getMaPhong() {
//        return maPhong;
//    }
//    public void setMaPhong(String maPhong){
//        this.maPhong = maPhong;
//    }
//    public String getDayNha() {
//        return dayNha;
//    }
//    public void setDayNha(String dayNha) {
//        this.dayNha = dayNha;
//    }
//    public double getDienTich() {
//        return dienTich;
//    }
//    public void setDienTich(double dienTich) {
//        this.dienTich = dienTich;
//    }
//    public int getSoBongDen() {
//        return soBongDen;
//    }
//    public void setSoBongDen(int soBongDen) {
//        this.soBongDen= soBongDen;
//    }
//
//    @Override
//    public String danhGia() {
//        return "unknown";
//    }
//
//    @Override
//    public String toString() {
//        return "PhongHoc{"+"maPhong=" + maPhong + ",dayNha=" + dayNha +",dienTich=" + dienTich +",soBongDen=" + soBongDen+'}';
//    }
//}
// class PhongHocLyThuyet extends PhongHoc{
//    private boolean mayChieu;
//    public PhongHocLyThuyet() {
//    }
//    public PhongHocLyThuyet(boolean mayChieu, String maPhong, String dayNha,double dienTich,int soBongDen) {
//        super(maPhong, dayNha, dienTich, soBongDen);
//        this.mayChieu = mayChieu;
//    }
//     @Override
//     public String danhGia() {
//        String tinhTrang="Phong Lý Thuyet Dat Chuan";
//        //kiểm tra tình trạng có đủ sáng hay không
//         double duAnhSang= dienTich/soBongDen;
//         if ((duAnhSang<=10)&&mayChieu==true) {
//             tinhTrang ="Dat Chuan";
//         }
//         return tinhTrang;
//     }
//
//     @Override
//     public String toString() {
//         return "PhongHocLyThuyet{"+super.toString()+"mayChieu="+ mayChieu +'}';
//     }
// }
//abstract class PhongHocThucHanh extends PhongHoc {
//    private int soMayTinh;
//    private Object PhongHoc;
//
//    public PhongHocThucHanh() {
//    }
//
//    public PhongHocThucHanh(int soMayTinh, String maPhong, String dayNha, double dienTich, int soBongDen) {
//        super(maPhong, dayNha, dienTich, soBongDen);
//        this.soMayTinh = soMayTinh;
//    }
//
//    @Override
//    public String danhGia() {
//        String tinhTrang = "Phong Thuc Hanh Dat Chuan";
//        //kiểm tra tình trạng có đủ sáng hay không
//        double duAnhSang = dienTich / soBongDen;
//        if ((duAnhSang >= 1.5)) {
//            tinhTrang = "Phong Thuc Hanh Dat Chuan";
//        }
//        return tinhTrang;
//    }
//
//    @Override
//    public String toString() {
//        return "PhongHocThucHanh{" + super.toString() + "soMayTinh=" + soMayTinh + '}';
//    }
//}
//public default void hienthi(){
//    for (PhongHoc mine : Phonghoc) {
//        System.out.println(""+mine.toString());
//        System.out.println(""+mine.danhGia());
//        System.out.println("");
//    }
//}
//public default PhongHoc hienThiTheoMa(String maPhong) {
//    for (PhongHoc ph: Phonghoc) {
//        if (ph.getMaPhong().equals(maPhong)){
//            return ph;
//        }
//    }
//    return null;
//}
//public default void hienThiDatChuan() {
//    for (PhongHoc ph : Phonghoc) {
//        if (ph.danhGia().equals("Dat Chuan")) {
//            System.out.println("" + ph.toString());
//        }
//    }
//    class Mani {
//        public void main(String[] args) {
//          }
//       }
//    }
//}