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

@ABIMarker(RemoteSystemSessionInfo.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionInfo;{ff4df648-8b0a-4e9a-9905-69e4b841c588})")
@WinRTByReference(brClass = RemoteSystemSessionInfo.ByReference::class)
public class RemoteSystemSessionInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionInfo.WithDefault, IWinRTObject {
  private val __11607888_Interface: IRemoteSystemSessionInfo.WithDefault by lazy {
    as_11607888()
  }


  public override val __11607888_Ptr: JNAPointer? by lazy {
    __11607888_Interface.__11607888_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__11607888_Interface)

  private fun as_11607888(): IRemoteSystemSessionInfo.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionInfo.ABI.makeIRemoteSystemSessionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionInfo.ABI.makeIRemoteSystemSessionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionInfo> {
    public override fun getValue() = RemoteSystemSessionInfo(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemSessionInfo {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionInfo(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
