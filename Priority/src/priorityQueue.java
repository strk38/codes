public class priorityQueue {
    private int Max;
    private data []arr;
    private int nItems;

    public priorityQueue(int m){
        Max=m;
        arr=new data[Max];
        nItems=0;
    }

    public boolean add(int num,int priority) {
        data d=new data(num,priority);
      if(nItems==arr.length)
          return false;
      else {
          arr[nItems]=d;
          nItems++;
          return true;
      }
    }

    public int removeData(){
        int minPrior=0;
        if(nItems==0)
            return -1;
        for(int i=0;i<nItems;i++){
            if(arr[i].priority<arr[minPrior].priority)
            minPrior=i;
        }
        int item=arr[minPrior].num;
        arr[minPrior]=arr[nItems-1]; //memory optimisation shift
        nItems--;
        return item;
    }

    public void changePriority(int number,int NewPriority){
        for(int i=0;i<nItems;i++) {
            if (number == arr[i].num) {
                arr[i].priority = NewPriority;
                break;
            }
        }
    }
   public void printPriorityQ(){
        int Ptemp;
        int Ntemp;
        for(int i=0;i<nItems-1;i++) {
            for (int j = i + 1; j < nItems; j++) {
                if (arr[i].priority > arr[j].priority) {
                    Ptemp = arr[i].priority;
                    Ntemp=arr[i].num;
                    arr[i].priority = arr[j].priority;
                    arr[i].num=arr[j].num;
                    arr[j].priority = Ptemp;
                    arr[j].num=Ntemp;
                }
            }
        }
        for(int i=0;i<nItems;i++) {
            System.out.println(arr[i].num + " "+arr[i].priority);
        }
    }
    public static void main(String[] args) {
        priorityQueue p=new priorityQueue(1000);
        p.add(11,4);
        p.add(12,1);
        p.add(13,3);
        p.add(15,2);
        p.printPriorityQ();
        System.out.println();
        System.out.println(p.removeData()+" is removed");
        p.changePriority(13,5);
        p.printPriorityQ();
    }
}
