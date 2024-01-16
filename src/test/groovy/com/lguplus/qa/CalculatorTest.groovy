package com.lguplus.qa

import spock.lang.Specification

class CalculatorTest extends Specification {
    def "Add"() {
        given:
        int a = 5
        int b = 7
        Calculator cal = new Calculator()

        when:
        int result = cal.add(a, b)

        then:
        result == 12
    }
}
