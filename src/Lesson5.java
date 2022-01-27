
/*Java 1 Homework 5
 *@author Ksenia
 * @version date 26/01/22
 *
 */

class Lesson5 {
    public static void main(String[] args){
        Person[] persArr=new Person[5];
        persArr[0]=new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArr[1]=new Person("Petrov Petr", "Director", "ppetrov@mailbox.com", "892333221", 42000, 41);
        persArr[2]=new Person("Sidorov Ivan", "Designer", "isidorov@mailbox.com", "892322311", 40000, 39);
        persArr[3]=new Person("Holodov Semen", "Driver", "sholodov@mailbox.com", "892311223", 33000, 45);
        persArr[4]=new Person("Morozov David", "Engineer", "dmorozov@mailbox.com", "892312345", 40000, 50);
        for (int i=0; i<5;i++){
            if (persArr[i].getAge()>40){
                System.out.println(persArr[i]+" is older than 40y.o.");
            } 
            
        }
       
        
        
    }
}

class Person {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    

    Person(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName=fullName;
        this.position=position;
        this.email=email;
        this.phone=phone;
        this.salary=salary;
        this.age=age;
       
    } 
    
    public int getAge(){
        return age;
    }
    
    
    @Override
    public String toString(){
        return "Person: "+fullName+", work as a(an) "+position+", email: "+email+", phone "+phone+", salary: "+salary+", age:"+age;
    }
        
}
    
      
