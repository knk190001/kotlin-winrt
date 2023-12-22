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

@ABIMarker(RemoteSystemEnumerationCompletedEventArgs.ABI::class)
@Signature("rc(Windows.System.RemoteSystems.RemoteSystemEnumerationCompletedEventArgs;{c6e83d5f-4030-4354-a060-14f1b22c545d})")
@WinRTByReference(brClass = RemoteSystemEnumerationCompletedEventArgs.ByReference::class)
public class RemoteSystemEnumerationCompletedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteSystemEnumerationCompletedEventArgs.WithDefault, IWinRTObject {
  private val __958533759_Interface: IRemoteSystemEnumerationCompletedEventArgs.WithDefault by
      lazy {
    as_958533759()
  }


  public override val __958533759_Ptr: JNAPointer? by lazy {
    __958533759_Interface.__958533759_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__958533759_Interface)

  private fun as_958533759(): IRemoteSystemEnumerationCompletedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRemoteSystemEnumerationCompletedEventArgs.ABI.makeIRemoteSystemEnumerationCompletedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteSystemEnumerationCompletedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteSystemEnumerationCompletedEventArgs.ABI.makeIRemoteSystemEnumerationCompletedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteSystemEnumerationCompletedEventArgs> {
    public override fun getValue() =
        RemoteSystemEnumerationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RemoteSystemEnumerationCompletedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteSystemEnumerationCompletedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        RemoteSystemEnumerationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return RemoteSystemEnumerationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RemoteSystemEnumerationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
