package demo.nativeauth0

import vision.id.auth0reactnative.facade.reactNativeAuth0.reactNativeAuth0Strings
import org.scalatest.funsuite.AnyFunSuite

class Auth0ComponentTest extends AnyFunSuite {
  test("Auth0 String") {
    assert(reactNativeAuth0Strings.Bearer === "Bearer")
  }

}
