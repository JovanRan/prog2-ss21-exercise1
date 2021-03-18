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
        List<Integer> points = new ArrayList<>(grades);

        if (grades.get(Min_Amount_Students) < 1 || grades.get(List_Position_Zero) > Max_Amount_Students) {
            return new ArrayList<>();
        }

        for (int i = 1; i <= grades.get(List_Position_Zero ); i++) {
            if (points.get(i) < Min_Amount_Points || points.get(i) > Max_Amount_Points) {
                points.set(i, 0);
            }
            if (points.get(i) >= Min_Points_not_to_fail && points.get(i) <= Max_Points_not_to_fail) {
                points.set(i, roundGrade(points.get(i)));
            }
        }
        return points;
    }

    public static int roundGrade(int points) {
        int finalGrade = points;
        int firstPosition = points % 10;
        int firstPosition_2 = points % 10;

        if (firstPosition  >= 5) {
            firstPosition = 10;
        } else {
            firstPosition  = 5;
        }

        finalGrade = (finalGrade - firstPosition_2) + firstPosition ;

        if (finalGrade - points < 3) {
            finalGrade = (points - firstPosition_2) + firstPosition ;
        } else {
            finalGrade = points;
        }
        return finalGrade;
    }
}