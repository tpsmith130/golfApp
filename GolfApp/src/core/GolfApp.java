// This is a product of Kyle Hendricks and Page Smith
// This is Kyle's edit
// Third edit
// 4th edit
package core;


public class GolfApp 
{

    public static void main(String[] args) 
    {
        Hole tempHolee;
        Hole holes[] = new Hole[Constants.NUM_OF_HOLES];
        // TODO code application logic here
        int j = 1;
        Round round = new Round();
        for(int i = 0; i < 18; i++)
        {
            tempHolee = new Hole(1 , 1 , 1, true, true);
            holes[i] = tempHolee;
        }
        round.setHoles(holes);
        round.calculate();
        /*
        Hole[] tempHole = round.getHoles();
        for(int i = 0; i < 18; i++)
        {
           System.out.printf("Score = %d Putts = %d PenaltyShots = %d\n",
                    tempHole[i].getScore(), tempHole[i].getPutts(), tempHole[i].getPenaltyShots());
            System.out.println("Fairway: " + tempHole[i].isFairway() + " Greens: " + 
                    tempHole[i].isGreens());
        }
        */
        System.out.println("Final Score = " + round.getScore() +
                ", Total Putts = " + round.getPutts() + 
                " Penalty Shots = " + round.getPenaltyShots() +
                " Fairway Average = " + round.getFairwayAverage() +
                " Green Average = " + round.getGreenAverage());
    }
    
}
