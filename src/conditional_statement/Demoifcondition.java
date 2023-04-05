package conditional_statement;

public class Demoifcondition {
    public static void main(String[]args){

        int age;
        age=70;
        if(age>=70){
            System.out.println("person is eligible for voting " +age);
       age=18;
       if (age>=18){
          System.out.println("is eligible for voting " +age);

          age=17;
          if(age<=18){
              System.out.println(" is not eligible for voting " +age);

              age=7;
              if(age>=6){
                  System.out.println("is not get addmission");

                  String city="Agra";
                  if(city =="Agra"){
                      System.out.println("person belongs to agra");

                      city="Delhi";
                      if(city == "Delhi"){
                          System.out.println("person belongs to Delhi");

                          city="Puneb";
                          if(city!="Tundla"){
                              System.out.println("person does not belongs to Tundla");
                          }
                      }
                  }


              }

          }

       }
        }



    }




}
