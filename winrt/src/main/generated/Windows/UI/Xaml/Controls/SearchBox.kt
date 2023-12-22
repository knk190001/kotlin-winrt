package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.ISearchBoxFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SearchBox.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.SearchBox;{f89ecc5a-99ba-4bd4-966c-f11fa443d13c})")
@WinRTByReference(brClass = SearchBox.ByReference::class)
public open class SearchBox(
  ptr: JNAPointer? = NULL
) : Control(ptr), ISearchBox.WithDefault, IWinRTObject {
  private val __487693721_Interface: ISearchBox.WithDefault by lazy {
    as_487693721()
  }


  public override val __487693721_Ptr: JNAPointer? by lazy {
    __487693721_Interface.__487693721_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__487693721_Interface)

  public constructor() : this(ABI.activate())

  private fun as_487693721(): ISearchBox.WithDefault {
    if(pointer == NULL) {
      return(ISearchBox.ABI.makeISearchBox(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchBox>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchBox.ABI.makeISearchBox(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SearchBox> {
    public override fun getValue() = SearchBox(pointer.getPointer(0))

    public fun setValue(value: SearchBox): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchBox, MemoryAddress> {
    public val ISearchBoxStatics_Instance: ISearchBoxStatics by lazy {
      createISearchBoxStatics()
    }


    public val ISearchBoxFactory_Instance: ISearchBoxFactory by lazy {
      createISearchBoxFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISearchBoxStatics(): ISearchBoxStatics {
      val refiid = Guid.REFIID(ISearchBoxStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.SearchBox".toHandle(),refiid,interfacePtr)
      val result = ISearchBoxStatics.ABI.makeISearchBoxStatics(interfacePtr.value)
      return result
    }

    public fun createISearchBoxFactory(): ISearchBoxFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.SearchBox".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISearchBoxFactory.ABI.makeISearchBoxFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = ISearchBoxFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): SearchBox {
      val address = segment.toRawLongValue()
      return SearchBox(Pointer(address))
    }

    public override fun toNative(obj: SearchBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SearchHistoryEnabledProperty() =
        ABI.ISearchBoxStatics_Instance.get_SearchHistoryEnabledProperty()

    public fun get_SearchHistoryContextProperty() =
        ABI.ISearchBoxStatics_Instance.get_SearchHistoryContextProperty()

    public fun get_PlaceholderTextProperty() =
        ABI.ISearchBoxStatics_Instance.get_PlaceholderTextProperty()

    public fun get_QueryTextProperty() = ABI.ISearchBoxStatics_Instance.get_QueryTextProperty()

    public fun get_FocusOnKeyboardInputProperty() =
        ABI.ISearchBoxStatics_Instance.get_FocusOnKeyboardInputProperty()

    public fun get_ChooseSuggestionOnEnterProperty() =
        ABI.ISearchBoxStatics_Instance.get_ChooseSuggestionOnEnterProperty()
  }
}
