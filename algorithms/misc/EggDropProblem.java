package algorithms.misc;

public class EggDropProblem {
    public static void main(String[] args) {
    EggDropProblem eggDropProblem=new EggDropProblem();
    int minAttempts = eggDropProblem.calculateMinAttempts(2,10);
    System.out.println(minAttempts);
    }

    int calculateMinAttempts(int eggs, int floors)
    {
       int T[][]=new int[eggs+1][floors+1];
       int min=Integer.MIN_VALUE;

       for(int i=0;i<=floors;i++)
       {
           T[1][i]=i;
       }

       for(int e=2;e<=eggs;e++)
       {
           for(int f=1;f<=floors;f++)
           {
               T[e][f]=Integer.MAX_VALUE;
               for(int k=1;k<=f;k++)
               {
                   min=1+Math.max(T[e-1][k-1],T[e][f-k]);
                   if(min<T[e][f])
                       T[e][f]=min;
               }
           }
       }

       return T[eggs][floors];

    }
}
