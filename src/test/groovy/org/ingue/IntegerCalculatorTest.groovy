package org.ingue

import org.ingue.Calculator
import org.ingue.exception.ZeroDivException
import spock.lang.Specification

class IntegerCalculatorTest extends Specification {

    def calculator

    def setup() {
        calculator = new Calculator();
    }

    def "5 + 10 = 15"() {
        given:
        def first = 5
        def second = 10

        when:
        def result = calculator.add(first, second)

        then:
        result == 15
    }

    def "5 - 10 = -5"() {
        given:
        def first = 5
        def second = 10

        when:
        def result = calculator.sub(first, second)

        then:
        result == -5
    }

    def "5 * 10 = 50"() {
        given:
        def first = 5
        def second = 10

        when:
        def result = calculator.mul(first, second)

        then:
        result == 50
    }

    def "0으로 나누면 ZeroDivException 발생"() {
        given:
        def first = 5
        def second = 0

        when:
        calculator.div(first, second)

        then:
        thrown(ZeroDivException.class)
    }
}
