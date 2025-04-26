package br.com.joaocarloslima.model;

import br.com.joaocarloslima.App;

import javafx.scene.image.ImageView;
import java.util.Random;

public class Meteoro extends Asset {

    private int tamanho;
    private static final Random random = new Random();

    public Meteoro(int x, int y, int velocidade, Direcao direcao) {
        super(x, y, velocidade, direcao);

        this.tamanho = random.nextInt(8) + 1;

        String path = "images/meteoro/meteoro" + tamanho + ".png";
        ImageView imagem = new ImageView(App.class.getResource(path).toString());
        setImagem(imagem);
    }

    public int getPoder() {
        return tamanho;
    }

    public void tomarTiro(Tiro tiro) {
        this.tamanho -= tiro.getPoder();
    }

    @Override
    public void mover() {
        switch (getDirecao()) {
            case CIMA:
                setY(getY() - getVelocidade());
                break;
            case BAIXO:
                setY(getY() + getVelocidade());
                break;
            case ESQUERDA:
                setX(getX() - getVelocidade());
                break;
            case DIREITA:
                setX(getX() + getVelocidade());
                break;
        }
    }
}