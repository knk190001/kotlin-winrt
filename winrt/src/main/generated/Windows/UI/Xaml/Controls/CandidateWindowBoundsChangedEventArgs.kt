package Windows.UI.Xaml.Controls

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

@ABIMarker(CandidateWindowBoundsChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.CandidateWindowBoundsChangedEventArgs;{8a946458-83b0-4c32-9450-5169a5838b55})")
@WinRTByReference(brClass = CandidateWindowBoundsChangedEventArgs.ByReference::class)
public class CandidateWindowBoundsChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICandidateWindowBoundsChangedEventArgs.WithDefault, IWinRTObject {
  private val __249371729_Interface: ICandidateWindowBoundsChangedEventArgs.WithDefault by lazy {
    as_249371729()
  }


  public override val __249371729_Ptr: JNAPointer? by lazy {
    __249371729_Interface.__249371729_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__249371729_Interface)

  private fun as_249371729(): ICandidateWindowBoundsChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICandidateWindowBoundsChangedEventArgs.ABI.makeICandidateWindowBoundsChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICandidateWindowBoundsChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICandidateWindowBoundsChangedEventArgs.ABI.makeICandidateWindowBoundsChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CandidateWindowBoundsChangedEventArgs> {
    public override fun getValue() = CandidateWindowBoundsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CandidateWindowBoundsChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CandidateWindowBoundsChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CandidateWindowBoundsChangedEventArgs {
      val address = segment.toRawLongValue()
      return CandidateWindowBoundsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CandidateWindowBoundsChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
