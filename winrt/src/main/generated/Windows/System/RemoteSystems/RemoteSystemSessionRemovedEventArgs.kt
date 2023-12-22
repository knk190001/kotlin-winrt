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

@ABIMarker(RemoteSystemSessionRemovedEventArgs.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemSessionRemovedEventArgs;{af82914e-39a1-4dea-9d63-43798d5bbbd0})")
@WinRTByReference(brClass = RemoteSystemSessionRemovedEventArgs.ByReference::class)
public class RemoteSystemSessionRemovedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemSessionRemovedEventArgs.WithDefault, IWinRTObject {
  private val __1017370393_Interface: IRemoteSystemSessionRemovedEventArgs.WithDefault by lazy {
    as_1017370393()
  }


  public override val __1017370393_Ptr: JNAPointer? by lazy {
    __1017370393_Interface.__1017370393_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1017370393_Interface)

  private fun as_1017370393(): IRemoteSystemSessionRemovedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemSessionRemovedEventArgs.ABI.makeIRemoteSystemSessionRemovedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemSessionRemovedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemSessionRemovedEventArgs.ABI.makeIRemoteSystemSessionRemovedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemSessionRemovedEventArgs> {
    public override fun getValue() = RemoteSystemSessionRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemSessionRemovedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemSessionRemovedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemSessionRemovedEventArgs {
      val address = segment.toRawLongValue()
      return RemoteSystemSessionRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemSessionRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
