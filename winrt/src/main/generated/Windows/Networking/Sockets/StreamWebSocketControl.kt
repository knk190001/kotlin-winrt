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

@ABIMarker(StreamWebSocketControl.ABI::class)
@Signature("rc(Windows.Networking.Sockets.StreamWebSocketControl;{b4f478b1-a45a-48db-953a-645b7d964c07})")
@WinRTByReference(brClass = StreamWebSocketControl.ByReference::class)
public class StreamWebSocketControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStreamWebSocketControl.WithDefault, IWebSocketControl.WithDefault,
    IWebSocketControl2.WithDefault, IStreamWebSocketControl2.WithDefault, IWinRTObject {
  private val __1305221170_Interface: IStreamWebSocketControl.WithDefault by lazy {
    as_1305221170()
  }


  private val __136954322_Interface: IWebSocketControl.WithDefault by lazy {
    as_136954322()
  }


  private val __49383364_Interface: IWebSocketControl2.WithDefault by lazy {
    as_49383364()
  }


  private val __1807150556_Interface: IStreamWebSocketControl2.WithDefault by lazy {
    as_1807150556()
  }


  public override val __1305221170_Ptr: JNAPointer? by lazy {
    __1305221170_Interface.__1305221170_Ptr
  }


  public override val __136954322_Ptr: JNAPointer? by lazy {
    __136954322_Interface.__136954322_Ptr
  }


  public override val __49383364_Ptr: JNAPointer? by lazy {
    __49383364_Interface.__49383364_Ptr
  }


  public override val __1807150556_Ptr: JNAPointer? by lazy {
    __1807150556_Interface.__1807150556_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1305221170_Interface, __136954322_Interface, __49383364_Interface,
        __1807150556_Interface)

  private fun as_1305221170(): IStreamWebSocketControl.WithDefault {
    if(pointer == NULL) {
      return(IStreamWebSocketControl.ABI.makeIStreamWebSocketControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamWebSocketControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamWebSocketControl.ABI.makeIStreamWebSocketControl(ref.value))
  }

  private fun as_136954322(): IWebSocketControl.WithDefault {
    if(pointer == NULL) {
      return(IWebSocketControl.ABI.makeIWebSocketControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebSocketControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebSocketControl.ABI.makeIWebSocketControl(ref.value))
  }

  private fun as_49383364(): IWebSocketControl2.WithDefault {
    if(pointer == NULL) {
      return(IWebSocketControl2.ABI.makeIWebSocketControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebSocketControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebSocketControl2.ABI.makeIWebSocketControl2(ref.value))
  }

  private fun as_1807150556(): IStreamWebSocketControl2.WithDefault {
    if(pointer == NULL) {
      return(IStreamWebSocketControl2.ABI.makeIStreamWebSocketControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamWebSocketControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamWebSocketControl2.ABI.makeIStreamWebSocketControl2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StreamWebSocketControl> {
    public override fun getValue() = StreamWebSocketControl(pointer.getPointer(0))

    public fun setValue(value: StreamWebSocketControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StreamWebSocketControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StreamWebSocketControl {
      val address = segment.toRawLongValue()
      return StreamWebSocketControl(Pointer(address))
    }

    public override fun toNative(obj: StreamWebSocketControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
