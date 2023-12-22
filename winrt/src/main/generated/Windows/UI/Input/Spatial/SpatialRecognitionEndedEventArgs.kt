package Windows.UI.Input.Spatial

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

@ABIMarker(SpatialRecognitionEndedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialRecognitionEndedEventArgs;{0e35f5cb-3f75-43f3-ac81-d1dc2df9b1fb})")
@WinRTByReference(brClass = SpatialRecognitionEndedEventArgs.ByReference::class)
public class SpatialRecognitionEndedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialRecognitionEndedEventArgs.WithDefault, IWinRTObject {
  private val __572694920_Interface: ISpatialRecognitionEndedEventArgs.WithDefault by lazy {
    as_572694920()
  }


  public override val __572694920_Ptr: JNAPointer? by lazy {
    __572694920_Interface.__572694920_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__572694920_Interface)

  private fun as_572694920(): ISpatialRecognitionEndedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialRecognitionEndedEventArgs.ABI.makeISpatialRecognitionEndedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialRecognitionEndedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialRecognitionEndedEventArgs.ABI.makeISpatialRecognitionEndedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialRecognitionEndedEventArgs> {
    public override fun getValue() = SpatialRecognitionEndedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialRecognitionEndedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialRecognitionEndedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialRecognitionEndedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialRecognitionEndedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialRecognitionEndedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
