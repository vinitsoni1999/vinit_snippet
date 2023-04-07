//Adding an OkHttpClient for custom network settings such as timeouts, interceptors, or caching
//Using Retrofit to make a network request and process the response
val client = OkHttpClient.Builder()
    .connectTimeout(30, TimeUnit.SECONDS)
    .readTimeout(30, TimeUnit.SECONDS)
    .addInterceptor(HttpLoggingInterceptor().apply {
        level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
    })
    .build()

val retrofit = Retrofit.Builder()
    .baseUrl("https://api.github.com/")
    .addConverterFactory(GsonConverterFactory.create())
    .client(client)
    .build()
    
//Adding query parameters to a GET request:
interface ApiService {
    @GET("users")
    suspend fun getUsers(@Query("since") since: Int): List<User>
}

val users = apiService.getUsers(since = 0)
