import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return welcome string"
    request{
        method GET()
        url("/home") {
        }
    }
    response {
        body("Welcome to Home")
        status 200
    }
}