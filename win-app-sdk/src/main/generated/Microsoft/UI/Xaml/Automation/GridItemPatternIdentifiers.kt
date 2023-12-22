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

@ABIMarker(GridItemPatternIdentifiers.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.GridItemPatternIdentifiers;{93609087-1114-557d-b17b-f801e41cebbb})")
@WinRTByReference(brClass = GridItemPatternIdentifiers.ByReference::class)
public class GridItemPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGridItemPatternIdentifiers.WithDefault, IWinRTObject {
  private val __1638437479_Interface: IGridItemPatternIdentifiers.WithDefault by lazy {
    as_1638437479()
  }


  public override val __1638437479_Ptr: JNAPointer? by lazy {
    __1638437479_Interface.__1638437479_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1638437479_Interface)

  private fun as_1638437479(): IGridItemPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(IGridItemPatternIdentifiers.ABI.makeIGridItemPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGridItemPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGridItemPatternIdentifiers.ABI.makeIGridItemPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GridItemPatternIdentifiers> {
    public override fun getValue() = GridItemPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: GridItemPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GridItemPatternIdentifiers, MemoryAddress> {
    public val IGridItemPatternIdentifiersStatics_Instance: IGridItemPatternIdentifiersStatics by
        lazy {
      createIGridItemPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGridItemPatternIdentifiersStatics(): IGridItemPatternIdentifiersStatics {
      val refiid = Guid.REFIID(IGridItemPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.GridItemPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IGridItemPatternIdentifiersStatics.ABI.makeIGridItemPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GridItemPatternIdentifiers {
      val address = segment.toRawLongValue()
      return GridItemPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: GridItemPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ColumnProperty() =
        ABI.IGridItemPatternIdentifiersStatics_Instance.get_ColumnProperty()

    public fun get_ColumnSpanProperty() =
        ABI.IGridItemPatternIdentifiersStatics_Instance.get_ColumnSpanProperty()

    public fun get_ContainingGridProperty() =
        ABI.IGridItemPatternIdentifiersStatics_Instance.get_ContainingGridProperty()

    public fun get_RowProperty() = ABI.IGridItemPatternIdentifiersStatics_Instance.get_RowProperty()

    public fun get_RowSpanProperty() =
        ABI.IGridItemPatternIdentifiersStatics_Instance.get_RowSpanProperty()
  }
}
