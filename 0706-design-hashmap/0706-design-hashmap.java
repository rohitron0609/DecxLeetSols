class MyHashMap {

    private boolean[] k;
    private Integer[] v;

    public MyHashMap() {
        k = new boolean[1000001];
        v = new Integer[1000001];
    }
    
    public void put(int key, int value) {
        k[key] = true;
        v[key] = value;
    }
    
    public int get(int key) {
        if(k[key] == true)
            return v[key];
        else return -1;
    }
    
    public void remove(int key) {
        k[key] = false;
        v[key] = null;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */