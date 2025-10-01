import Estoque.Estoque;

import java.util.Random;

public class Armazem {

        private final int  ID;
        private Armazem[] armazem;
        private  Random gerador = new Random();


        public  Armazem(){
            this.ID = gerador.nextInt(1, 100);

            this.armazem = new Armazem[100];


        }


        public void addEstoque(int posicao ,Armazem estoque){


                this.armazem[posicao] = estoque;


        }

        public  void printArmazen(int posicao, Armazem Armazem){


                IO.println(this.armazem[posicao]);

        }

        public void printArmazernAll(Armazem Armazen){

            for (int i = 0; i < this.armazem.length; i++) {
                IO.println(this.armazem[i]+ "\n");
            }
        }

        public void DeletarEstoque(int posicao, Armazem armazem){

            this.armazem[posicao] = null;
        }

}
