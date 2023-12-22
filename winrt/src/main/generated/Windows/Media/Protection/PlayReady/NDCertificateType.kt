package Windows.Media.Protection.PlayReady

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

@ABIMarker(NDCertificateType.ABI::class)
@Signature("enum(Windows.Media.Protection.PlayReady.NDCertificateType;i4)")
@WinRTByReference(brClass = NDCertificateType.ByReference::class)
public enum class NDCertificateType(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  PC(1),
  Device(2),
  Domain(3),
  Issuer(4),
  CrlSigner(5),
  Service(6),
  Silverlight(7),
  Application(8),
  Metering(9),
  KeyFileSigner(10),
  Server(11),
  LicenseSigner(12),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NDCertificateType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> PC
      2 -> Device
      3 -> Domain
      4 -> Issuer
      5 -> CrlSigner
      6 -> Service
      7 -> Silverlight
      8 -> Application
      9 -> Metering
      10 -> KeyFileSigner
      11 -> Server
      12 -> LicenseSigner
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NDCertificateType> {
    public fun setValue(newValue: NDCertificateType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NDCertificateType =
        NDCertificateType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NDCertificateType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NDCertificateType =
        NDCertificateType.values()[0].fromNative(value, null)

    public override fun toNative(obj: NDCertificateType): Int = obj.value
  }
}
