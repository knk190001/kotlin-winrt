package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardCryptogramPlacementOptions.ABI::class)
@Signature("enum(Windows.Devices.SmartCards.SmartCardCryptogramPlacementOptions;u4)")
@WinRTByReference(brClass = SmartCardCryptogramPlacementOptions.ByReference::class)
public enum class SmartCardCryptogramPlacementOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  UnitsAreInNibbles(1),
  ChainOutput(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmartCardCryptogramPlacementOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> UnitsAreInNibbles
      2 -> ChainOutput
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SmartCardCryptogramPlacementOptions> {
    public fun setValue(newValue: SmartCardCryptogramPlacementOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmartCardCryptogramPlacementOptions =
        SmartCardCryptogramPlacementOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmartCardCryptogramPlacementOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmartCardCryptogramPlacementOptions =
        SmartCardCryptogramPlacementOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmartCardCryptogramPlacementOptions): Int = obj.value
  }
}
