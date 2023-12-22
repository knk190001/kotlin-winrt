package Windows.Security.Authentication.Identity.Provider

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(SecondaryAuthenticationFactorAuthenticationMessage.ABI::class)
@Signature("enum(Windows.Security.Authentication.Identity.Provider.SecondaryAuthenticationFactorAuthenticationMessage;i4)")
@WinRTByReference(brClass = SecondaryAuthenticationFactorAuthenticationMessage.ByReference::class)
public enum class SecondaryAuthenticationFactorAuthenticationMessage(
  public val value: Int
) : NativeMapped {
  Invalid(0),
  SwipeUpWelcome(1),
  TapWelcome(2),
  DeviceNeedsAttention(3),
  LookingForDevice(4),
  LookingForDevicePluggedin(5),
  BluetoothIsDisabled(6),
  NfcIsDisabled(7),
  WiFiIsDisabled(8),
  ExtraTapIsRequired(9),
  DisabledByPolicy(10),
  TapOnDeviceRequired(11),
  HoldFinger(12),
  ScanFinger(13),
  UnauthorizedUser(14),
  ReregisterRequired(15),
  TryAgain(16),
  SayPassphrase(17),
  ReadyToSignIn(18),
  UseAnotherSignInOption(19),
  ConnectionRequired(20),
  TimeLimitExceeded(21),
  CanceledByUser(22),
  CenterHand(23),
  MoveHandCloser(24),
  MoveHandFarther(25),
  PlaceHandAbove(26),
  RecognitionFailed(27),
  DeviceUnavailable(28),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SecondaryAuthenticationFactorAuthenticationMessage {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Invalid
      1 -> SwipeUpWelcome
      2 -> TapWelcome
      3 -> DeviceNeedsAttention
      4 -> LookingForDevice
      5 -> LookingForDevicePluggedin
      6 -> BluetoothIsDisabled
      7 -> NfcIsDisabled
      8 -> WiFiIsDisabled
      9 -> ExtraTapIsRequired
      10 -> DisabledByPolicy
      11 -> TapOnDeviceRequired
      12 -> HoldFinger
      13 -> ScanFinger
      14 -> UnauthorizedUser
      15 -> ReregisterRequired
      16 -> TryAgain
      17 -> SayPassphrase
      18 -> ReadyToSignIn
      19 -> UseAnotherSignInOption
      20 -> ConnectionRequired
      21 -> TimeLimitExceeded
      22 -> CanceledByUser
      23 -> CenterHand
      24 -> MoveHandCloser
      25 -> MoveHandFarther
      26 -> PlaceHandAbove
      27 -> RecognitionFailed
      28 -> DeviceUnavailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SecondaryAuthenticationFactorAuthenticationMessage> {
    public fun setValue(newValue: SecondaryAuthenticationFactorAuthenticationMessage): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SecondaryAuthenticationFactorAuthenticationMessage =
        SecondaryAuthenticationFactorAuthenticationMessage.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<SecondaryAuthenticationFactorAuthenticationMessage, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SecondaryAuthenticationFactorAuthenticationMessage =
        SecondaryAuthenticationFactorAuthenticationMessage.values()[0].fromNative(value, null)

    public override fun toNative(obj: SecondaryAuthenticationFactorAuthenticationMessage): Int =
        obj.value
  }
}
