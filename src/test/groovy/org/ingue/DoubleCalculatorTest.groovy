package org.ingue

import org.ingue.Calculator
import spock.lang.Specification

class DoubleCalculatorTest extends Specification {

    def calculator
    def first
    def second

    def setup() {
        calculator = new Calculator()
        first = 5.0
        second = 10.5
    }

    def "5.0 + 10.5 = 15.5"() {
        when:
        def result = calculator.add(first, second)

        then:
        result == 15.5
    }

    def "5.0 - 10.5 = -5.5"() {
        when:
        def result = calculator.sub(first, second)

        then:
        result == -5.5
    }

    def "5.0 * 10.5 = 52.5"() {
        when:
        def result = calculator.mul(first, second)

        then:
        result == 52.5
    }
}
