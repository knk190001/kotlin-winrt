package Windows.Graphics.Holographic

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

@ABIMarker(HolographicSpaceUserPresence.ABI::class)
@Signature("enum(Windows.Graphics.Holographic.HolographicSpaceUserPresence;i4)")
@WinRTByReference(brClass = HolographicSpaceUserPresence.ByReference::class)
public enum class HolographicSpaceUserPresence(
  public val value: Int
) : NativeMapped {
  Absent(0),
  PresentPassive(1),
  PresentActive(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HolographicSpaceUserPresence {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Absent
      1 -> PresentPassive
      2 -> PresentActive
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<HolographicSpaceUserPresence> {
    public fun setValue(newValue: HolographicSpaceUserPresence): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HolographicSpaceUserPresence =
        HolographicSpaceUserPresence.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HolographicSpaceUserPresence, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HolographicSpaceUserPresence =
        HolographicSpaceUserPresence.values()[0].fromNative(value, null)

    public override fun toNative(obj: HolographicSpaceUserPresence): Int = obj.value
  }
}
