
package reader.criteria;

/**
 *
 * @author 358721
 */
public class EndsWithQuestionOrExclamationMark implements Criterion{

    @Override
    public boolean complies(String line){
        if (line.isEmpty()){
            return false;
        } 
        char lastCharacter = line.charAt(line.length() - 1);
        return lastCharacter == '?' || lastCharacter == '!';
    }
}