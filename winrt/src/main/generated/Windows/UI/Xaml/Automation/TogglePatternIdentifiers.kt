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

@ABIMarker(TogglePatternIdentifiers.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.TogglePatternIdentifiers;{7e191f6b-34d4-4ae7-83ac-29f88882d985})")
@WinRTByReference(brClass = TogglePatternIdentifiers.ByReference::class)
public class TogglePatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITogglePatternIdentifiers.WithDefault, IWinRTObject {
  private val __1741207479_Interface: ITogglePatternIdentifiers.WithDefault by lazy {
    as_1741207479()
  }


  public override val __1741207479_Ptr: JNAPointer? by lazy {
    __1741207479_Interface.__1741207479_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1741207479_Interface)

  private fun as_1741207479(): ITogglePatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(ITogglePatternIdentifiers.ABI.makeITogglePatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITogglePatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITogglePatternIdentifiers.ABI.makeITogglePatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TogglePatternIdentifiers> {
    public override fun getValue() = TogglePatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: TogglePatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TogglePatternIdentifiers, MemoryAddress> {
    public val ITogglePatternIdentifiersStatics_Instance: ITogglePatternIdentifiersStatics by lazy {
      createITogglePatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITogglePatternIdentifiersStatics(): ITogglePatternIdentifiersStatics {
      val refiid = Guid.REFIID(ITogglePatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.TogglePatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          ITogglePatternIdentifiersStatics.ABI.makeITogglePatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TogglePatternIdentifiers {
      val address = segment.toRawLongValue()
      return TogglePatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: TogglePatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ToggleStateProperty() =
        ABI.ITogglePatternIdentifiersStatics_Instance.get_ToggleStateProperty()
  }
}
