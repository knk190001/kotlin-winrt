package Windows.Networking.Sockets

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

@ABIMarker(StreamSocketListenerConnectionReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.Sockets.StreamSocketListenerConnectionReceivedEventArgs;{0c472ea9-373f-447b-85b1-ddd4548803ba})")
@WinRTByReference(brClass = StreamSocketListenerConnectionReceivedEventArgs.ByReference::class)
public class StreamSocketListenerConnectionReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStreamSocketListenerConnectionReceivedEventArgs.WithDefault, IWinRTObject {
  private val __934388569_Interface: IStreamSocketListenerConnectionReceivedEventArgs.WithDefault by
      lazy {
    as_934388569()
  }


  public override val __934388569_Ptr: JNAPointer? by lazy {
    __934388569_Interface.__934388569_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__934388569_Interface)

  private fun as_934388569(): IStreamSocketListenerConnectionReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocketListenerConnectionReceivedEventArgs.ABI.makeIStreamSocketListenerConnectionReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocketListenerConnectionReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocketListenerConnectionReceivedEventArgs.ABI.makeIStreamSocketListenerConnectionReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StreamSocketListenerConnectionReceivedEventArgs> {
    public override fun getValue() =
        StreamSocketListenerConnectionReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: StreamSocketListenerConnectionReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StreamSocketListenerConnectionReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        StreamSocketListenerConnectionReceivedEventArgs {
      val address = segment.toRawLongValue()
      return StreamSocketListenerConnectionReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: StreamSocketListenerConnectionReceivedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
