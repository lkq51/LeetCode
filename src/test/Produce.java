package test;

import java.awt.*;
import java.util.EventListener;

/**
 * Created by lkq on 2017/3/28.
 */
public class Produce {
    private final EventListener listener;

    private Produce(){
        listener = new EventListener() {
            public void onEvent (Event e){
                //
            }
        };
    }

 /*   public static Produce newInstance (EventSource source){
        Produce safe = new Produce();
        source.registerListener(safe.listener);
        return safe;
    }*/
}
