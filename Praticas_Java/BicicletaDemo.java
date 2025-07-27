class Bicicleta{
    int cadencia;
    int velocidade;
    int marcha;
    
    void mudarCadencia(int novaCadencia){
      cadencia = novaCadencia;
    }
    
    void mudarMarcha(int novaMarcha){
      marcha = novaMarcha;
    }
    
    void acelerar(int incremento){
      velocidade += incremento;
    }
    
    void frear(int decremento){
      velocidade -= decremento;
    }
    
    void mostrarEstado(){
      System.out.println("Cadencia: " + cadencia + ", Marcha: " + marcha + ",Velocidade: " + velocidade);
    }
  }
  
  class BicicletaDemo{
    public static void main(String[] args) {
      Bicicleta bike1 = new Bicicleta();
      Bicicleta bike2 = new Bicicleta();
      
      bike1.mudarCadencia(50);
      bike1.mudarMarcha(2);
      bike1.acelerar(10);
      bike1.mostrarEstado();
      
      bike2.mudarCadencia(60);
      bike2.mudarMarcha(3);
      bike2.acelerar(15);
      bike2.mostrarEstado();
    }
  }