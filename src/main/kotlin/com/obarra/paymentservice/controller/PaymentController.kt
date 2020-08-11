package com.obarra.paymentservice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class PaymentController {

    @GetMapping("/")
    fun findAll(@RequestParam(value = "type", defaultValue = "TC" ) name: String )= listOf(222, 404, 303)


    @GetMapping("/{id}")
    fun find(@PathVariable id: Long): Long {
        print(id)
        return 404
    }

}