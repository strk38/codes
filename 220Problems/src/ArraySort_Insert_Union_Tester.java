public class ArraySort_Insert_Union_Tester {

        public static void main(String[]args){
            int []a={7,9,0,0,0,1,3,5};
            int []b={0,2,4,6,8,10};
            int []d={1,2,100,100,500,500};
            int []e={4,9,500,30,30,500,1};

            ArraySort_Insert_Union l=new  ArraySort_Insert_Union();

            System.out.println();
            System.out.println("Array Union");
            int []c=l.union(a,d);
            l.print(c);

            System.out.println();
            System.out.println("Circular Array Union");
            c=l.union(a,2,b,1);
            l.print(c);

            System.out.println();
            System.out.println("Array Intersection");
            c=l.intersection(a,b);
            l.print(c);

            System.out.println();
            System.out.println("Circular Array Intersection");
            c=l.intersection(a,2,b,1);
            l.print(c);

            System.out.println();
            System.out.println(" Array Sort");
            c=l.sort(e);
            l.print(c);

            System.out.println();
            System.out.println("Circular Array Sort");
            c=l.sort(a,2);
            l.print(c);
            c=l.sort(a);
            l.print(c);

            System.out.println();
            System.out.println("Array Zigzag");
            int []f={1,3,7,7};
            int []g={4,6,9,10};
            c=l.zigzag(f,g);
            l.print(c);

            System.out.println();
            System.out.println("Circular Array Zigzag");
            int []h={7,9,0,0,0,1,3,5};
            c=l.zigzag(h,5,5,b,1,5);
            l.print(c);

        }
    }

