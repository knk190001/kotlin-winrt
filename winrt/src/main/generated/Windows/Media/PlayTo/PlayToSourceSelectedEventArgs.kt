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

@ABIMarker(PlayToSourceSelectedEventArgs.ABI::class)
@Signature("rc(Windows.Media.PlayTo.PlayToSourceSelectedEventArgs;{0c9d8511-5202-4dcb-8c67-abda12bb3c12})")
@WinRTByReference(brClass = PlayToSourceSelectedEventArgs.ByReference::class)
public class PlayToSourceSelectedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayToSourceSelectedEventArgs.WithDefault, IWinRTObject {
  private val __1064373965_Interface: IPlayToSourceSelectedEventArgs.WithDefault by lazy {
    as_1064373965()
  }


  public override val __1064373965_Ptr: JNAPointer? by lazy {
    __1064373965_Interface.__1064373965_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1064373965_Interface)

  private fun as_1064373965(): IPlayToSourceSelectedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPlayToSourceSelectedEventArgs.ABI.makeIPlayToSourceSelectedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayToSourceSelectedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayToSourceSelectedEventArgs.ABI.makeIPlayToSourceSelectedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayToSourceSelectedEventArgs> {
    public override fun getValue() = PlayToSourceSelectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PlayToSourceSelectedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayToSourceSelectedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlayToSourceSelectedEventArgs {
      val address = segment.toRawLongValue()
      return PlayToSourceSelectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PlayToSourceSelectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
