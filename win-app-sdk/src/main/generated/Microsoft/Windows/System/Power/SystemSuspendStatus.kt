package Microsoft.Windows.System.Power

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

@ABIMarker(SystemSuspendStatus.ABI::class)
@Signature("enum(Microsoft.Windows.System.Power.SystemSuspendStatus;i4)")
@WinRTByReference(brClass = SystemSuspendStatus.ByReference::class)
public enum class SystemSuspendStatus(
  public val value: Int
) : NativeMapped {
  Uninitialized(0),
  Entering(1),
  AutoResume(2),
  ManualResume(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SystemSuspendStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Uninitialized
      1 -> Entering
      2 -> AutoResume
      3 -> ManualResume
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SystemSuspendStatus> {
    public fun setValue(newValue: SystemSuspendStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SystemSuspendStatus =
        SystemSuspendStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SystemSuspendStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SystemSuspendStatus =
        SystemSuspendStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SystemSuspendStatus): Int = obj.value
  }
}
