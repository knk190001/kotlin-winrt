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

@ABIMarker(RcsEndUserMessageAction.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.RcsEndUserMessageAction;{92378737-9b42-46d3-9d5e-3c1b2dae7cb8})")
@WinRTByReference(brClass = RcsEndUserMessageAction.ByReference::class)
public class RcsEndUserMessageAction(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRcsEndUserMessageAction.WithDefault, IWinRTObject {
  private val __51635822_Interface: IRcsEndUserMessageAction.WithDefault by lazy {
    as_51635822()
  }


  public override val __51635822_Ptr: JNAPointer? by lazy {
    __51635822_Interface.__51635822_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__51635822_Interface)

  private fun as_51635822(): IRcsEndUserMessageAction.WithDefault {
    if(pointer == NULL) {
      return(IRcsEndUserMessageAction.ABI.makeIRcsEndUserMessageAction(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRcsEndUserMessageAction>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRcsEndUserMessageAction.ABI.makeIRcsEndUserMessageAction(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RcsEndUserMessageAction> {
    public override fun getValue() = RcsEndUserMessageAction(pointer.getPointer(0))

    public fun setValue(value: RcsEndUserMessageAction): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RcsEndUserMessageAction, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RcsEndUserMessageAction {
      val address = segment.toRawLongValue()
      return RcsEndUserMessageAction(Pointer(address))
    }

    public override fun toNative(obj: RcsEndUserMessageAction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
