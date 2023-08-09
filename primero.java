import java.util.Scanner;

public class HolaMundo{
        
    public static void main (String[] args){
        int grado=0;
        float promedio=0;
        int suma=0;
        int materias=0;
        Scanner lector = new Scanner(System.in);
        System.out.print("Introduce el grado: ");
        grado = lector.nextInt();
        if (grado<=3){
           
            if(grado == 1) {
                materias = 12;
            }else if(grado == 2){
                materias = 24;
            }else if(grado == 3){
                materias = 33;
            }
            int  []  calificaciones= new int[materias];
            for(int i = 0; i<calificaciones.length; i++){
                int num = i+1;
                System.out.print("Materia "+num+ ":");
                int n = lector.nextInt();
                calificaciones[i] = n;
                suma = suma + n;
            }
            promedio = suma/materias;
            System.out.println(materias + " calificaciones");
            System.out.println("Promedio: "+ promedio);

        }else{
            System.out.println("Grado inválido");
        }
       

    
    }
    
}
