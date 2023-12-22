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

@ABIMarker(StreamWebSocketInformation.ABI::class)
@Signature("rc(Windows.Networking.Sockets.StreamWebSocketInformation;{5e01e316-c92a-47a5-b25f-07847639d181})")
@WinRTByReference(brClass = StreamWebSocketInformation.ByReference::class)
public class StreamWebSocketInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebSocketInformation.WithDefault, IWebSocketInformation2.WithDefault,
    IWinRTObject {
  private val __1690991997_Interface: IWebSocketInformation.WithDefault by lazy {
    as_1690991997()
  }


  private val __881144405_Interface: IWebSocketInformation2.WithDefault by lazy {
    as_881144405()
  }


  public override val __1690991997_Ptr: JNAPointer? by lazy {
    __1690991997_Interface.__1690991997_Ptr
  }


  public override val __881144405_Ptr: JNAPointer? by lazy {
    __881144405_Interface.__881144405_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1690991997_Interface, __881144405_Interface)

  private fun as_1690991997(): IWebSocketInformation.WithDefault {
    if(pointer == NULL) {
      return(IWebSocketInformation.ABI.makeIWebSocketInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebSocketInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebSocketInformation.ABI.makeIWebSocketInformation(ref.value))
  }

  private fun as_881144405(): IWebSocketInformation2.WithDefault {
    if(pointer == NULL) {
      return(IWebSocketInformation2.ABI.makeIWebSocketInformation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebSocketInformation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebSocketInformation2.ABI.makeIWebSocketInformation2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StreamWebSocketInformation> {
    public override fun getValue() = StreamWebSocketInformation(pointer.getPointer(0))

    public fun setValue(value: StreamWebSocketInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StreamWebSocketInformation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StreamWebSocketInformation {
      val address = segment.toRawLongValue()
      return StreamWebSocketInformation(Pointer(address))
    }

    public override fun toNative(obj: StreamWebSocketInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
