package Util;

import java.util.TimerTask;

/**
 * Created by amaliujia on 15-5-10.
 */
public class StatChecker extends TimerTask {
    TimeLogger logger;

    public StatChecker(TimeLogger l){
        this.logger = l;
    }

    @Override
    public void run() {
        logger.judge();
    }
}
