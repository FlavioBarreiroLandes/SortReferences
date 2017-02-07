package util;

import java.util.Comparator;

/**
 *
 * @author Flávio Barreiro Landes
 * E-mail: landesflavio@gmail.com
 */
public class SortReferences implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }    
}
