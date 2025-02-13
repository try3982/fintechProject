package com.zerobase.domain.domain

import javax.persistence.*

@Entity
@Table(name = "LOAN_REVIEW")
class LoanReview (
    @Column(name ="user_key")
    val userKey: String,

    @Column(name ="loan_lmt_amt")
    val loanLimitedAmount: Long,

    @Column(name = "loan_intrt")
    val loanIntrt: Double
) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}