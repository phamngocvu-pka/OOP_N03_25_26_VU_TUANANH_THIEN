package hotpital.model;

abstract class actor{
        abstract void act();
    }
    class hero extends actor{
     public void act(){
         System.out.println("hero");
        }
    }
    class Sadak extends actor{
        public void act(){
            System.out.println("Sadak");
        }
    }

    class Stage{
        actor a=new hero();
        void change() { a=new  Sadak(); }
        void go() { a.act(); }
    }