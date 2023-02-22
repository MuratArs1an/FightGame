package FightGame;

public class Main {
    public static void main(String[] args) {
        Fighter f1=new Fighter("Rocky Balbao",25,200,80, 50);
        Fighter f2=new Fighter("Ivan Drago",20,180,90, 40);

        Match match=new Match(f1,f2,80,100);
        match.run();
    }
}
