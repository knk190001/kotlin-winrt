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

@ABIMarker(RemoteSystemSessionJoinRequestedEventArgs.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionJoinRequestedEventArgs;{dbca4fc3-82b9-4816-9c24-e40e61774bd8})")
@WinRTByReference(brClass = RemoteSystemSessionJoinRequestedEventArgs.ByReference::class)
public class RemoteSystemSessionJoinRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionJoinRequestedEventArgs.WithDefault, IWinRTObject {
  private val __850624235_Interface: IRemoteSystemSessionJoinRequestedEventArgs.WithDefault by
      lazy {
    as_850624235()
  }


  public override val __850624235_Ptr: JNAPointer? by lazy {
    __850624235_Interface.__850624235_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__850624235_Interface)

  private fun as_850624235(): IRemoteSystemSessionJoinRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionJoinRequestedEventArgs.ABI.makeIRemoteSystemSessionJoinRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionJoinRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionJoinRequestedEventArgs.ABI.makeIRemoteSystemSessionJoinRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionJoinRequestedEventArgs> {
    public override fun getValue() =
        RemoteSystemSessionJoinRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionJoinRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionJoinRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RemoteSystemSessionJoinRequestedEventArgs {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionJoinRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionJoinRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
