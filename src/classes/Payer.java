package classes;

public class Payer {
    private String name;
    private String surname;
    private String adress;
    private String cardNumber;

    public Payer() {
        this.name = "Ivan";
        this.surname = "Ivanov";
        this.adress = "nowhere";
        this.cardNumber = "123456789";
    }
    public Payer(String name, String surname, String adress, String cardNumber) {
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.cardNumber = cardNumber;
    }

    public String toString(Payer payer) {
        StringBuilder result = new StringBuilder();
        result.append("Payer: ").append(payer.surname).append(" ").append(payer.name).append(" ")
              .append("address: ").append(payer.adress).append(" ").append("card: ").append(payer.cardNumber);
        return result.toString();
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }
}
