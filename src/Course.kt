import java.util.UUID
import java.util.UUID.randomUUID

open class Course (var name : String = "", var description : String = "",var id : String? = ""){

    init {
        id = randomUUID().toString()
    }



}