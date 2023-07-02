package io.everyonecodes.week1_springbeans.amazing_goodbye_world;


public class AmazingGoodbyeWorld {

    Goodbye goodbye = new Goodbye();
    World world = new World();

    public String get() {
        return goodbye.get() + world.get();
    }
}
