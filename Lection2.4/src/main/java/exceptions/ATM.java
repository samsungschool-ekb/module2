package exceptions;

/**
 * Created by teacher-pc on 20.10.2018.
 */
public class ATM {
    private int balance;

    public void deposite(int amount){
        balance += amount;
        System.out.println("Счет пополнен, текущий баланс: " + balance);
    }

    public void withDraw(int amount)throws ATMException{
        if(amount <= balance){
            balance -= amount;
            System.out.println("Средства обналичены, остаток: " + balance);
        }else{
            int needMoney= amount - balance;
            throw new ATMException(needMoney);
        }
    }
}
