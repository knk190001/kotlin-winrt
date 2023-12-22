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

@ABIMarker(SmartCardPinResetRequest.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardPinResetRequest;{12fe3c4d-5fb9-4e8e-9ff6-61f475124fef})")
@WinRTByReference(brClass = SmartCardPinResetRequest.ByReference::class)
public class SmartCardPinResetRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardPinResetRequest.WithDefault, IWinRTObject {
  private val __27207057_Interface: ISmartCardPinResetRequest.WithDefault by lazy {
    as_27207057()
  }


  public override val __27207057_Ptr: JNAPointer? by lazy {
    __27207057_Interface.__27207057_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__27207057_Interface)

  private fun as_27207057(): ISmartCardPinResetRequest.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardPinResetRequest.ABI.makeISmartCardPinResetRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardPinResetRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardPinResetRequest.ABI.makeISmartCardPinResetRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardPinResetRequest> {
    public override fun getValue() = SmartCardPinResetRequest(pointer.getPointer(0))

    public fun setValue(value: SmartCardPinResetRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardPinResetRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmartCardPinResetRequest {
      val address = segment.toRawLongValue()
      return SmartCardPinResetRequest(Pointer(address))
    }

    public override fun toNative(obj: SmartCardPinResetRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
