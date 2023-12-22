package Windows.Networking.Connectivity

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

@ABIMarker(ConnectivityInterval.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.ConnectivityInterval;{4faa3fff-6746-4824-a964-eed8e87f8709})")
@WinRTByReference(brClass = ConnectivityInterval.ByReference::class)
public class ConnectivityInterval(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConnectivityInterval.WithDefault, IWinRTObject {
  private val __2068666719_Interface: IConnectivityInterval.WithDefault by lazy {
    as_2068666719()
  }


  public override val __2068666719_Ptr: JNAPointer? by lazy {
    __2068666719_Interface.__2068666719_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2068666719_Interface)

  private fun as_2068666719(): IConnectivityInterval.WithDefault {
    if(pointer == NULL) {
      return(IConnectivityInterval.ABI.makeIConnectivityInterval(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectivityInterval>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectivityInterval.ABI.makeIConnectivityInterval(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConnectivityInterval> {
    public override fun getValue() = ConnectivityInterval(pointer.getPointer(0))

    public fun setValue(value: ConnectivityInterval): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConnectivityInterval, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ConnectivityInterval {
      val address = segment.toRawLongValue()
      return ConnectivityInterval(Pointer(address))
    }

    public override fun toNative(obj: ConnectivityInterval): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
