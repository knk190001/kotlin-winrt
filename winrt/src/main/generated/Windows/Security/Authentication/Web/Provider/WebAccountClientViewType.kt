package Windows.Security.Authentication.Web.Provider

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

@ABIMarker(WebAccountClientViewType.ABI::class)
@Signature("enum(Windows.Security.Authentication.Web.Provider.WebAccountClientViewType;i4)")
@WinRTByReference(brClass = WebAccountClientViewType.ByReference::class)
public enum class WebAccountClientViewType(
  public val value: Int
) : NativeMapped {
  IdOnly(0),
  IdAndProperties(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WebAccountClientViewType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> IdOnly
      1 -> IdAndProperties
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WebAccountClientViewType>
      {
    public fun setValue(newValue: WebAccountClientViewType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WebAccountClientViewType =
        WebAccountClientViewType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WebAccountClientViewType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WebAccountClientViewType =
        WebAccountClientViewType.values()[0].fromNative(value, null)

    public override fun toNative(obj: WebAccountClientViewType): Int = obj.value
  }
}
