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

@ABIMarker(SmartCardEmulationType.ABI::class)
@Signature("enum(Windows.Devices.SmartCards.SmartCardEmulationType;i4)")
@WinRTByReference(brClass = SmartCardEmulationType.ByReference::class)
public enum class SmartCardEmulationType(
  public val value: Int
) : NativeMapped {
  Host(0),
  Uicc(1),
  EmbeddedSE(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmartCardEmulationType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Host
      1 -> Uicc
      2 -> EmbeddedSE
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SmartCardEmulationType> {
    public fun setValue(newValue: SmartCardEmulationType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmartCardEmulationType =
        SmartCardEmulationType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmartCardEmulationType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmartCardEmulationType =
        SmartCardEmulationType.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmartCardEmulationType): Int = obj.value
  }
}
