
import java.util.*;

public class BankSystem {
    
    public static void main (String args[]) throws InsufficientFundsException, InvalidAmountException{

    BankAccount acc1 = new BankAccount(2000);
        BankAccount acc2 = new BankAccount(5000); 
        try{
            Transaction(acc1, acc2);
        }catch(InvalidAmountException ex){
            System.out.println(ex.getMessage());
        }catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
            
    }

    public static void Transaction(BankAccount acc1, BankAccount acc2) throws InvalidAmountException, InsufficientFundsException  {
        Scanner iscan = new Scanner(System.in);
        System.out.println("Баланс acc1: " + acc1.balance);
        System.out.println("Баланс acc2: " + acc2.balance);
        System.out.println("Введите сумму перевода: ");
        Double sum = iscan.nextDouble();
        try{
            acc1.transaction(sum, acc2);  
            System.out.println("Успешно!");  
            System.out.println("Баланс acc1: " + acc1.balance);
            System.out.println("Баланс acc2: " + acc2.balance);    
        }finally{
            iscan.close();
        }
    }    
    }
