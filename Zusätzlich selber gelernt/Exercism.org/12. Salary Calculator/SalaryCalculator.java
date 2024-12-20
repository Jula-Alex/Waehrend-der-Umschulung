public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
          return daysSkipped < 5 ? 1 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < 20 && productsSold > 0 ? 10 : productsSold == 0 ? 0 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = 1000 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);
        return salary > 2000 ? 2000 : salary;
    } 
}
