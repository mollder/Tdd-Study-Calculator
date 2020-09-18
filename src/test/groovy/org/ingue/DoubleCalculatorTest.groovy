package org.ingue

import org.ingue.Calculator
import spock.lang.Specification

class DoubleCalculatorTest extends Specification {

    def calculator

    def setup() {
        calculator = new Calculator()
    }

    def "5.0 + 10.5 더하기는 15.5"() {
        given:
        def first = 5.0
        def second = 10.5

        when:
        def result = calculator.add(first, second)

        then:
        result == 15.5
    }

    def "5.0 + 10.5 뺄셈은 -5.5"() {
        given:
        def first = 5.0
        def second = 10.5

        when:
        def result = calculator.sub(first, second)

        then:
        result == -5.5
    }

    def "5.0 * 10.5 곱하기는 52.5"() {
        given:
        def fisrt = 5.0
        def second = 10.5

        when:
        def result = calculator.mul(fisrt, second)

        then:
        result == 52.5
    }

    def "5 / 10 = 0.5"() {
        given:
        def first = 5
        def second = 10

        when:
        def result = calculator.div(first, second)

        then:
        result == 0.5
    }
}
