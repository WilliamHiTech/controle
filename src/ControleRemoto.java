public class ControleRemoto {
    private int botao1;
    private int botao2;
    private int botao3;
    private int botao4;
    private int botao5;
    private int bateria;

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getBotao1() {
        return botao1;
    }

    public void setBotao1(int botao1) {
        this.botao1 = botao1;
    }

    public int getBotao2() {
        return botao2;
    }

    public void setBotao2(int botao2) {
        this.botao2 = botao2;
    }

    public int getBotao3() {
        return botao3;
    }

    public void setBotao3(int botao3) {
        this.botao3 = botao3;
    }

    public int getBotao4() {
        return botao4;
    }

    public void setBotao4(int botao4) {
        this.botao4 = botao4;
    }

    public int getBotao5() {
        return botao5;
    }

    public void setBotao5(int botao5) {
        this.botao5 = botao5;
    }
    public void ligar(){
        if (botao1 ==1){
            System.out.println("Ligando");

        }else{
            System.out.println("Nao foi possivel ligar");
        }

    }
    public void desligar(){
        if (botao2 == 2){
            System.out.println("Desligando");
        }else{
            System.out.println("Função nao disponivel");
        }
    }
    public void netFlix(){
        if (botao3 == 3){
            System.out.println("Inicializando NetFliX");
        }else{
            System.out.println("Função nao disponivel");
        }

    }
    public void volume(){
        if (botao4 == 4){
            System.out.println("Aumentando volume");
        } else {
            System.out.println("Função indisponivel");
        }

        }
        public void volumeMenos(){
        if (botao5 == 5){
            System.out.println("Abaixando volume");
        }else{
            System.out.println("Função indisponivel");
        }
        }

    }

