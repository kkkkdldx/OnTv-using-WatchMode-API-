
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {
    //@GET("regions/?apiKey=tLJlKtXy2JBWzDRbaAPbZoQdxx2tbOxU2ZsJi87F")
    //fun getCountry (): retrofit2.Call<List<CountryHandler>>

    @GET("genres/?apiKey=LGNYkcxKEO9wRq1QwYRVnLalOLcl9ztAp5W9geYt")
    fun getGenre (): retrofit2.Call<List<GenreHandler>>

    @GET("list-titles/?apiKey=LGNYkcxKEO9wRq1QwYRVnLalOLcl9ztAp5W9geYt")//&genres= 32
    fun getTitles (@Query("genres") genre: String): retrofit2.Call<ListTitlesHandler>
}