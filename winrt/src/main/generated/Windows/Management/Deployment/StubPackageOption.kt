package Windows.Management.Deployment

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

@ABIMarker(StubPackageOption.ABI::class)
@Signature("enum(Windows.Management.Deployment.StubPackageOption;i4)")
@WinRTByReference(brClass = StubPackageOption.ByReference::class)
public enum class StubPackageOption(
  public val value: Int
) : NativeMapped {
  Default(0),
  InstallFull(1),
  InstallStub(2),
  UsePreference(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      StubPackageOption {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> InstallFull
      2 -> InstallStub
      3 -> UsePreference
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<StubPackageOption> {
    public fun setValue(newValue: StubPackageOption): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): StubPackageOption =
        StubPackageOption.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<StubPackageOption, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): StubPackageOption =
        StubPackageOption.values()[0].fromNative(value, null)

    public override fun toNative(obj: StubPackageOption): Int = obj.value
  }
}
