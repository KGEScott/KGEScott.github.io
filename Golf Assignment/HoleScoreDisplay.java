/**
 * Registers observer, updates the information and displays the current score.
 * @author Kyrtis Scott
 *
 */

public class HoleScoreDisplay implements Observer {

        private Subject golfer;
        private int strokes;
        private int par;

        /**
         * Registers itself as an observer of the golfer
         * @param golfer passes in the golfers information.
         */
        public HoleScoreDisplay(Subject golfer) {
                this.golfer = golfer;
                golfer.registerObserver(this);
        }

        /**
         * passes in the strokes and par to update the information about strokes and par
         */
        @Override
        public void update(int strokes, int par) {
        this.strokes = strokes;
        this.par = par;
        displayCurrentScore();
    }
        
        /**
         * Shows the round score and calculates if par, under par, or over par.
         */
        private void displayCurrentScore() {
                System.out.println("Current Round Stats:");
                System.out.println("Par: "+par);
                System.out.println("Strokes: "+strokes);
                if (strokes == par)
                	System.out.println("Made Par \n");
                else if (strokes > par)
                	System.out.println((strokes - par) + " over Par \n");
                else 
                System.out.println((par - strokes) + " under Par \n");
        }
}