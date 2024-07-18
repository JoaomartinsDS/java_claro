package edu.joao.anatomiaclasses;
public class MediaAluno {
    
    public static void main(String[]args){
        float nota1 = 10;
        float nota2 = 8;
        float nota3 = 7;
        float media = calcularMedia(nota1, nota2, nota3);
        System.out.println(media);
    }
    public static float calcularMedia(float nota1, float nota2, float nota3){
        return (nota1 + nota2 + nota3) / 3;
    }

}
