package Windows.UI.Input.Preview.Injection

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

@ABIMarker(InjectedInputPenButtons.ABI::class)
@Signature("enum(Windows.UI.Input.Preview.Injection.InjectedInputPenButtons;u4)")
@WinRTByReference(brClass = InjectedInputPenButtons.ByReference::class)
public enum class InjectedInputPenButtons(
  public val value: Int
) : NativeMapped {
  None(0),
  Barrel(1),
  Inverted(2),
  Eraser(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InjectedInputPenButtons {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Barrel
      2 -> Inverted
      4 -> Eraser
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InjectedInputPenButtons> {
    public fun setValue(newValue: InjectedInputPenButtons): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InjectedInputPenButtons =
        InjectedInputPenButtons.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InjectedInputPenButtons, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InjectedInputPenButtons =
        InjectedInputPenButtons.values()[0].fromNative(value, null)

    public override fun toNative(obj: InjectedInputPenButtons): Int = obj.value
  }
}
