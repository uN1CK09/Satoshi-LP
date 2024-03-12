//Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.

package ExsModularização;
public class Lt02_ModEx43 {
    public static void main(String[] args) {
        double Ana = 1.1, Maria = 1.5;
        System.out.println("Anos até que Ana Seja maior que Maria: " + FuncTempo(Ana, Maria));
    }

    static double FuncTempo(double Ana, double Maria){
        double anos = 0;
        while (Ana<Maria){
            Ana += 0.03;
            Maria += 0.02;
            anos += 1;
        }
        return anos;
    }
}
