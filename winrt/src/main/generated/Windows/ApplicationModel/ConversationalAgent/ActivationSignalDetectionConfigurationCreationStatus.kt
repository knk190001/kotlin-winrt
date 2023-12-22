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

@ABIMarker(ActivationSignalDetectionConfigurationCreationStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.ConversationalAgent.ActivationSignalDetectionConfigurationCreationStatus;i4)")
@WinRTByReference(brClass = ActivationSignalDetectionConfigurationCreationStatus.ByReference::class)
public enum class ActivationSignalDetectionConfigurationCreationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  SignalIdNotAvailable(1),
  ModelIdNotSupported(2),
  InvalidSignalId(3),
  InvalidModelId(4),
  InvalidDisplayName(5),
  ConfigurationAlreadyExists(6),
  CreationNotSupported(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ActivationSignalDetectionConfigurationCreationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> SignalIdNotAvailable
      2 -> ModelIdNotSupported
      3 -> InvalidSignalId
      4 -> InvalidModelId
      5 -> InvalidDisplayName
      6 -> ConfigurationAlreadyExists
      7 -> CreationNotSupported
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ActivationSignalDetectionConfigurationCreationStatus> {
    public fun setValue(newValue: ActivationSignalDetectionConfigurationCreationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ActivationSignalDetectionConfigurationCreationStatus =
        ActivationSignalDetectionConfigurationCreationStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<ActivationSignalDetectionConfigurationCreationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ActivationSignalDetectionConfigurationCreationStatus
        = ActivationSignalDetectionConfigurationCreationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: ActivationSignalDetectionConfigurationCreationStatus): Int =
        obj.value
  }
}
