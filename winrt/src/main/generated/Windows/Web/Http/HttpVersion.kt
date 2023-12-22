package Windows.Web.Http

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

@ABIMarker(HttpVersion.ABI::class)
@Signature("enum(Windows.Web.Http.HttpVersion;i4)")
@WinRTByReference(brClass = HttpVersion.ByReference::class)
public enum class HttpVersion(
  public val value: Int
) : NativeMapped {
  None(0),
  Http10(1),
  Http11(2),
  Http20(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HttpVersion {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Http10
      2 -> Http11
      3 -> Http20
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HttpVersion> {
    public fun setValue(newValue: HttpVersion): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HttpVersion =
        HttpVersion.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HttpVersion, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HttpVersion =
        HttpVersion.values()[0].fromNative(value, null)

    public override fun toNative(obj: HttpVersion): Int = obj.value
  }
}
