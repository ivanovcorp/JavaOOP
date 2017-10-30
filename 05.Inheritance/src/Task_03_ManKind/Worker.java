package Task_03_ManKind;

/**
 * Created by ivano on 2/13/2017.
 */
public class Worker extends Human {

    private Double weekSalary;
    private Double hoursPerDay;
    private Double slaryPerHour;

    public Worker(String firstName, String lastName, Double weekSalary, Double hoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setHoursPerDay(hoursPerDay);
    }

    protected void setWeekSalary(Double weekSalary) {
        if (weekSalary < 10) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: weekSalary");
        }
        this.weekSalary = weekSalary;
    }

    protected void setHoursPerDay(Double hoursPerDay) {
        if (hoursPerDay < 1 || hoursPerDay > 12) {
            throw new IllegalArgumentException("Expected value mismatch!Argument: workHoursPerDay");
        }
        this.hoursPerDay = hoursPerDay;
    }

    protected Double getWeekSalary(){
        return this.weekSalary;
    }

    protected Double getHoursPerDay() {
        return this.hoursPerDay;
    }

    public Double calculateSalaryPerHour() {
        double salaryPerHour = (weekSalary / 7) / hoursPerDay;
        return salaryPerHour;
    }

    @Override
    public String toString() {
        final StringBuilder stringBuilder = new StringBuilder(super.toString());
        stringBuilder.append(String.format("Week Salary: %.2f%nHours per day: %.2f%nSalary per hour: %.2f%n",
                this.getWeekSalary(),
                this.getHoursPerDay(),
                this.calculateSalaryPerHour()));
        return stringBuilder.toString();
    }
}
