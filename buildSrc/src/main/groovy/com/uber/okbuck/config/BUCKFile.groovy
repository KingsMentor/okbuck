package com.uber.okbuck.config

import com.uber.okbuck.rule.base.BuckRule

final class BUCKFile extends BuckConfigFile {

    private final List<BuckRule> mRules

    BUCKFile(List<BuckRule> rules) {
        mRules = rules
    }

    @Override
    final void print(PrintStream printer) {
        mRules.each { rule ->
            rule.print(printer)
        }
    }
}
