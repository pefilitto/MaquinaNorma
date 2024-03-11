public class MaquinaNorma {
    public int A;
    public int B;
    public int C;
    public int D;
    public int flag;

    public void adicionaAB(){
        flag = 0;
        while(flag == 0){
            A = A + 1;
            B = B - 1;
            if(B == 0){
                flag = flag + 1;
            }
        }
    }

    public void adicionaABC(){
        flag = 0;
        C = 0;
        while(flag == 0){
            C = C + 1;
            B = B - 1;
            if(B == 0){
                flag = flag + 1;
            }
        }

        flag = 0;
        while(flag == 0){
            A = A + 1;
            B = B + 1;
            C = C - 1;
            if(C == 0){
                flag = flag + 1;
            }
        }
    }



}
