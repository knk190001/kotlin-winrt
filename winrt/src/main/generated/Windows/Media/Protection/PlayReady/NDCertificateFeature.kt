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

@ABIMarker(NDCertificateFeature.ABI::class)
@Signature("enum(Windows.Media.Protection.PlayReady.NDCertificateFeature;i4)")
@WinRTByReference(brClass = NDCertificateFeature.ByReference::class)
public enum class NDCertificateFeature(
  public val value: Int
) : NativeMapped {
  Transmitter(1),
  Receiver(2),
  SharedCertificate(3),
  SecureClock(4),
  AntiRollBackClock(5),
  CRLS(9),
  PlayReady3Features(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NDCertificateFeature {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> Transmitter
      2 -> Receiver
      3 -> SharedCertificate
      4 -> SecureClock
      5 -> AntiRollBackClock
      9 -> CRLS
      13 -> PlayReady3Features
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NDCertificateFeature> {
    public fun setValue(newValue: NDCertificateFeature): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NDCertificateFeature =
        NDCertificateFeature.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NDCertificateFeature, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NDCertificateFeature =
        NDCertificateFeature.values()[0].fromNative(value, null)

    public override fun toNative(obj: NDCertificateFeature): Int = obj.value
  }
}
