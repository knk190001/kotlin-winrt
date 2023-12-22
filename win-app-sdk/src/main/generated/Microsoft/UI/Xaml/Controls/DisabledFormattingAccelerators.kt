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

@ABIMarker(DisabledFormattingAccelerators.ABI::class)
@Signature("enum(Microsoft.UI.Xaml.Controls.DisabledFormattingAccelerators;u4)")
@WinRTByReference(brClass = DisabledFormattingAccelerators.ByReference::class)
public enum class DisabledFormattingAccelerators(
  public val value: Int
) : NativeMapped {
  None(0),
  Bold(1),
  Italic(2),
  Underline(4),
  All(-1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DisabledFormattingAccelerators {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Bold
      2 -> Italic
      4 -> Underline
      -1 -> All
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<DisabledFormattingAccelerators> {
    public fun setValue(newValue: DisabledFormattingAccelerators): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DisabledFormattingAccelerators =
        DisabledFormattingAccelerators.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DisabledFormattingAccelerators, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DisabledFormattingAccelerators =
        DisabledFormattingAccelerators.values()[0].fromNative(value, null)

    public override fun toNative(obj: DisabledFormattingAccelerators): Int = obj.value
  }
}
