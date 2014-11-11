package chapter3testage;

public class BalanceQuarterly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int expensesJanuary = 15000;
		int expensesFebruary = 23000;
		int expensesMarch = 17000;
		
		int expensesQuarterly = expensesJanuary + expensesFebruary + expensesMarch;
		System.out.println(expensesQuarterly);
		
		int mediumMonthly = expensesQuarterly/3;
		System.out.println("Valor da média mensal = " + mediumMonthly);
	}
}