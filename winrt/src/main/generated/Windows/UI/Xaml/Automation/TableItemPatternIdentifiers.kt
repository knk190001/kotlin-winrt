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

@ABIMarker(TableItemPatternIdentifiers.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.TableItemPatternIdentifiers;{c326e5ad-8077-4c64-98e4-e83bcf1b4389})")
@WinRTByReference(brClass = TableItemPatternIdentifiers.ByReference::class)
public class TableItemPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITableItemPatternIdentifiers.WithDefault, IWinRTObject {
  private val __956629152_Interface: ITableItemPatternIdentifiers.WithDefault by lazy {
    as_956629152()
  }


  public override val __956629152_Ptr: JNAPointer? by lazy {
    __956629152_Interface.__956629152_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__956629152_Interface)

  private fun as_956629152(): ITableItemPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(ITableItemPatternIdentifiers.ABI.makeITableItemPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITableItemPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITableItemPatternIdentifiers.ABI.makeITableItemPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TableItemPatternIdentifiers> {
    public override fun getValue() = TableItemPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: TableItemPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TableItemPatternIdentifiers, MemoryAddress> {
    public val ITableItemPatternIdentifiersStatics_Instance: ITableItemPatternIdentifiersStatics by
        lazy {
      createITableItemPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITableItemPatternIdentifiersStatics(): ITableItemPatternIdentifiersStatics {
      val refiid = Guid.REFIID(ITableItemPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.TableItemPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          ITableItemPatternIdentifiersStatics.ABI.makeITableItemPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TableItemPatternIdentifiers {
      val address = segment.toRawLongValue()
      return TableItemPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: TableItemPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ColumnHeaderItemsProperty() =
        ABI.ITableItemPatternIdentifiersStatics_Instance.get_ColumnHeaderItemsProperty()

    public fun get_RowHeaderItemsProperty() =
        ABI.ITableItemPatternIdentifiersStatics_Instance.get_RowHeaderItemsProperty()
  }
}
