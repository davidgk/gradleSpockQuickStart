import spock.lang.Specification

class CalculadoraTest extends Specification {


    def "Si sumamos 1 mas 2 es igual 3"() {
        given:
            def a = 1;
            def b = 2
        when:
            def result = new Calculadora().sumar(a, b)
        then:
            result == 3
    }
}
