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

@ABIMarker(SpreadsheetItemPatternIdentifiers.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.SpreadsheetItemPatternIdentifiers;{dca2ec46-8564-5c9c-ba90-2c08455f697b})")
@WinRTByReference(brClass = SpreadsheetItemPatternIdentifiers.ByReference::class)
public class SpreadsheetItemPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpreadsheetItemPatternIdentifiers.WithDefault, IWinRTObject {
  private val __1739590867_Interface: ISpreadsheetItemPatternIdentifiers.WithDefault by lazy {
    as_1739590867()
  }


  public override val __1739590867_Ptr: JNAPointer? by lazy {
    __1739590867_Interface.__1739590867_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1739590867_Interface)

  private fun as_1739590867(): ISpreadsheetItemPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(ISpreadsheetItemPatternIdentifiers.ABI.makeISpreadsheetItemPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpreadsheetItemPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpreadsheetItemPatternIdentifiers.ABI.makeISpreadsheetItemPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpreadsheetItemPatternIdentifiers> {
    public override fun getValue() = SpreadsheetItemPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: SpreadsheetItemPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpreadsheetItemPatternIdentifiers, MemoryAddress> {
    public val ISpreadsheetItemPatternIdentifiersStatics_Instance:
        ISpreadsheetItemPatternIdentifiersStatics by lazy {
      createISpreadsheetItemPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpreadsheetItemPatternIdentifiersStatics():
        ISpreadsheetItemPatternIdentifiersStatics {
      val refiid = Guid.REFIID(ISpreadsheetItemPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.SpreadsheetItemPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          ISpreadsheetItemPatternIdentifiersStatics.ABI.makeISpreadsheetItemPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpreadsheetItemPatternIdentifiers {
      val address = segment.toRawLongValue()
      return SpreadsheetItemPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: SpreadsheetItemPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FormulaProperty() =
        ABI.ISpreadsheetItemPatternIdentifiersStatics_Instance.get_FormulaProperty()
  }
}
