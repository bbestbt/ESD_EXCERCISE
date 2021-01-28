package kmitl.esd.exercise1.singleton;

import java.util.HashMap;

public class CompanyManager <k,v> {
    private static CompanyManager instance = null;
    HashMap<k, v> items = null;

    protected CompanyManager() {
        items = new HashMap<k, v>();
    }

    public static CompanyManager getInstance() {
        if (instance == null) {
            synchronized (CompanyManager.class) {
                if (instance == null)
                    instance = new CompanyManager();
            }
        }
        return instance;
    }


    public v get(k key) {
        return items.get(key);

    }

    public void set(k key, v value) {
        items.put(key, value);
    }


}


/*

public  class CompanyManager  {

    private static HashMap<String, CompanyManager> register  = new HashMap<String, CompanyManager>();

    private static final CompanyManager INSTANCE = new CompanyManager();

    protected CompanyManager() {
        //...
    }

//    public void doSthInstance() {
//        System.out.println("Sth with the instance");
//    }
//
//    public static void doSth() {
//        System.out.println("Sth");
//    }

    public static void Register(String name, CompanyManager value)
    {
        if(getRegister().containsKey(name)) {
            System.out.println(name+" already registered");
        } else {
            getRegister().put(name, value);
        }
    }

    public static HashMap<String, CompanyManager> getRegister() {
        return register;
    }

    public static void setRegister(HashMap<String, CompanyManager> register) {
        CompanyManager.register = register;
    }

    public static CompanyManager getINSTANCE() {
        return INSTANCE;
    }

    public void print() {
        System.out.println("comp");
    }

    public static CompanyManager getValue(String name){
        return register.get(name);
    }

}

*/
