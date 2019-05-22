package com.template.flows

import co.paralleluniverse.fibers.Suspendable
import groovy.transform.Immutable
import net.corda.core.flows.FlowException
import net.corda.core.flows.FlowLogic
import net.corda.core.flows.InitiatingFlow
import net.corda.core.flows.StartableByRPC
import net.corda.core.utilities.ProgressTracker

// ******************
// * Initiator flow *
// ******************
@Immutable(knownImmutableClasses=[ProgressTracker])
@InitiatingFlow
@StartableByRPC
class Initiator extends FlowLogic<Void> {
    private  ProgressTracker progressTracker = new ProgressTracker()

    @Override
    ProgressTracker getProgressTracker() {
        return progressTracker
    }

    @Suspendable
    @Override
    Void call() throws FlowException {
        // Initiator flow logic goes here.

        return null
    }
}
