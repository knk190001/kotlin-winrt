package Windows.ApplicationModel.Search

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SearchPane.ABI::class)
@Signature("rc(Windows.ApplicationModel.Search.SearchPane;{fdacec38-3700-4d73-91a1-2f998674238a})")
@WinRTByReference(brClass = SearchPane.ByReference::class)
public class SearchPane(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISearchPane.WithDefault, IWinRTObject {
  private val __347021273_Interface: ISearchPane.WithDefault by lazy {
    as_347021273()
  }


  public override val __347021273_Ptr: JNAPointer? by lazy {
    __347021273_Interface.__347021273_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__347021273_Interface)

  private fun as_347021273(): ISearchPane.WithDefault {
    if(pointer == NULL) {
      return(ISearchPane.ABI.makeISearchPane(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISearchPane>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISearchPane.ABI.makeISearchPane(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SearchPane> {
    public override fun getValue() = SearchPane(pointer.getPointer(0))

    public fun setValue(value: SearchPane): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SearchPane, MemoryAddress> {
    public val ISearchPaneStatics_Instance: ISearchPaneStatics by lazy {
      createISearchPaneStatics()
    }


    public val ISearchPaneStaticsWithHideThisApplication_Instance:
        ISearchPaneStaticsWithHideThisApplication by lazy {
      createISearchPaneStaticsWithHideThisApplication()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISearchPaneStatics(): ISearchPaneStatics {
      val refiid = Guid.REFIID(ISearchPaneStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Search.SearchPane".toHandle(),refiid,interfacePtr)
      val result = ISearchPaneStatics.ABI.makeISearchPaneStatics(interfacePtr.value)
      return result
    }

    public fun createISearchPaneStaticsWithHideThisApplication():
        ISearchPaneStaticsWithHideThisApplication {
      val refiid = Guid.REFIID(ISearchPaneStaticsWithHideThisApplication.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Search.SearchPane".toHandle(),refiid,interfacePtr)
      val result =
          ISearchPaneStaticsWithHideThisApplication.ABI.makeISearchPaneStaticsWithHideThisApplication(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SearchPane {
      val address = segment.toRawLongValue()
      return SearchPane(Pointer(address))
    }

    public override fun toNative(obj: SearchPane): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForCurrentView() = ABI.ISearchPaneStatics_Instance.GetForCurrentView()

    public fun HideThisApplication() =
        ABI.ISearchPaneStaticsWithHideThisApplication_Instance.HideThisApplication()
  }
}
