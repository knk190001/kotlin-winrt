package Windows.UI.UIAutomation.Core

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

@ABIMarker(AutomationRemoteOperationStatus.ABI::class)
@Signature("enum(Windows.UI.UIAutomation.Core.AutomationRemoteOperationStatus;i4)")
@WinRTByReference(brClass = AutomationRemoteOperationStatus.ByReference::class)
public enum class AutomationRemoteOperationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  MalformedBytecode(1),
  InstructionLimitExceeded(2),
  UnhandledException(3),
  ExecutionFailure(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutomationRemoteOperationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> MalformedBytecode
      2 -> InstructionLimitExceeded
      3 -> UnhandledException
      4 -> ExecutionFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AutomationRemoteOperationStatus> {
    public fun setValue(newValue: AutomationRemoteOperationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutomationRemoteOperationStatus =
        AutomationRemoteOperationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutomationRemoteOperationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutomationRemoteOperationStatus =
        AutomationRemoteOperationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutomationRemoteOperationStatus): Int = obj.value
  }
}
