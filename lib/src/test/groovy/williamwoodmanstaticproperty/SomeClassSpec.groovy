package williamwoodmanstaticproperty

import spock.lang.Specification

class SomeClassSpec extends Specification {
    def "test dynamic static method"() {
        expect:
        SomeClass.magicNumber == 42
    }
}
