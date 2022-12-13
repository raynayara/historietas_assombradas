import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner object = new Scanner(System.in);

        personagens player1 = new personagens("Pepe", 100 );
        personagens player2 = new personagens("Marilu", 100 );
        personagens criatura = new personagens("Morte",100);

        System.out.println("Pepe é um garoto malcriado e preguiçoso de onze anos, " +
                "\nque mora com sua avó, uma velha bruxa, e trabalha como entregador para ela" +
                "\ncujo trabalho é vender artefatos e poções mágicas pela internet. " +
                "\nOs produtos criados por ela, levam Pepe, seu cão Ramirez, e marilu sua amiga." +
                "\na enfrentarem monstros, espíritos e toda espécie de criatura sobrenatural.");

        System.out.println("\nEm uma noite fria e sombria, Pepe e Marilu embarcam em uma jornada " +
                "\npara fazerem entregas de umas porções para a vó do Pepe. Mas no caminho," +
                "\neles encontram criaturas monstruosas que estão tentando roubar suas porções. " +
                "\nPara escapar eles precisarão usar algumas de suas porções extras e tentarem fugir, " +
                "\ncaso contrário eles perderam vida, podendo até morrer. ");

        System.out.println("\n\n(porção 1) Ataque calice de fogo --> 50 de dano"+
                "\n(porção 2) Ataque garras do inferno --> 75 de dano");
        int ataque = object.nextInt();

        if (ataque == 1){
            System.out.println(criatura.nome+" leva 50 de dano");
            criatura.vida = criatura.vida - 50;
            System.out.println(criatura.nome+" está com "+criatura.vida+" de vida");
        }
        else {
            System.out.println(criatura.nome+" leva 75 de dano");
            criatura.vida = criatura.vida - 75;
            System.out.println(criatura.nome+" está com "+criatura.vida+" de vida");
        }
        System.out.println("\n(porção 3) sopro de dragão --> 50 de dano"+
        "\n(porção 4) mordida de morcego --> 15 de dano ");
        int ataque2 = object.nextInt();

        if (ataque2 == 3){
            System.out.println(criatura.nome+" leva 50 de dano");
            criatura.vida = criatura.vida - 50;
            System.out.println(criatura.nome+" está com "+criatura.vida+" de vida, "+criatura.nome+" morreu ");

        }
        else{
            System.out.println(criatura.nome+" leva 15 de dano");
            criatura.vida = criatura.vida - 15;
            System.out.println(criatura.nome+" está com "+criatura.vida+" de vida");
        }

    }
}