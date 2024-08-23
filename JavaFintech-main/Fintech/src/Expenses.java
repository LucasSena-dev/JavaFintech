public class Expenses {
    public float expense;
    public int expenseType;
    public String expenseDate;


    public void Expense(float expense, int expenseType, String expenseDate) {
        this.expense = expense;
        this.expenseType = expenseType;
        this.expenseDate = expenseDate;
    }


    public void getExpense(){
        System.out.println("Expense: " + expense);
    }
}

