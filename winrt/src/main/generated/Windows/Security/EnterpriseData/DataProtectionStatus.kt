package Windows.Security.EnterpriseData

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

@ABIMarker(DataProtectionStatus.ABI::class)
@Signature("enum(Windows.Security.EnterpriseData.DataProtectionStatus;i4)")
@WinRTByReference(brClass = DataProtectionStatus.ByReference::class)
public enum class DataProtectionStatus(
  public val value: Int
) : NativeMapped {
  ProtectedToOtherIdentity(0),
  Protected(1),
  Revoked(2),
  Unprotected(3),
  LicenseExpired(4),
  AccessSuspended(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DataProtectionStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ProtectedToOtherIdentity
      1 -> Protected
      2 -> Revoked
      3 -> Unprotected
      4 -> LicenseExpired
      5 -> AccessSuspended
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DataProtectionStatus> {
    public fun setValue(newValue: DataProtectionStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DataProtectionStatus =
        DataProtectionStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DataProtectionStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DataProtectionStatus =
        DataProtectionStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: DataProtectionStatus): Int = obj.value
  }
}
