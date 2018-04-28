package application.addingclient

interface AddingClientApplication {
    fun performBusinessProcess(command : AddingClientCommand)
}