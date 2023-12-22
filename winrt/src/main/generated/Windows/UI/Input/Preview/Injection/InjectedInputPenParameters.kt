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

@ABIMarker(InjectedInputPenParameters.ABI::class)
@Signature("enum(Windows.UI.Input.Preview.Injection.InjectedInputPenParameters;u4)")
@WinRTByReference(brClass = InjectedInputPenParameters.ByReference::class)
public enum class InjectedInputPenParameters(
  public val value: Int
) : NativeMapped {
  None(0),
  Pressure(1),
  Rotation(2),
  TiltX(4),
  TiltY(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InjectedInputPenParameters {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Pressure
      2 -> Rotation
      4 -> TiltX
      8 -> TiltY
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<InjectedInputPenParameters> {
    public fun setValue(newValue: InjectedInputPenParameters): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InjectedInputPenParameters =
        InjectedInputPenParameters.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InjectedInputPenParameters, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InjectedInputPenParameters =
        InjectedInputPenParameters.values()[0].fromNative(value, null)

    public override fun toNative(obj: InjectedInputPenParameters): Int = obj.value
  }
}
