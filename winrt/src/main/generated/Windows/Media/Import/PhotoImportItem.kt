package Windows.Media.Import

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

@ABIMarker(PhotoImportItem.ABI::class)
@Signature("rc(Windows.Media.Import.PhotoImportItem;{a9d07e76-9bfc-43b8-b356-633b6a988c9e})")
@WinRTByReference(brClass = PhotoImportItem.ByReference::class)
public class PhotoImportItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhotoImportItem.WithDefault, IPhotoImportItem2.WithDefault, IWinRTObject {
  private val __1367392123_Interface: IPhotoImportItem.WithDefault by lazy {
    as_1367392123()
  }


  private val __560517097_Interface: IPhotoImportItem2.WithDefault by lazy {
    as_560517097()
  }


  public override val __1367392123_Ptr: JNAPointer? by lazy {
    __1367392123_Interface.__1367392123_Ptr
  }


  public override val __560517097_Ptr: JNAPointer? by lazy {
    __560517097_Interface.__560517097_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1367392123_Interface, __560517097_Interface)

  private fun as_1367392123(): IPhotoImportItem.WithDefault {
    if(pointer == NULL) {
      return(IPhotoImportItem.ABI.makeIPhotoImportItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhotoImportItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhotoImportItem.ABI.makeIPhotoImportItem(ref.value))
  }

  private fun as_560517097(): IPhotoImportItem2.WithDefault {
    if(pointer == NULL) {
      return(IPhotoImportItem2.ABI.makeIPhotoImportItem2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhotoImportItem2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhotoImportItem2.ABI.makeIPhotoImportItem2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhotoImportItem> {
    public override fun getValue() = PhotoImportItem(pointer.getPointer(0))

    public fun setValue(value: PhotoImportItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhotoImportItem, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhotoImportItem {
      val address = segment.toRawLongValue()
      return PhotoImportItem(Pointer(address))
    }

    public override fun toNative(obj: PhotoImportItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
