/**
 * Sets up the golfer and lets the observers view the stats of the golfer.
 * @author Kyrtis Scott
 * 
 */

import java.util.ArrayList;

public class Golfer implements Subject {

        private ArrayList<Observer> observers;
        private String name;

        public Golfer(String name) {
                super();
                this.name = name;
                observers = new ArrayList<Observer>();
        }

        /**
         * notifies the observers of the score.
         * @param strokes notifies the observer of strokes.
         * @param par notifies the observer of par.
         */
        public void enterScore(int strokes, int par) {
        notifyObservers(strokes, par);
        }
        
        /**
         * gets the name of the golfer.
         * @return returns the name of the golfer.
         */
        public String getName() {
                return name;
        }

        /**
         * adds the observer to the array list.
         */
        @Override
        public void registerObserver(Observer observer) {
                observers.add(observer);
                
        }
        
        /**
         * removes the observer from the array list.
         */
        @Override
        public void removeObserver(Observer observer) {
                observers.remove(observer);
        }
        
        /**
         * Loops through the array list of observers and updates them of the score.
         * @param passes through strokes and par to the observer.
         */
        @Override
        public void notifyObservers(int strokes, int par) {
                for (Observer observer : observers) {
                        observer.update(strokes, par);
                }
        }
        
}