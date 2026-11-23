class ProductOfNumbers {

    ArrayList<Integer> list = new ArrayList<>();

    public ProductOfNumbers() {

    }
    
    public void add(int num) {
        list.add(num);
    }
    
    public int getProduct(int k) {
        
        int idx = list.size() - 1;

        int prod = 1;

        while(k != 0){
            prod *= list.get(idx);
            idx--;    
            k--;
        }

        return prod;
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */