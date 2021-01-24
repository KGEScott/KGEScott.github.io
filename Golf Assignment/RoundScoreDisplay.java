/**
 * Registers observer, updates the information and displays the round total.
 * @author Kyrtis Scott
 *
 */

public class RoundScoreDisplay implements Observer {

        private Subject golfer;
        private int strokesTotal;
        private int parTotal;
        
        /**
         * registers itself with the golfer.
         * @param golfer passes in the golfers information.
         */
        public RoundScoreDisplay(Subject golfer) {
                this.golfer = golfer;
                golfer.registerObserver(this);
        }

        /**
         * passes in the strokes and par to update the information about strokes and par
         */
        @Override
        public void update(int strokes, int par) {
                strokesTotal = strokesTotal + strokes;
                parTotal  = parTotal + par;
                displayRoundScore();
        }

        /**
         * Shows the round total and calculates if par, under par, or over par.
         */
        private void displayRoundScore() {
                System.out.println("Round Stats:");
                System.out.println("Par: "+parTotal);
                System.out.println("Strokes: "+strokesTotal);
                if (strokesTotal == parTotal)
                	System.out.println("Making Par \n");
                else if (strokesTotal > parTotal)
                	System.out.println((strokesTotal - parTotal) + " over Par \n");
                else
                System.out.println((parTotal - strokesTotal) + " under Par \n");
        
        }
}