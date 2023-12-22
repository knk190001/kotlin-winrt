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

@ABIMarker(ProtectedImportExportStatus.ABI::class)
@Signature("enum(Windows.Security.EnterpriseData.ProtectedImportExportStatus;i4)")
@WinRTByReference(brClass = ProtectedImportExportStatus.ByReference::class)
public enum class ProtectedImportExportStatus(
  public val value: Int
) : NativeMapped {
  Ok(0),
  Undetermined(1),
  Unprotected(2),
  Revoked(3),
  NotRoamable(4),
  ProtectedToOtherIdentity(5),
  LicenseExpired(6),
  AccessSuspended(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ProtectedImportExportStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Ok
      1 -> Undetermined
      2 -> Unprotected
      3 -> Revoked
      4 -> NotRoamable
      5 -> ProtectedToOtherIdentity
      6 -> LicenseExpired
      7 -> AccessSuspended
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ProtectedImportExportStatus> {
    public fun setValue(newValue: ProtectedImportExportStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ProtectedImportExportStatus =
        ProtectedImportExportStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ProtectedImportExportStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ProtectedImportExportStatus =
        ProtectedImportExportStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: ProtectedImportExportStatus): Int = obj.value
  }
}
