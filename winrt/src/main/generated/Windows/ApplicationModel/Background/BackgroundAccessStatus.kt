package Windows.ApplicationModel.Background

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

@ABIMarker(BackgroundAccessStatus.ABI::class)
@Signature("enum(Windows.ApplicationModel.Background.BackgroundAccessStatus;i4)")
@WinRTByReference(brClass = BackgroundAccessStatus.ByReference::class)
public enum class BackgroundAccessStatus(
  public val value: Int
) : NativeMapped {
  Unspecified(0),
  AllowedWithAlwaysOnRealTimeConnectivity(1),
  AllowedMayUseActiveRealTimeConnectivity(2),
  Denied(3),
  AlwaysAllowed(4),
  AllowedSubjectToSystemPolicy(5),
  DeniedBySystemPolicy(6),
  DeniedByUser(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      BackgroundAccessStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unspecified
      1 -> AllowedWithAlwaysOnRealTimeConnectivity
      2 -> AllowedMayUseActiveRealTimeConnectivity
      3 -> Denied
      4 -> AlwaysAllowed
      5 -> AllowedSubjectToSystemPolicy
      6 -> DeniedBySystemPolicy
      7 -> DeniedByUser
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<BackgroundAccessStatus> {
    public fun setValue(newValue: BackgroundAccessStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): BackgroundAccessStatus =
        BackgroundAccessStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<BackgroundAccessStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): BackgroundAccessStatus =
        BackgroundAccessStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: BackgroundAccessStatus): Int = obj.value
  }
}
