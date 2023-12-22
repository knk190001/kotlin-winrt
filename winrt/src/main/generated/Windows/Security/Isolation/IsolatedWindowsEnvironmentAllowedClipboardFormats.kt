package Windows.Security.Isolation

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

@ABIMarker(IsolatedWindowsEnvironmentAllowedClipboardFormats.ABI::class)
@Signature("enum(Windows.Security.Isolation.IsolatedWindowsEnvironmentAllowedClipboardFormats;u4)")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentAllowedClipboardFormats.ByReference::class)
public enum class IsolatedWindowsEnvironmentAllowedClipboardFormats(
  public val value: Int
) : NativeMapped {
  None(0),
  Text(1),
  Image(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IsolatedWindowsEnvironmentAllowedClipboardFormats {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Text
      2 -> Image
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<IsolatedWindowsEnvironmentAllowedClipboardFormats> {
    public fun setValue(newValue: IsolatedWindowsEnvironmentAllowedClipboardFormats): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IsolatedWindowsEnvironmentAllowedClipboardFormats =
        IsolatedWindowsEnvironmentAllowedClipboardFormats.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentAllowedClipboardFormats, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IsolatedWindowsEnvironmentAllowedClipboardFormats =
        IsolatedWindowsEnvironmentAllowedClipboardFormats.values()[0].fromNative(value, null)

    public override fun toNative(obj: IsolatedWindowsEnvironmentAllowedClipboardFormats): Int =
        obj.value
  }
}
