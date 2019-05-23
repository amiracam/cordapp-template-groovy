package com.template.contracts

import groovy.transform.Immutable
import net.corda.core.contracts.CommandData
import net.corda.core.contracts.Contract
import net.corda.core.transactions.LedgerTransaction

// ************
// * Contract *
// ************
@Immutable
class TemplateContract implements Contract {
    // This is used to identify our contract when building a transaction.
    static String ID = "com.template.com.template.contracts.TemplateContract"

    // A transaction is valid if the verify() function of the contract of all the transaction's input and output states
    // does not throw an exception.
    @Override
    void verify(LedgerTransaction tx) {}

    // Used to indicate the transaction's intent.
    interface Commands extends CommandData {
        class Action implements Commands {}
    }
}