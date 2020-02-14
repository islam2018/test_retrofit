import android.util.Log
import com.example.myparking.models.Parking
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object DataSource {
    var service: ParkingService

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://myparking-backend.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        service = retrofit.create(ParkingService::class.java)
    }

    // I passed the listener cuz it's an ASYNCHRONOUS CALL
    fun getParkings(listener: OnParkingListner) {
        service.findParkings().enqueue(object: Callback<List<Parking>> {
            override fun onFailure(call: Call<List<Parking>>, t: Throwable) {
                Log.d("ERROR", t.printStackTrace().toString())
            }

            override fun onResponse(call: Call<List<Parking>>, response: Response<List<Parking>>) {
                val list = ArrayList(response.body()!!)
                listener.onParkingsReceived(list)
            }

        })
    }
}
interface OnParkingListner {
    fun onParkingsReceived(parkings: ArrayList<Parking>)
}