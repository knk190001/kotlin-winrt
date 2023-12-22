package Windows.Security.ExchangeActiveSyncProvisioning

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

@ABIMarker(EasRequireEncryptionResult.ABI::class)
@Signature("enum(Windows.Security.ExchangeActiveSyncProvisioning.EasRequireEncryptionResult;i4)")
@WinRTByReference(brClass = EasRequireEncryptionResult.ByReference::class)
public enum class EasRequireEncryptionResult(
  public val value: Int
) : NativeMapped {
  NotEvaluated(0),
  Compliant(1),
  CanBeCompliant(2),
  NotProvisionedOnAllVolumes(3),
  DeFixedDataNotSupported(4),
  FixedDataNotSupported(4),
  DeHardwareNotCompliant(5),
  HardwareNotCompliant(5),
  DeWinReNotConfigured(6),
  LockNotConfigured(6),
  DeProtectionSuspended(7),
  ProtectionSuspended(7),
  DeOsVolumeNotProtected(8),
  OsVolumeNotProtected(8),
  DeProtectionNotYetEnabled(9),
  ProtectionNotYetEnabled(9),
  NoFeatureLicense(10),
  OsNotProtected(11),
  UnexpectedFailure(12),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EasRequireEncryptionResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotEvaluated
      1 -> Compliant
      2 -> CanBeCompliant
      3 -> NotProvisionedOnAllVolumes
      4 -> DeFixedDataNotSupported
      4 -> FixedDataNotSupported
      5 -> DeHardwareNotCompliant
      5 -> HardwareNotCompliant
      6 -> DeWinReNotConfigured
      6 -> LockNotConfigured
      7 -> DeProtectionSuspended
      7 -> ProtectionSuspended
      8 -> DeOsVolumeNotProtected
      8 -> OsVolumeNotProtected
      9 -> DeProtectionNotYetEnabled
      9 -> ProtectionNotYetEnabled
      10 -> NoFeatureLicense
      11 -> OsNotProtected
      12 -> UnexpectedFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<EasRequireEncryptionResult> {
    public fun setValue(newValue: EasRequireEncryptionResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EasRequireEncryptionResult =
        EasRequireEncryptionResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EasRequireEncryptionResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EasRequireEncryptionResult =
        EasRequireEncryptionResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: EasRequireEncryptionResult): Int = obj.value
  }
}
