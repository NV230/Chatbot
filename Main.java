import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {

    boolean online = true;

    System.out.println("\f");
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Hello my name is Jerry Jones! I am a basketball-oriented chatbot!");
    System.out.println("What's your name?");
    String name = sc.nextLine();
    
    // Our greeting method which greets the user
    greeting(name);
    indicator();
    
    // Asks if the user is ready to begin the program.
    beginning();
    indicator();
    
    //
    // Asks user basketball-related questons //
    favoriteTeam();
    favoritePlayer();

   

  }



  public static boolean beginning(){

    System.out.println("Are you ready to begin?");
    Scanner sc = new Scanner(System.in);
    String response1 = sc.nextLine();
    boolean init = true;  
    if (response1.equals("yes")){
      init = true;
    }

    else if (response1.equals("no")){
      init = false;
    }

    else{
      init = true;
    }

    return init;

  }

  public static void indicator(){
      System.out.println(">>>");
  }

  public static void greeting(String name) {
      System.out.println("Hello "+ name + "," + " I hope you are having a nice day!");
  }
  public static void favoriteTeam(){
    System.out.println("What is your favorite basketball team?");
    Scanner sc = new Scanner(System.in);
    String favoriteTeam = sc.nextLine();
    indicator();
    System.out.println("That is my favorite team as well");
  }
  public static void favoritePlayer(){
    System.out.println("Who is your favorite player?");
    Scanner sc = new Scanner(System.in);
    String favoritePlayer = sc.nextLine();
    indicator();
    
    if (favoritePlayer.equals("Stephen Curry")) {
      System.out.println("Oh really? My favorite player is Stephen Curry as well!");
  }
    else{
      System.out.println("Oh, I am not familiar with who this player is but I look forward to reading more about them!");
    }

  }

}