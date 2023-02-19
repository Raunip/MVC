public class MVCPatternDemo {
    public static void main(String[] args) {
        StudentModel model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("Raunip");
        controller.updateView();
        controller.setStudentRollNo(String.valueOf(29));
        controller.updateView();

    }

    private static StudentModel retriveStudentFromDatabase() {
        StudentModel student = new StudentModel();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
