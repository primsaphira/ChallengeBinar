package com.binar.gamesuit.controller

import com.binar.gamesuit.service.SuitService
import com.binar.gamesuit.view.SuitCallback

class SuitController(val suitCallback: SuitCallback) {

    private val suitService = SuitService()

    fun process(player: Int) {
        var listrandom = (1..3).shuffled()
        var player2 = listrandom.last()
        suitCallback.showHumanChoice(suitService.gameSuit[player-1])
        suitCallback.showComputerChoice(suitService.gameSuit[player2-1])
        var result = suitService.calculateWinner(player-1, player2-1)
        suitCallback.showResult(result)
        suitCallback.exitGame()
    }

}




