package Windows.UI.Xaml.Media

import Windows.UI.Xaml.DependencyObject
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ImageSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.ImageSource;{737ef309-ea41-4d96-a71c-98e98efcab07})")
@WinRTByReference(brClass = ImageSource.ByReference::class)
public open class ImageSource(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IImageSource.WithDefault, IWinRTObject {
  private val __328820186_Interface: IImageSource.WithDefault by lazy {
    as_328820186()
  }


  public override val __328820186_Ptr: JNAPointer? by lazy {
    __328820186_Interface.__328820186_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__328820186_Interface)

  private fun as_328820186(): IImageSource.WithDefault {
    if(pointer == NULL) {
      return(IImageSource.ABI.makeIImageSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageSource.ABI.makeIImageSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ImageSource> {
    public override fun getValue() = ImageSource(pointer.getPointer(0))

    public fun setValue(value: ImageSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageSource, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ImageSource {
      val address = segment.toRawLongValue()
      return ImageSource(Pointer(address))
    }

    public override fun toNative(obj: ImageSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
