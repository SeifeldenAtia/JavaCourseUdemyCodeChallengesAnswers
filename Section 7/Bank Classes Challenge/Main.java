public class Main {


    public static void main(String[] args) {


        Bank bank = new Bank();

        bank.setAccountBalance(1555);

        bank.setAccountBalance(1);
        bank.setAccountNumber("123456789");

        bank.deposit( "123456789" ,  579);

        bank.deposit( "12345678" ,  20);

        bank.withdraw("123456789" , 500);




    }
}
