import java.util.ArrayList;
import java.util.List;

public class Result {

    public static final int Max_Amount_Students = 60;
    public static final int Min_Amount_Students = 0;
    public static final int Max_Amount_Points = 100;
    public static final int Min_Amount_Points = 0;
    public static final int Max_Points_not_to_fail = 100;
    public static final int Min_Points_not_to_fail = 38;
    public static final int List_Position_Zero = 0;

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> n = new ArrayList<>(grades);

        if (grades.get(Min_Amount_Students) < 1 || grades.get(List_Position_Zero) > Max_Amount_Students) {
            return new ArrayList<>();
        }

        for (int i = 1; i <= grades.get(List_Position_Zero ); i++) {
            if (n.get(i) < Min_Amount_Points || n.get(i) > Max_Amount_Points) {
                n.set(i, 0);
            }
            if (n.get(i) >= Min_Points_not_to_fail && n.get(i) <= Max_Points_not_to_fail) {
                n.set(i, RoundGrade(n.get(i)));
            }
        }
        return n;
    }

    public static int RoundGrade(int points) {
        int finalGrade = points;
        int x1 = points % 10;
        int x2 = points % 10;

        if (x1 >= 5) {
            x1 = 10;
        } else {
            x1 = 5;
        }

        finalGrade = (finalGrade - x2) + x1;

        if (finalGrade - points < 3) {
            finalGrade = (points - x2) + x1;
        } else {
            finalGrade = points;
        }
        return finalGrade;
    }
}
