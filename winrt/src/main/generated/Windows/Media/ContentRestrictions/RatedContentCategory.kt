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

@ABIMarker(RatedContentCategory.ABI::class)
@Signature("enum(Windows.Media.ContentRestrictions.RatedContentCategory;i4)")
@WinRTByReference(brClass = RatedContentCategory.ByReference::class)
public enum class RatedContentCategory(
  public val value: Int
) : NativeMapped {
  General(0),
  Application(1),
  Game(2),
  Movie(3),
  Television(4),
  Music(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      RatedContentCategory {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> General
      1 -> Application
      2 -> Game
      3 -> Movie
      4 -> Television
      5 -> Music
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<RatedContentCategory> {
    public fun setValue(newValue: RatedContentCategory): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): RatedContentCategory =
        RatedContentCategory.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<RatedContentCategory, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): RatedContentCategory =
        RatedContentCategory.values()[0].fromNative(value, null)

    public override fun toNative(obj: RatedContentCategory): Int = obj.value
  }
}
