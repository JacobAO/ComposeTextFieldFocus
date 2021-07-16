# ComposeTextFieldFocus

This app demonstrates an issue with Jetpack Compose where if you use windowSoftInputMode=adjustResize, tapping on a TextField that would be covered by the keyboard appearing does not properly resize the screen and scroll the TextField into view. Instead the TextField is hidden by the keyboard and they keyboard will sometimes immediately close.

Using windowSoftInputMode=adjustPan (or leaving it unspecified which seems to use adjustPan behavior) will prevent the issue of the TextField being hidden by the keyboard but will not allow you to scroll through the entire content of the screen which seems to be the expected behavior for adjustPan
