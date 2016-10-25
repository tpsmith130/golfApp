package core;


public class Round 
{
    private Hole[] holes;
    private int score = -1;
    private double fairwayAverage = -1;
    private double greenAverage = -1;
    private int putts = -1;
    private int penaltyShots = -1;

    public Round()
    {
        
    }
    public Round(Hole[] holes)
    {
       this.setHoles(holes);
       
    }
    
    public void printRound()
    {
        calculate();
    }
    public void calculate()
    {
        int tempScore = 0;
        double tempFairwaysHit = 0;
        double tempGreensHit = 0;
        int tempPutts = 0;
        int tempPenaltyShots = 0;
        
        for(int i = 0; i < Constants.NUM_OF_HOLES; i++)
        {
            tempScore += holes[i].getScore();
            tempPutts += holes[i].getPutts();
            tempPenaltyShots += holes[i].getPenaltyShots();
            
            // This assumes there is 18 fairways in a round. It does not
            // take par threes into account
            if(holes[i].isFairway()) tempFairwaysHit++;
            if(holes[i].isGreens()) tempGreensHit++;
          
            
        }
        
        setScore(tempScore);
        setPutts(tempPutts);
        setPenaltyShots(tempPenaltyShots);
        // SEE COMMENT ABOVE ABOUT PAR THREES
        setFairwayAverage(tempFairwaysHit / Constants.NUM_OF_HOLES);
        setGreenAverage(tempGreensHit / Constants.NUM_OF_HOLES);
    }
   
    /**
     * @return the holes
     */
    public Hole[] getHoles() {
        return holes;
    }

    /**
     * @param holes the holes to set
     */
    public void setHoles(Hole[] holes) {
        this.holes = holes;
    }

    /**
     * @return the score
     */
    public int getScore() {
        return score;
    }

    /**
     * @param score the score to set
     */
    public void setScore(int score) {
        this.score = score;
    }

    /**
     * @return the fairwayAverage
     */
    public double getFairwayAverage() {
        return fairwayAverage;
    }

    /**
     * @param fairwayAverage the fairwayAverage to set
     */
    public void setFairwayAverage(double fairwayAverage) {
        this.fairwayAverage = fairwayAverage;
    }

    /**
     * @return the greenAverage
     */
    public double getGreenAverage() {
        return greenAverage;
    }

    /**
     * @param greenAverage the greenAverage to set
     */
    public void setGreenAverage(double greenAverage) {
        this.greenAverage = greenAverage;
    }

    /**
     * @return the putts
     */
    public int getPutts() {
        return putts;
    }

    /**
     * @param putts the putts to set
     */
    public void setPutts(int putts) {
        this.putts = putts;
    }

    /**
     * @return the penaltyShots
     */
    public int getPenaltyShots() {
        return penaltyShots;
    }

    /**
     * @param penaltyShots the penaltyShots to set
     */
    public void setPenaltyShots(int penaltyShots) {
        this.penaltyShots = penaltyShots;
    }
     
}
