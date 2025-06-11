import controller.StudentController;
import model.Student;
import model.StudentModel;
import view.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentModel model = new StudentModel();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.addStudent(new Student("Usman", 3.7));
        controller.addStudent(new Student("Abdullah", 4.1));
        controller.addStudent(new Student("Kazim", 3.2));
        controller.addStudent(new Student("Dani", 2.5));
        controller.addStudent(new Student("Aizaz", 2.9));
        controller.addStudent(new Student("Mustafa", 3.9));
        controller.updateView();
    }
}
