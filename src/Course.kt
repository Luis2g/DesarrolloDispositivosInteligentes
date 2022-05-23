import java.util.UUID
import java.util.UUID.randomUUID

open class Course (var id : Int? = 0, var name : String = "", var description : String = ""){

    init {
        id = Integer.parseInt(randomUUID().toString())
    }



}