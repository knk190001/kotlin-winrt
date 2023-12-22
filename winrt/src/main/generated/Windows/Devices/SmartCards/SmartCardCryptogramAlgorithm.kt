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

@ABIMarker(SmartCardCryptogramAlgorithm.ABI::class)
@Signature("enum(Windows.Devices.SmartCards.SmartCardCryptogramAlgorithm;i4)")
@WinRTByReference(brClass = SmartCardCryptogramAlgorithm.ByReference::class)
public enum class SmartCardCryptogramAlgorithm(
  public val value: Int
) : NativeMapped {
  None(0),
  CbcMac(1),
  Cvc3Umd(2),
  DecimalizedMsd(3),
  Cvc3MD(4),
  Sha1(5),
  SignedDynamicApplicationData(6),
  RsaPkcs1(7),
  Sha256Hmac(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmartCardCryptogramAlgorithm {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> CbcMac
      2 -> Cvc3Umd
      3 -> DecimalizedMsd
      4 -> Cvc3MD
      5 -> Sha1
      6 -> SignedDynamicApplicationData
      7 -> RsaPkcs1
      8 -> Sha256Hmac
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SmartCardCryptogramAlgorithm> {
    public fun setValue(newValue: SmartCardCryptogramAlgorithm): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmartCardCryptogramAlgorithm =
        SmartCardCryptogramAlgorithm.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmartCardCryptogramAlgorithm, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmartCardCryptogramAlgorithm =
        SmartCardCryptogramAlgorithm.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmartCardCryptogramAlgorithm): Int = obj.value
  }
}
