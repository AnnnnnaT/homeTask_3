public class BankAccount {

    double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void checkBalance(){
        System.out.println("Current balace: " + balance);
    }

    public void transaction(double sum, BankAccount acc) throws InvalidAmountException, InsufficientFundsException {

        this.balance = this.balance - sum;
        acc.balance = acc.balance + sum;
        
        if(sum <= 0){
            throw new InvalidAmountException ("Некорректная сумма перевода");
        }
        if(this.balance < sum){
            throw new InsufficientFundsException ("Недостаточно средств на счете");
        }
    }

}
