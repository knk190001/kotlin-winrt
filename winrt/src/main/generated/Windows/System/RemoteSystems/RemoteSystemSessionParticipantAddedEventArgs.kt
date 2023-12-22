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

@ABIMarker(RemoteSystemSessionParticipantAddedEventArgs.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionParticipantAddedEventArgs;{d35a57d8-c9a1-4bb7-b6b0-79bb91adf93d})")
@WinRTByReference(brClass = RemoteSystemSessionParticipantAddedEventArgs.ByReference::class)
public class RemoteSystemSessionParticipantAddedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionParticipantAddedEventArgs.WithDefault, IWinRTObject {
  private val __544233672_Interface: IRemoteSystemSessionParticipantAddedEventArgs.WithDefault by
      lazy {
    as_544233672()
  }


  public override val __544233672_Ptr: JNAPointer? by lazy {
    __544233672_Interface.__544233672_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__544233672_Interface)

  private fun as_544233672(): IRemoteSystemSessionParticipantAddedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionParticipantAddedEventArgs.ABI.makeIRemoteSystemSessionParticipantAddedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionParticipantAddedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionParticipantAddedEventArgs.ABI.makeIRemoteSystemSessionParticipantAddedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionParticipantAddedEventArgs> {
    public override fun getValue() =
        RemoteSystemSessionParticipantAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionParticipantAddedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionParticipantAddedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RemoteSystemSessionParticipantAddedEventArgs {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionParticipantAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionParticipantAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
