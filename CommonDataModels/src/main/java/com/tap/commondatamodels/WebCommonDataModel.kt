import com.tap.commondatamodels.cardBrands.CardBrand

data class WebCommonDataModel(
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

data class Customer(
    var id: String,
    var nameOnCard: String = "",
    var editable: Boolean = false,
    var contact: Contact,
    var name: Name
)

data class AcceptanceWeb(
    var supportedBrands: MutableList<CardBrand>,
    var supportedCards: MutableList<String>
)

data class FieldsWeb(var cardHolder: Boolean)
data class addonsWeb(var loader: Boolean, var savedCard: Boolean, var displayPaymentBrands: Boolean)
data class interfaceWeb(
    var locale: LOCAL = LOCAL.EN,
    var theme: THEMEWEB = THEMEWEB.LIGHT,
    var edges: EDGES = EDGES.CURVED,
    var directions: DIRECTIONS = DIRECTIONS.LTR
)

data class Contact(var email: String, var phone: Phone)
data class Phone(var countryCode: String, var number: String)
data class Name(var lang: LOCAL, var first: String, var last: String, var middle: String)


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

