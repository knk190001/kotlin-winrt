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

@ABIMarker(RcsEndUserMessageAvailableEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.Chat.RcsEndUserMessageAvailableEventArgs;{2d45ae01-3f89-41ea-9702-9e9ed411aa98})")
@WinRTByReference(brClass = RcsEndUserMessageAvailableEventArgs.ByReference::class)
public class RcsEndUserMessageAvailableEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRcsEndUserMessageAvailableEventArgs.WithDefault, IWinRTObject {
  private val __426839254_Interface: IRcsEndUserMessageAvailableEventArgs.WithDefault by lazy {
    as_426839254()
  }


  public override val __426839254_Ptr: JNAPointer? by lazy {
    __426839254_Interface.__426839254_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__426839254_Interface)

  private fun as_426839254(): IRcsEndUserMessageAvailableEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRcsEndUserMessageAvailableEventArgs.ABI.makeIRcsEndUserMessageAvailableEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRcsEndUserMessageAvailableEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRcsEndUserMessageAvailableEventArgs.ABI.makeIRcsEndUserMessageAvailableEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RcsEndUserMessageAvailableEventArgs> {
    public override fun getValue() = RcsEndUserMessageAvailableEventArgs(pointer.getPointer(0))

    public fun setValue(value: RcsEndUserMessageAvailableEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RcsEndUserMessageAvailableEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RcsEndUserMessageAvailableEventArgs {
      val address = segment.toRawLongValue()
      return RcsEndUserMessageAvailableEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RcsEndUserMessageAvailableEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
