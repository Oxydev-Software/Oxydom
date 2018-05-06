package fr.oxydom.application.addingclient

interface AddingClientApplication {
    fun performBusinessProcess(command : AddingClientCommand)
}