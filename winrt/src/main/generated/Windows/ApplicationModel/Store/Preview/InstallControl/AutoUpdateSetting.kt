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

@ABIMarker(AutoUpdateSetting.ABI::class)
@Signature("enum(Windows.ApplicationModel.Store.Preview.InstallControl.AutoUpdateSetting;i4)")
@WinRTByReference(brClass = AutoUpdateSetting.ByReference::class)
public enum class AutoUpdateSetting(
  public val value: Int
) : NativeMapped {
  Disabled(0),
  Enabled(1),
  DisabledByPolicy(2),
  EnabledByPolicy(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AutoUpdateSetting {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Disabled
      1 -> Enabled
      2 -> DisabledByPolicy
      3 -> EnabledByPolicy
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AutoUpdateSetting> {
    public fun setValue(newValue: AutoUpdateSetting): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AutoUpdateSetting =
        AutoUpdateSetting.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AutoUpdateSetting, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AutoUpdateSetting =
        AutoUpdateSetting.values()[0].fromNative(value, null)

    public override fun toNative(obj: AutoUpdateSetting): Int = obj.value
  }
}
