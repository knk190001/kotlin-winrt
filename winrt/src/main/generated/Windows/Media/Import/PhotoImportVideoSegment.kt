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

@ABIMarker(PhotoImportVideoSegment.ABI::class)
@Signature("rc(Windows.Media.Import.PhotoImportVideoSegment;{623c0289-321a-41d8-9166-8c62a333276c})")
@WinRTByReference(brClass = PhotoImportVideoSegment.ByReference::class)
public class PhotoImportVideoSegment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhotoImportVideoSegment.WithDefault, IWinRTObject {
  private val __1752665760_Interface: IPhotoImportVideoSegment.WithDefault by lazy {
    as_1752665760()
  }


  public override val __1752665760_Ptr: JNAPointer? by lazy {
    __1752665760_Interface.__1752665760_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1752665760_Interface)

  private fun as_1752665760(): IPhotoImportVideoSegment.WithDefault {
    if(pointer == NULL) {
      return(IPhotoImportVideoSegment.ABI.makeIPhotoImportVideoSegment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhotoImportVideoSegment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhotoImportVideoSegment.ABI.makeIPhotoImportVideoSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhotoImportVideoSegment> {
    public override fun getValue() = PhotoImportVideoSegment(pointer.getPointer(0))

    public fun setValue(value: PhotoImportVideoSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhotoImportVideoSegment, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhotoImportVideoSegment {
      val address = segment.toRawLongValue()
      return PhotoImportVideoSegment(Pointer(address))
    }

    public override fun toNative(obj: PhotoImportVideoSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
