public class BudgetCalculator
{
    private static final double SALARY = 3000.0;
    private static final double SAVINGS_PERCENT = 0.20;
    private static final double RENT_PERCENT = 0.30;
    private static final double GROCERIS_PERCENT = 0.15;
    private static final double ENTERTAINMENT_PERCENT = 0.10;

    public static void main (String[] args)
    {
        double monthlySalary = SALARY;
        double savedAmount;
        double rentAmount;
        double groceriesAmount;
        double entertainmentAmount;
        double totalExpenses;
        double reaminingBalance;

        savedAmount = monthlySalary * SAVINGS_PERCENT;
        rentAmount = monthlySalary * RENT_PERCENT;
        groceriesAmount = monthlySalary * GROCERIS_PERCENT;
        entertainmentAmount = monthlySalary * ENTERTAINMENT_PERCENT;
        totalExpenses = rentAmount + groceriesAmount + entertainmentAmount;
        reaminingBalance = monthlySalary - totalExpenses;

        System.out.println("The monthly salary is = $" + monthlySalary);
        System.out.println("The amount saved is = $" + savedAmount);
        System.out.println("The amount spent on rent is = $" + rentAmount);
        System.out.println("The amount spent on groceries is = $" + groceriesAmount);
        System.out.println("The amount spent on entertainemnt is = $" + entertainmentAmount);
        System.out.println("The total expenses are = $" + totalExpenses);
        System.out.println("The total remaining balance is = $" + reaminingBalance);

    }
}