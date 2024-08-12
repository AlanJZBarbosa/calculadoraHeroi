public class CalculadoraRankeadas {

    public static void main(String[] args) {
        
        int vitorias = 105;
        int derrotas = 20;
        
        String resultado = calcularRank(vitorias, derrotas);
        System.out.println(resultado);
    }

    // Função para calcular o saldo de vitórias e determinar o nível
    public static String calcularRank(int vitorias, int derrotas) {
        int saldoVitorias = vitorias - derrotas;
        String nivel = determinarNivel(vitorias);

        return "O Herói tem de saldo de " + saldoVitorias + " está no nível de " + nivel;
    }

    // Função para determinar o nível com base nas vitórias
    public static String determinarNivel(int vitorias) {
        if (vitorias < 10) {
            return "Ferro";
        } else if (vitorias >= 11 && vitorias <= 20) {
            return "Bronze";
        } else if (vitorias >= 21 && vitorias <= 50) {
            return "Prata";
        } else if (vitorias >= 51 && vitorias <= 80) {
            return "Ouro";
        } else if (vitorias >= 81 && vitorias <= 90) {
            return "Diamante";
        } else if (vitorias >= 91 && vitorias <= 100) {
            return "Lendário";
        } else if (vitorias >= 101) {
            return "Imortal";
        } else {
            return "Nível desconhecido";
        }
    }
}
