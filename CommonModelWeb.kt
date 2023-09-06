package company.tap.tapcardformkit.open.models

data class WebModel(
    var publicKey: String,
    var merchant: Merchant,
    var transaction: Transaction,
    var customer: Customer,
    var fields: FieldsWeb,
    var acceptance: AcceptanceWeb,
    var addons: addonsWeb,
    var interfaceWeb: interfaceWeb
)

data class Merchant(var id: String)
data class Transaction(var amount: String, var currency: CURRENCY = CURRENCY.SAR)

data class Customer(var id: String, var nameOnCard: String, var editable: Boolean)
data class AcceptanceWeb(
    var supportedBrands: MutableList<String>,
    var supportedCards: MutableList<String>
)

data class FieldsWeb(var cardHolder: Boolean)
data class addonsWeb(var loader: Boolean, var savedCard: Boolean)
data class interfaceWeb(
    var locale: LOCAL = LOCAL.EN,
    var theme: THEMEWEB = THEMEWEB.LIGHT,
    var edges: EDGES = EDGES.CURVED,
    var directions: DIRECTIONS = DIRECTIONS.LTR
)


enum class CURRENCY {
    SAR, KWD
}

enum class LOCAL {
    EN, AR
}

enum class THEMEWEB {
    LIGHT, DARK
}

enum class EDGES {
    CURVED, STRAIGHT
}

enum class DIRECTIONS {
    RTL, LTR
}

