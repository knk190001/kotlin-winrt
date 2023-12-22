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

@ABIMarker(NDCertificatePlatformID.ABI::class)
@Signature("enum(Windows.Media.Protection.PlayReady.NDCertificatePlatformID;i4)")
@WinRTByReference(brClass = NDCertificatePlatformID.ByReference::class)
public enum class NDCertificatePlatformID(
  public val value: Int
) : NativeMapped {
  Windows(0),
  OSX(1),
  WindowsOnARM(2),
  WindowsMobile7(5),
  iOSOnARM(6),
  XBoxOnPPC(7),
  WindowsPhone8OnARM(8),
  WindowsPhone8OnX86(9),
  XboxOne(10),
  AndroidOnARM(11),
  WindowsPhone81OnARM(12),
  WindowsPhone81OnX86(13),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      NDCertificatePlatformID {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Windows
      1 -> OSX
      2 -> WindowsOnARM
      5 -> WindowsMobile7
      6 -> iOSOnARM
      7 -> XBoxOnPPC
      8 -> WindowsPhone8OnARM
      9 -> WindowsPhone8OnX86
      10 -> XboxOne
      11 -> AndroidOnARM
      12 -> WindowsPhone81OnARM
      13 -> WindowsPhone81OnX86
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<NDCertificatePlatformID> {
    public fun setValue(newValue: NDCertificatePlatformID): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): NDCertificatePlatformID =
        NDCertificatePlatformID.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<NDCertificatePlatformID, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): NDCertificatePlatformID =
        NDCertificatePlatformID.values()[0].fromNative(value, null)

    public override fun toNative(obj: NDCertificatePlatformID): Int = obj.value
  }
}
