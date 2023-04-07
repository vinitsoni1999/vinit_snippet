//Check if an internet connection is available
fun isNetworkAvailable(context: Context): Boolean {
    val connectivityManager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val networkInfo = connectivityManager.activeNetworkInfo
    return networkInfo != null && networkInfo.isConnected
}

fun showNetworkUnavailableDialog(context: Context) {
    AlertDialog.Builder(context)
        .setTitle("Network Unavailable")
        .setMessage("Please check your internet connection and try again.")
        .setPositiveButton("OK", null)
        .show()
}

//To use this function in your own code, you would simply need to call it and pass in a Context object as an argument. For example
if (isNetworkAvailable(this)) {
    // Do something that requires network connectivity
} else {
    // Show an error message or handle the lack of connectivity in some other way
}
