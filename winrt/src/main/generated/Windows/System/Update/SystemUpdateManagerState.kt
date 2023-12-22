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

@ABIMarker(SystemUpdateManagerState.ABI::class)
@Signature("enum(Windows.System.Update.SystemUpdateManagerState;i4)")
@WinRTByReference(brClass = SystemUpdateManagerState.ByReference::class)
public enum class SystemUpdateManagerState(
  public val value: Int
) : NativeMapped {
  Idle(0),
  Detecting(1),
  ReadyToDownload(2),
  Downloading(3),
  ReadyToInstall(4),
  Installing(5),
  RebootRequired(6),
  ReadyToFinalize(7),
  Finalizing(8),
  Completed(9),
  AttentionRequired(10),
  Error(11),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SystemUpdateManagerState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Idle
      1 -> Detecting
      2 -> ReadyToDownload
      3 -> Downloading
      4 -> ReadyToInstall
      5 -> Installing
      6 -> RebootRequired
      7 -> ReadyToFinalize
      8 -> Finalizing
      9 -> Completed
      10 -> AttentionRequired
      11 -> Error
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SystemUpdateManagerState>
      {
    public fun setValue(newValue: SystemUpdateManagerState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SystemUpdateManagerState =
        SystemUpdateManagerState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SystemUpdateManagerState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SystemUpdateManagerState =
        SystemUpdateManagerState.values()[0].fromNative(value, null)

    public override fun toNative(obj: SystemUpdateManagerState): Int = obj.value
  }
}
