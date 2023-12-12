import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return true for even"
    request{
        method GET()
        url("/check-if-even") {
            queryParameters {
                parameter("number", "2")
            }
        }
    }
    response {
        body("true")
        status 200
    }
}