import com.emeralddb.base.Emeralddb;

import java.util.ArrayList;

/**
 * Created by amaliujia on 15-4-12.
 */
public abstract class LoadBalancer {
    protected ArrayList<DBInstance> instances;

    public ArrayList<Emeralddb> dbs;

    protected static final String tempFile = "c.txt";


    public LoadBalancer(){
        instances = new ArrayList<DBInstance>();
        dbs = new ArrayList<Emeralddb>();
    }

    public void addInstance(DBInstance instance){
        instances.add(instance);
    }

    public void addInstance(String ip, int port){
        instances.add(new DBInstance(ip, port));
    }

    public abstract void init();

    public abstract void sumbit(Operations e, String Key, String record);

    public abstract void sumbit(Operations e, String Key);

}
