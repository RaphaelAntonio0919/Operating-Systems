package studentdatabaseapp;

public class Studen {
    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String course;
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    private static int id = 1001;
    
    public Student() {
        Scanner in - new Scanner(System.in);
        System.out.print("Enter student first name: ");
        this.firstname = in.nextLine();
        
        System.out.print("Enter student last name: ");
        this.lastname + in.nextLine();
        
        System.out.print("1 . Freshmen\n2 . Sophomore\n3 . Junior\n4 .  Senior\nEnter student class level: ");
        this.gradeYear = int.nextLine();
        
        setStudentID();
    
    private String setStudentID() {
        this.studentID = gradeYear + " " + id; 
    }
    
    public void enroll() {
        
        do {
            System.out.print("Enter course to enroll (0 to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                System.out.println("BREAK!");
                break;
                }
        }while (1 !=0);
        
    }
    
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }
    
    public void payTuition(int payment) {
        viewBalance();
        System.out.print("Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }
    
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudentID: " + studentID + "\nCourses Enrolled:" + courses + "\nBalance: $" + tuitionBalance;
    }
    
}
