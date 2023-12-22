package Microsoft.UI.Xaml.Media.Imaging

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

@ABIMarker(SvgImageSourceFailedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Imaging.SvgImageSourceFailedEventArgs;{76e66278-7804-5439-a50d-14c5ba896714})")
@WinRTByReference(brClass = SvgImageSourceFailedEventArgs.ByReference::class)
public class SvgImageSourceFailedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISvgImageSourceFailedEventArgs.WithDefault, IWinRTObject {
  private val __1691411297_Interface: ISvgImageSourceFailedEventArgs.WithDefault by lazy {
    as_1691411297()
  }


  public override val __1691411297_Ptr: JNAPointer? by lazy {
    __1691411297_Interface.__1691411297_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1691411297_Interface)

  private fun as_1691411297(): ISvgImageSourceFailedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISvgImageSourceFailedEventArgs.ABI.makeISvgImageSourceFailedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISvgImageSourceFailedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISvgImageSourceFailedEventArgs.ABI.makeISvgImageSourceFailedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SvgImageSourceFailedEventArgs> {
    public override fun getValue() = SvgImageSourceFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SvgImageSourceFailedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SvgImageSourceFailedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SvgImageSourceFailedEventArgs {
      val address = segment.toRawLongValue()
      return SvgImageSourceFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SvgImageSourceFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
