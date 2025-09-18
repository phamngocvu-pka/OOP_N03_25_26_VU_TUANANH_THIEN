abstract class actor {
    abstract void act();
}
class HappyActor extends actor {
    public void act() {
        System.out.println("coc444cc.");
    }
}
class SadActor extends actor {
    public void act() {
        System.out.println("coccc.");
    }
}
class stage{
    actor a = new HappyActor();
    void change(){
        a = new SadActor();
    }
    void go(){
        a.act();
    }
}