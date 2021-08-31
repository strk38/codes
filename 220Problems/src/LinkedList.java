 class LinkedList {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
        Node(int d,Node nx){
            data=d;
            next=nx;
        }
    }

    void getUnion(Node head1,Node head2){
        Node t1=head1,t2=head2;
        while(t1!=null){
           push(t1.data);
           t1=t1.next;
        }
        while(t2!=null){
            if(!Present(head,t2.data))
                push(t2.data);
                t2=t2.next;
        }


    }

    void intersection(Node head1,Node head2){
        Node result=null;
        Node t1=head1;
        while(t1!=null){
            if(Present(head2,t1.data))
                push(t1.data);
            t1=t1.next;
        }
    }

    void push(int new_data){
        Node n=new Node(new_data);
        n.next=head;
        head=n;
    }

    boolean Present(Node head,int data){
        Node tail=head;
        while(tail!=null){
            if(tail.data==data)
                return true;
            tail=tail.next;  //else
        }return false;
    }

    void printList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    void sortList(){
        Node current=head,tail=null;
        int temp;
        if(head==null)
            return;
        else{
            while(current!=null){
                tail=current.next;
                while(tail!=null){
                  if(current.data>tail.data){
                    temp=current.data;
                    current.data=tail.data;
                    tail.data=temp;
                  }
                  tail=tail.next;
                }
                current=current.next;
            }
        }
    }

    void Product(Node head1,Node head2){
        Node t1=head1,t2=head2;
        for(Node n=head;n!=null;n=n.next){
            n.data=t1.data*t2.data;
            t1=t1.next;
            t2=t2.next;
            if(t1==null || t2==null){
                n.next=null;
                break;
            }
        }
    }

    void Sum(Node head1,Node head2){
         Node t1=head1,t2=head2;
         for(Node n=head;n!=null;n=n.next){
             n.data=t1.data+t2.data;
             t1=t1.next;
             t2=t2.next;
             if(t1==null || t2==null){
                 n.next=null;
                 break;
             }
         }
     }

    void Difference(Node head1,Node head2){
        Node t1=head1,t2=head2;
        for(Node n=head;n!=null;n=n.next){
            n.data=t1.data-t2.data;
            t1=t1.next;
            t2=t2.next;
            if(t1==null || t2==null){
                n.next=null;
                break;
            }
        }
    }

    void DotProduct(Node head1,Node head2){
        Node t1=head1,t2=head2,t3=head;
        int t4=0;
        for(Node n=head;n!=null;n=n.next){
            n.data=t1.data*t2.data;
            t3.data=n.data;
            t1=t1.next;
            t2=t2.next;
            t4=t4+t3.data;
            if(t1==null || t2==null){
                n.next=null;
                break;
            }
        }
        System.out.println(t4);
    }

    void toArray(Node head1){
        Node t=head1;
        int count=0;
        for(Node n=t;n!=null;n=n.next){
            count++;
        }
        int i=0;
        int []c=new int[count];
        for(Node n=t;n!=null && i<count;n=n.next){
            c[i]=n.data;
            i++;
        }

        for(int j=0;j<c.length;j++){
            System.out.print(c[j]+"  ");
        }
        System.out.println();
    }

    void toList(int []a){
        Node head;

        for(int i=0;i<a.length;i++){

        }
    }
    public static int seqSearch(Node head,Object k){
        Node n=head;
        for(int i=0;n!=null;i++,n=n.next){
            if(k.equals(n.data))
                return i;
        }return -1;
    }

     public Node zigzag(Node a, Node b){
         Node head=new Node(a.data,null);
         Node tail=head;
         for(Node n=a.next;n!=null;n=n.next){
             Node k=new Node(n.data,null);
             tail.next=k;
             tail=tail.next;
         }
         tail=head;
         for(Node n=b;n!=null;n=n.next){
             Node k=new Node(n.data,tail.next);
             tail.next=k;
             tail=tail.next.next;
         }
         return head;
     }

    void reverseList(Node head){
        Node nH=new Node(head.data,null);
         for(Node n =head.next;n!=null;n=n.next){
            Node x=new Node(n.data,null);
            x.next=nH;
            nH=x;
         }

     }
    public static void main(String[] args) {
        LinkedList list1=new LinkedList();
        LinkedList list2=new LinkedList();
        LinkedList unin=new LinkedList();
        LinkedList intersect=new LinkedList();

       /* list1.push(10);
        list1.push(20);
        list1.push(30);
        list1.push(50);
        list1.push(70);

        list2.push(20);
        list2.push(60);
        list2.push(40);
        list2.push(50);
        list2.push(80);*/
       list1={10,20,30,50,70};
       list2={20,60,40,50,80};

        unin.getUnion(list1.head,list2.head);
        intersect.intersection(list1.head,list2.head);

        System.out.println("First list :"+list1.head.data);
        list1.printList();

        System.out.println("Second list :");
        list2.printList();

        System.out.println("Union is :");
        unin.printList();

        System.out.println("Intersection is :");
        intersect.printList();

        System.out.println("Sort List :");
        unin.sortList();
        unin.printList();

        System.out.println("Product List :");
        unin.Product(list1.head,list2.head);
        unin.printList();

        System.out.println("Sum List :");
        unin.Sum(list1.head,list2.head);
        unin.printList();

        System.out.println("Difference List :");
        unin.Difference(list1.head,list2.head);
        unin.printList();

        System.out.println("Dot Product :");
        unin.DotProduct(list1.head,list2.head);

        System.out.println("LinkedList to Array : ");
        unin.toArray(list1.head);

        System.out.println("Array to LinkedList : ");
        int c[]={1,2,3,5};
        unin.toList(c);

        System.out.println("SeqSearch :");
        System.out.println(seqSearch(list1.head,0));


        System.out.println();
        LinkedList list4=new LinkedList();
        list4.reverseList(list1.head);
        list4.printList();

        System.out.println("Linked List Zigzag :");
        LinkedList list3=new LinkedList();
        list3.zigzag(list1.head,list2.head);
        list3.printList();
    }
}
