package Windows.Media.Capture.Frames

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

@ABIMarker(MultiSourceMediaFrameArrivedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.MultiSourceMediaFrameArrivedEventArgs;{63115e01-cf51-48fd-aab0-6d693eb48127})")
@WinRTByReference(brClass = MultiSourceMediaFrameArrivedEventArgs.ByReference::class)
public class MultiSourceMediaFrameArrivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMultiSourceMediaFrameArrivedEventArgs.WithDefault, IWinRTObject {
  private val __633386529_Interface: IMultiSourceMediaFrameArrivedEventArgs.WithDefault by lazy {
    as_633386529()
  }


  public override val __633386529_Ptr: JNAPointer? by lazy {
    __633386529_Interface.__633386529_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__633386529_Interface)

  private fun as_633386529(): IMultiSourceMediaFrameArrivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IMultiSourceMediaFrameArrivedEventArgs.ABI.makeIMultiSourceMediaFrameArrivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMultiSourceMediaFrameArrivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMultiSourceMediaFrameArrivedEventArgs.ABI.makeIMultiSourceMediaFrameArrivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MultiSourceMediaFrameArrivedEventArgs> {
    public override fun getValue() = MultiSourceMediaFrameArrivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: MultiSourceMediaFrameArrivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MultiSourceMediaFrameArrivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MultiSourceMediaFrameArrivedEventArgs {
      val address = segment.toRawLongValue()
      return MultiSourceMediaFrameArrivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: MultiSourceMediaFrameArrivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
