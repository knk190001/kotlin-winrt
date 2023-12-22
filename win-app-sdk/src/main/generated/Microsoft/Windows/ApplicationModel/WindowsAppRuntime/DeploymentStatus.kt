package Microsoft.Windows.ApplicationModel.WindowsAppRuntime

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

@ABIMarker(DeploymentStatus.ABI::class)
@Signature("enum(Microsoft.Windows.ApplicationModel.WindowsAppRuntime.DeploymentStatus;i4)")
@WinRTByReference(brClass = DeploymentStatus.ByReference::class)
public enum class DeploymentStatus(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  Ok(1),
  PackageInstallRequired(2),
  PackageInstallFailed(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DeploymentStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> Ok
      2 -> PackageInstallRequired
      3 -> PackageInstallFailed
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DeploymentStatus> {
    public fun setValue(newValue: DeploymentStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DeploymentStatus =
        DeploymentStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DeploymentStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DeploymentStatus =
        DeploymentStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: DeploymentStatus): Int = obj.value
  }
}
