package ex2;

public class Ex2 {
    public static void main(String[] args) {
        double[][] profits = {{2400,4500,100,4000,9000,8000,7000,6000,2000,12000,13000,14000},
                {1400,2500,1000,3400,6700,7800,3200,2200,6600,7000,8000,9000},
                {1400,4500,100,3000,9000,9000,7000,6000,2000,12000,13000,11000},
                {3300,4500,100,5000,4300,7000,6000,5000,2000,12000,12000,10000},
                {6600,4500,100,8000,8700,6000,5000,4000,2000,12000,11000,11000},
                {4400,4500,100,5000,2300,9900,7000,2200,4400,22000,10000,7000}};

        int row;
        int col;
        double totalP=0;
        // Total Profit
        for(row=0;row<profits.length;row++){
            for(col=0;col<profits[row].length;col++){
                totalP += profits[row][col];
            }
        }
        System.out.printf("Total Profits is €%,.2f%n",totalP);

        //Total profit for December
        totalP=0;
        for(row=0;row<profits.length;row++){
            for(col=11;col<profits[row].length;col++){
                totalP += profits[row][col];
            }
        }

        System.out.printf("Total Profits for December is €%,.2f%n",totalP);

        //Total Profit for Store 0
        totalP=0;
        for(row=0;row<profits.length-5;row++){
            for(col=0;col<profits[row].length;col++){
                totalP += profits[row][col];
            }
        }

        System.out.printf("Total Profits for Store 0 is €%,.2f%n",totalP);

        //A 1-D array to hold the total profits for each month of the year
        int store;
        int month;
        double profit=0;
        double[] monthlyProfit = new double[12];

        for(month =0;month<monthlyProfit.length;month++){
            monthlyProfit[month]=0;
            profit=0;
            for(store=0;store<profits.length;store++){
                profit+=profits[store][month];
            }
            monthlyProfit[month]=profit;
            System.out.printf("Monthly profit €%,.2f%n",monthlyProfit[month]);
        }

        //Store with the most profit for the year
        double maxProfit;
        int bestStore;
        double total = 0.0;

        for(month =0;month<profits[0].length;month++){
            total += profits[0][month];
        }
        bestStore=0;
        maxProfit=total;
        for(store=1;store<profits.length;store++){
            total = 0.0;
            for(month=0;month<profits[0].length;month++){
                total += profits[store][month];
            }
            if(total>maxProfit){
                maxProfit=total;
                bestStore=store;
            }
        }

        System.out.printf("Best profit of €%,.2f came from store %d",maxProfit,bestStore);
    }
}
