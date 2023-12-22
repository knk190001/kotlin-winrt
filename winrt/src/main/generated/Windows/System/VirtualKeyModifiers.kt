package Windows.System

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

@ABIMarker(VirtualKeyModifiers.ABI::class)
@Signature("enum(Windows.System.VirtualKeyModifiers;u4)")
@WinRTByReference(brClass = VirtualKeyModifiers.ByReference::class)
public enum class VirtualKeyModifiers(
  public val value: Int
) : NativeMapped {
  None(0),
  Control(1),
  Menu(2),
  Shift(4),
  Windows(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VirtualKeyModifiers {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Control
      2 -> Menu
      4 -> Shift
      8 -> Windows
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VirtualKeyModifiers> {
    public fun setValue(newValue: VirtualKeyModifiers): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VirtualKeyModifiers =
        VirtualKeyModifiers.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VirtualKeyModifiers, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VirtualKeyModifiers =
        VirtualKeyModifiers.values()[0].fromNative(value, null)

    public override fun toNative(obj: VirtualKeyModifiers): Int = obj.value
  }
}
