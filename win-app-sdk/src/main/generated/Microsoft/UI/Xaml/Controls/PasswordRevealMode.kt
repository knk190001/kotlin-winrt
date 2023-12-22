package Microsoft.UI.Xaml.Controls

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

@ABIMarker(PasswordRevealMode.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.PasswordRevealMode;i4)")
@WinRTByReference(brClass = PasswordRevealMode.ByReference::class)
public enum class PasswordRevealMode(
  public val value: Int
) : NativeMapped {
  Peek(0),
  Hidden(1),
  Visible(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PasswordRevealMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Peek
      1 -> Hidden
      2 -> Visible
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PasswordRevealMode> {
    public fun setValue(newValue: PasswordRevealMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PasswordRevealMode =
        PasswordRevealMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PasswordRevealMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PasswordRevealMode =
        PasswordRevealMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: PasswordRevealMode): Int = obj.value
  }
}
