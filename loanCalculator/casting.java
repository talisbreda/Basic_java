import java.util.Scanner;

public class casting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type the value of the loan");
        double loanValue = scan.nextDouble();

        System.out.println("Type the amount of quotas");
        int loanQuotas = scan.nextInt();

        calculateLoanTotalPay(loanValue, loanQuotas);
    }

    public static void calculateLoanTotalPay(double loanValue, int loanQuotas) {
        double valueInterest;
        if (loanValue <= 5000) {
            valueInterest = 1.1;
        } else if (loanValue <=20000) {
            valueInterest = 1.15;
        } else {
            valueInterest = 1.2;
        }

        double quotaInterest;
        if (loanQuotas <= 3) {
            quotaInterest = 1.05;
        } else if (loanQuotas <=6) {
            quotaInterest = 1.07;
        } else if (loanQuotas <=9) {
            quotaInterest = 1.1;
        } else  {
            quotaInterest = 1.15;
        }

        double totalValue = loanValue * (valueInterest * quotaInterest);
        System.out.println("Total pay value: " + totalValue);
    }
}
