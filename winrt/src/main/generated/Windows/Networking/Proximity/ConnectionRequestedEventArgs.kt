package Windows.Networking.Proximity

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

@ABIMarker(ConnectionRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.Proximity.ConnectionRequestedEventArgs;{eb6891ae-4f1e-4c66-bd0d-46924a942e08})")
@WinRTByReference(brClass = ConnectionRequestedEventArgs.ByReference::class)
public class ConnectionRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConnectionRequestedEventArgs.WithDefault, IWinRTObject {
  private val __544328832_Interface: IConnectionRequestedEventArgs.WithDefault by lazy {
    as_544328832()
  }


  public override val __544328832_Ptr: JNAPointer? by lazy {
    __544328832_Interface.__544328832_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__544328832_Interface)

  private fun as_544328832(): IConnectionRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IConnectionRequestedEventArgs.ABI.makeIConnectionRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectionRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectionRequestedEventArgs.ABI.makeIConnectionRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConnectionRequestedEventArgs> {
    public override fun getValue() = ConnectionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ConnectionRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConnectionRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ConnectionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return ConnectionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ConnectionRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
