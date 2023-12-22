package Windows.Media.ContentRestrictions

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

@ABIMarker(ContentAccessRestrictionLevel.ABI::class)
@Signature("enum(Windows.Media.ContentRestrictions.ContentAccessRestrictionLevel;i4)")
@WinRTByReference(brClass = ContentAccessRestrictionLevel.ByReference::class)
public enum class ContentAccessRestrictionLevel(
  public val value: Int
) : NativeMapped {
  Allow(0),
  Warn(1),
  Block(2),
  Hide(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ContentAccessRestrictionLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Allow
      1 -> Warn
      2 -> Block
      3 -> Hide
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<ContentAccessRestrictionLevel> {
    public fun setValue(newValue: ContentAccessRestrictionLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ContentAccessRestrictionLevel =
        ContentAccessRestrictionLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ContentAccessRestrictionLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ContentAccessRestrictionLevel =
        ContentAccessRestrictionLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: ContentAccessRestrictionLevel): Int = obj.value
  }
}
