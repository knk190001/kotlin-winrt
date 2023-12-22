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

@ABIMarker(ActivationSignalDetectionConfigurationSetModelDataResult.ABI::class)
@Signature("enum(Windows.ApplicationModel.ConversationalAgent.ActivationSignalDetectionConfigurationSetModelDataResult;i4)")
@WinRTByReference(brClass =
    ActivationSignalDetectionConfigurationSetModelDataResult.ByReference::class)
public enum class ActivationSignalDetectionConfigurationSetModelDataResult(
  public val value: Int
) : NativeMapped {
  Success(0),
  EmptyModelData(1),
  UnsupportedFormat(2),
  ConfigurationCurrentlyEnabled(3),
  InvalidData(4),
  SetModelDataNotSupported(5),
  ConfigurationNotFound(6),
  UnknownError(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ActivationSignalDetectionConfigurationSetModelDataResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> EmptyModelData
      2 -> UnsupportedFormat
      3 -> ConfigurationCurrentlyEnabled
      4 -> InvalidData
      5 -> SetModelDataNotSupported
      6 -> ConfigurationNotFound
      7 -> UnknownError
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ActivationSignalDetectionConfigurationSetModelDataResult> {
    public fun setValue(newValue: ActivationSignalDetectionConfigurationSetModelDataResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ActivationSignalDetectionConfigurationSetModelDataResult =
        ActivationSignalDetectionConfigurationSetModelDataResult.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<ActivationSignalDetectionConfigurationSetModelDataResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int):
        ActivationSignalDetectionConfigurationSetModelDataResult =
        ActivationSignalDetectionConfigurationSetModelDataResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: ActivationSignalDetectionConfigurationSetModelDataResult): Int
        = obj.value
  }
}
