public class Principal 
{
   public static void main(String[] args) {
      Filme meuFilme = new Filme();
      meuFilme.nome = "Deadpool & Wolverine";
      meuFilme.anoDeLancamento = 2024;
      meuFilme.incluidoNoPlano = true;
      meuFilme.duracaoEmMinutos = 127;
      System.out.println(meuFilme.nome);
      System.out.println(meuFilme.anoDeLancamento);
      System.out.println(meuFilme.duracaoEmMinutos);

   }
}