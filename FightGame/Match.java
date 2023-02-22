package FightGame;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }

    public void run(){
        if(isCheck()){
            int round=1;
            while(this.f1.health>0 && this.f2.health>0){

                System.out.println("========"+round+" ROUND =========");
                if(isStart()>=50){
                    f2.health=f1.hit(f2);
                    System.out.println(this.f2.name+"`nin "+this.f2.health+" Cani Kaldi");
                }else{
                    f1.health=f2.hit(f1);
                    System.out.println(this.f1.name+"`nin "+this.f1.health+" Cani Kaldi");
                }
                if(isWin()){
                    break;
                }
                round++;
            }

        }else{
            System.out.println("Sporcularin Sketletleri Uyumsuz");
        }
    }

    boolean isCheck(){
        return(this.f1.weight>=minWeight && this.f1.weight<=maxWeight) && (this.f2.weight>=minWeight && this.f2.weight<=maxWeight);
    }
    boolean isWin(){
        if(this.f1.health==0){
            System.out.println(this.f2.name+" Kazandi");
            return true;
        }
        if(this.f2.health==0){
            System.out.println(this.f1.name+" Kazandi");
            return true;
        }
        return false;
    }

    double isStart(){
        return Math.random()*100;
    }

}
