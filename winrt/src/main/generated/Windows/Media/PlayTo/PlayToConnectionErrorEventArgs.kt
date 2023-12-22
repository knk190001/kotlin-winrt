package Windows.Media.PlayTo

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

@ABIMarker(PlayToConnectionErrorEventArgs.ABI::class)
@Signature("rc(Windows.Media.PlayTo.PlayToConnectionErrorEventArgs;{bf5eada6-88e6-445f-9d40-d9b9f8939896})")
@WinRTByReference(brClass = PlayToConnectionErrorEventArgs.ByReference::class)
public class PlayToConnectionErrorEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayToConnectionErrorEventArgs.WithDefault, IWinRTObject {
  private val __1336330751_Interface: IPlayToConnectionErrorEventArgs.WithDefault by lazy {
    as_1336330751()
  }


  public override val __1336330751_Ptr: JNAPointer? by lazy {
    __1336330751_Interface.__1336330751_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1336330751_Interface)

  private fun as_1336330751(): IPlayToConnectionErrorEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPlayToConnectionErrorEventArgs.ABI.makeIPlayToConnectionErrorEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayToConnectionErrorEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayToConnectionErrorEventArgs.ABI.makeIPlayToConnectionErrorEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayToConnectionErrorEventArgs> {
    public override fun getValue() = PlayToConnectionErrorEventArgs(pointer.getPointer(0))

    public fun setValue(value: PlayToConnectionErrorEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayToConnectionErrorEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlayToConnectionErrorEventArgs {
      val address = segment.toRawLongValue()
      return PlayToConnectionErrorEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PlayToConnectionErrorEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
