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

@ABIMarker(SourceSuspensionChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.SourceSuspensionChangedEventArgs;{2ece7b5e-d49b-4394-bc32-f97d6cedec1c})")
@WinRTByReference(brClass = SourceSuspensionChangedEventArgs.ByReference::class)
public class SourceSuspensionChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISourceSuspensionChangedEventArgs.WithDefault, IWinRTObject {
  private val __1750608019_Interface: ISourceSuspensionChangedEventArgs.WithDefault by lazy {
    as_1750608019()
  }


  public override val __1750608019_Ptr: JNAPointer? by lazy {
    __1750608019_Interface.__1750608019_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1750608019_Interface)

  private fun as_1750608019(): ISourceSuspensionChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISourceSuspensionChangedEventArgs.ABI.makeISourceSuspensionChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISourceSuspensionChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISourceSuspensionChangedEventArgs.ABI.makeISourceSuspensionChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SourceSuspensionChangedEventArgs> {
    public override fun getValue() = SourceSuspensionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SourceSuspensionChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SourceSuspensionChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SourceSuspensionChangedEventArgs {
      val address = segment.toRawLongValue()
      return SourceSuspensionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SourceSuspensionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
