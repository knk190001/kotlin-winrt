package Windows.ApplicationModel

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

@ABIMarker(AddResourcePackageOptions.ABI::class)
@Signature("enum(Windows.ApplicationModel.AddResourcePackageOptions;u4)")
@WinRTByReference(brClass = AddResourcePackageOptions.ByReference::class)
public enum class AddResourcePackageOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  ForceTargetAppShutdown(1),
  ApplyUpdateIfAvailable(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AddResourcePackageOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ForceTargetAppShutdown
      2 -> ApplyUpdateIfAvailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<AddResourcePackageOptions>
      {
    public fun setValue(newValue: AddResourcePackageOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AddResourcePackageOptions =
        AddResourcePackageOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AddResourcePackageOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AddResourcePackageOptions =
        AddResourcePackageOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: AddResourcePackageOptions): Int = obj.value
  }
}
