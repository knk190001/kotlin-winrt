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

@ABIMarker(ValuePatternIdentifiers.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.ValuePatternIdentifiers;{fb493395-fb97-59d5-9323-4651ce964b55})")
@WinRTByReference(brClass = ValuePatternIdentifiers.ByReference::class)
public class ValuePatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IValuePatternIdentifiers.WithDefault, IWinRTObject {
  private val __2126167739_Interface: IValuePatternIdentifiers.WithDefault by lazy {
    as_2126167739()
  }


  public override val __2126167739_Ptr: JNAPointer? by lazy {
    __2126167739_Interface.__2126167739_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2126167739_Interface)

  private fun as_2126167739(): IValuePatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(IValuePatternIdentifiers.ABI.makeIValuePatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IValuePatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IValuePatternIdentifiers.ABI.makeIValuePatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ValuePatternIdentifiers> {
    public override fun getValue() = ValuePatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: ValuePatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ValuePatternIdentifiers, MemoryAddress> {
    public val IValuePatternIdentifiersStatics_Instance: IValuePatternIdentifiersStatics by lazy {
      createIValuePatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIValuePatternIdentifiersStatics(): IValuePatternIdentifiersStatics {
      val refiid = Guid.REFIID(IValuePatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.ValuePatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IValuePatternIdentifiersStatics.ABI.makeIValuePatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ValuePatternIdentifiers {
      val address = segment.toRawLongValue()
      return ValuePatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: ValuePatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsReadOnlyProperty() =
        ABI.IValuePatternIdentifiersStatics_Instance.get_IsReadOnlyProperty()

    public fun get_ValueProperty() =
        ABI.IValuePatternIdentifiersStatics_Instance.get_ValueProperty()
  }
}
