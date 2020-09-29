
package revisao1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;


public class Revisao1 {

    
    public static void main(String[] args) throws FileNotFoundException {
                
        // Questão 1
        System.out.println("Questão 1");
        System.out.println("Hello world");
        
        //Questão 2
        int tam=10;
        int[] vet= new int[tam];
        Random rand = new Random();
        
        for(int i=0;i<tam;i++){
            vet[i]= rand.nextInt(99);
        }
        
        System.out.println("Questão 2:");
        
        for(int i=0;i<tam;i++){
            System.out.print(vet[i]+",");
        }
        
        //Questão 3
        
        int[][] matriz = new int[tam][tam];
        
        
        for(int i=0;i<tam;i++){              //preenchendo a matriz
           for(int j=0;j<tam;j++){
               matriz[i][j]=rand.nextInt(10);
           }
       }
        System.out.println("\nQuestão 3:");
               
        for(int i=0;i<tam;i++){              //Print da matriz
            System.out.println(" ");
            for(int j=0;j<tam;j++){
               System.out.print(matriz[i][j]+ " ");
           }
       }
         //Questão 4
         int maior = 0;
         int menor = 100;
         int media=0;
         
         
         System.out.println("\nQuestão 4:");
         
         for(int i=0;i<tam;i++){
            System.out.print(vet[i]+",");
            if(vet[i]<= menor){
                
                menor=vet[i];
            }
            if(vet[i]>= maior){
                maior=vet[i];
            }
            media = media + vet[i];
            
         }
         
         
         System.out.println("\nO maior número é:"+ maior);
         System.out.println("O menor número é:"+menor);
         System.out.println("A média dos números é "+ media/tam);
         
         //Questão 5
         
         Scanner txt1 = new Scanner(new FileReader("C:\\Users\\fdrew\\Desktop\\Faculdade\\Pesquisao Operacional\\Matriz\\Matriz1.txt") );
         Scanner txt2 = new Scanner(new FileReader("C:\\Users\\fdrew\\Desktop\\Faculdade\\Pesquisao Operacional\\Matriz\\Matriz2.txt") );
         int [][]matriz1 = new int[tam][tam];
         int [][]matriz2= new int[tam][tam];
         int [][]soma= new int [tam][tam];
         
         for(int i=0;i<tam;i++){              //preenchendo a matriz1
           for(int j=0;j<tam;j++){
               matriz1[i][j]=txt1.nextInt();
           }
       }
         for(int i=0;i<tam;i++){              //preenchendo a matriz2
           for(int j=0;j<tam;j++){
               matriz2[i][j]=txt2.nextInt();
           }
       }
         System.out.println("Matriz 1 ");
         for(int i=0;i<tam;i++){              //Print da matriz1
            System.out.println(" ");
            for(int j=0;j<tam;j++){
               System.out.print(matriz1[i][j]+ " ");
           }
       }
         
         System.out.println("\nMatriz 2 ");
         for(int i=0;i<tam;i++){              //Print da matriz
            System.out.println(" ");
            for(int j=0;j<tam;j++){
               System.out.print(matriz2[i][j]+ " ");
           }
       }
         for(int i=0;i<tam;i++){              //Somando as matrizes
           for(int j=0;j<tam;j++){
               soma[i][j]=matriz1[i][j]+matriz2[i][j];
           }
         
    }
         System.out.println("\nSoma das matrizes ");
         for(int i=0;i<tam;i++){                            //Print da Soma
            System.out.println(" ");
            for(int j=0;j<tam;j++){
               System.out.print(soma[i][j]+ " ");
           }
    
}
}
}
