package Windows.System.Update

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

@ABIMarker(SystemUpdateItemState.ABI::class)
@Signature("enum(Windows.System.Update.SystemUpdateItemState;i4)")
@WinRTByReference(brClass = SystemUpdateItemState.ByReference::class)
public enum class SystemUpdateItemState(
  public val value: Int
) : NativeMapped {
  NotStarted(0),
  Initializing(1),
  Preparing(2),
  Calculating(3),
  Downloading(4),
  Installing(5),
  Completed(6),
  RebootRequired(7),
  Error(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SystemUpdateItemState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotStarted
      1 -> Initializing
      2 -> Preparing
      3 -> Calculating
      4 -> Downloading
      5 -> Installing
      6 -> Completed
      7 -> RebootRequired
      8 -> Error
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SystemUpdateItemState> {
    public fun setValue(newValue: SystemUpdateItemState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SystemUpdateItemState =
        SystemUpdateItemState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SystemUpdateItemState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SystemUpdateItemState =
        SystemUpdateItemState.values()[0].fromNative(value, null)

    public override fun toNative(obj: SystemUpdateItemState): Int = obj.value
  }
}
