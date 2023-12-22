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

@ABIMarker(SvgImageSourceOpenedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Imaging.SvgImageSourceOpenedEventArgs;{1c9860d5-38d0-5b21-8d48-072f1e254e39})")
@WinRTByReference(brClass = SvgImageSourceOpenedEventArgs.ByReference::class)
public class SvgImageSourceOpenedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISvgImageSourceOpenedEventArgs.WithDefault, IWinRTObject {
  private val __517841077_Interface: ISvgImageSourceOpenedEventArgs.WithDefault by lazy {
    as_517841077()
  }


  public override val __517841077_Ptr: JNAPointer? by lazy {
    __517841077_Interface.__517841077_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__517841077_Interface)

  private fun as_517841077(): ISvgImageSourceOpenedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISvgImageSourceOpenedEventArgs.ABI.makeISvgImageSourceOpenedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISvgImageSourceOpenedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISvgImageSourceOpenedEventArgs.ABI.makeISvgImageSourceOpenedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SvgImageSourceOpenedEventArgs> {
    public override fun getValue() = SvgImageSourceOpenedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SvgImageSourceOpenedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SvgImageSourceOpenedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SvgImageSourceOpenedEventArgs {
      val address = segment.toRawLongValue()
      return SvgImageSourceOpenedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SvgImageSourceOpenedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
