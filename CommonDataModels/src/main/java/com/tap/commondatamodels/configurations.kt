import com.google.gson.annotations.SerializedName
import com.tap.commondatamodels.cardBrands.CardBrand
import com.tap.commondatamodels.currencies.GlobalCurrency

data class configurations(
    var publicKey: String?,
    var merchant: merchant?,
    var transaction: transaction?,
    var customer: customer?,
    var fields: fields?,
    var acceptance: acceptance?,
    var addons: addons?,
    @SerializedName("interface")
    var `interface`: `interface`?
)

data class merchant(var id: String)
data class transaction(var amount: String, var currency: GlobalCurrency = GlobalCurrency.SAR)

data class customer(
    var id: String,
    var nameOnCard: String = "",
    var editable: Boolean = false,
    var contact: contact,
    var name: name
)

data class acceptance(
    var supportedBrands: MutableList<CardBrand>,
    var supportedCards: MutableList<String>
)

data class fields(var cardHolder: Boolean)
data class addons(var loader: Boolean, var savedCard: Boolean, var displayPaymentBrands: Boolean)
data class `interface`(
    var locale: LOCAL = LOCAL.EN,
    var theme: THEMEWEB = THEMEWEB.LIGHT,
    var edges: EDGES = EDGES.CURVED,
    var directions: DIRECTIONS = DIRECTIONS.LTR
)

data class contact(var email: String, var phone: Phone)
data class Phone(var countryCode: String, var number: String)
data class name(var lang: LOCAL, var first: String, var last: String, var middle: String)


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

enum class CardType {
    CREDIT, DEBIT, ALL
}

