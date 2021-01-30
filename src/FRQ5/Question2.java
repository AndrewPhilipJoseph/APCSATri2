package FRQ5;

public class Question2 {
}


class Payroll {


    private int itemsSold[];
    private double[] wages;

    private int maxSales;
    private int minSales;

    public Payroll(int itemSold[]) {
        this.itemsSold = itemSold;
        findMaxAndMin(itemSold);
        computeBonusThreshold();
    }

    public int computeBonusThreshold() {
        int bonusThreshold = 0;
        for (int employee : itemsSold) {

            bonusThreshold += employee;
        }

        bonusThreshold -= minSales;
        bonusThreshold -= maxSales;

        System.out.println(bonusThreshold/(itemsSold.length-2));
        return bonusThreshold/(itemsSold.length-2);
    }


    public void findMaxAndMin(int itemSold[]) {
        minSales = itemSold[0];
        maxSales = itemSold[0];
        for (int employee : itemsSold) {
            if (minSales > employee) {
                minSales = employee;
            }
            if (maxSales < employee) {
                maxSales = employee;
            }

        }

    }

    public void computeWages(int payPerDay, int payPerItem) {

        int bonusT = computeBonusThreshold();

        for (int i = 0; i < itemsSold.length; i++) {
            wages[i] = (payPerDay + (itemsSold[i]*payPerItem));

            if (itemsSold[i] > bonusT) {
                wages[i] += (payPerDay*0.1);
            }

        }
    }


    public static void main(String[] args) {
        int input[] = {9, 5, 19};
        Payroll pay = new Payroll(input);
    }


}
