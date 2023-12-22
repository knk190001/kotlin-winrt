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

@ABIMarker(RemoteSystemSessionJoinResult.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionJoinResult;{ce7b1f04-a03e-41a4-900b-1e79328c1267})")
@WinRTByReference(brClass = RemoteSystemSessionJoinResult.ByReference::class)
public class RemoteSystemSessionJoinResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionJoinResult.WithDefault, IWinRTObject {
  private val __1142064023_Interface: IRemoteSystemSessionJoinResult.WithDefault by lazy {
    as_1142064023()
  }


  public override val __1142064023_Ptr: JNAPointer? by lazy {
    __1142064023_Interface.__1142064023_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1142064023_Interface)

  private fun as_1142064023(): IRemoteSystemSessionJoinResult.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionJoinResult.ABI.makeIRemoteSystemSessionJoinResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionJoinResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionJoinResult.ABI.makeIRemoteSystemSessionJoinResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionJoinResult> {
    public override fun getValue() = RemoteSystemSessionJoinResult(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionJoinResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionJoinResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemSessionJoinResult {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionJoinResult(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionJoinResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
