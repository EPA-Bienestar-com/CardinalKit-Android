package edu.stanford.cardinalkit.domain.usecases.auth

import com.google.firebase.auth.AuthCredential
import edu.stanford.cardinalkit.domain.repositories.AuthRepository

class SignInWithGoogle(
    private val repository: AuthRepository
) {
    suspend operator fun invoke(
        googleCredential: AuthCredential
    ) = repository.firebaseSignInWithGoogle(googleCredential)
}
