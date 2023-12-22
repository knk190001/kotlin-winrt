package Windows.ApplicationModel.Chat

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

@ABIMarker(RcsEndUserMessageAvailableTriggerDetails.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.RcsEndUserMessageAvailableTriggerDetails;{5b97742d-351f-4692-b41e-1b035dc18986})")
@WinRTByReference(brClass = RcsEndUserMessageAvailableTriggerDetails.ByReference::class)
public class RcsEndUserMessageAvailableTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRcsEndUserMessageAvailableTriggerDetails.WithDefault, IWinRTObject {
  private val __1492377417_Interface: IRcsEndUserMessageAvailableTriggerDetails.WithDefault by
      lazy {
    as_1492377417()
  }


  public override val __1492377417_Ptr: JNAPointer? by lazy {
    __1492377417_Interface.__1492377417_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1492377417_Interface)

  private fun as_1492377417(): IRcsEndUserMessageAvailableTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IRcsEndUserMessageAvailableTriggerDetails.ABI.makeIRcsEndUserMessageAvailableTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRcsEndUserMessageAvailableTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRcsEndUserMessageAvailableTriggerDetails.ABI.makeIRcsEndUserMessageAvailableTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RcsEndUserMessageAvailableTriggerDetails> {
    public override fun getValue() = RcsEndUserMessageAvailableTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: RcsEndUserMessageAvailableTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RcsEndUserMessageAvailableTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RcsEndUserMessageAvailableTriggerDetails {
      val address = segment.toRawLongValue()
      return RcsEndUserMessageAvailableTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: RcsEndUserMessageAvailableTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
