package br.com.frankenstein.frankensteinms

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FrankensteinMsApplication

fun main(args: Array<String>) {
    runApplication<FrankensteinMsApplication>(*args)
}
