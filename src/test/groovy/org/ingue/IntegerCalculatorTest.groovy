package org.ingue

import org.ingue.Calculator
import org.ingue.exception.ZeroDivException
import spock.lang.Specification

class IntegerCalculatorTest extends Specification {

    def calculator
    def first
    def second

    def setup() {
        calculator = new Calculator()
        first = 5
        second = 10
    }

    def "5 + 10 = 15"() {
        when:
        def result = calculator.add(first, second)

        then:
        result == 15
    }

    def "5 - 10 = -5"() {
        when:
        def result = calculator.sub(first, second)

        then:
        result == -5
    }

    def "5 * 10 = 50"() {
        when:
        def result = calculator.mul(first, second)

        then:
        result == 50
    }

    def "5 / 10 = 0.5"() {
        when:
        def result = calculator.div(first, second)

        then:
        result == 0.5
    }

    def "0으로 나누면 ZeroDivException 발생"() {
        given:
        def zero = 0

        when:
        calculator.div(first, zero)

        then:
        thrown(ZeroDivException.class)
    }
}
