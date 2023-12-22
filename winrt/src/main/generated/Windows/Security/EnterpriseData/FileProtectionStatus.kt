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

@ABIMarker(FileProtectionStatus.ABI::class)
@Signature("enum(Windows.Security.EnterpriseData.FileProtectionStatus;i4)")
@WinRTByReference(brClass = FileProtectionStatus.ByReference::class)
public enum class FileProtectionStatus(
  public val value: Int
) : NativeMapped {
  Undetermined(0),
  Unknown(0),
  Unprotected(1),
  Revoked(2),
  Protected(3),
  ProtectedByOtherUser(4),
  ProtectedToOtherEnterprise(5),
  NotProtectable(6),
  ProtectedToOtherIdentity(7),
  LicenseExpired(8),
  AccessSuspended(9),
  FileInUse(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      FileProtectionStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undetermined
      0 -> Unknown
      1 -> Unprotected
      2 -> Revoked
      3 -> Protected
      4 -> ProtectedByOtherUser
      5 -> ProtectedToOtherEnterprise
      6 -> NotProtectable
      7 -> ProtectedToOtherIdentity
      8 -> LicenseExpired
      9 -> AccessSuspended
      10 -> FileInUse
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<FileProtectionStatus> {
    public fun setValue(newValue: FileProtectionStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): FileProtectionStatus =
        FileProtectionStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<FileProtectionStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): FileProtectionStatus =
        FileProtectionStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: FileProtectionStatus): Int = obj.value
  }
}
