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

@ABIMarker(RemoteSystemSessionCreationResult.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionCreationResult;{a79812c2-37de-448c-8b83-a30aa3c4ead6})")
@WinRTByReference(brClass = RemoteSystemSessionCreationResult.ByReference::class)
public class RemoteSystemSessionCreationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionCreationResult.WithDefault, IWinRTObject {
  private val __1253253470_Interface: IRemoteSystemSessionCreationResult.WithDefault by lazy {
    as_1253253470()
  }


  public override val __1253253470_Ptr: JNAPointer? by lazy {
    __1253253470_Interface.__1253253470_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1253253470_Interface)

  private fun as_1253253470(): IRemoteSystemSessionCreationResult.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionCreationResult.ABI.makeIRemoteSystemSessionCreationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionCreationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionCreationResult.ABI.makeIRemoteSystemSessionCreationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionCreationResult> {
    public override fun getValue() = RemoteSystemSessionCreationResult(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionCreationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionCreationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemSessionCreationResult {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionCreationResult(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionCreationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
