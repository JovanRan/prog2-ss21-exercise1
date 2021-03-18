import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ResultTest {

    @BeforeAll
    static void init() {
    }

    @BeforeEach
    void setUp() {
    }

    @Test
    @DisplayName("test 1")
    public void testGradingStudents_three_students_normal_points() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(3, 75, 49, 98));
        List<Integer> expected = Arrays.asList(3, 75, 50, 100);

        assertTrue(expected.size() == grades.size()
                && expected.containsAll(grades)
                && grades.containsAll(expected));
    }

    @Test
    @DisplayName("test 2")
    public void testGradingStudents_one_student_only() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(1, 69));
        List<Integer> expected = Arrays.asList(1, 70);

        assertTrue(expected.size() == grades.size()
                && expected.containsAll(grades)
                && grades.containsAll(expected));
    }

    @Test
    @DisplayName("test 3")
    public void testGradingStudents_one_student_more_than_100_points() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(1, 101));
        List<Integer> expected = Arrays.asList(1, 0);

        assertTrue(expected.size() == grades.size()
                && expected.containsAll(grades)
                && grades.containsAll(expected));
    }

    @Test
    @DisplayName("test 4")
    public void testGradingStudents_two_students_more_than_100_points() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(2, 101, 120));
        List<Integer> expected = Arrays.asList(2, 0, 0);

        assertTrue(expected.size() == grades.size()
                && expected.containsAll(grades)
                && grades.containsAll(expected));
    }

    @Test
    @DisplayName("test 5")
    public void testGradingStudents_more_than_60_students() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(61, 30, 30, 30, 40, 45, 45, 45, 20, 20, 10, 30, 30, 30, 40, 45, 45, 45, 20, 20, 10, 30, 30, 30, 40, 45, 45, 45, 20, 20, 10, 30, 30, 30, 40, 45, 45, 45, 20, 20, 10, 30, 30, 30, 40, 45, 45, 45, 20, 20, 10, 30, 30, 30, 40, 45, 45, 45, 20, 20, 10, 65));
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, grades);
    }

    @Test
    @DisplayName("test 6")
    public void testGradingStudents_two_students_with_negative_points() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(2, -1, -100));
        List<Integer> expected = Arrays.asList(2, 0, 0);

        assertTrue(expected.size() == grades.size()
                && expected.containsAll(grades)
                && grades.containsAll(expected));
    }

    @Test
    @DisplayName("test 7")
    public void testGradingStudents_less_than_0_students_and_negativ_points() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(-2, -1, -100));
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, grades);
    }

    @Test
    @DisplayName("test 8")
    public void testGradingStudents_EmptyList() {
        List<Integer> grades = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();

        assertEquals(expected, grades);
    }

    @Test
    @DisplayName("test 9")
    public void testGradingStudents_two_students_normal_points() {
        List<Integer> grades = Result.gradingStudents(Arrays.asList(2, 64, 72));
        List<Integer> expected = Arrays.asList(2, 65, 72);

        assertTrue(expected.size() == grades.size()
                && expected.containsAll(grades)
                && grades.containsAll(expected));
    }

}
