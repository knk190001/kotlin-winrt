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

@ABIMarker(GridPatternIdentifiers.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.GridPatternIdentifiers;{c902980f-96c5-450c-9044-7e52c24f9e94})")
@WinRTByReference(brClass = GridPatternIdentifiers.ByReference::class)
public class GridPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGridPatternIdentifiers.WithDefault, IWinRTObject {
  private val __1426740613_Interface: IGridPatternIdentifiers.WithDefault by lazy {
    as_1426740613()
  }


  public override val __1426740613_Ptr: JNAPointer? by lazy {
    __1426740613_Interface.__1426740613_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1426740613_Interface)

  private fun as_1426740613(): IGridPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(IGridPatternIdentifiers.ABI.makeIGridPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGridPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGridPatternIdentifiers.ABI.makeIGridPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GridPatternIdentifiers> {
    public override fun getValue() = GridPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: GridPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GridPatternIdentifiers, MemoryAddress> {
    public val IGridPatternIdentifiersStatics_Instance: IGridPatternIdentifiersStatics by lazy {
      createIGridPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGridPatternIdentifiersStatics(): IGridPatternIdentifiersStatics {
      val refiid = Guid.REFIID(IGridPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.GridPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IGridPatternIdentifiersStatics.ABI.makeIGridPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GridPatternIdentifiers {
      val address = segment.toRawLongValue()
      return GridPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: GridPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ColumnCountProperty() =
        ABI.IGridPatternIdentifiersStatics_Instance.get_ColumnCountProperty()

    public fun get_RowCountProperty() =
        ABI.IGridPatternIdentifiersStatics_Instance.get_RowCountProperty()
  }
}
