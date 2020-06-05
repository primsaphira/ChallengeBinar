package com.binar.gamesuit.controller

import com.binar.gamesuit.view.SuitCallback
import java.lang.Math.random

class SuitController(val suitCallback: SuitCallback) {

    private val suitService = SuitService()

    fun process(player: Int) {
        var player2 = (1..3).shuffled().first()

        // suitCallback.showResult(suitService.calculateWinner(player, player2.minus(1)))
        suitCallback.showComputerChoice(suitService.gameSuit[player2.minus(1)])
        // process(player)

        var result = suitService.calculateWinner(player.minus(1), player2.minus(1))
        suitCallback.showResult(result)
        suitCallback.exitGame()
    }


}




