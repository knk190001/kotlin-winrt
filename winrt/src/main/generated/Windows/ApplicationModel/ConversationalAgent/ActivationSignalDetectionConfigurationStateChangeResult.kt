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

@ABIMarker(ActivationSignalDetectionConfigurationStateChangeResult.ABI::class)
@Signature("enum(Windows.ApplicationModel.ConversationalAgent.ActivationSignalDetectionConfigurationStateChangeResult;i4)")
@WinRTByReference(brClass =
    ActivationSignalDetectionConfigurationStateChangeResult.ByReference::class)
public enum class ActivationSignalDetectionConfigurationStateChangeResult(
  public val value: Int
) : NativeMapped {
  Success(0),
  NoModelData(1),
  ConfigurationNotFound(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ActivationSignalDetectionConfigurationStateChangeResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> NoModelData
      2 -> ConfigurationNotFound
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ActivationSignalDetectionConfigurationStateChangeResult> {
    public fun setValue(newValue: ActivationSignalDetectionConfigurationStateChangeResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ActivationSignalDetectionConfigurationStateChangeResult =
        ActivationSignalDetectionConfigurationStateChangeResult.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<ActivationSignalDetectionConfigurationStateChangeResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int):
        ActivationSignalDetectionConfigurationStateChangeResult =
        ActivationSignalDetectionConfigurationStateChangeResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: ActivationSignalDetectionConfigurationStateChangeResult): Int
        = obj.value
  }
}
