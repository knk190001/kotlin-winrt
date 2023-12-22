package Windows.Devices.PointOfService

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

@ABIMarker(UnifiedPosErrorSeverity.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.UnifiedPosErrorSeverity;i4)")
@WinRTByReference(brClass = UnifiedPosErrorSeverity.ByReference::class)
public enum class UnifiedPosErrorSeverity(
  public val value: Int
) : NativeMapped {
  UnknownErrorSeverity(0),
  Warning(1),
  Recoverable(2),
  Unrecoverable(3),
  AssistanceRequired(4),
  Fatal(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UnifiedPosErrorSeverity {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UnknownErrorSeverity
      1 -> Warning
      2 -> Recoverable
      3 -> Unrecoverable
      4 -> AssistanceRequired
      5 -> Fatal
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UnifiedPosErrorSeverity> {
    public fun setValue(newValue: UnifiedPosErrorSeverity): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UnifiedPosErrorSeverity =
        UnifiedPosErrorSeverity.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UnifiedPosErrorSeverity, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UnifiedPosErrorSeverity =
        UnifiedPosErrorSeverity.values()[0].fromNative(value, null)

    public override fun toNative(obj: UnifiedPosErrorSeverity): Int = obj.value
  }
}
