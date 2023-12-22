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

@ABIMarker(PlayToSourceDeferral.ABI::class)
@Signature("rc(Windows.Media.PlayTo.PlayToSourceDeferral;{4100891d-278e-4f29-859b-a9e501053e7d})")
@WinRTByReference(brClass = PlayToSourceDeferral.ByReference::class)
public class PlayToSourceDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayToSourceDeferral.WithDefault, IWinRTObject {
  private val __397780922_Interface: IPlayToSourceDeferral.WithDefault by lazy {
    as_397780922()
  }


  public override val __397780922_Ptr: JNAPointer? by lazy {
    __397780922_Interface.__397780922_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__397780922_Interface)

  private fun as_397780922(): IPlayToSourceDeferral.WithDefault {
    if(pointer == NULL) {
      return(IPlayToSourceDeferral.ABI.makeIPlayToSourceDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayToSourceDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayToSourceDeferral.ABI.makeIPlayToSourceDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayToSourceDeferral> {
    public override fun getValue() = PlayToSourceDeferral(pointer.getPointer(0))

    public fun setValue(value: PlayToSourceDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayToSourceDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PlayToSourceDeferral {
      val address = segment.toRawLongValue()
      return PlayToSourceDeferral(Pointer(address))
    }

    public override fun toNative(obj: PlayToSourceDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
