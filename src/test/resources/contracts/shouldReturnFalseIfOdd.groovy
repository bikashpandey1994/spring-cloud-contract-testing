import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return false for odd"
    request{
        method GET()
        url("/check-if-even") {
            queryParameters {
                parameter("number", "5")
            }
        }
    }
    response {
        body("false")
        status 200
    }
}