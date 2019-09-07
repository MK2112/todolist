package com.mk2112.businesslogic

import com.mk2112.view.viewcontroller.ViewControllerImpl

class MainControllerImpl: MainController {
    private val viewController = ViewControllerImpl()

    override fun run() {
        viewController.showHome()

        // look if file exists
        // if so, read it
        // if not, create it
    }
}