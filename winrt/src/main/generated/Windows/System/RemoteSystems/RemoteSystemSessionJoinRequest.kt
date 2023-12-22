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

@ABIMarker(RemoteSystemSessionJoinRequest.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionJoinRequest;{20600068-7994-4331-86d1-d89d882585ee})")
@WinRTByReference(brClass = RemoteSystemSessionJoinRequest.ByReference::class)
public class RemoteSystemSessionJoinRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionJoinRequest.WithDefault, IWinRTObject {
  private val __1046100029_Interface: IRemoteSystemSessionJoinRequest.WithDefault by lazy {
    as_1046100029()
  }


  public override val __1046100029_Ptr: JNAPointer? by lazy {
    __1046100029_Interface.__1046100029_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1046100029_Interface)

  private fun as_1046100029(): IRemoteSystemSessionJoinRequest.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionJoinRequest.ABI.makeIRemoteSystemSessionJoinRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionJoinRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionJoinRequest.ABI.makeIRemoteSystemSessionJoinRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionJoinRequest> {
    public override fun getValue() = RemoteSystemSessionJoinRequest(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionJoinRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionJoinRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemSessionJoinRequest {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionJoinRequest(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionJoinRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
