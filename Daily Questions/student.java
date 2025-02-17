public class student {
    private String Name;
    private int roll_number;
    private String phoneNumber;
//set data
    public void setName(String name){
        this.Name=name;
    }
    public void setRollNo(int roll_number){
        this.roll_number=roll_number;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
//get data:
    public String getName(){
        return Name;
    }
    public int getRollNo(){
        return roll_number;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

//display
  public void displayInfo() {
    System.out.println("Name: " + Name);
    System.out.println("Roll No: " + roll_number);
    System.out.println("Phone Number: " + phoneNumber);
}

public static void main(String[] args) {
    student student = new student();
    
    student.setName("Taranpreet");
    student.setRollNo(908);
    student.setPhoneNumber("88470****");
    student.getName();
    student.getRollNo();
    student.getPhoneNumber();
    student.displayInfo();
}
}
