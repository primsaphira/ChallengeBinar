package com.binar.gamesuit.view

import com.binar.gamesuit.controller.SuitController
import com.binar.gamesuit.model.Result

class MainView : SuitCallback {

    private var controller: SuitController = SuitController(this)

    init {
        println(" Selamat datang di Permainan Batu Gunting Kertas ")
    }

    fun start() {

        println(" Tentukan pilihan anda sekarang ! ")
        println(" 1. Batu ")
        println(" 2. Gunting ")
        println(" 3. Kertas ")
        println(" 0. Keluar")

        userInput()
    }

    override fun userInput() {
        var player = -1
        do {
            print("Masukkan pilihan Anda di sini: ")
            player = readLine().toString().toInt()
            if (player > 0 && player < 4) {
                controller.process(player)
            } else if (player != 0){
                showWrongInput(Result.WRONG_VALUE.resultValue)
            }
        }while (player != 0 )
        exitGame()
    }

    override fun showResult(result: Result) {
        println(result)
    }

    override fun showWrongInput(wrongValue: String) {
        println(wrongValue)
        println()
    }

    override fun showComputerChoice(result: String) {
        println("Pilihan pemain 2 [Computer] adalah : $result")
    }

    override fun showHumanChoice(player: String) {

        println("Pilihan pemain 1 [Anda] adalah : $player")
    }

    override fun exitGame() {
        println("Apakah anda ingin keluar dari permainan?")
        println("1. Ya ")
        println("2. Tidak")
        println("pilihan anda: ")
        val exit = readLine()?.toInt()
        when (exit) {
            1 -> println("SAMPAI JUMPA LAGI DI PERMAINAN BERIKUTNYA!")
            2 -> start()
            else -> {
                println("Pilihan salah, masukkan lagi pilihan anda ! ")
                exitGame()
            }
        }
    }
}


