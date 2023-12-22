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

@ABIMarker(StreamSocketInformation.ABI::class)
@Signature("rc(Windows.Networking.Sockets.StreamSocketInformation;{3b80ae30-5e68-4205-88f0-dc85d2e25ded})")
@WinRTByReference(brClass = StreamSocketInformation.ByReference::class)
public class StreamSocketInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStreamSocketInformation.WithDefault, IStreamSocketInformation2.WithDefault,
    IWinRTObject {
  private val __80092769_Interface: IStreamSocketInformation.WithDefault by lazy {
    as_80092769()
  }


  private val __1812091407_Interface: IStreamSocketInformation2.WithDefault by lazy {
    as_1812091407()
  }


  public override val __80092769_Ptr: JNAPointer? by lazy {
    __80092769_Interface.__80092769_Ptr
  }


  public override val __1812091407_Ptr: JNAPointer? by lazy {
    __1812091407_Interface.__1812091407_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__80092769_Interface, __1812091407_Interface)

  private fun as_80092769(): IStreamSocketInformation.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocketInformation.ABI.makeIStreamSocketInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocketInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocketInformation.ABI.makeIStreamSocketInformation(ref.value))
  }

  private fun as_1812091407(): IStreamSocketInformation2.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocketInformation2.ABI.makeIStreamSocketInformation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocketInformation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocketInformation2.ABI.makeIStreamSocketInformation2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StreamSocketInformation> {
    public override fun getValue() = StreamSocketInformation(pointer.getPointer(0))

    public fun setValue(value: StreamSocketInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StreamSocketInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StreamSocketInformation {
      val address = segment.toRawLongValue()
      return StreamSocketInformation(Pointer(address))
    }

    public override fun toNative(obj: StreamSocketInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
