package Windows.Security.Credentials

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

@ABIMarker(WebAccountPictureSize.ABI::class)
@Signature("enum(Windows.Security.Credentials.WebAccountPictureSize;i4)")
@WinRTByReference(brClass = WebAccountPictureSize.ByReference::class)
public enum class WebAccountPictureSize(
  public val value: Int
) : NativeMapped {
  Size64x64(64),
  Size208x208(208),
  Size424x424(424),
  Size1080x1080(1080),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WebAccountPictureSize {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      64 -> Size64x64
      208 -> Size208x208
      424 -> Size424x424
      1080 -> Size1080x1080
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WebAccountPictureSize> {
    public fun setValue(newValue: WebAccountPictureSize): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WebAccountPictureSize =
        WebAccountPictureSize.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WebAccountPictureSize, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WebAccountPictureSize =
        WebAccountPictureSize.values()[0].fromNative(value, null)

    public override fun toNative(obj: WebAccountPictureSize): Int = obj.value
  }
}
