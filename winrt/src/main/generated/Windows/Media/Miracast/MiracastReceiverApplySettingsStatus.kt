package Windows.Media.Miracast

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

@ABIMarker(MiracastReceiverApplySettingsStatus.ABI::class)
@Signature("enum(Windows.Media.Miracast.MiracastReceiverApplySettingsStatus;i4)")
@WinRTByReference(brClass = MiracastReceiverApplySettingsStatus.ByReference::class)
public enum class MiracastReceiverApplySettingsStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  UnknownFailure(1),
  MiracastNotSupported(2),
  AccessDenied(3),
  FriendlyNameTooLong(4),
  ModelNameTooLong(5),
  ModelNumberTooLong(6),
  InvalidSettings(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MiracastReceiverApplySettingsStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> UnknownFailure
      2 -> MiracastNotSupported
      3 -> AccessDenied
      4 -> FriendlyNameTooLong
      5 -> ModelNameTooLong
      6 -> ModelNumberTooLong
      7 -> InvalidSettings
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MiracastReceiverApplySettingsStatus> {
    public fun setValue(newValue: MiracastReceiverApplySettingsStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MiracastReceiverApplySettingsStatus =
        MiracastReceiverApplySettingsStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MiracastReceiverApplySettingsStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MiracastReceiverApplySettingsStatus =
        MiracastReceiverApplySettingsStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MiracastReceiverApplySettingsStatus): Int = obj.value
  }
}
