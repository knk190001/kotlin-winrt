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

@ABIMarker(RemoteSystemSessionUpdatedEventArgs.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionUpdatedEventArgs;{16875069-231e-4c91-8ec8-b3a39d9e55a3})")
@WinRTByReference(brClass = RemoteSystemSessionUpdatedEventArgs.ByReference::class)
public class RemoteSystemSessionUpdatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionUpdatedEventArgs.WithDefault, IWinRTObject {
  private val __1301461730_Interface: IRemoteSystemSessionUpdatedEventArgs.WithDefault by lazy {
    as_1301461730()
  }


  public override val __1301461730_Ptr: JNAPointer? by lazy {
    __1301461730_Interface.__1301461730_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1301461730_Interface)

  private fun as_1301461730(): IRemoteSystemSessionUpdatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionUpdatedEventArgs.ABI.makeIRemoteSystemSessionUpdatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionUpdatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionUpdatedEventArgs.ABI.makeIRemoteSystemSessionUpdatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionUpdatedEventArgs> {
    public override fun getValue() = RemoteSystemSessionUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionUpdatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionUpdatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemSessionUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
