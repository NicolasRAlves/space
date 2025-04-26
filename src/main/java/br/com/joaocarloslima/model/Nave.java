package br.com.joaocarloslima.model;
import br.com.joaocarloslima.model.Asset;

import br.com.joaocarloslima.App;
import javafx.scene.image.ImageView;

public class Nave extends Asset{

    private int x;
    private int y;
    private int velocidade = 10;
    private Direcao direcao = Direcao.CIMA;

    public Nave(int x, int y, int velocidade, Direcao direcao) {
        this.x = x;
        this.y = y;
        this.velocidade = velocidade;
        this.direcao = direcao;

    }


    public void mover() {
        int x = getX();
        int y = getY();

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
        return new Tiro(poder, getX(), getY() - 50, 10, Direcao.CIMA);
    }
}