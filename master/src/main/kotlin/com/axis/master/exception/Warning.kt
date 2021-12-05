package com.axis.master.exception

data class Warning (
    val msg: String?
): RuntimeException()