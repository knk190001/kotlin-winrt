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

@ABIMarker(RemoteSystemUpdatedEventArgs.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemUpdatedEventArgs;{7502ff0e-dbcb-4155-b4ca-b30a04f27627})")
@WinRTByReference(brClass = RemoteSystemUpdatedEventArgs.ByReference::class)
public class RemoteSystemUpdatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemUpdatedEventArgs.WithDefault, IWinRTObject {
  private val __543247184_Interface: IRemoteSystemUpdatedEventArgs.WithDefault by lazy {
    as_543247184()
  }


  public override val __543247184_Ptr: JNAPointer? by lazy {
    __543247184_Interface.__543247184_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__543247184_Interface)

  private fun as_543247184(): IRemoteSystemUpdatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemUpdatedEventArgs.ABI.makeIRemoteSystemUpdatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemUpdatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemUpdatedEventArgs.ABI.makeIRemoteSystemUpdatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemUpdatedEventArgs> {
    public override fun getValue() = RemoteSystemUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemUpdatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemUpdatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return RemoteSystemUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
