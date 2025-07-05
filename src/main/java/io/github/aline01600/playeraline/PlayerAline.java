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
        return Decision.COOPERATE;
    }

}
