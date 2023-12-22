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

@ABIMarker(StreamSocketListenerControl.ABI::class)
@Signature("rc(Windows.Networking.Sockets.StreamSocketListenerControl;{20d8c576-8d8a-4dba-9722-a16c4d984980})")
@WinRTByReference(brClass = StreamSocketListenerControl.ByReference::class)
public class StreamSocketListenerControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStreamSocketListenerControl.WithDefault,
    IStreamSocketListenerControl2.WithDefault, IWinRTObject {
  private val __784315202_Interface: IStreamSocketListenerControl.WithDefault by lazy {
    as_784315202()
  }


  private val __1456032564_Interface: IStreamSocketListenerControl2.WithDefault by lazy {
    as_1456032564()
  }


  public override val __784315202_Ptr: JNAPointer? by lazy {
    __784315202_Interface.__784315202_Ptr
  }


  public override val __1456032564_Ptr: JNAPointer? by lazy {
    __1456032564_Interface.__1456032564_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__784315202_Interface, __1456032564_Interface)

  private fun as_784315202(): IStreamSocketListenerControl.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocketListenerControl.ABI.makeIStreamSocketListenerControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocketListenerControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocketListenerControl.ABI.makeIStreamSocketListenerControl(ref.value))
  }

  private fun as_1456032564(): IStreamSocketListenerControl2.WithDefault {
    if(pointer == NULL) {
      return(IStreamSocketListenerControl2.ABI.makeIStreamSocketListenerControl2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStreamSocketListenerControl2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStreamSocketListenerControl2.ABI.makeIStreamSocketListenerControl2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StreamSocketListenerControl> {
    public override fun getValue() = StreamSocketListenerControl(pointer.getPointer(0))

    public fun setValue(value: StreamSocketListenerControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StreamSocketListenerControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): StreamSocketListenerControl {
      val address = segment.toRawLongValue()
      return StreamSocketListenerControl(Pointer(address))
    }

    public override fun toNative(obj: StreamSocketListenerControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
