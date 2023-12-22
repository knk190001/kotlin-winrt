package Microsoft.UI.Xaml.Input

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

@ABIMarker(KeyboardNavigationMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Input.KeyboardNavigationMode;i4)")
@WinRTByReference(brClass = KeyboardNavigationMode.ByReference::class)
public enum class KeyboardNavigationMode(
  public val value: Int
) : NativeMapped {
  Local(0),
  Cycle(1),
  Once(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      KeyboardNavigationMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Local
      1 -> Cycle
      2 -> Once
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<KeyboardNavigationMode> {
    public fun setValue(newValue: KeyboardNavigationMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): KeyboardNavigationMode =
        KeyboardNavigationMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<KeyboardNavigationMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): KeyboardNavigationMode =
        KeyboardNavigationMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: KeyboardNavigationMode): Int = obj.value
  }
}
