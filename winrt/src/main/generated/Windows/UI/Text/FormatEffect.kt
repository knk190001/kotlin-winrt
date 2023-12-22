package Windows.UI.Text

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

@ABIMarker(FormatEffect.ABI::class)
@Signature("enum(Windows.UI.Text.FormatEffect;i4)")
@WinRTByReference(brClass = FormatEffect.ByReference::class)
public enum class FormatEffect(
  public val value: Int
) : NativeMapped {
  Off(0),
  On(1),
  Toggle(2),
  Undefined(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FormatEffect {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Off
      1 -> On
      2 -> Toggle
      3 -> Undefined
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FormatEffect> {
    public fun setValue(newValue: FormatEffect): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FormatEffect =
        FormatEffect.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FormatEffect, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FormatEffect =
        FormatEffect.values()[0].fromNative(value, null)

    public override fun toNative(obj: FormatEffect): Int = obj.value
  }
}
