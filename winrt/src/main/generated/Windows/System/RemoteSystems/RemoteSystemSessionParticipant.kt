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

@ABIMarker(RemoteSystemSessionParticipant.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionParticipant;{7e90058c-acf9-4729-8a17-44e7baed5dcc})")
@WinRTByReference(brClass = RemoteSystemSessionParticipant.ByReference::class)
public class RemoteSystemSessionParticipant(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionParticipant.WithDefault, IWinRTObject {
  private val __1165970673_Interface: IRemoteSystemSessionParticipant.WithDefault by lazy {
    as_1165970673()
  }


  public override val __1165970673_Ptr: JNAPointer? by lazy {
    __1165970673_Interface.__1165970673_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1165970673_Interface)

  private fun as_1165970673(): IRemoteSystemSessionParticipant.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionParticipant.ABI.makeIRemoteSystemSessionParticipant(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionParticipant>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionParticipant.ABI.makeIRemoteSystemSessionParticipant(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionParticipant> {
    public override fun getValue() = RemoteSystemSessionParticipant(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionParticipant): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionParticipant, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemSessionParticipant {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionParticipant(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionParticipant): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
