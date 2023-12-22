package Windows.Networking.XboxLive

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

@ABIMarker(XboxLiveInboundEndpointPairCreatedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.XboxLive.XboxLiveInboundEndpointPairCreatedEventArgs;{dc183b62-22ba-48d2-80de-c23968bd198b})")
@WinRTByReference(brClass = XboxLiveInboundEndpointPairCreatedEventArgs.ByReference::class)
public class XboxLiveInboundEndpointPairCreatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXboxLiveInboundEndpointPairCreatedEventArgs.WithDefault, IWinRTObject {
  private val __1637454595_Interface: IXboxLiveInboundEndpointPairCreatedEventArgs.WithDefault by
      lazy {
    as_1637454595()
  }


  public override val __1637454595_Ptr: JNAPointer? by lazy {
    __1637454595_Interface.__1637454595_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1637454595_Interface)

  private fun as_1637454595(): IXboxLiveInboundEndpointPairCreatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IXboxLiveInboundEndpointPairCreatedEventArgs.ABI.makeIXboxLiveInboundEndpointPairCreatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXboxLiveInboundEndpointPairCreatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXboxLiveInboundEndpointPairCreatedEventArgs.ABI.makeIXboxLiveInboundEndpointPairCreatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XboxLiveInboundEndpointPairCreatedEventArgs> {
    public override fun getValue() =
        XboxLiveInboundEndpointPairCreatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: XboxLiveInboundEndpointPairCreatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XboxLiveInboundEndpointPairCreatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        XboxLiveInboundEndpointPairCreatedEventArgs {
      val address = segment.toRawLongValue()
      return XboxLiveInboundEndpointPairCreatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: XboxLiveInboundEndpointPairCreatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
