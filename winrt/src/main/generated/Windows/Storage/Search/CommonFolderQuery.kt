package Windows.Storage.Search

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

@ABIMarker(CommonFolderQuery.ABI::class)
@Signature("enum(Windows.Storage.Search.CommonFolderQuery;i4)")
@WinRTByReference(brClass = CommonFolderQuery.ByReference::class)
public enum class CommonFolderQuery(
  public val value: Int
) : NativeMapped {
  DefaultQuery(0),
  GroupByYear(100),
  GroupByMonth(101),
  GroupByArtist(102),
  GroupByAlbum(103),
  GroupByAlbumArtist(104),
  GroupByComposer(105),
  GroupByGenre(106),
  GroupByPublishedYear(107),
  GroupByRating(108),
  GroupByTag(109),
  GroupByAuthor(110),
  GroupByType(111),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CommonFolderQuery {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DefaultQuery
      100 -> GroupByYear
      101 -> GroupByMonth
      102 -> GroupByArtist
      103 -> GroupByAlbum
      104 -> GroupByAlbumArtist
      105 -> GroupByComposer
      106 -> GroupByGenre
      107 -> GroupByPublishedYear
      108 -> GroupByRating
      109 -> GroupByTag
      110 -> GroupByAuthor
      111 -> GroupByType
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CommonFolderQuery> {
    public fun setValue(newValue: CommonFolderQuery): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CommonFolderQuery =
        CommonFolderQuery.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CommonFolderQuery, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CommonFolderQuery =
        CommonFolderQuery.values()[0].fromNative(value, null)

    public override fun toNative(obj: CommonFolderQuery): Int = obj.value
  }
}
