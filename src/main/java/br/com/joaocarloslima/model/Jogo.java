
package br.com.joaocarloslima.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jogo {

    public List<Asset> assets = new ArrayList<Asset>();
    public Nave nave = new Nave(280, 400, 10, Direcao.DIREITA);

    private int pontos = 0;
    private int nivel = 1;

    public Tiro atirar() {
        Tiro tiro = nave.atirar(nivel);
        assets.add(tiro);
        return tiro;
    }

    public Meteoro criarMeteoro() {
        Random random = new Random();
        int x = random.nextInt(640);
        Meteoro meteoro = new Meteoro(x, 0, 2 + nivel, Direcao.BAIXO);
        assets.add(meteoro);
        return meteoro;
    }

    public Meteoro meteoro(){
        return null;
    };

    public void pontuar() {
        pontos++;
        if (pontos % 10 == 0 && nivel < 4) {
            nivel++;
        }
    }

    public int getPontos() {
        return pontos;
    }

    public int getNivel() {
        return nivel;
    }
}
