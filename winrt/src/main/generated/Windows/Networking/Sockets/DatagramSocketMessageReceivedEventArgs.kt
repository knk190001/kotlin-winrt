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

@ABIMarker(DatagramSocketMessageReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.Sockets.DatagramSocketMessageReceivedEventArgs;{9e2ddca2-1712-4ce4-b179-8c652c6d107e})")
@WinRTByReference(brClass = DatagramSocketMessageReceivedEventArgs.ByReference::class)
public class DatagramSocketMessageReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDatagramSocketMessageReceivedEventArgs.WithDefault, IWinRTObject {
  private val __1810144997_Interface: IDatagramSocketMessageReceivedEventArgs.WithDefault by lazy {
    as_1810144997()
  }


  public override val __1810144997_Ptr: JNAPointer? by lazy {
    __1810144997_Interface.__1810144997_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1810144997_Interface)

  private fun as_1810144997(): IDatagramSocketMessageReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDatagramSocketMessageReceivedEventArgs.ABI.makeIDatagramSocketMessageReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDatagramSocketMessageReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDatagramSocketMessageReceivedEventArgs.ABI.makeIDatagramSocketMessageReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DatagramSocketMessageReceivedEventArgs> {
    public override fun getValue() = DatagramSocketMessageReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DatagramSocketMessageReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DatagramSocketMessageReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DatagramSocketMessageReceivedEventArgs {
      val address = segment.toRawLongValue()
      return DatagramSocketMessageReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DatagramSocketMessageReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
