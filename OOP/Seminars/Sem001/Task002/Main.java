package Seminars.Sem001.Task002;

public class Main {
    public static void main(String[] args) {
        CreditAccount creditAccount = new CreditAccount(12,
                "Ivan", 2000.0, 20.5);

        SavingAccaunt savingAccaunt = new SavingAccaunt(18,
                "Oleg", 1000.0, 10.0);
        System.out.println("creditAccount.getBalance()" + creditAccount.getBalance());
        creditAccount.calculateInterest();
        System.out.println("creditAccount.getBalance()" + creditAccount.getBalance());

        System.out.println("savingAccaunt.getBalance()" + savingAccaunt.getBalance());
        savingAccaunt.addInterest();
        System.out.println("savingAccaunt.getBalance()" + savingAccaunt.getBalance());

    }
}
