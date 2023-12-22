package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardCryptographicKeyAttestationStatus.ABI::class)
@Signature("enum(Windows.Devices.SmartCards.SmartCardCryptographicKeyAttestationStatus;i4)")
@WinRTByReference(brClass = SmartCardCryptographicKeyAttestationStatus.ByReference::class)
public enum class SmartCardCryptographicKeyAttestationStatus(
  public val value: Int
) : NativeMapped {
  NoAttestation(0),
  SoftwareKeyWithoutTpm(1),
  SoftwareKeyWithTpm(2),
  TpmKeyUnknownAttestationStatus(3),
  TpmKeyWithoutAttestationCapability(4),
  TpmKeyWithTemporaryAttestationFailure(5),
  TpmKeyWithLongTermAttestationFailure(6),
  TpmKeyWithAttestation(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmartCardCryptographicKeyAttestationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NoAttestation
      1 -> SoftwareKeyWithoutTpm
      2 -> SoftwareKeyWithTpm
      3 -> TpmKeyUnknownAttestationStatus
      4 -> TpmKeyWithoutAttestationCapability
      5 -> TpmKeyWithTemporaryAttestationFailure
      6 -> TpmKeyWithLongTermAttestationFailure
      7 -> TpmKeyWithAttestation
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SmartCardCryptographicKeyAttestationStatus> {
    public fun setValue(newValue: SmartCardCryptographicKeyAttestationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmartCardCryptographicKeyAttestationStatus =
        SmartCardCryptographicKeyAttestationStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<SmartCardCryptographicKeyAttestationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmartCardCryptographicKeyAttestationStatus =
        SmartCardCryptographicKeyAttestationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmartCardCryptographicKeyAttestationStatus): Int = obj.value
  }
}
