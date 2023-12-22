package Windows.Services.Maps

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

@ABIMarker(WaypointKind.ABI::class)
@Signature("enum(Windows.Services.Maps.WaypointKind;i4)")
@WinRTByReference(brClass = WaypointKind.ByReference::class)
public enum class WaypointKind(
  public val value: Int
) : NativeMapped {
  Stop(0),
  Via(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WaypointKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Stop
      1 -> Via
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WaypointKind> {
    public fun setValue(newValue: WaypointKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WaypointKind =
        WaypointKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WaypointKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WaypointKind =
        WaypointKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: WaypointKind): Int = obj.value
  }
}
