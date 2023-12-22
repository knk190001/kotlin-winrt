package Windows.ApplicationModel.ConversationalAgent

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

@ABIMarker(ActivationSignalDetectionConfigurationRemovalResult.ABI::class)
@Signature("enum(Windows.ApplicationModel.ConversationalAgent.ActivationSignalDetectionConfigurationRemovalResult;i4)")
@WinRTByReference(brClass = ActivationSignalDetectionConfigurationRemovalResult.ByReference::class)
public enum class ActivationSignalDetectionConfigurationRemovalResult(
  public val value: Int
) : NativeMapped {
  Success(0),
  NotFound(1),
  CurrentlyEnabled(2),
  RemovalNotSupported(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ActivationSignalDetectionConfigurationRemovalResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> NotFound
      2 -> CurrentlyEnabled
      3 -> RemovalNotSupported
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ActivationSignalDetectionConfigurationRemovalResult> {
    public fun setValue(newValue: ActivationSignalDetectionConfigurationRemovalResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ActivationSignalDetectionConfigurationRemovalResult =
        ActivationSignalDetectionConfigurationRemovalResult.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<ActivationSignalDetectionConfigurationRemovalResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ActivationSignalDetectionConfigurationRemovalResult
        = ActivationSignalDetectionConfigurationRemovalResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: ActivationSignalDetectionConfigurationRemovalResult): Int =
        obj.value
  }
}
