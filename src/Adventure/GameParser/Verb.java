/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adventure.GameParser;

/**
 *
 * @author jeffj
 */
public class Verb extends Word {
    public Verb(String word) {
        super(word);
    }

    @Override
    public String toString() {
        return "VERB("+super.toString()+")";
    }
}
