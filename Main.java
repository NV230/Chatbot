import java.util.Scanner;
import java.util.Random;

class Main {
  
  public static void main(String[] args) {

    boolean online = true;
    boolean statement1 = true;
    boolean statement2 = true;
    boolean statement3 = true;
    String userInput;
    String userInput1;
    String userInput2;
    String userInput3;


    System.out.println("\f");
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Hello my name is H.O.O.P.S! I am a basketball-oriented chatbot!");
    System.out.println("What's your name?");
    String name = sc.nextLine();
    
    // Our greeting method which greets the user
    greeting(name);
    
    // Asks if the user is ready to begin the program.
    beginning();
    
    // Asks user basketball-related questons //
    favoriteTeam();
    favoritePlayer();

    String [] array = {"Alrighty then.", "Glad to hear your opinion.", "Oh that's neat.", "Awesome!"};
    Random random = new Random();

    // randomly selects an index from the array
    int select = random.nextInt(array.length); 

    while (online == true)
    
    {
      System.out.println("Do you like watching basketball?");
      userInput = sc.nextLine();
      indicator();

      if(userInput.equals("yes"))
      {
        System.out.println("Same, that's why I was created; to engage in hoops talk.");
        online = false;
      }

      else if(userInput.equals("no"))
      {
        System.out.println("Oh, you should really watch it, the game can be really enjoyable.");
        online = false;
      }

      else{
        System.out.println(array[select]);
        online = false; 
      }

    }
    
    while (online == false)
    {
      System.out.println("Who do you consider to be the greatest basketball player of all time?");
      userInput1 = sc.nextLine();
      indicator();

      if(userInput1.equals("LeBron James"))
      {
        System.out.println("Yup, you are absoutely correct.");
        statement1 = false;
        break;
      }

      else if(userInput1.equals("Michael Jordan"))
      {
        System.out.println("Nope, you are incorrect.  It's LeBron.");
        statement1 = false;
        break;
      }

      else{
        System.out.println(array[select]);
        statement1 = false;
        break; 
      }
    }

    while (statement1 == false)
    {
      System.out.println("Who will win MVP in the NBA this season?");
      userInput1 = sc.nextLine();
      indicator();

      if(userInput1.equals("Nikola Jokic"))
      {
        System.out.println("Yup, the Joker is wrecking havoc this season.");
        statement2 = false;
        break;
      }

      else if(userInput1.equals("Damian Lillard"))
      {
        System.out.println("Nope, Dame isn't even the best point guard in the league, that honor belongs to Steph.");
        statement2 = false;
        break;
      }

      else{
        System.out.println(array[select]);
        statement2 = false;
        break; 
      }
    }

    while (statement2 == false)
    {
      System.out.println("Oh it looks likes we are out of time.  Do you want to discuss one more question?");
      userInput2 = sc.nextLine();
      indicator();

      if (userInput2.equals("yes")){
        System.out.println("Alright then.");
        statement3 = false;
        break;
      }

      else if (userInput2.equals("no")){
        System.out.println("Okay then, see you next time!");
        System.out.println("Goodbye " + name);
        break;
      }

      else{
        System.out.println("Okay then, see you next time!");
        System.out.println("Goodbye " + name + "!");
        break;
      }

    }

  while (statement3 == false)
  {
    System.out.println("Who do you think will win the NBA finals?");
    userInput3 = sc.nextLine();
    indicator();

    if (userInput3.equals("Los Angeles Clippers")){
      System.out.println("Yeah, I think the Clippers will comeback and win the title");
      System.out.println("Anyways, it was nice chatting with you, " + name + ", I hope you have a nice day!");
      break;
    }

    else{
      System.out.println("That was not the team I had in mind.");
      System.out.println("Anyways, it was nice chatting with you, " + name + ", I hope you have a nice day!");
      break;
    }
  }
   
}

  public static boolean beginning(){

    System.out.println("Are you ready to begin?");
    Scanner sc = new Scanner(System.in);
    String response1 = sc.nextLine();
    indicator();
    boolean init = true;  
    if (response1.equals("yes")){
      init = true;
    }

    else if (response1.equals("no")){
      System.out.println("Too bad, you still have to chat!");
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
      indicator();
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
      indicator();
  }
    else{
      System.out.println("Oh, I am not familiar with who this player is but I look forward to reading more about them!");
      indicator();
    }

  }

}