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

@ABIMarker(ConnectionCost.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.ConnectionCost;{bad7d829-3416-4b10-a202-bac0b075bdae})")
@WinRTByReference(brClass = ConnectionCost.ByReference::class)
public class ConnectionCost(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConnectionCost.WithDefault, IConnectionCost2.WithDefault, IWinRTObject {
  private val __545415218_Interface: IConnectionCost.WithDefault by lazy {
    as_545415218()
  }


  private val __271997476_Interface: IConnectionCost2.WithDefault by lazy {
    as_271997476()
  }


  public override val __545415218_Ptr: JNAPointer? by lazy {
    __545415218_Interface.__545415218_Ptr
  }


  public override val __271997476_Ptr: JNAPointer? by lazy {
    __271997476_Interface.__271997476_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__545415218_Interface, __271997476_Interface)

  private fun as_545415218(): IConnectionCost.WithDefault {
    if(pointer == NULL) {
      return(IConnectionCost.ABI.makeIConnectionCost(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectionCost>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectionCost.ABI.makeIConnectionCost(ref.value))
  }

  private fun as_271997476(): IConnectionCost2.WithDefault {
    if(pointer == NULL) {
      return(IConnectionCost2.ABI.makeIConnectionCost2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectionCost2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectionCost2.ABI.makeIConnectionCost2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ConnectionCost>
      {
    public override fun getValue() = ConnectionCost(pointer.getPointer(0))

    public fun setValue(value: ConnectionCost): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConnectionCost, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ConnectionCost {
      val address = segment.toRawLongValue()
      return ConnectionCost(Pointer(address))
    }

    public override fun toNative(obj: ConnectionCost): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
