class Commercial (propertyName: String, propertyNumber: Int, commercialRate: Int, customerName: String, customerPhone: String, customerAddress: String, squareFootage: Double):
    Customer(customerName, customerPhone, customerAddress, squareFootage) {
    private var propertyName: String = ""
    private var propertyNumber: Int = 0
    private var commercialRate: Int = 0

    /**class Commercial
     * @author Sarah Kazmierczak
     * date 10/05/2020
     * @param
     * commercialRate: describes the building rate
     * propertyName: describes the building name
     * propertyNumber: describes the number of buildings
     */

    init {
        this.commercialRate = commercialRate
        this.propertyName = propertyName
        this.propertyNumber = propertyNumber

    }

    fun calculate(){
        val weeklyRate = commercialRate * squareFootage
        if (propertyNumber > 1)
            weeklyRate * .10
        println("$customerName, $propertyName, $weeklyRate")
    }
}
