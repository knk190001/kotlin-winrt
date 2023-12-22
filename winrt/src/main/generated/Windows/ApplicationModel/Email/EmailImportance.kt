package Windows.ApplicationModel.Email

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

@ABIMarker(EmailImportance.ABI::class)
@Signature("enum(Windows.ApplicationModel.Email.EmailImportance;i4)")
@WinRTByReference(brClass = EmailImportance.ByReference::class)
public enum class EmailImportance(
  public val value: Int
) : NativeMapped {
  Normal(0),
  High(1),
  Low(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      EmailImportance {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      1 -> High
      2 -> Low
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<EmailImportance> {
    public fun setValue(newValue: EmailImportance): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): EmailImportance =
        EmailImportance.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<EmailImportance, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): EmailImportance =
        EmailImportance.values()[0].fromNative(value, null)

    public override fun toNative(obj: EmailImportance): Int = obj.value
  }
}
