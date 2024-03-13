public class MaquinaNorma {
    public void adicionaAB(int A, int B){
        while(B != 0){
            A = A + 1;
            B = B - 1;
        }
        System.out.println("Soma: " + A);
    }

    public void adicionaABusandoC(int A, int B, int C){
        C = 0;
        while(B != 0){
            C = C + 1;
            B = B - 1;
        }
        while(C != 0){
            A = A + 1;
            B = B + 1;
            C = C - 1;
        }
        System.out.println("Soma: " + A);
    }

    public void atribuiABusandoC(int A, int B, int C){
        C = B;
        System.out.println("Valor inicial de A: " + A);
        while(A != 0) A--;
        while(C != 0){
            A = A + 1;
            C = C - 1;
        }
        System.out.println("Valor de A depois da atribuição : " + A);
    }

    public void multABusandoCD(int A, int B){
        int C = 0, D = 0, E = 0;

        while(B != 0){
            C++;
            B--;
        }

        while(C != 0){
            B++;
            C--;
            while(A != 0){
                A--;
                D++;
                E++;
            }
            while(D!=0){
                D--;
                A++;
            }
        }
        System.out.println("Multiplicação: " + E);
    }
}
