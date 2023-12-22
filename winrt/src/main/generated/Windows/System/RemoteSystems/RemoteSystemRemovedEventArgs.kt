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

@ABIMarker(RemoteSystemRemovedEventArgs.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemRemovedEventArgs;{8b3d16bb-7306-49ea-b7df-67d5714cb013})")
@WinRTByReference(brClass = RemoteSystemRemovedEventArgs.ByReference::class)
public class RemoteSystemRemovedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemRemovedEventArgs.WithDefault, IWinRTObject {
  private val __1432887989_Interface: IRemoteSystemRemovedEventArgs.WithDefault by lazy {
    as_1432887989()
  }


  public override val __1432887989_Ptr: JNAPointer? by lazy {
    __1432887989_Interface.__1432887989_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1432887989_Interface)

  private fun as_1432887989(): IRemoteSystemRemovedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemRemovedEventArgs.ABI.makeIRemoteSystemRemovedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemRemovedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemRemovedEventArgs.ABI.makeIRemoteSystemRemovedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemRemovedEventArgs> {
    public override fun getValue() = RemoteSystemRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemRemovedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemRemovedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemRemovedEventArgs {
      val address = segment.toRawLongValue()
      return RemoteSystemRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
