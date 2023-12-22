package Windows.Networking.BackgroundTransfer

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

@ABIMarker(BackgroundTransferStatus.ABI::class)
@Signature("enum(Windows.Networking.BackgroundTransfer.BackgroundTransferStatus;i4)")
@WinRTByReference(brClass = BackgroundTransferStatus.ByReference::class)
public enum class BackgroundTransferStatus(
  public val value: Int
) : NativeMapped {
  Idle(0),
  Running(1),
  PausedByApplication(2),
  PausedCostedNetwork(3),
  PausedNoNetwork(4),
  Completed(5),
  Canceled(6),
  Error(7),
  PausedRecoverableWebErrorStatus(8),
  PausedSystemPolicy(32),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BackgroundTransferStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Idle
      1 -> Running
      2 -> PausedByApplication
      3 -> PausedCostedNetwork
      4 -> PausedNoNetwork
      5 -> Completed
      6 -> Canceled
      7 -> Error
      8 -> PausedRecoverableWebErrorStatus
      32 -> PausedSystemPolicy
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BackgroundTransferStatus>
      {
    public fun setValue(newValue: BackgroundTransferStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BackgroundTransferStatus =
        BackgroundTransferStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BackgroundTransferStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BackgroundTransferStatus =
        BackgroundTransferStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: BackgroundTransferStatus): Int = obj.value
  }
}
