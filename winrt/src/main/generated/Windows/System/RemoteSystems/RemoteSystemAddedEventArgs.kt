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

@ABIMarker(RemoteSystemAddedEventArgs.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemAddedEventArgs;{8f39560f-e534-4697-8836-7abea151516e})")
@WinRTByReference(brClass = RemoteSystemAddedEventArgs.ByReference::class)
public class RemoteSystemAddedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemAddedEventArgs.WithDefault, IWinRTObject {
  private val __72353195_Interface: IRemoteSystemAddedEventArgs.WithDefault by lazy {
    as_72353195()
  }


  public override val __72353195_Ptr: JNAPointer? by lazy {
    __72353195_Interface.__72353195_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__72353195_Interface)

  private fun as_72353195(): IRemoteSystemAddedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemAddedEventArgs.ABI.makeIRemoteSystemAddedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemAddedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemAddedEventArgs.ABI.makeIRemoteSystemAddedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemAddedEventArgs> {
    public override fun getValue() = RemoteSystemAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemAddedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemAddedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteSystemAddedEventArgs {
      val address = segment.toRawLongValue()
      return RemoteSystemAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
