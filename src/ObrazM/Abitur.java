package ObrazM;

public class Abitur {
    int number;
    String lastName;
    String name;
    String fatherName;
    int yearOfBirth;
    int mark1;
    int mark2;
    int mark3;
    double averCertificate;

    public Abitur(int number,String lastName,String name,String fatherName,int yearOfBirth,int mark1,int mark2,int mark3, double averCertificate)
    {
        this.number = number;
        this.lastName = lastName;
        this.name = name;
        this.fatherName = fatherName;
        this.yearOfBirth = yearOfBirth;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.averCertificate = averCertificate;
    }
    public String toString() {
        return "\n" + "Student: " +
                "Number: " + number + "\n"+ "FIO: " + lastName + " " + name +" "+ fatherName +"\n"+"Year of Birth: " + yearOfBirth + "\n"+"Marks for the exam: "
                + mark1 + "; " + mark2 + "; " + mark3 + "\n" + "Average mark of sertificate: " + averCertificate;
    }

    public double getAverMark(){
        return ((mark1+mark2+mark3)/3)*0.88 + averCertificate;
    }
    public String getData() {
        return "\n" + "Student: " +
                "Number: " + number + "\n"+ "FIO: " + lastName + " " + name +" "+ fatherName +"\n"+"Year of Birth: " + yearOfBirth + "\n"+"Mark: "
                + getAverMark();
    }
}
