class LRUCache {

    class Node{
        int key;
        int value;

        Node prev;
        Node next;

        Node(int key, int value){
            this.key = key;
            this.value = value;
        }


    }

    Node head;
    Node tail;

    int capacity;
    HashMap<Integer,Node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();

        head = new Node(0,0);
        tail = new Node(0,0);

        head.next = tail;
        tail.prev = head;
    }

    void addFirst(Node node){
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    void remove(Node node){
        Node before = node.prev;
        Node after = node.next;

        before.next = after;
        after.prev = before;
    }
    
    public int get(int key) {
        Node node = map.get(key);
        if(node == null){
            return -1;
        }

        remove(node);
        addFirst(node);

        return node.value;

    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            Node node = map.get(key);

            node.value = value;

            remove(node);
            addFirst(node);
        }else{
            Node node = new Node(key, value);

            if(map.size() == capacity){
                Node lru = tail.prev;
                remove(lru);
                map.remove(lru.key);
            }

            map.put(key,node);
            addFirst(node);


        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */