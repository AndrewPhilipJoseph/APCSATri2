package FRQ7;

public class Unit8
{

}

class Plot
{
    private String cropType;
    private int cropYield;

    public Plot(String crop, int yield)
    {
        /*implementation not shown*/
    }

    public String getCropType()
    {
        return cropType;
    }

    public int getCropYield()
    {
        return cropYield;
    }
}

class ExperimentalFarm
{
    private Plot[][] farmPlots;

    public ExperimentalFarm(Plot[][] p)
    {
        farmPlots = p;
    }

    /**Returns the plot with the highest yield for a given crop type, as described in part (a).*/
    public Plot getHighestYield(String c)
    {

        int highest = 0;
        int highestIndex = -1;
        int collumn = -1;
        for (Plot[] plot : farmPlots) {
            collumn++;
            for (int i = 0; i < plot.length; i++) {
                if (plot[i].getCropType().equals(c)) {
                    if (plot[i].getCropYield()>highest) {
                        highest = plot[i].getCropYield();
                        highestIndex = i;
                    }
                }
            }

        }

        if (highestIndex == -1) {
            return null;
        }
return farmPlots[collumn][highestIndex];
    }

    /**Returns true if all plots in a given column in the two-dimensional array farmPlots
     * contain the same type of crop, or false otherwise, as described in part (b).
     */
    public boolean sameCrop(int col)
    {
        for (int i = 0; i < farmPlots.length; i++) {
            if (farmPlots[i][col].getCropType().equals(farmPlots[0][col].getCropType())) {

            }
            else {return false;}
        }
        return true;
    }
}
