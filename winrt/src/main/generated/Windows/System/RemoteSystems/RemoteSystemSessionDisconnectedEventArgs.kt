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

@ABIMarker(RemoteSystemSessionDisconnectedEventArgs.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionDisconnectedEventArgs;{de0bc69b-77c5-461c-8209-7c6c5d3111ab})")
@WinRTByReference(brClass = RemoteSystemSessionDisconnectedEventArgs.ByReference::class)
public class RemoteSystemSessionDisconnectedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionDisconnectedEventArgs.WithDefault, IWinRTObject {
  private val __45999834_Interface: IRemoteSystemSessionDisconnectedEventArgs.WithDefault by lazy {
    as_45999834()
  }


  public override val __45999834_Ptr: JNAPointer? by lazy {
    __45999834_Interface.__45999834_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__45999834_Interface)

  private fun as_45999834(): IRemoteSystemSessionDisconnectedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionDisconnectedEventArgs.ABI.makeIRemoteSystemSessionDisconnectedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionDisconnectedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionDisconnectedEventArgs.ABI.makeIRemoteSystemSessionDisconnectedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionDisconnectedEventArgs> {
    public override fun getValue() = RemoteSystemSessionDisconnectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionDisconnectedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionDisconnectedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RemoteSystemSessionDisconnectedEventArgs {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionDisconnectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionDisconnectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
