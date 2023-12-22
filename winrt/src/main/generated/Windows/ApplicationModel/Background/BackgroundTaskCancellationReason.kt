package Windows.ApplicationModel.Background

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

@ABIMarker(BackgroundTaskCancellationReason.ABI::class)
@Signature("enum(Windows.ApplicationModel.Background.BackgroundTaskCancellationReason;i4)")
@WinRTByReference(brClass = BackgroundTaskCancellationReason.ByReference::class)
public enum class BackgroundTaskCancellationReason(
  public val value: Int
) : NativeMapped {
  Abort(0),
  Terminating(1),
  LoggingOff(2),
  ServicingUpdate(3),
  IdleTask(4),
  Uninstall(5),
  ConditionLoss(6),
  SystemPolicy(7),
  QuietHoursEntered(8),
  ExecutionTimeExceeded(9),
  ResourceRevocation(10),
  EnergySaver(11),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BackgroundTaskCancellationReason {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Abort
      1 -> Terminating
      2 -> LoggingOff
      3 -> ServicingUpdate
      4 -> IdleTask
      5 -> Uninstall
      6 -> ConditionLoss
      7 -> SystemPolicy
      8 -> QuietHoursEntered
      9 -> ExecutionTimeExceeded
      10 -> ResourceRevocation
      11 -> EnergySaver
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<BackgroundTaskCancellationReason> {
    public fun setValue(newValue: BackgroundTaskCancellationReason): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BackgroundTaskCancellationReason =
        BackgroundTaskCancellationReason.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BackgroundTaskCancellationReason, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BackgroundTaskCancellationReason =
        BackgroundTaskCancellationReason.values()[0].fromNative(value, null)

    public override fun toNative(obj: BackgroundTaskCancellationReason): Int = obj.value
  }
}
