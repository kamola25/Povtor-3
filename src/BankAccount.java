public class BankAccount {
    public double amount;


    public double getAmount() {
        return (int) amount;

    } public boolean deposit(double sum){
        if (amount == 0){
          amount = amount +sum;
            System.out.println("Вы пополнили свой баланс."+ "\nVash balance: "+getAmount());
        }else{
            System.out.println("Вы пополнили свой баланс."+ "\nVash balance: "+amount+sum);
        }return true;

    }

    public void withDraw(int sum)throws LimitException {
        if (sum>amount){
            throw new LimitException("На вашем балансе недостаточно средств. Ваш текущий баланс", getAmount());
        }
        System.out.println(amount=amount-sum);
    }

    /*public boolean infoYourBalance(){
        System.out.println("Вы пополнили свой баланс."+ "\nVash balance: "+getAmount());
        return true;

    }
   */
}
