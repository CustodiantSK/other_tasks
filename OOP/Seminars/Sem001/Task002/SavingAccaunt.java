package Seminars.Sem001.Task002;

public class SavingAccaunt extends Account {
    private Double saivingProcent;

    public SavingAccaunt() {
    }

    public SavingAccaunt(Integer numAccount, String owner, Double balance, Double saivingProcent) {
        super(numAccount, owner, balance);
        this.saivingProcent = saivingProcent;
    }

    // public SavingAccaunt(Double saivingProcent) {
    // this.saivingProcent = saivingProcent;
    // }

    public Double getSaivingProcent() {
        return saivingProcent;
    }

    public void setSaivingProcent(Double saivingProcent) {
        this.saivingProcent = saivingProcent;
    }

    protected void addInterest() {
        Double result = getBalance() * saivingProcent / 100;
        deposit(result);
    }

}
