import java.util.Scanner;
  
class Main{
    static int add(int a, int b){
      return a+b;
    }
    static int sub(int a, int b){
      return a-b;
    }
static int mul(int a, int b){
      return a*b;
    }

static double div(int a, int b){
    if(b == 0){
        System.out.println("Cannot divide by zero.");
        return 0;
    }


    return (double)a / b;
}

    static int max(int a, int b){
      
      if(a>=b){
        return a;
      } else{
        return b;
      }
    }
    
    static int min(int a, int b){
      
      if(a<=b){
        return a;
      } else{
        return b;
      }

    }
    static double currency(double rs){
    return rs * 95.75;
}

static boolean isEven(int n){
    return n % 2 == 0;
}
    
      

    public static void main (String arg[]){
      Scanner sc=new Scanner(System.in);
    while(true){
      System.out.println("Welcome to Calculator");
   


System.out.println("1. Add");
  System.out.println("2. Sub");
System.out.println("3. Mul");
System.out.println("4. Div");
   System.out.println("5. max value");
   System.out.println("6. min value");
   System.out.println("7. currency convert"); 
   System.out.println("8. even odd find"); 
System.out.println("9. Exit");

System.out.println("ENTER YOUR CHOICE");
int choice=sc.nextInt();





switch(choice){

  case 1:
                    System.out.print("Enter First Number: ");
                    int a1 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    int b1 = sc.nextInt();

                    System.out.println("Answer = " + add(a1, b1));
                    break;

                case 2:
                    System.out.print("Enter First Number: ");
                    int a2 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    int b2 = sc.nextInt();

                    System.out.println("Answer = " + sub(a2, b2));
                    break;

                case 3:
                    System.out.print("Enter First Number: ");
                    int a3 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    int b3 = sc.nextInt();

                    System.out.println("Answer = " + mul(a3, b3));
                    break;

                case 4:
                    System.out.print("Enter First Number: ");
                    int a4 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    int b4 = sc.nextInt();

                    if (b4 == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Answer = " + div(a4, b4));
                    }
                    break;

                case 5:
                    System.out.print("Enter First Number: ");
                    int a5 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    int b5 = sc.nextInt();

                    System.out.println("Maximum = " + max(a5, b5));
                    break;

                case 6:
                    System.out.print("Enter First Number: ");
                    int a6 = sc.nextInt();
                    System.out.print("Enter Second Number: ");
                    int b6 = sc.nextInt();

                    System.out.println("Minimum = " + min(a6, b6));
                    break;

                case 7:
                System.out.print("Enter Rupees: ");
                    double rs = sc.nextDouble();

                    System.out.println("USD = " + currency(rs));
                    break;
         
                    

                case 8:
                    System.out.println("Enter no");
                     int eo=sc.nextInt();
                      if(eo % 2==0){
                         System.out.println("EVEN");
                          } else { System.out.println("ODD");
                           } 
                           break;

                case 9:
                    System.out.println("Thanks for Visiting.");
                    return;

                default:
                  System.out.println("Invalid Choice");
  
}

    }

    }
}


