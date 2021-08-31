public class Assignment {
    public Node head;

    public Assignment(Object a[]){
        Node n=new Node(a[0],null);
        head=n;
        Node tail=head;
        for(int i=1;i<a.length;i++){
            n=new Node(a[i],null);
            tail.next=n;
            tail=n;
        }

    }

    public Assignment(Node h){
        head=h;

    }

    public void PrintList(){
        for(Node n=head;n!=null;n=n.next){
            System.out.print(n.element+" ");
        }
        System.out.println();
    }




    public void EvenNum(){
        for(Node n=head;n!=null;n=n.next){
            if((int)n.element%2==0){
                System.out.print(n.element+" ");
            }
        }
    }

    public void Array(int size){
        Object c[]=new Object[size];
        for(Node n=head;n!=null;n=n.next) {
            for (int i = 0; i < c.length; i++) {
                if ((int) n.element % 2 == 0) {
                  c[i]=n.element;
                }
            }

        }
        for(int i = 0; i < c.length; i++){
            System.out.print(c[i]+" ");
        }
    }







}
