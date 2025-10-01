import Estoque.Estoque;
import Vestuario.Vestuario;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    //criando um vestuario

     Vestuario v1 = new Vestuario("camisa", "adidas","G", 67.99);
     Estoque e1 = new Estoque(10, v1);

     Armazem a1 = new Armazem();

     a1.addEstoque(1, a1);

     a1.printArmazen(1, a1);

}
