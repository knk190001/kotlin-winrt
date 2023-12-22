package Windows.Media

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

@ABIMarker(ImageDisplayProperties.ABI::class)
@Signature("rc(Windows.Media.ImageDisplayProperties;{cd0bc7ef-54e7-411f-9933-f0e98b0a96d2})")
@WinRTByReference(brClass = ImageDisplayProperties.ByReference::class)
public class ImageDisplayProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IImageDisplayProperties.WithDefault, IWinRTObject {
  private val __1362159242_Interface: IImageDisplayProperties.WithDefault by lazy {
    as_1362159242()
  }


  public override val __1362159242_Ptr: JNAPointer? by lazy {
    __1362159242_Interface.__1362159242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1362159242_Interface)

  private fun as_1362159242(): IImageDisplayProperties.WithDefault {
    if(pointer == NULL) {
      return(IImageDisplayProperties.ABI.makeIImageDisplayProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageDisplayProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageDisplayProperties.ABI.makeIImageDisplayProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ImageDisplayProperties> {
    public override fun getValue() = ImageDisplayProperties(pointer.getPointer(0))

    public fun setValue(value: ImageDisplayProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageDisplayProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ImageDisplayProperties {
      val address = segment.toRawLongValue()
      return ImageDisplayProperties(Pointer(address))
    }

    public override fun toNative(obj: ImageDisplayProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
