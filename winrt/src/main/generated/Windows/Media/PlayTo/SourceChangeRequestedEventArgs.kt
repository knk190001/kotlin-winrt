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

@ABIMarker(SourceChangeRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Media.PlayTo.SourceChangeRequestedEventArgs;{fb3f3a96-7aa6-4a8b-86e7-54f6c6d34f64})")
@WinRTByReference(brClass = SourceChangeRequestedEventArgs.ByReference::class)
public class SourceChangeRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISourceChangeRequestedEventArgs.WithDefault, IWinRTObject {
  private val __729799687_Interface: ISourceChangeRequestedEventArgs.WithDefault by lazy {
    as_729799687()
  }


  public override val __729799687_Ptr: JNAPointer? by lazy {
    __729799687_Interface.__729799687_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__729799687_Interface)

  private fun as_729799687(): ISourceChangeRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISourceChangeRequestedEventArgs.ABI.makeISourceChangeRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISourceChangeRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISourceChangeRequestedEventArgs.ABI.makeISourceChangeRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SourceChangeRequestedEventArgs> {
    public override fun getValue() = SourceChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SourceChangeRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SourceChangeRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SourceChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return SourceChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SourceChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
