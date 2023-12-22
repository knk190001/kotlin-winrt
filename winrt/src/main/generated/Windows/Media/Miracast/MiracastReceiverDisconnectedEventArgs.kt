package Windows.Media.Miracast

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

@ABIMarker(MiracastReceiverDisconnectedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Miracast.MiracastReceiverDisconnectedEventArgs;{d9a15e5e-5fee-57e6-b4b0-04727db93229})")
@WinRTByReference(brClass = MiracastReceiverDisconnectedEventArgs.ByReference::class)
public class MiracastReceiverDisconnectedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMiracastReceiverDisconnectedEventArgs.WithDefault, IWinRTObject {
  private val __1868155911_Interface: IMiracastReceiverDisconnectedEventArgs.WithDefault by lazy {
    as_1868155911()
  }


  public override val __1868155911_Ptr: JNAPointer? by lazy {
    __1868155911_Interface.__1868155911_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1868155911_Interface)

  private fun as_1868155911(): IMiracastReceiverDisconnectedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMiracastReceiverDisconnectedEventArgs.ABI.makeIMiracastReceiverDisconnectedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMiracastReceiverDisconnectedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMiracastReceiverDisconnectedEventArgs.ABI.makeIMiracastReceiverDisconnectedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MiracastReceiverDisconnectedEventArgs> {
    public override fun getValue() = MiracastReceiverDisconnectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MiracastReceiverDisconnectedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MiracastReceiverDisconnectedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MiracastReceiverDisconnectedEventArgs {
      val address = segment.toRawLongValue()
      return MiracastReceiverDisconnectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MiracastReceiverDisconnectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
