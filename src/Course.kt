import java.util.UUID
import java.util.UUID.randomUUID

open class Course (var name : String = "", var description : String = "",var id : Int? = 0){

    init {
        id = Integer.parseInt(randomUUID().toString())
    }



}