package Task_1;

public class Main {
    static void main(String[] args) {
        StudentService studentService = new StudentService();
        BookService bookService = new BookService();

        Student student1 = new Student(1,"Receb",18);
        Student student2 = new Student(2,"Rashul",18);
        Student student3 = new Student(3,"Murad",18);

        studentService.addStudent(student1);
        studentService.addStudent(student2);
        studentService.addStudent(student3);

        for (Student student : studentService.getStudents()) {
            System.out.println(student);
        }

        Student foundStudent = studentService.findStudentById(2);

        if (foundStudent != null) {
            System.out.println(foundStudent);
        }

        for (Student student : studentService.getStudents()) {
            System.out.println(student);
        }

        Book book1 = new Book(1,"123","456");
        Book book2 = new Book(2,"234","456");
        Book book3 = new Book(3,"234","456");

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        for (Book book : bookService.getBooks()) {
            System.out.println(book);
        }

        Book foundBook = bookService.findBookById(103);
        if (foundBook != null) {
            System.out.println(foundBook);
        }

        bookService.removeBookById(102);

        for (Book book : bookService.getBooks()) {
            System.out.println(book);
        }
    }
}
