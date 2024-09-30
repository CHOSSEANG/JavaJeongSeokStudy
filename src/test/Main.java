package test;

public class Main {
    public static void main(String[] args) {
        MovieEnter movieEnter = new MovieEnter();

        movieEnter.register(new NewTestActor());
        movieEnter.register(new TestActor());

        Director director = new Director();

        if (!director.isMakeMovie()) {
//            director.setActor(movieEnter.getActor());
        }
    }
}

class Director {
    Actor actor;

    boolean isMakeMovie() {
        return actor != null;
    }

    void makeMovie() {
        actor.act();
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
}

interface Actor {
    String act();
}

class TestActor implements Actor {
    public String act() {
        return "TestDriver";
    }
}

class NewTestActor implements Actor {
    public String act() {
        return "NewTestDriver";
    }
}

class MovieEnter {
    void register(Actor actor) {
        System.out.println(actor.act());
    }
}
