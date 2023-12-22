package Windows.Security.Authorization.AppCapabilityAccess

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

@ABIMarker(AppCapabilityAccessStatus.ABI::class)
@Signature("enum(Windows.Security.Authorization.AppCapabilityAccess.AppCapabilityAccessStatus;i4)")
@WinRTByReference(brClass = AppCapabilityAccessStatus.ByReference::class)
public enum class AppCapabilityAccessStatus(
  public val value: Int
) : NativeMapped {
  DeniedBySystem(0),
  NotDeclaredByApp(1),
  DeniedByUser(2),
  UserPromptRequired(3),
  Allowed(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppCapabilityAccessStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DeniedBySystem
      1 -> NotDeclaredByApp
      2 -> DeniedByUser
      3 -> UserPromptRequired
      4 -> Allowed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppCapabilityAccessStatus>
      {
    public fun setValue(newValue: AppCapabilityAccessStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppCapabilityAccessStatus =
        AppCapabilityAccessStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppCapabilityAccessStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppCapabilityAccessStatus =
        AppCapabilityAccessStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppCapabilityAccessStatus): Int = obj.value
  }
}
