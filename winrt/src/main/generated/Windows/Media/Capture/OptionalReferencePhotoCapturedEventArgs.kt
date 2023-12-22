package Windows.Media.Capture

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

@ABIMarker(OptionalReferencePhotoCapturedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.OptionalReferencePhotoCapturedEventArgs;{470f88b3-1e6d-4051-9c8b-f1d85af047b7})")
@WinRTByReference(brClass = OptionalReferencePhotoCapturedEventArgs.ByReference::class)
public class OptionalReferencePhotoCapturedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IOptionalReferencePhotoCapturedEventArgs.WithDefault, IWinRTObject {
  private val __1821882086_Interface: IOptionalReferencePhotoCapturedEventArgs.WithDefault by lazy {
    as_1821882086()
  }


  public override val __1821882086_Ptr: JNAPointer? by lazy {
    __1821882086_Interface.__1821882086_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1821882086_Interface)

  private fun as_1821882086(): IOptionalReferencePhotoCapturedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IOptionalReferencePhotoCapturedEventArgs.ABI.makeIOptionalReferencePhotoCapturedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IOptionalReferencePhotoCapturedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IOptionalReferencePhotoCapturedEventArgs.ABI.makeIOptionalReferencePhotoCapturedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<OptionalReferencePhotoCapturedEventArgs> {
    public override fun getValue() = OptionalReferencePhotoCapturedEventArgs(pointer.getPointer(0))

    public fun setValue(value: OptionalReferencePhotoCapturedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<OptionalReferencePhotoCapturedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        OptionalReferencePhotoCapturedEventArgs {
      val address = segment.toRawLongValue()
      return OptionalReferencePhotoCapturedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: OptionalReferencePhotoCapturedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
