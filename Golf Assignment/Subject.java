/**
 * Must implement these to be an observer.
 * @author Kyrtis Scott
 *
 */

public interface Subject {

	/**
	 * This must be implemented to be an observer.
	 * @param observer is the new observer that receives updates.
	 */
        public void registerObserver(Observer observer);
        public void removeObserver(Observer observer);
        public void notifyObservers(int strokes, int par);
        
        
}