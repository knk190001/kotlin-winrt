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

@ABIMarker(RemoteSystemSessionInvitationReceivedEventArgs.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionInvitationReceivedEventArgs;{5e964a2d-a10d-4edb-8dea-54d20ac19543})")
@WinRTByReference(brClass = RemoteSystemSessionInvitationReceivedEventArgs.ByReference::class)
public class RemoteSystemSessionInvitationReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionInvitationReceivedEventArgs.WithDefault, IWinRTObject {
  private val __1217105115_Interface: IRemoteSystemSessionInvitationReceivedEventArgs.WithDefault by
      lazy {
    as_1217105115()
  }


  public override val __1217105115_Ptr: JNAPointer? by lazy {
    __1217105115_Interface.__1217105115_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1217105115_Interface)

  private fun as_1217105115(): IRemoteSystemSessionInvitationReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionInvitationReceivedEventArgs.ABI.makeIRemoteSystemSessionInvitationReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionInvitationReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionInvitationReceivedEventArgs.ABI.makeIRemoteSystemSessionInvitationReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionInvitationReceivedEventArgs> {
    public override fun getValue() =
        RemoteSystemSessionInvitationReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionInvitationReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionInvitationReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RemoteSystemSessionInvitationReceivedEventArgs {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionInvitationReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionInvitationReceivedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
