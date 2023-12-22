package Windows.Media.Casting

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

@ABIMarker(CastingConnectionState.ABI::class)
@Signature("enum(Windows.Media.Casting.CastingConnectionState;i4)")
@WinRTByReference(brClass = CastingConnectionState.ByReference::class)
public enum class CastingConnectionState(
  public val value: Int
) : NativeMapped {
  Disconnected(0),
  Connected(1),
  Rendering(2),
  Disconnecting(3),
  Connecting(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CastingConnectionState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disconnected
      1 -> Connected
      2 -> Rendering
      3 -> Disconnecting
      4 -> Connecting
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CastingConnectionState> {
    public fun setValue(newValue: CastingConnectionState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CastingConnectionState =
        CastingConnectionState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CastingConnectionState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CastingConnectionState =
        CastingConnectionState.values()[0].fromNative(value, null)

    public override fun toNative(obj: CastingConnectionState): Int = obj.value
  }
}
