public class Account {
        private String id;
        private String name;
        private int balance = 0;

        public Account() {
        }

        public Account(String id, String name) {
            this.id = id;
            this.name = name;
        }

        public Account(String id, String name, int balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getBalance() {
            return balance;
        }

        public void setBalance(int balance) {
            this.balance = balance;
        }
        // them tien vao tai khoan
        public int credit(int amount) {
            if (amount >= 0) {
                balance = balance + amount;
            }
            return balance;
        }
        // rut tien tu tai khoan
        public int debit(int amount){
            if (balance>=amount){
                balance = balance -amount;
            }else{
                System.out.println("poor");
            }
            return  balance;
        }
        public int transFerTo(Account accountShop, int amount) {
            if (balance >= amount) {
                // nhan tien
                accountShop.credit(amount);
                // mat 1 khoan tien khi mua
                balance = balance - amount;
            } else { // ngheo
                System.out.println("Poor");
            }
            return balance;
        }

    @Override
    public String toString() {
        return "Account["+"id="+id+",name="+name+",balance="+balance+"]";
    }
}
class Min03{
    public static void main(String[] args) {
        Account a01 = new Account("111","Canh", 500);
        a01.credit(1500);
        System.out.println(""+a01);
        a01.debit(200);
        System.out.println(""+a01);
        Account bumboshop = new Account("222","Banh Canh", 1000);
        a01.transFerTo(bumboshop, 10);
        System.out.println(""+bumboshop);
        System.out.println(""+a01);
    }
}



