package Microsoft.UI.Xaml.Automation

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

@ABIMarker(SelectionPatternIdentifiers.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.SelectionPatternIdentifiers;{401743d2-1fba-5d05-b89f-631676453237})")
@WinRTByReference(brClass = SelectionPatternIdentifiers.ByReference::class)
public class SelectionPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISelectionPatternIdentifiers.WithDefault, IWinRTObject {
  private val __2040691808_Interface: ISelectionPatternIdentifiers.WithDefault by lazy {
    as_2040691808()
  }


  public override val __2040691808_Ptr: JNAPointer? by lazy {
    __2040691808_Interface.__2040691808_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2040691808_Interface)

  private fun as_2040691808(): ISelectionPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(ISelectionPatternIdentifiers.ABI.makeISelectionPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectionPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectionPatternIdentifiers.ABI.makeISelectionPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SelectionPatternIdentifiers> {
    public override fun getValue() = SelectionPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: SelectionPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SelectionPatternIdentifiers, MemoryAddress> {
    public val ISelectionPatternIdentifiersStatics_Instance: ISelectionPatternIdentifiersStatics by
        lazy {
      createISelectionPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISelectionPatternIdentifiersStatics(): ISelectionPatternIdentifiersStatics {
      val refiid = Guid.REFIID(ISelectionPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.SelectionPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          ISelectionPatternIdentifiersStatics.ABI.makeISelectionPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SelectionPatternIdentifiers {
      val address = segment.toRawLongValue()
      return SelectionPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: SelectionPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CanSelectMultipleProperty() =
        ABI.ISelectionPatternIdentifiersStatics_Instance.get_CanSelectMultipleProperty()

    public fun get_IsSelectionRequiredProperty() =
        ABI.ISelectionPatternIdentifiersStatics_Instance.get_IsSelectionRequiredProperty()

    public fun get_SelectionProperty() =
        ABI.ISelectionPatternIdentifiersStatics_Instance.get_SelectionProperty()
  }
}
