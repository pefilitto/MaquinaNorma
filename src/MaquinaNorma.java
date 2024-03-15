public class MaquinaNorma {
    public int adicionaAB(int A, int B){
        while(B != 0){
            A = A + 1;
            B = B - 1;
        }
        return A;
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

    public void adicionaABcomNegativo(int A, int B, int B1){
        while(B != 0){
            if(B1 == 1){
                A = A - 1;
            }
            else{
                A = A + 1;
            }
            B = B - 1;
        }
        System.out.println("Soma: " + A);
    }

    public void verificaPrimo(int A){
        int B = 0, C = 0;
        C = adicionaAB(C, A);
        C--;
        while(C != 0 && B != 1) {
            if(A % C == 0){
                B++;
            }
            if(B != 1){
                C--;
            }
        }
        C--;
        if(C != 0){
            System.out.println("Não é primo");
        }
        else{
            System.out.println("É primo");
        }
    }
}
