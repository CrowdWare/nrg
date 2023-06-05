package at.crowdware.nrg.logic

import java.io.Serializable

data class Account(
    var publicKey: String = "",
    var privateKey: String = "",
    var isScooping: Boolean = false,
    var transactions: MutableList<Transaction> = mutableListOf<Transaction>(),
    var friends: MutableList<Friend> = mutableListOf<Friend>()
) : Serializable