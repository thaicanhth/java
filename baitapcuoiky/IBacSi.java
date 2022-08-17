package baitapcuoiky;

import java.util.ArrayList;

public abstract class IBacSi {
    public abstract double priceForSale();

    public abstract double luongHagThangn();

    interface printable {
        void IBacSi();
        public abstract class Fruit extends IBacSi {
            protected String ma;
            protected String hoTen;
            protected double mucLuong;

            public Fruit() {
            }
            public Fruit(String ma, String hoten, double mucluong) {
                this.ma = ma;
                this.hoTen = hoten;
                this.mucLuong = mucluong;
            }

            public String getId() {
                return ma;
            }

            public void setId(String ma) {
                this.ma = ma;
            }

            public String getHoten() {
                return hoTen;
            }

            public void setHoten(String hoten) {
                this.hoTen = hoten;
            }

            public double getMucluong() {
                return mucLuong;
            }

            public void setPrice() {
                this.mucLuong = mucLuong;
            }

            @Override
            public double priceForSale() {
                System.out.println("priceForSale");
                return 0;
            }

            @Override
            public String toString() {
                return "Fruit{" + "ma=" + ma + ", hoTen=" + hoTen + "," +
                        " mucLuong=" + mucLuong + '}';
            }
            public abstract String tostring();
        }
    }
    public abstract class BacSi extends IBacSi {
        protected String ma;
        protected String hoTen;
        protected double mucLuong;

        public BacSi() {

        }

        public BacSi(String ma, String hoTen, double mucLuong) {
            this.ma = ma;
            this.hoTen = hoTen;
            this.mucLuong = mucLuong;
        }

        public String getMa() {
            return ma;
        }

        public void setMa(String ma) {
            this.ma = ma;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public double getMucLuong() {
            return mucLuong;
        }

        public void setMucLuong(double mucLuong) {
            this.mucLuong = mucLuong;
        }

        @Override
        public double luongHagThangn() {
            return 0;
        }

        @Override
        public String toString() {
            return "BacSi{" +
                    "ma='" + ma + '\'' +
                    ", hoTen='" + hoTen + '\'' +
                    ", mucLuong=" + mucLuong +
                    '}';
        }
    }
//c
public abstract class BSToanTG extends BacSi{
    private double luongKham;
    private double luongXetNghiem;

    public BSToanTG() {

    }

    public BSToanTG(String ma, String hoTen, double mucLuong, double luongKham, double luongXetNghiem) {
        super(ma, hoTen, mucLuong);
        this.luongKham = luongKham;
        this.luongXetNghiem = luongXetNghiem;
    }

    public double luongHangThang() {
        double luongBSToanTG = luongKham + luongXetNghiem + mucLuong;
        return luongBSToanTG;
    }

    @Override
    public String toString() {
        return "BSToanTG{" +
                super.toString() +
                "luongKham=" + luongKham +
                ", luongXetNghiem=" + luongXetNghiem +
                '}';
    }
 }
 //d
 public abstract class BSBanTG extends BacSi {
     private double luongNgay;
     private int soNgayLamViec;

     public BSBanTG() {

     }

     public BSBanTG(String ma, String hoTen, double mucLuong, double luongNgay, int soNgayLamViec) {
         super(ma, hoTen, mucLuong);
         this.luongNgay = luongNgay;
         this.soNgayLamViec = soNgayLamViec;
     }

     public double luongHangThang() {
         double phuPhiLuong;
         if (soNgayLamViec < 7) {
             phuPhiLuong = 500;
         } else {
             phuPhiLuong = 1000;
         }

         int mucLuong = 0;
         double luongBSBanTG = mucLuong * 30 % +luongNgay * soNgayLamViec + phuPhiLuong;

         return luongBSBanTG;
     }

     @Override
     public String toString() {
         return "BSBanTG{" +
                 super.toString() +
                 "luongNgay=" + luongNgay +
                 ", soNgayLamViec=" + soNgayLamViec +
                 '}';
     }
 }}

// }
 //e
// interface IFruit {
//     String DSBacSi();
//     public class DSBacSi {
//         private ArrayList<BacSi> Bacsi = new ArrayList<>();
//
//         public DSBacSi() {
//             BacSi BSBanTG1 = new BSBanTG1("01","Phan Huy", "Bao",150000,7);
//             Bacsi.add(BSBanTG1);
//             BacSi BSBanTG2 = new BSBanTG2("02","Phan Văn", "Canh",150000,7);
//             Bacsi.add(BSBanTG1);
//             BacSi BSBanTG3 = new BSBanTG3("03","Phan Văn", "Cao",150000,7);
//             Bacsi.add(BSBanTG3);
//         }
//     }
//  }
//}


