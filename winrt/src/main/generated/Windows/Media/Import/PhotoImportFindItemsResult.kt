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

@ABIMarker(PhotoImportFindItemsResult.ABI::class)
@Signature("rc(Windows.Media.Import.PhotoImportFindItemsResult;{3915e647-6c78-492b-844e-8fe5e8f6bfb9})")
@WinRTByReference(brClass = PhotoImportFindItemsResult.ByReference::class)
public class PhotoImportFindItemsResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhotoImportFindItemsResult.WithDefault,
    IPhotoImportFindItemsResult2.WithDefault, IWinRTObject {
  private val __1946399972_Interface: IPhotoImportFindItemsResult.WithDefault by lazy {
    as_1946399972()
  }


  private val __208856938_Interface: IPhotoImportFindItemsResult2.WithDefault by lazy {
    as_208856938()
  }


  public override val __1946399972_Ptr: JNAPointer? by lazy {
    __1946399972_Interface.__1946399972_Ptr
  }


  public override val __208856938_Ptr: JNAPointer? by lazy {
    __208856938_Interface.__208856938_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1946399972_Interface, __208856938_Interface)

  private fun as_1946399972(): IPhotoImportFindItemsResult.WithDefault {
    if(pointer == NULL) {
      return(IPhotoImportFindItemsResult.ABI.makeIPhotoImportFindItemsResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhotoImportFindItemsResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhotoImportFindItemsResult.ABI.makeIPhotoImportFindItemsResult(ref.value))
  }

  private fun as_208856938(): IPhotoImportFindItemsResult2.WithDefault {
    if(pointer == NULL) {
      return(IPhotoImportFindItemsResult2.ABI.makeIPhotoImportFindItemsResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhotoImportFindItemsResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhotoImportFindItemsResult2.ABI.makeIPhotoImportFindItemsResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhotoImportFindItemsResult> {
    public override fun getValue() = PhotoImportFindItemsResult(pointer.getPointer(0))

    public fun setValue(value: PhotoImportFindItemsResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhotoImportFindItemsResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhotoImportFindItemsResult {
      val address = segment.toRawLongValue()
      return PhotoImportFindItemsResult(Pointer(address))
    }

    public override fun toNative(obj: PhotoImportFindItemsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
