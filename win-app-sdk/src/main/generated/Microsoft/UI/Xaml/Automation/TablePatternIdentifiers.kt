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

@ABIMarker(TablePatternIdentifiers.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.TablePatternIdentifiers;{3d7f9c0b-ff8f-50fa-bc01-2cc3c2e06e2c})")
@WinRTByReference(brClass = TablePatternIdentifiers.ByReference::class)
public class TablePatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITablePatternIdentifiers.WithDefault, IWinRTObject {
  private val __1245179490_Interface: ITablePatternIdentifiers.WithDefault by lazy {
    as_1245179490()
  }


  public override val __1245179490_Ptr: JNAPointer? by lazy {
    __1245179490_Interface.__1245179490_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1245179490_Interface)

  private fun as_1245179490(): ITablePatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(ITablePatternIdentifiers.ABI.makeITablePatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITablePatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITablePatternIdentifiers.ABI.makeITablePatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TablePatternIdentifiers> {
    public override fun getValue() = TablePatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: TablePatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TablePatternIdentifiers, MemoryAddress> {
    public val ITablePatternIdentifiersStatics_Instance: ITablePatternIdentifiersStatics by lazy {
      createITablePatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITablePatternIdentifiersStatics(): ITablePatternIdentifiersStatics {
      val refiid = Guid.REFIID(ITablePatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.TablePatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          ITablePatternIdentifiersStatics.ABI.makeITablePatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TablePatternIdentifiers {
      val address = segment.toRawLongValue()
      return TablePatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: TablePatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ColumnHeadersProperty() =
        ABI.ITablePatternIdentifiersStatics_Instance.get_ColumnHeadersProperty()

    public fun get_RowHeadersProperty() =
        ABI.ITablePatternIdentifiersStatics_Instance.get_RowHeadersProperty()

    public fun get_RowOrColumnMajorProperty() =
        ABI.ITablePatternIdentifiersStatics_Instance.get_RowOrColumnMajorProperty()
  }
}
