public class SalesManager extends Employee {

    private double sales;
    private double commissionRate;

    public SalesManager(String name, double baseSalary,
                        double sales, double commissionRate) {

        super(name, baseSalary);
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (sales * commissionRate);
    }
}