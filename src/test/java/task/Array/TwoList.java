package task.Array;

        import javax.persistence.criteria.CriteriaBuilder;
        import java.util.*;

public class TwoList {
    public static List<String> generalTwoList(final List<String> listOne, final List<String> listTwo) {
        Map<String,String> map = new TreeMap();
        map.put("sfd", "sdf");

        List<String> listRes = new ArrayList();
        Set<String> set = new HashSet<>(); // если хотим уникальные значения были в результате
        for (String x : listTwo) {
            if (listOne.contains(x))
                listRes.add(x);
        }

        return listRes;
    }
}
