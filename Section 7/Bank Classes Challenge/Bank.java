public class Bank {



//    Attributes    or     Fields
    private String accountNumber ;

    private double accountBalance ;


    private String customerName ;

    private String email ;

    private String phone ;


//  Behaviour

    public String getAccountNumber () {

        return accountNumber ;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setAccountNumber (String accountNumber) {

       this.accountNumber = accountNumber ;

    }

    public void setAccountBalance(long accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public void deposit (String accountNumber , long amount) {

        if (accountNumber == this.accountNumber) {

            this.accountBalance = this.accountBalance + amount ;

            System.out.println("You had just added "+ amount+" to your account");
            System.out.println("Your balance now = "+ this.accountBalance);

        } else {

            System.out.println("This is not your account! please write your account number correctly");
        }


    }

    public void withdraw (String accountNumber , long amount) {

        if (accountNumber == this.accountNumber ) {
            if (this.accountBalance >= amount) {

                this.accountBalance = this.accountBalance - amount ;
                System.out.println("You had just withdrew "+ amount+" from your account");
                System.out.println("Your balance now = "+ this.accountBalance);

            } else {
                System.out.println("You can't withdraw this amount of Money because you only have" + this.accountBalance );
            }



        }  else {

            System.out.println("This is not your account! please write your account number correctly");
        }


    }


}
