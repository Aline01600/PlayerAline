/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package io.github.aline01600.playeraline;

import io.github.guisso.meleeinterface.Decision;
import io.github.guisso.meleeinterface.IPlayer;

/**
 *
 * @author aline
 */
public class PlayerAline 
        implements IPlayer{
        boolean traicao = false;
        int punicao = 2;
        int punicaoAtual = 0;
        boolean emPunicao = false;
    @Override
    public String getDeveloperName() {
        return "Aline";
    }

    @Override
    public String getEngineName() {
        return "punitivo";
    }

    @Override
    public Decision makeMyMove(Decision opponentPreviousMove) {
        
        if (emPunicao) {
            punicaoAtual--;
            if (punicaoAtual == 0) {
                emPunicao = false;
            }
            return Decision.DEFECT;
        }

        if (opponentPreviousMove == Decision.DEFECT && !emPunicao){
            emPunicao = true;
            punicaoAtual = punicao;
            punicao *= 2;
            return Decision.DEFECT;
        }
        return Decision.COOPERATE;
    }

}
