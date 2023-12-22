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

@ABIMarker(InjectedInputTouchParameters.ABI::class)
@Signature("enum(Windows.UI.Input.Preview.Injection.InjectedInputTouchParameters;u4)")
@WinRTByReference(brClass = InjectedInputTouchParameters.ByReference::class)
public enum class InjectedInputTouchParameters(
  public val value: Int
) : NativeMapped {
  None(0),
  Contact(1),
  Orientation(2),
  Pressure(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InjectedInputTouchParameters {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Contact
      2 -> Orientation
      4 -> Pressure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<InjectedInputTouchParameters> {
    public fun setValue(newValue: InjectedInputTouchParameters): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InjectedInputTouchParameters =
        InjectedInputTouchParameters.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InjectedInputTouchParameters, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InjectedInputTouchParameters =
        InjectedInputTouchParameters.values()[0].fromNative(value, null)

    public override fun toNative(obj: InjectedInputTouchParameters): Int = obj.value
  }
}
