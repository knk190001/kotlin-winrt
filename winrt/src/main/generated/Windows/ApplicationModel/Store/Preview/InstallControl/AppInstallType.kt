package Windows.ApplicationModel.Store.Preview.InstallControl

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

@ABIMarker(AppInstallType.ABI::class)
@Signature("enum(Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallType;i4)")
@WinRTByReference(brClass = AppInstallType.ByReference::class)
public enum class AppInstallType(
  public val value: Int
) : NativeMapped {
  Install(0),
  Update(1),
  Repair(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AppInstallType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Install
      1 -> Update
      2 -> Repair
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AppInstallType> {
    public fun setValue(newValue: AppInstallType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AppInstallType =
        AppInstallType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AppInstallType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AppInstallType =
        AppInstallType.values()[0].fromNative(value, null)

    public override fun toNative(obj: AppInstallType): Int = obj.value
  }
}
