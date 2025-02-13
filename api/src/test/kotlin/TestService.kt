import com.zerobase.domain.domain.UserInfo
import com.zerobase.domain.repository.UserInfoRepository
import org.springframework.stereotype.Service
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor.UserDataKey

@Service
class TestService (
    private val userInfoRepository : UserInfoRepository
) {
    fun testGetService(userKey: String) = userInfoRepository.findByUserKey(userKey).toDto()
    fun UserInfo.todto() = TestDto.UserInfoDto(userKey, userRegisterationNumber, userName, userIncomeAmount)

}
