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

@ABIMarker(CastingConnectionErrorStatus.ABI::class)
@Signature("enum(Windows.Media.Casting.CastingConnectionErrorStatus;i4)")
@WinRTByReference(brClass = CastingConnectionErrorStatus.ByReference::class)
public enum class CastingConnectionErrorStatus(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  DeviceDidNotRespond(1),
  DeviceError(2),
  DeviceLocked(3),
  ProtectedPlaybackFailed(4),
  InvalidCastingSource(5),
  Unknown(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CastingConnectionErrorStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> DeviceDidNotRespond
      2 -> DeviceError
      3 -> DeviceLocked
      4 -> ProtectedPlaybackFailed
      5 -> InvalidCastingSource
      6 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CastingConnectionErrorStatus> {
    public fun setValue(newValue: CastingConnectionErrorStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CastingConnectionErrorStatus =
        CastingConnectionErrorStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CastingConnectionErrorStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CastingConnectionErrorStatus =
        CastingConnectionErrorStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: CastingConnectionErrorStatus): Int = obj.value
  }
}
