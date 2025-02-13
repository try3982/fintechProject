package com.zerobase.domain.domain

import javax.persistence.*

@Entity
@Table(name = "USER_INFO")
class UserInfo(
    @Column(name = "user_key")
    val userKey: String,

    @Column(name = "user_reg_num")
    val userRegisterationNumber: String,

    @Column(name = "user_nm")
    val userName: String,

    @Column(name = "user_icm_amt")
    val userIncomeAmount: Long
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    val id: Long? = null
}
