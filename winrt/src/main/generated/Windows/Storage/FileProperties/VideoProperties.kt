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

@ABIMarker(VideoProperties.ABI::class)
@Signature("rc(Windows.Storage.FileProperties.VideoProperties;{719ae507-68de-4db8-97de-49998c059f2f})")
@WinRTByReference(brClass = VideoProperties.ByReference::class)
public class VideoProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVideoProperties.WithDefault, IStorageItemExtraProperties.WithDefault,
    IWinRTObject {
  private val __61092270_Interface: IVideoProperties.WithDefault by lazy {
    as_61092270()
  }


  private val __1999536785_Interface: IStorageItemExtraProperties.WithDefault by lazy {
    as_1999536785()
  }


  public override val __61092270_Ptr: JNAPointer? by lazy {
    __61092270_Interface.__61092270_Ptr
  }


  public override val __1999536785_Ptr: JNAPointer? by lazy {
    __1999536785_Interface.__1999536785_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__61092270_Interface, __1999536785_Interface)

  private fun as_61092270(): IVideoProperties.WithDefault {
    if(pointer == NULL) {
      return(IVideoProperties.ABI.makeIVideoProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVideoProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVideoProperties.ABI.makeIVideoProperties(ref.value))
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
      IByReference<VideoProperties> {
    public override fun getValue() = VideoProperties(pointer.getPointer(0))

    public fun setValue(value: VideoProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VideoProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VideoProperties {
      val address = segment.toRawLongValue()
      return VideoProperties(Pointer(address))
    }

    public override fun toNative(obj: VideoProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
