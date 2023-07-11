package Seminars.Sem001.Task002;

public class CreditAccount extends Account {
    private Double procent;

    public CreditAccount(Integer numAccount, String owner, Double balance, Double procent) {
        super(numAccount, owner, balance);
        this.procent = procent;
    }

    public CreditAccount() {

    }

    public Double getProcent() {
        return procent;
    }

    public void setProcent(Double procent) {
        this.procent = procent;
    }

    protected void calculateInterest() {
        Double result = getBalance() * procent / 100;
        withdraw(result);
    }
}
