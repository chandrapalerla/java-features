class SingletonWithDoubleChecked {

    private static volatile SingletonWithDoubleChecked instance;

    private SingletonWithDoubleChecked() {}

    public static SingletonWithDoubleChecked getInstance() {
        if (instance == null) {  // 1st check
            synchronized (SingletonWithDoubleChecked.class) {
                if (instance == null) {  // 2nd check
                    instance = new SingletonWithDoubleChecked();
                }
            }
        }
        return instance;
    }
}