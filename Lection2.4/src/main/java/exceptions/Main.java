package exceptions;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by teacher-pc on 20.10.2018.
 */
public class Main {
    public static void main(String[] args) {
//        FileOutputStream fos;
//        try {
//            npe();
//            arrIndex();
//            divideByZero();
//        } catch (ArrayIndexOutOfBoundsException | StringIndexOutOfBoundsException e) {
//            System.err.println("Выход за границы массива/строки");
//        } catch (NullPointerException e) {
//            System.out.println("НПЕ");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            System.out.println("Данные сохранены в любом случае");
//        }
//        System.out.println("Прогрмма работает дальше");
        ATM atm = new ATM();
        atm.deposite(500);
        //вывод ошибки
        try {
            atm.withDraw(200);
            atm.withDraw(200);
            atm.withDraw(150);
        } catch (ATMException e) {
            e.printStackTrace();
        }
        System.out.println("рабоаем далее");
    }


    static void npe() throws NullPointerException {
        String stroke = null;
        stroke.trim();
    }

    static void arrIndex() throws ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException {
        int[] intArr = {1, 2, 3};
        intArr[5] = 10;
    }

    static void divideByZero() throws ArithmeticException {
        System.out.println(1 / 0);
    }
}
