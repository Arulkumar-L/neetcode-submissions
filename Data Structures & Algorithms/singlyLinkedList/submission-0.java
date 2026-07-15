class Node {
    int val;
    Node next;
    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    public Node head;
    public Node tail;
    
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        if (index < 0 || head == null) {
            return -1;
        }
        if (index == 0) {
            return head.val;
        }
        Node temp = head;
        int count = 0;
        while (temp != null && count < index) {
            count++;
            temp = temp.next;
        }
        if (temp == null) {
            return -1;
        }
        return temp.val;
    }

    public void insertHead(int val) {
        Node newnode = new Node(val);
        newnode.next = head;
        head = newnode;
        if (tail == null) {
            tail = newnode;
        }
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public boolean remove(int index) {
        if (index < 0 || head == null) {
            return false;
        }
        if (index == 0) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return true;
        }
        
        Node temp = head;
        int count = 0;
        while (temp != null && count < index - 1) {
            count++;
            temp = temp.next;
        }
        
        if (temp == null || temp.next == null) {
            return false;
        }
        
        if (temp.next == tail) {
            tail = temp;
        }
        
        temp.next = temp.next.next;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> list = new ArrayList<>();
        Node temp = head;
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        return list;
    }
}