package Windows.Security.Cryptography.Certificates

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

@ABIMarker(ExportOption.ABI::class)
@Signature("enum(Windows.Security.Cryptography.Certificates.ExportOption;i4)")
@WinRTByReference(brClass = ExportOption.ByReference::class)
public enum class ExportOption(
  public val value: Int
) : NativeMapped {
  NotExportable(0),
  Exportable(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ExportOption {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotExportable
      1 -> Exportable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ExportOption> {
    public fun setValue(newValue: ExportOption): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ExportOption =
        ExportOption.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ExportOption, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ExportOption =
        ExportOption.values()[0].fromNative(value, null)

    public override fun toNative(obj: ExportOption): Int = obj.value
  }
}
