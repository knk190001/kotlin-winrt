package Windows.ApplicationModel.Search

import Windows.ApplicationModel.Search.ISearchQueryLinguisticDetailsFactory.ABI.IID
import Windows.Foundation.Collections.IIterable
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SearchQueryLinguisticDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.SearchQueryLinguisticDetails;{46a1205b-69c9-4745-b72f-a8a4fc8f24ae})")
@WinRTByReference(brClass = SearchQueryLinguisticDetails.ByReference::class)
public class SearchQueryLinguisticDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchQueryLinguisticDetails.WithDefault, IWinRTObject {
  private val __1206940244_Interface: ISearchQueryLinguisticDetails.WithDefault by lazy {
    as_1206940244()
  }


  public override val __1206940244_Ptr: JNAPointer? by lazy {
    __1206940244_Interface.__1206940244_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1206940244_Interface)

  public constructor(
    queryTextAlternatives: IIterable<String?>,
    queryTextCompositionStart: WinDef.UINT,
    queryTextCompositionLength: WinDef.UINT
  ) : this(ABI.activate(queryTextAlternatives, queryTextCompositionStart,
      queryTextCompositionLength))

  private fun as_1206940244(): ISearchQueryLinguisticDetails.WithDefault {
    if(pointer == NULL) {
      return(ISearchQueryLinguisticDetails.ABI.makeISearchQueryLinguisticDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchQueryLinguisticDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchQueryLinguisticDetails.ABI.makeISearchQueryLinguisticDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchQueryLinguisticDetails> {
    public override fun getValue() = SearchQueryLinguisticDetails(pointer.getPointer(0))

    public fun setValue(value: SearchQueryLinguisticDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchQueryLinguisticDetails, MemoryAddress> {
    public val ISearchQueryLinguisticDetailsFactory_Instance: ISearchQueryLinguisticDetailsFactory
        by lazy {
      createISearchQueryLinguisticDetailsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISearchQueryLinguisticDetailsFactory(): ISearchQueryLinguisticDetailsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Search.SearchQueryLinguisticDetails".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISearchQueryLinguisticDetailsFactory.ABI.makeISearchQueryLinguisticDetailsFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      queryTextAlternatives: IIterable<String?>,
      queryTextCompositionStart: WinDef.UINT,
      queryTextCompositionLength: WinDef.UINT
    ): JNAPointer? =
        ISearchQueryLinguisticDetailsFactory_Instance.CreateInstance(queryTextAlternatives,
        queryTextCompositionStart, queryTextCompositionLength)?.pointer

    public override fun fromNative(segment: MemoryAddress): SearchQueryLinguisticDetails {
      val address = segment.toRawLongValue()
      return SearchQueryLinguisticDetails(Pointer(address))
    }

    public override fun toNative(obj: SearchQueryLinguisticDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
