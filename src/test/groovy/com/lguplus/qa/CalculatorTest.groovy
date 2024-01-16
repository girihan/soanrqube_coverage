package com.lguplus.qa

import spock.lang.Specification

class CalculatorTest extends Specification {
    def "Add"() {
        given:
        Calculator cal = new Calculator()

        when:
        int result = cal.add(a, b)

        then:
        result == 12

        where:
        a | b
        5 | 7
    }
}
