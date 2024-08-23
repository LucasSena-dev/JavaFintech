public class Income {
    public float income;
    public int incomeType;
    public String incomeDate;


    public Income(float income, int incomeType, String incomeDate) {
        this.income = income;
        this.incomeType = incomeType;
        this.incomeDate = incomeDate;
    }


    public void getIncome(){
        System.out.println("Balance: " + income);
    }
}
