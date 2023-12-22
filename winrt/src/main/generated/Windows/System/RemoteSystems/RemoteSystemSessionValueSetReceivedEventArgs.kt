package Windows.System.RemoteSystems

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

@ABIMarker(RemoteSystemSessionValueSetReceivedEventArgs.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionValueSetReceivedEventArgs;{06f31785-2da5-4e58-a78f-9e8d0784ee25})")
@WinRTByReference(brClass = RemoteSystemSessionValueSetReceivedEventArgs.ByReference::class)
public class RemoteSystemSessionValueSetReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionValueSetReceivedEventArgs.WithDefault, IWinRTObject {
  private val __2002694717_Interface: IRemoteSystemSessionValueSetReceivedEventArgs.WithDefault by
      lazy {
    as_2002694717()
  }


  public override val __2002694717_Ptr: JNAPointer? by lazy {
    __2002694717_Interface.__2002694717_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2002694717_Interface)

  private fun as_2002694717(): IRemoteSystemSessionValueSetReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionValueSetReceivedEventArgs.ABI.makeIRemoteSystemSessionValueSetReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionValueSetReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionValueSetReceivedEventArgs.ABI.makeIRemoteSystemSessionValueSetReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionValueSetReceivedEventArgs> {
    public override fun getValue() =
        RemoteSystemSessionValueSetReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionValueSetReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionValueSetReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RemoteSystemSessionValueSetReceivedEventArgs {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionValueSetReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionValueSetReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
