package Windows.Networking.Connectivity

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

@ABIMarker(RoamingStates.ABI::class)
@Signature("enum(Windows.Networking.Connectivity.RoamingStates;u4)")
@WinRTByReference(brClass = RoamingStates.ByReference::class)
public enum class RoamingStates(
  public val value: Int
) : NativeMapped {
  None(0),
  NotRoaming(1),
  Roaming(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RoamingStates {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> NotRoaming
      2 -> Roaming
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RoamingStates> {
    public fun setValue(newValue: RoamingStates): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RoamingStates =
        RoamingStates.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RoamingStates, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RoamingStates =
        RoamingStates.values()[0].fromNative(value, null)

    public override fun toNative(obj: RoamingStates): Int = obj.value
  }
}
