import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.request.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class JiraIntegrator {
    private var coroutineScope = CoroutineScope(Dispatchers.Main)

    fun createRequest() {
        coroutineScope.launch {
            val httpClient = HttpClient(CIO)
            val response = httpClient.get("https://www.mechta.kz/api/v1/header/cities")
            System.out.println("Response = ${response.status}")
            httpClient.close()
        }
    }

}