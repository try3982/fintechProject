import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("fintech/api/v1")

class TestController {
    @GetMapping("/test/get")
    fun test() :TestDto {

    }
}