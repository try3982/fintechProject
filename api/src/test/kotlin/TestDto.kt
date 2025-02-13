import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties.Registration

class TestDto {
    data class UserInfoDto (
        val userKey : String,
        val userRegistrationNumber: String,
        val userName : String,
        val userIncomeAmount: Long
    )
}