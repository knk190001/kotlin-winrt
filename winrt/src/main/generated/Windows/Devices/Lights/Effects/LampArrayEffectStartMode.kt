package Windows.Devices.Lights.Effects

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

@ABIMarker(LampArrayEffectStartMode.ABI::class)
@Signature("enum(Windows.Devices.Lights.Effects.LampArrayEffectStartMode;i4)")
@WinRTByReference(brClass = LampArrayEffectStartMode.ByReference::class)
public enum class LampArrayEffectStartMode(
  public val value: Int
) : NativeMapped {
  Sequential(0),
  Simultaneous(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LampArrayEffectStartMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Sequential
      1 -> Simultaneous
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LampArrayEffectStartMode>
      {
    public fun setValue(newValue: LampArrayEffectStartMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LampArrayEffectStartMode =
        LampArrayEffectStartMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LampArrayEffectStartMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LampArrayEffectStartMode =
        LampArrayEffectStartMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: LampArrayEffectStartMode): Int = obj.value
  }
}
