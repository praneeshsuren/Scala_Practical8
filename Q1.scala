def encrypt(text: String, shift: Int): String = {
    text.map { char =>
      if (char.isLetter) {
        val offset = if (char.isUpper) 'A' else 'a'
        ((char - offset + shift) % 26 + offset).toChar
      } else {
        char
      }
    }
}

def decrypt(text: String, shift: Int): String = {
    encrypt(text, 26 - shift)
}

def cipher(text: String, shift: Int, operation: (String, Int) => String): String = {
    operation(text, shift)
}

@main def main1(): Unit = {
    val originalText = "Hello, World!"
    val shift = 1

    val encryptedText = cipher(originalText, shift, encrypt)
    println(s"Encrypted: $encryptedText")

    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted: $decryptedText")
}