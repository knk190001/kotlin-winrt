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

@ABIMarker(WindowPatternIdentifiers.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.WindowPatternIdentifiers;{bec579e1-91be-5d8f-aaca-6ad8839872d2})")
@WinRTByReference(brClass = WindowPatternIdentifiers.ByReference::class)
public class WindowPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWindowPatternIdentifiers.WithDefault, IWinRTObject {
  private val __568613840_Interface: IWindowPatternIdentifiers.WithDefault by lazy {
    as_568613840()
  }


  public override val __568613840_Ptr: JNAPointer? by lazy {
    __568613840_Interface.__568613840_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__568613840_Interface)

  private fun as_568613840(): IWindowPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(IWindowPatternIdentifiers.ABI.makeIWindowPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindowPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindowPatternIdentifiers.ABI.makeIWindowPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WindowPatternIdentifiers> {
    public override fun getValue() = WindowPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: WindowPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WindowPatternIdentifiers, MemoryAddress> {
    public val IWindowPatternIdentifiersStatics_Instance: IWindowPatternIdentifiersStatics by lazy {
      createIWindowPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWindowPatternIdentifiersStatics(): IWindowPatternIdentifiersStatics {
      val refiid = Guid.REFIID(IWindowPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.WindowPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IWindowPatternIdentifiersStatics.ABI.makeIWindowPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WindowPatternIdentifiers {
      val address = segment.toRawLongValue()
      return WindowPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: WindowPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CanMaximizeProperty() =
        ABI.IWindowPatternIdentifiersStatics_Instance.get_CanMaximizeProperty()

    public fun get_CanMinimizeProperty() =
        ABI.IWindowPatternIdentifiersStatics_Instance.get_CanMinimizeProperty()

    public fun get_IsModalProperty() =
        ABI.IWindowPatternIdentifiersStatics_Instance.get_IsModalProperty()

    public fun get_IsTopmostProperty() =
        ABI.IWindowPatternIdentifiersStatics_Instance.get_IsTopmostProperty()

    public fun get_WindowInteractionStateProperty() =
        ABI.IWindowPatternIdentifiersStatics_Instance.get_WindowInteractionStateProperty()

    public fun get_WindowVisualStateProperty() =
        ABI.IWindowPatternIdentifiersStatics_Instance.get_WindowVisualStateProperty()
  }
}
