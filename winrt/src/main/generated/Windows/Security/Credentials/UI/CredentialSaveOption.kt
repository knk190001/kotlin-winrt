package Windows.Security.Credentials.UI

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

@ABIMarker(CredentialSaveOption.ABI::class)
@Signature("enum(Windows.Security.Credentials.UI.CredentialSaveOption;i4)")
@WinRTByReference(brClass = CredentialSaveOption.ByReference::class)
public enum class CredentialSaveOption(
  public val value: Int
) : NativeMapped {
  Unselected(0),
  Selected(1),
  Hidden(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CredentialSaveOption {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unselected
      1 -> Selected
      2 -> Hidden
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CredentialSaveOption> {
    public fun setValue(newValue: CredentialSaveOption): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CredentialSaveOption =
        CredentialSaveOption.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CredentialSaveOption, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CredentialSaveOption =
        CredentialSaveOption.values()[0].fromNative(value, null)

    public override fun toNative(obj: CredentialSaveOption): Int = obj.value
  }
}
