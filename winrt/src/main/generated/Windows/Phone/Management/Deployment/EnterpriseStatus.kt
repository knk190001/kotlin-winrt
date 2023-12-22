package Windows.Phone.Management.Deployment

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

@ABIMarker(EnterpriseStatus.ABI::class)
@Signature("enum(Windows.Phone.Management.Deployment.EnterpriseStatus;i4)")
@WinRTByReference(brClass = EnterpriseStatus.ByReference::class)
public enum class EnterpriseStatus(
  public val value: Int
) : NativeMapped {
  Enrolled(0),
  Disabled(1),
  Revoked(2),
  Expired(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EnterpriseStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Enrolled
      1 -> Disabled
      2 -> Revoked
      3 -> Expired
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EnterpriseStatus> {
    public fun setValue(newValue: EnterpriseStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EnterpriseStatus =
        EnterpriseStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EnterpriseStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EnterpriseStatus =
        EnterpriseStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: EnterpriseStatus): Int = obj.value
  }
}
