package com.binar.gamesuit.view

import com.binar.gamesuit.controller.SuitController
import com.binar.gamesuit.model.Result

class MainView : SuitCallback {

    private var controller: SuitController = SuitController(this)

    init {
        println(" Selamat datang di Permainan Batu Gunting Kertas ")
    }

    fun start() {

        println(" Masukkan pilihan anda ! ")
        println(" 1. Batu ")
        println(" 2. Gunting ")
        println(" 3. Kertas ")

        userInput()

    }

    override fun userInput() {

        print("Masukkan pilihan Anda: ")
        val player = readLine().toString().toInt()
        controller.process(player)

    }

    override fun showResult(result: Result) {
        println(result)
    }

    override fun showWrongInput(wrongValue: String) {
        println(wrongValue)
        println()
    }

    override fun showComputerChoice(result: String) {
        println("pilihan computer : $result")
    }

    override fun exitGame() {
        println("Apakah anda ingin keluar dari permainan?")
        println("1. Ya ")
        println("2. Tidak")
        println("pilihan anda: ")
        val exit = readLine()?.toInt()
        if (exit == 1) {
            println("SAMPAI JUMPA LAGI DI PERMAINAN BERIKUTNYA")
        } else {
            start()
        }


    }

}