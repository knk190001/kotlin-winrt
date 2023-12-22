package Windows.ApplicationModel.Search.Core

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(SearchSuggestionManager.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.Core.SearchSuggestionManager;{3f0c50a1-cb9d-497b-b500-3c04ac959ad2})")
@WinRTByReference(brClass = SearchSuggestionManager.ByReference::class)
public class SearchSuggestionManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchSuggestionManager.WithDefault, IWinRTObject {
  private val __1734756877_Interface: ISearchSuggestionManager.WithDefault by lazy {
    as_1734756877()
  }


  public override val __1734756877_Ptr: JNAPointer? by lazy {
    __1734756877_Interface.__1734756877_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1734756877_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1734756877(): ISearchSuggestionManager.WithDefault {
    if(pointer == NULL) {
      return(ISearchSuggestionManager.ABI.makeISearchSuggestionManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchSuggestionManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchSuggestionManager.ABI.makeISearchSuggestionManager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SearchSuggestionManager> {
    public override fun getValue() = SearchSuggestionManager(pointer.getPointer(0))

    public fun setValue(value: SearchSuggestionManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchSuggestionManager, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Search.Core.SearchSuggestionManager".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): SearchSuggestionManager {
      val address = segment.toRawLongValue()
      return SearchSuggestionManager(Pointer(address))
    }

    public override fun toNative(obj: SearchSuggestionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
