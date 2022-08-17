package Day08;
interface IFruit{
    public abstract class Fruit implements IFruit {
        protected int Id;
        protected String Name;
        protected double price;

        public Fruit() {
        }
        public Fruit(int Id, String Name, double price) {
            this.Id = Id;
            this.Name = Name;
            this.price = price;
        }

        public int getId() {
            return Id;
        }

        public void setId(int Id) {
            this.Id = Id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice() {
            this.price = price;
        }

        public double priceForSale() {
            System.out.println("priceForSale");
            return 0;
        }

        @Override
        public String toString() {
            return "Fruit{" + "Id=" + Id + ", Name=" + Name + "," +
                    " price=" + price + '}';

        }
        public abstract String tostring();
    }
}
class FruitIn extends IFruit.Fruit {
    private double extraIn;

    public FruitIn() {
    }
    public FruitIn(double extraIn,int Id, String Name, double price) {
        super(Id,Name,price);
        this.extraIn = extraIn;
    }

    @Override
    public double priceForSale() {
        double GiaBan = price + extraIn;
        return GiaBan;
    }

    @Override
    public String tostring() {
        return "FruitIn{"+super.toString() + "extraIn=" + extraIn + '}';
    }
}
class FruitOut extends IFruit.Fruit {
    private String orgin;
    private double extraOut;

    public FruitOut() {
    }

    public FruitOut(String orgin, double extraOut,int Id, String Name, double price) {
        super(Id, Name, price);
        this.orgin = orgin;
        this.extraOut =extraOut;
    }

    @Override
    public double priceForSale() {
        double GiaBan = price + extraOut + (20/100 * extraOut);
        return GiaBan;
    }

    @Override
    public String tostring() {
        return "FruitOut{"+super.toString() + "orgin=" + orgin + "extraOut=" + extraOut + '}';
    }
}
//class main {
//    public static void main(String[] args) {
////       e giaBan= new GiaBan(20/200);
////    }
////}