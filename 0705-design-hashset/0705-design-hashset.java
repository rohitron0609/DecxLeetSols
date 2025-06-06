class MyHashSet {

    private List<Integer> ls = new ArrayList<>();

    public MyHashSet() {
       
    }
    
    public void add(int key) {
        boolean flag = false;
        for(int i : ls){
            if(i == key)
                flag = true;
        }
        if(flag == false)
            ls.add(key);
    }
    
    public void remove(int key) {
        boolean flag = false;
        for(int i : ls){
            if(i == key)
                flag = true;
        }
        if(flag == true)
            ls.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        for(int i : ls){
            if(i == key)
                return true;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */