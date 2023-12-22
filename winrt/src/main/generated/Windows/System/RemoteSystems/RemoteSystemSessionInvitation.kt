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

@ABIMarker(RemoteSystemSessionInvitation.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionInvitation;{3e32cc91-51d7-4766-a121-25516c3b8294})")
@WinRTByReference(brClass = RemoteSystemSessionInvitation.ByReference::class)
public class RemoteSystemSessionInvitation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionInvitation.WithDefault, IWinRTObject {
  private val __1424201189_Interface: IRemoteSystemSessionInvitation.WithDefault by lazy {
    as_1424201189()
  }


  public override val __1424201189_Ptr: JNAPointer? by lazy {
    __1424201189_Interface.__1424201189_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1424201189_Interface)

  private fun as_1424201189(): IRemoteSystemSessionInvitation.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionInvitation.ABI.makeIRemoteSystemSessionInvitation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionInvitation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionInvitation.ABI.makeIRemoteSystemSessionInvitation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionInvitation> {
    public override fun getValue() = RemoteSystemSessionInvitation(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionInvitation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionInvitation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemSessionInvitation {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionInvitation(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionInvitation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
