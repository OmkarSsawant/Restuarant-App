package com.visiondev.ccthrusdaytrivia4

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.visiondev.ccthrusdaytrivia4.data.rest.FiltersItem
import com.visiondev.ccthrusdaytrivia4.data.rest.RequestParams
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*
import kotlinx.coroutines.runBlocking

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing ).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.visiondev.ccthrusdaytrivia4", appContext.packageName)
    }

    @Test
    fun listRestaurants(){
        val client = HttpClient(Android){
            install(ContentNegotiation){
                json()
            }

        }

        runBlocking {
            val response = client.post("https://travel-advisor.p.rapidapi.com/locations/v2/list-nearby") {
                contentType(ContentType.Application.Json)
                headers {
                    append("X-RapidAPI-Key",Configs.RAPID_API_KEY)
                    append("X-RapidAPI-Host",Configs.RAPID_HOST)
                }
                parameter("currency","USD")
                parameter("units","km")
                parameter("lang","en_US")

                setBody(RequestParams(contentType = "restaurant", filters = listOf(FiltersItem("placetype", value = listOf("restaurant")))))
            }

            println(    response
                .call.response.toString())

            assert(response.status == HttpStatusCode.Accepted)

        }

    }
}