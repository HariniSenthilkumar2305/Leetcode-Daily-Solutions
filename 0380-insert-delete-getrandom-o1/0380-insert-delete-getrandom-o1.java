class RandomizedSet {
    HashSet<Integer>a=new HashSet<>();
    Random ran=new Random();
    public RandomizedSet() {
              //Constructor 
    }
    
    public boolean insert(int val) {
     if(a.contains(val)){
        return false;
     }
     a.add(val);
     return true;
    }
    
    public boolean remove(int val) {
       if(!a.contains(val)){
        return false;
       }
       a.remove(val);
       return true;
    }
    
    public int getRandom() {
      if(a.isEmpty()){
        throw new IllegalStateException("Set is Empty");
      }
      int index=ran.nextInt(a.size());
      return (Integer)a.toArray()[index];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */