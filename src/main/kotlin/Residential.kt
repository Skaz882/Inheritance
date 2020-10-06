class Residential (constantRate: Int, seniorField: Boolean, customerName: String, customerPhone: String, customerAddress: String, squareFootage: Double):
    Customer(customerName, customerPhone, customerAddress, squareFootage){
    private var constantRate: Int = 0
    private var seniorField: Boolean

    /**class Residential
     * @author Sarah Kazmierczak
     * date 10/05/2020
     * @param
     * constantRate: describes the building cost
     * seniorField: describes the person's age
     */
    init {
        this.constantRate = constantRate
        this.seniorField = seniorField
    }

    fun multiply(){
        val thisweeklyRate = constantRate * squareFootage
        if (seniorField == true)
            thisweeklyRate * .15
        println("$customerName, $customerAddress, $thisweeklyRate")
    }

}