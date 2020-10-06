fun main(){
    println("Please enter customer information.")
    val customer1 = Customer("Sarah Kazmierczak", "815-236-7335", "1378 Westport Ridge", 2400.0)
    println("Please indicate whether customer is residential or commercial and enter appropriate info.")
    val rescustomer1 = Residential(6, false, "Sarah Kazmierczak", "815,236-7335", "1378 Westport Ridge", 2400.0)
    val customer2 = Customer("Yoshida Kuno", "953-216-7456", "1093 Oak Avenue", 5900.0)
    val comcustomer2 = Commercial("Midnight Sun Industries", 1, 5, "Yoshida Kuno", "953-216-7456", "1093 Oak Avenue", 5900.0)

    customer1.printAll()
    rescustomer1.multiply()
    customer2.printAll()
    comcustomer2.calculate()
}
