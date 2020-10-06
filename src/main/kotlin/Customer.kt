open class Customer ( customerName: String,  customerPhone: String,  customerAddress: String,  squareFootage: Double) {
    var customerName: String = ""
    var customerPhone: String = ""
    var customerAddress: String = ""
    var squareFootage: Double = 0.00

    /**class Customer
     * @author Sarah Kazmierczak
     * date 10/05/2020
     * @param
     * customerName: describes the person's name
     * customerPhone: describes the person's phone number
     * customerAddress: describes the person's address
     * squareFootage: describes the square feet of the building
     */
    init {
        this.customerName = customerName
        this.customerPhone= customerPhone
        this.customerAddress = customerAddress
        this.squareFootage = squareFootage
    }
    fun printAll(){
        println("$customerName, $customerAddress, $customerPhone, $squareFootage")
    }
}