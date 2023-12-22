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

@ABIMarker(RemoteSystemSessionWatcher.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionWatcher;{8003e340-0c41-4a62-b6d7-bdbe2b19be2d})")
@WinRTByReference(brClass = RemoteSystemSessionWatcher.ByReference::class)
public class RemoteSystemSessionWatcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionWatcher.WithDefault, IWinRTObject {
  private val __1262405242_Interface: IRemoteSystemSessionWatcher.WithDefault by lazy {
    as_1262405242()
  }


  public override val __1262405242_Ptr: JNAPointer? by lazy {
    __1262405242_Interface.__1262405242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1262405242_Interface)

  private fun as_1262405242(): IRemoteSystemSessionWatcher.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionWatcher.ABI.makeIRemoteSystemSessionWatcher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionWatcher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionWatcher.ABI.makeIRemoteSystemSessionWatcher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionWatcher> {
    public override fun getValue() = RemoteSystemSessionWatcher(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionWatcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionWatcher, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemSessionWatcher {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionWatcher(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionWatcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
