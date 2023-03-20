package com.wookey.project.commons.exception

interface CustomException

class BadRequestException(msg: String) : RuntimeException(msg), CustomException

class ClientException(msg: String) : RuntimeException(msg), CustomException
