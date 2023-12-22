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

@ABIMarker(XboxLiveEndpointPairStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.XboxLive.XboxLiveEndpointPairStateChangedEventArgs;{592e3b55-de08-44e7-ac3b-b9b9a169583a})")
@WinRTByReference(brClass = XboxLiveEndpointPairStateChangedEventArgs.ByReference::class)
public class XboxLiveEndpointPairStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXboxLiveEndpointPairStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __1155568693_Interface: IXboxLiveEndpointPairStateChangedEventArgs.WithDefault by
      lazy {
    as_1155568693()
  }


  public override val __1155568693_Ptr: JNAPointer? by lazy {
    __1155568693_Interface.__1155568693_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1155568693_Interface)

  private fun as_1155568693(): IXboxLiveEndpointPairStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IXboxLiveEndpointPairStateChangedEventArgs.ABI.makeIXboxLiveEndpointPairStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXboxLiveEndpointPairStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXboxLiveEndpointPairStateChangedEventArgs.ABI.makeIXboxLiveEndpointPairStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XboxLiveEndpointPairStateChangedEventArgs> {
    public override fun getValue() =
        XboxLiveEndpointPairStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: XboxLiveEndpointPairStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XboxLiveEndpointPairStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        XboxLiveEndpointPairStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return XboxLiveEndpointPairStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: XboxLiveEndpointPairStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
