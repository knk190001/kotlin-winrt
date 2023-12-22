package Windows.Storage.Search

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ContentIndexer.ABI::class)
@Signature("rc(Windows.Storage.Search.ContentIndexer;{b1767f8d-f698-4982-b05f-3a6e8cab01a2})")
@WinRTByReference(brClass = ContentIndexer.ByReference::class)
public class ContentIndexer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IContentIndexer.WithDefault, IContentIndexerQueryOperations.WithDefault,
    IWinRTObject {
  private val __1645691255_Interface: IContentIndexer.WithDefault by lazy {
    as_1645691255()
  }


  private val __711694069_Interface: IContentIndexerQueryOperations.WithDefault by lazy {
    as_711694069()
  }


  public override val __1645691255_Ptr: JNAPointer? by lazy {
    __1645691255_Interface.__1645691255_Ptr
  }


  public override val __711694069_Ptr: JNAPointer? by lazy {
    __711694069_Interface.__711694069_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1645691255_Interface, __711694069_Interface)

  private fun as_1645691255(): IContentIndexer.WithDefault {
    if(pointer == NULL) {
      return(IContentIndexer.ABI.makeIContentIndexer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentIndexer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentIndexer.ABI.makeIContentIndexer(ref.value))
  }

  private fun as_711694069(): IContentIndexerQueryOperations.WithDefault {
    if(pointer == NULL) {
      return(IContentIndexerQueryOperations.ABI.makeIContentIndexerQueryOperations(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContentIndexerQueryOperations>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContentIndexerQueryOperations.ABI.makeIContentIndexerQueryOperations(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ContentIndexer>
      {
    public override fun getValue() = ContentIndexer(pointer.getPointer(0))

    public fun setValue(value: ContentIndexer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContentIndexer, MemoryAddress> {
    public val IContentIndexerStatics_Instance: IContentIndexerStatics by lazy {
      createIContentIndexerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIContentIndexerStatics(): IContentIndexerStatics {
      val refiid = Guid.REFIID(IContentIndexerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Search.ContentIndexer".toHandle(),refiid,interfacePtr)
      val result = IContentIndexerStatics.ABI.makeIContentIndexerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContentIndexer {
      val address = segment.toRawLongValue()
      return ContentIndexer(Pointer(address))
    }

    public override fun toNative(obj: ContentIndexer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetIndexer(indexName: String) =
        ABI.IContentIndexerStatics_Instance.GetIndexer(indexName)

    public fun GetIndexer() = ABI.IContentIndexerStatics_Instance.GetIndexer()
  }
}
