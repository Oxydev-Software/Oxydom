package application.addingclient

import dagger.Component

@Component
interface AddingClientApplication {
    fun performBusinessProcess(command : AddingClientCommand)
}