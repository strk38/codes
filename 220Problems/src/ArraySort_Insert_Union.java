public class ArraySort_Insert_Union {
    public int[] union(int []a,int []b){
        int []c=new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[i+a.length]=b[i];
        }
        for(int i=0;i<c.length;i++){
            for(int j=0;j<i;j++){
                if(c[i]==c[j]){
                    c[i]=0;
                    break;
                }
            }
        }
        int count=0;
        for(int i=0;i<c.length;i++){
            if(c[i]==0)
                count++;
        }
        int []d=new int[c.length-count];
        for(int i=0,j=0;i<c.length;i++){
            if(c[i]!=0)
                d[j++]=c[i];
        }

        return sort(d);
    }


    public int[] union(int[]a, int startA,int[] b, int startB){
        return  union(a,b);
    }
    public int[] intersection(int []a, int []b){
        int c[]=new int[a.length];
        int count=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j] && a[i]!=0){
                    c[count++]=a[i];
                    break;
                }
            }
        }
        int d[]=new int[count];
        for(int i=0;i<d.length;i++)
            d[i]=c[i];
        return d;
    }


    public int[] intersection(int []a, int startA, int []b, int startB){
        return intersection(a,b);
    }
    public int[] sort(int[]a){
        for(int i=0;i<a.length-1;i++){
            int count=0;
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    count++;
                }
            }
            if(count==0)
                break;
        }
        return a;
    }


    public int[] sort(int[]a,int start){
        a=sort(a);
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==0)
                count++;
            else
                break;
        }
        int b[]=new int[a.length-count];
        for(int i=0;i<b.length;i++)
            b[i]=a[i+count];
        return b;
    }
    public int[] zigzag(int []a, int[]b){
        int []c=new int[a.length+b.length];
        for(int i=0;i<c.length;i++){
            if(i%2==0)
                c[i]=a[i/2];
            else
                c[i]=b[i/2];
        }
        return c;
    }
    public int[] zigzag(int []a,int startA,int sizeA, int[]b,int startB,int sizeB){
        int []c=new int[sizeA+sizeB];
        for(int i=0;i<c.length;i++){
            if(i%2==0)
                c[i]=a[(i/2+startA)%a.length];
            else
                c[i]=b[(i/2+startB)%b.length];
        }
        return c;
    }
    public void print(int[] a){
        for(int i=0;i<a.length-1;i++)
            System.out.print(a[i]+", ");
        if(a.length>0)
            System.out.println(a[a.length-1]);
        System.out.println("***************");
    }
}
