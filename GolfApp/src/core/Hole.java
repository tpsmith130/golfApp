package core;

public class Hole 
{
    private int score, putts, penaltyShots;
    private boolean fairway, greens;
    

    // Constructor
    public Hole(int score)
	 {
	     setScore(score);
	 }
    public Hole(int score, int putts, int penaltyShots, boolean fairway, 
            boolean greens)
    {
        setScore(score);
        setPutts(putts);
        setPenaltyShots(penaltyShots);
        setFairway(fairway);
        setGreens(greens);

        //printHole(this);
    }
    
    public void printHole(Hole tempHole)
        {
            System.out.printf("Score = %d Putts = %d PenaltyShots = %d\n",
                    this.getScore(), this.getPutts(), this.getPenaltyShots());
            System.out.println("Fairway: " + this.isFairway() + " Greens: " + 
                    this.isGreens());
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

    /**
     * @return the fairway
     */
    public boolean isFairway() {
        return fairway;
    }

    /**
     * @param fairway the fairway to set
     */
    public void setFairway(boolean fairway) {
        this.fairway = fairway;
    }

    /**
     * @return the greens
     */
    public boolean isGreens() {
        return greens;
    }

    /**
     * @param greens the greens to set
     */
    public void setGreens(boolean greens) {
        this.greens = greens;
    }

}
