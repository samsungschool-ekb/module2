package collections;

import java.math.BigDecimal;

/**
 * Created by teacher-pc on 17.10.2018.
 */
public class Customer {
    private String id, name, surname;
    private BigDecimal middlePrice;

    public Customer() {
    }

    public Customer(String id, String name, String surname, BigDecimal middlePrice) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.middlePrice = middlePrice;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public BigDecimal getMiddlePrice() {
        return middlePrice;
    }

    public void setMiddlePrice(BigDecimal middlePrice) {
        this.middlePrice = middlePrice;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", middlePrice=" + middlePrice +
                '}';
    }
}
