package Windows.Storage.FileProperties

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

@ABIMarker(ImageProperties.ABI::class)
@Signature("rc(Windows.Storage.FileProperties.ImageProperties;{523c9424-fcff-4275-afee-ecdb9ab47973})")
@WinRTByReference(brClass = ImageProperties.ByReference::class)
public class ImageProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IImageProperties.WithDefault, IStorageItemExtraProperties.WithDefault,
    IWinRTObject {
  private val __1721355058_Interface: IImageProperties.WithDefault by lazy {
    as_1721355058()
  }


  private val __1999536785_Interface: IStorageItemExtraProperties.WithDefault by lazy {
    as_1999536785()
  }


  public override val __1721355058_Ptr: JNAPointer? by lazy {
    __1721355058_Interface.__1721355058_Ptr
  }


  public override val __1999536785_Ptr: JNAPointer? by lazy {
    __1999536785_Interface.__1999536785_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1721355058_Interface, __1999536785_Interface)

  private fun as_1721355058(): IImageProperties.WithDefault {
    if(pointer == NULL) {
      return(IImageProperties.ABI.makeIImageProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IImageProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IImageProperties.ABI.makeIImageProperties(ref.value))
  }

  private fun as_1999536785(): IStorageItemExtraProperties.WithDefault {
    if(pointer == NULL) {
      return(IStorageItemExtraProperties.ABI.makeIStorageItemExtraProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStorageItemExtraProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStorageItemExtraProperties.ABI.makeIStorageItemExtraProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ImageProperties> {
    public override fun getValue() = ImageProperties(pointer.getPointer(0))

    public fun setValue(value: ImageProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ImageProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ImageProperties {
      val address = segment.toRawLongValue()
      return ImageProperties(Pointer(address))
    }

    public override fun toNative(obj: ImageProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
