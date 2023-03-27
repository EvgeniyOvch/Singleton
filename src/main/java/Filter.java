import java.util.ArrayList;
import java.util.List;

public class Filter {

    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        for (int res : source) {
            String resFilter = ((res >= treshold) ? "Элемент " + res + " не проходит " : "Элемент " + res + " проходит");
            logger.log(resFilter);
            if (res < treshold) {
                result.add(res);
            }
        }
        return result;
    }
}

