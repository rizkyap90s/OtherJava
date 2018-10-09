/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gem1;

/**
 *
 * @author Lab2_Dosen
 */
public class Gem1 {

    /**
     * @param args the command line arguments
     */
    static void sort(int []indata)
    {
      int a,b,c;
      
      
      for (a=indata.length-1;a>=0;a--)
        {
            for (b = 1; b<= a; b++)
            {
                if (indata[b-1] > indata[b] ) 
                {  
                    c = indata[b-1];
                    indata[b-1] = indata[b];
                    indata[b] = c; 
                  
                }    
            }
        }  
     
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int []M = {1,11,12,2,13,23,31,62,71,61};
        int []T = new  int[10];
        int []B = new  int[10];
        int []H = new  int[10];
        int i,temp,tm, s, j,loop,hit, k,l;
        for (i=0;i<M.length;i++)
        {
           T[i] = M[i] % 10;  
           System.out.print(T[i] + " ");  
        } 
         System.out.println();
        for (i=0;i<T.length;i++)
        {
           if (T[i] != 0) {
               B[T[i]] = B[T[i]] + 1;
           }
        } 
        loop = 0;
        for (i=0;i<B.length;i++)
        {
           if (B[i] != 0) 
           {
            temp = 0;   
            hit=0;
            
            for (j=0;j<M.length;j++)
            {
                temp = M[j] % 10;
                if (temp == i){
                    hit=hit+1;
                }
            }
            int AR[] = new int[hit];
            l= 0;
            for (k=0;k<M.length;k++)
            {
                if ((M[k] % 10)== i )
                {
                    AR[l] = M[k];
                    l++;
                }
            }
           sort(AR);
           l = AR.length;
           k = 0;
           while (k < l)
           {    
               
           
               H[loop] = AR[k];
               k++;
               loop++;
           }
           
           
            } 
      }

       System.out.println();
        
        for (i=0;i<T.length;i++)
        {
           System.out.print(T[i] + " ");
          
             
        } 
         System.out.println();
        for (i=0;i<M.length;i++)
        {
         
           System.out.print(M[i] + " ");  
             
        }  
        System.out.println();
        for (i=0;i<H.length;i++)
        {
         
           System.out.print(H[i] + " ");  
             
        }  
        System.out.println();
        
    }
    
}
