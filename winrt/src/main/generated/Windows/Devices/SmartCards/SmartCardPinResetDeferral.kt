package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardPinResetDeferral.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardPinResetDeferral;{18c94aac-7805-4004-85e4-bbefac8f6884})")
@WinRTByReference(brClass = SmartCardPinResetDeferral.ByReference::class)
public class SmartCardPinResetDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardPinResetDeferral.WithDefault, IWinRTObject {
  private val __197729163_Interface: ISmartCardPinResetDeferral.WithDefault by lazy {
    as_197729163()
  }


  public override val __197729163_Ptr: JNAPointer? by lazy {
    __197729163_Interface.__197729163_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__197729163_Interface)

  private fun as_197729163(): ISmartCardPinResetDeferral.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardPinResetDeferral.ABI.makeISmartCardPinResetDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardPinResetDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardPinResetDeferral.ABI.makeISmartCardPinResetDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardPinResetDeferral> {
    public override fun getValue() = SmartCardPinResetDeferral(pointer.getPointer(0))

    public fun setValue(value: SmartCardPinResetDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardPinResetDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmartCardPinResetDeferral {
      val address = segment.toRawLongValue()
      return SmartCardPinResetDeferral(Pointer(address))
    }

    public override fun toNative(obj: SmartCardPinResetDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
