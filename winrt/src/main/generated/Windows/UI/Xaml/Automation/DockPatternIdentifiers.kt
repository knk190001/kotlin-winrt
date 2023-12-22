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

@ABIMarker(DockPatternIdentifiers.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.DockPatternIdentifiers;{ccd7f4e6-e4f9-47ff-bde7-378b11f78e09})")
@WinRTByReference(brClass = DockPatternIdentifiers.ByReference::class)
public class DockPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDockPatternIdentifiers.WithDefault, IWinRTObject {
  private val __595017768_Interface: IDockPatternIdentifiers.WithDefault by lazy {
    as_595017768()
  }


  public override val __595017768_Ptr: JNAPointer? by lazy {
    __595017768_Interface.__595017768_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__595017768_Interface)

  private fun as_595017768(): IDockPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(IDockPatternIdentifiers.ABI.makeIDockPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDockPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDockPatternIdentifiers.ABI.makeIDockPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DockPatternIdentifiers> {
    public override fun getValue() = DockPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: DockPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DockPatternIdentifiers, MemoryAddress> {
    public val IDockPatternIdentifiersStatics_Instance: IDockPatternIdentifiersStatics by lazy {
      createIDockPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDockPatternIdentifiersStatics(): IDockPatternIdentifiersStatics {
      val refiid = Guid.REFIID(IDockPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.DockPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IDockPatternIdentifiersStatics.ABI.makeIDockPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DockPatternIdentifiers {
      val address = segment.toRawLongValue()
      return DockPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: DockPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DockPositionProperty() =
        ABI.IDockPatternIdentifiersStatics_Instance.get_DockPositionProperty()
  }
}
