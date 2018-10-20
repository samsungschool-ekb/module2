package exceptions;

/**
 * Created by teacher-pc on 20.10.2018.
 */
public class ATMException extends Exception {
    private int amount;

    ATMException(int amount) {
        this.amount = amount;
    }

    @Override
    public void printStackTrace() {
        System.err.println("Недостаточно средств, необходимо еще " + amount + " рублей");
    }
}
