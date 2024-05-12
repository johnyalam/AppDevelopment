package fi.dev.kotlinlibrary.basic.sealed.state

class UpdateUI {
    fun updateUI(state: UIState){
        when (state) {
            is UIState.Loading -> {}
            is UIState.Success -> {}
            is UIState.Error -> {}
        }
    }
}