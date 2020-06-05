package com.binar.gamesuit.view

import com.binar.gamesuit.model.Result

interface SuitCallback {

    fun userInput()
    fun exitGame()
    fun showResult(result: Result)
    fun showWrongInput(wrongValue: String)
    fun showComputerChoice(result: String)
}