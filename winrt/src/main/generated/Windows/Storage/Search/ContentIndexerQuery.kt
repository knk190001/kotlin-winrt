package Windows.Storage.Search

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ContentIndexerQuery.ABI::class)
@Signature("rc(Windows.Storage.Search.ContentIndexerQuery;{70e3b0f8-4bfc-428a-8889-cc51da9a7b9d})")
@WinRTByReference(brClass = ContentIndexerQuery.ByReference::class)
public class ContentIndexerQuery(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentIndexerQuery.WithDefault, IWinRTObject {
  private val __95283265_Interface: IContentIndexerQuery.WithDefault by lazy {
    as_95283265()
  }


  public override val __95283265_Ptr: JNAPointer? by lazy {
    __95283265_Interface.__95283265_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__95283265_Interface)

  private fun as_95283265(): IContentIndexerQuery.WithDefault {
    if(pointer == NULL) {
      return(IContentIndexerQuery.ABI.makeIContentIndexerQuery(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentIndexerQuery>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentIndexerQuery.ABI.makeIContentIndexerQuery(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContentIndexerQuery> {
    public override fun getValue() = ContentIndexerQuery(pointer.getPointer(0))

    public fun setValue(value: ContentIndexerQuery): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentIndexerQuery, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ContentIndexerQuery {
      val address = segment.toRawLongValue()
      return ContentIndexerQuery(Pointer(address))
    }

    public override fun toNative(obj: ContentIndexerQuery): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
