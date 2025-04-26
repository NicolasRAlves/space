package br.com.joaocarloslima.model;

import br.com.joaocarloslima.App;
import javafx.scene.image.ImageView;

public class Tiro extends Asset {

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    private int poder;

    public Tiro (int poder, int x, int y, int velocidade, Direcao direcao){
        super(x, y, velocidade, direcao);
        this.poder = poder;

        String path = "images/laser/laser" + poder + ".png";
        ImageView imagem = new ImageView(App.class.getResource(path).toString());
        setImagem(imagem);
    }

}
