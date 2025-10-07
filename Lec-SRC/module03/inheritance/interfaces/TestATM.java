package module03.inheritance.interfaces;

class ATM {
    // Nested interface for ATM Card
    public interface Card {
        boolean validatePIN(String pin);
        double getBalance();
    }

    // ATM can work only with objects implementing Card
    public void insertCard(Card card) {
        if (card.validatePIN("1234")) {
            System.out.println("PIN accepted. Balance: " + card.getBalance());
        } else {
            System.out.println("Invalid PIN.");
        }
    }
}

class DebitCard implements ATM.Card {
    private double balance = 5000;

    public boolean validatePIN(String pin) {
        return "1234".equals(pin);
    }

    public double getBalance() {
        return balance;
    }
}

public class TestATM {
    public static void main(String[] args) {
        ATM atm = new ATM();
        ATM.Card myCard = new DebitCard();
        atm.insertCard(myCard);
    }
}

