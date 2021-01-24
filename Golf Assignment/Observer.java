/**
 * Implements an update method that passes strokes and pars.
 * @author Kyrtis Scott
 *
 */

public interface Observer {

	/**
	 * implements an update method that passes through the strokes and par.
	 * @param strokes passes through stroke score.
	 * @param par passes through par score.
	 */
	public void update(int strokes, int par);   
}