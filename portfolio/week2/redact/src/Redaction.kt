// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(input: String, profanity: String, grawlix: Char = 'X'): String {
    val censor = buildString { 
        for (n in 1..profanity.length) {
            append(grawlix)
        }
    }
    return input.replace(profanity, censor)
}