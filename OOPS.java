
public class OOPS{

    public static void main(String args[]){
        Pen p1 =new Pen(); //created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        p1.setColor("yellow");
        System.out.println(p1.getColor());

        // BankAccount myAcc = new BankAccount();
        // myAcc.username ="shradhaKhapra";
        // myAcc.setPassword("abcdefghi");


    }
}
// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password = pwd;

//     }
// }

class Pen{
    String color;
    int tip;

    String getColor(){
        return this.color;

    }

    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
       this.color = newColor;

    }

    void setTip(int newTip){
        this.tip = tip;

    }
}

class Student{
    String name;
    int age;
    float percentages; //cgpa 

    void calcPercentage (int phy,int chem,int math){
        percentages = (phy + chem + math)/3;
    }
}