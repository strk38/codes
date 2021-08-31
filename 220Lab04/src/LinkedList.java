public class LinkedList{
    public Node head;


    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    public LinkedList(Object [] a){
        // TO DO

       Node n  =new Node( a[0],null);
         head=n;
        Node tail=head;
        for(int i=1;i<a.length;i++){
             n=new Node(a[i],null);
            tail.next=n;
            tail=n;

        }
    }

    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public LinkedList(Node h){
        // TO DO
        head=h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode(){
        // TO DO
        int counter=0;
        for(Node n=head;n!=null;n=n.next){
            counter++;
        }
        return counter; // please remove this line!
    }

    /* prints the elements in the list */
    public void printList(){
        // TO DO
        for(Node n=head;n!=null;n=n.next){
            System.out.print(n.element+" ");
        }
        System.out.println();
    }

    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        // TO DO
        if(idx<0 && idx>countNode())
            return null;
        else{
            int i=0;
            for(Node n=head;n!=null;n=n.next){
                if(i==idx){
                    return n;
                }
                i++;
            }
        }
        return null; // please remove this line!
    }


    // returns the element of the Node at the given index. For invalid idx return null.
    public Object get(int idx) {
        // TO DO
        Node n=nodeAt(idx);
        if(n!=null){
            return n.element;
        }
      return null;
    }



    /* updates the element of the Node at the given index.
     * Returns the old element that was replaced. For invalid index return null.
     * parameter: index, new element
     */
    public Object set(int idx, Object elem){
        // TO DO
        Object oldElem=null;
        if(idx<0 && idx>countNode()){
            return null;
        }
        else{
            int i=0;
            for(Node n=head;n!=null;n=n.next){
                if(i==idx){
                    oldElem=n.element;
                    n.element=elem;

                }
                i++;
            }
            return oldElem;
        }
         // please remove this line!
    }


    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        // TO DO
        int i=-1;
        for(Node n=head;n!=null;n=n.next){
            if(n.element==elem){
                break;
            }
            i++;
        }
        if(i>=0)
            return i;
        return -1; // please remove this line!
    }

    // returns true if the element exists in the List, return false otherwise.
    public boolean contains(Object elem){
        // TO DO
        int n=indexOf(elem);
        if(n>=0)
            return true;

        return false; // please remove this line!
    }

    // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
    public Node copyList(){
        // TO DO
        Node nH=new Node(head.element,null);
        Node nT=nH;
        for(Node n=head.next;n!=null;n=n.next){
            Node x=new Node(n.element,null);
            nT.next=x;
            nT=x;
        }
        return nH; // please remove this line!
    }

    // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
    public Node reverseList(){
        // TO DO
        Node nH=new Node(head.element,null);
        //Node nT=nH;
        for(Node n=head.next;n!=null;n=n.next){
            Node x=new Node(n.element,null);
            x.next=nH;
            nH=x;
        }
        return nH; // please remove this line!
    }

    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        // TO DO
        if(idx>=0 && idx<=countNode()){
            Node n=new Node(elem,null);
           if(idx==0){
               n.next=head;
               head=n;
           }
           else{
                Node prev = nodeAt(idx - 1);
                Node s = prev.next;
                n.next = s;
                prev.next = n;
            }
        }
    }


    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int index){
        // TO DO
        Node temp=head;
        if(index>=0 && index<=countNode()){
            if(index==0){
                head=head.next;
            }
            else{
               //for(Node n=head.next;n!=null;n=n.next)
                 Node x = new Node(get(index),null);
                 Node prev = nodeAt(index - 1);
                 Node nxt=nodeAt(index+1);
                 temp=x;
                 //x=x.next;
                 prev.next = nxt;

             }
            return temp.element;
        }
        return null; // please remove this line!
    }

    // Rotates the list to the left by 1 position.
    public void rotateLeft(){
        // TO DO
       //  Node first=new Node(head.element,null);
        Object first=head.element;
        head=head.next;
        insert(first,countNode());
    }

    // Rotates the list to the right by 1 position.
    public void rotateRight(){
        // TO DO

     Node n=head;
     Object temp=n.element;
     while(true){
         if(n.next==null){
             head.element=temp;
             break;
         }
         else{
             n=n.next;
             Object tmpE=n.element;
             n.element=temp;
             temp=tmpE;
         }
     }
    }

}


