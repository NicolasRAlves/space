package br.com.joaocarloslima.model;

public class Nave extends Asset {

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);
    }

    public void mover() {
        super.mover();

        if (getX() < 0) {
            setX(0);
        } else if (getX() > 590) {
            setX(590);
        }

        if (getY() < 0) {
            setY(0);
        } else if (getY() > 400) { 
            setY(400);
        }
    }

    public Tiro atirar(int poder) {
        return new Tiro(getX(), getY() - 50, 10, Direcao.CIMA, poder);
    }
}
