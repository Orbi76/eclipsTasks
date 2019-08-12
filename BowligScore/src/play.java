

import java.util.Random;

public class play {


    public static void main(String[] args) {
        Game g = new Game();
        int i;
        int PinsDown1;
        int PinsDown2; 
    

        for (i=1; i<11; i++)
        {
            PinsDown1 = ThrowBall(0); //1st try
            System.out.println("Frame " + i + " Throw 1" + " knocked down is " + PinsDown1);
            if(PinsDown1 == 10)
            {
                g.roll(10);
                System.out.println("Congratulations, you bowled a strike!");
                System.out.println();
            }
            else
            {
                PinsDown2 = ThrowBall(PinsDown1); //2nd try
                System.out.println("Frame " + i + " Throw 2" + " knocked down is " + PinsDown2);
                g.roll(PinsDown1);
                g.roll(PinsDown2);
                if (PinsDown1+PinsDown2 == 10)
                    System.out.println("Congratulations, you bowled a spare!");
                    System.out.println();
            }
        }

        System.out.println("Final score is " + g.score() );

    }  //*** end main ***

    public static int ThrowBall(int PinsDown)
    {
        int standing = 10-PinsDown;
        Random rand = new Random();
        int  down = rand.nextInt(standing+1); 
        return down;
    }

}  //*** End class ***





