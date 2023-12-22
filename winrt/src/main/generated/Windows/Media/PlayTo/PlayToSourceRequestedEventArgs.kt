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

@ABIMarker(PlayToSourceRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Media.PlayTo.PlayToSourceRequestedEventArgs;{c5cdc330-29df-4ec6-9da9-9fbdfcfc1b3e})")
@WinRTByReference(brClass = PlayToSourceRequestedEventArgs.ByReference::class)
public class PlayToSourceRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayToSourceRequestedEventArgs.WithDefault, IWinRTObject {
  private val __56076376_Interface: IPlayToSourceRequestedEventArgs.WithDefault by lazy {
    as_56076376()
  }


  public override val __56076376_Ptr: JNAPointer? by lazy {
    __56076376_Interface.__56076376_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__56076376_Interface)

  private fun as_56076376(): IPlayToSourceRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPlayToSourceRequestedEventArgs.ABI.makeIPlayToSourceRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayToSourceRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayToSourceRequestedEventArgs.ABI.makeIPlayToSourceRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayToSourceRequestedEventArgs> {
    public override fun getValue() = PlayToSourceRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PlayToSourceRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayToSourceRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlayToSourceRequestedEventArgs {
      val address = segment.toRawLongValue()
      return PlayToSourceRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PlayToSourceRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
