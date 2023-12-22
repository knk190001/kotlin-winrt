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

@ABIMarker(SpatialRecognitionStartedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialRecognitionStartedEventArgs;{24da128f-0008-4a6d-aa50-2a76f9cfb264})")
@WinRTByReference(brClass = SpatialRecognitionStartedEventArgs.ByReference::class)
public class SpatialRecognitionStartedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialRecognitionStartedEventArgs.WithDefault, IWinRTObject {
  private val __528038687_Interface: ISpatialRecognitionStartedEventArgs.WithDefault by lazy {
    as_528038687()
  }


  public override val __528038687_Ptr: JNAPointer? by lazy {
    __528038687_Interface.__528038687_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__528038687_Interface)

  private fun as_528038687(): ISpatialRecognitionStartedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISpatialRecognitionStartedEventArgs.ABI.makeISpatialRecognitionStartedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialRecognitionStartedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialRecognitionStartedEventArgs.ABI.makeISpatialRecognitionStartedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialRecognitionStartedEventArgs> {
    public override fun getValue() = SpatialRecognitionStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SpatialRecognitionStartedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialRecognitionStartedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialRecognitionStartedEventArgs {
      val address = segment.toRawLongValue()
      return SpatialRecognitionStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SpatialRecognitionStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
