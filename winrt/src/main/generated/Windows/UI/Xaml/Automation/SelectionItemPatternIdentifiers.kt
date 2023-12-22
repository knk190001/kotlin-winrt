package Windows.UI.Xaml.Automation

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

@ABIMarker(SelectionItemPatternIdentifiers.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.SelectionItemPatternIdentifiers;{2dafa41a-3ef8-4bb5-a02b-3ee1b2274740})")
@WinRTByReference(brClass = SelectionItemPatternIdentifiers.ByReference::class)
public class SelectionItemPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISelectionItemPatternIdentifiers.WithDefault, IWinRTObject {
  private val __646965598_Interface: ISelectionItemPatternIdentifiers.WithDefault by lazy {
    as_646965598()
  }


  public override val __646965598_Ptr: JNAPointer? by lazy {
    __646965598_Interface.__646965598_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__646965598_Interface)

  private fun as_646965598(): ISelectionItemPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(ISelectionItemPatternIdentifiers.ABI.makeISelectionItemPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectionItemPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectionItemPatternIdentifiers.ABI.makeISelectionItemPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SelectionItemPatternIdentifiers> {
    public override fun getValue() = SelectionItemPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: SelectionItemPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SelectionItemPatternIdentifiers, MemoryAddress> {
    public val ISelectionItemPatternIdentifiersStatics_Instance:
        ISelectionItemPatternIdentifiersStatics by lazy {
      createISelectionItemPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISelectionItemPatternIdentifiersStatics():
        ISelectionItemPatternIdentifiersStatics {
      val refiid = Guid.REFIID(ISelectionItemPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.SelectionItemPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          ISelectionItemPatternIdentifiersStatics.ABI.makeISelectionItemPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SelectionItemPatternIdentifiers {
      val address = segment.toRawLongValue()
      return SelectionItemPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: SelectionItemPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsSelectedProperty() =
        ABI.ISelectionItemPatternIdentifiersStatics_Instance.get_IsSelectedProperty()

    public fun get_SelectionContainerProperty() =
        ABI.ISelectionItemPatternIdentifiersStatics_Instance.get_SelectionContainerProperty()
  }
}
