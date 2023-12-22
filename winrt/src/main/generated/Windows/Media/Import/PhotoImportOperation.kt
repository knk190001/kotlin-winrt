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

@ABIMarker(PhotoImportOperation.ABI::class)
@Signature("rc(Windows.Media.Import.PhotoImportOperation;{d9f797e4-a09a-4ee4-a4b1-20940277a5be})")
@WinRTByReference(brClass = PhotoImportOperation.ByReference::class)
public class PhotoImportOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhotoImportOperation.WithDefault, IWinRTObject {
  private val __1177424383_Interface: IPhotoImportOperation.WithDefault by lazy {
    as_1177424383()
  }


  public override val __1177424383_Ptr: JNAPointer? by lazy {
    __1177424383_Interface.__1177424383_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1177424383_Interface)

  private fun as_1177424383(): IPhotoImportOperation.WithDefault {
    if(pointer == NULL) {
      return(IPhotoImportOperation.ABI.makeIPhotoImportOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhotoImportOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhotoImportOperation.ABI.makeIPhotoImportOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhotoImportOperation> {
    public override fun getValue() = PhotoImportOperation(pointer.getPointer(0))

    public fun setValue(value: PhotoImportOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhotoImportOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhotoImportOperation {
      val address = segment.toRawLongValue()
      return PhotoImportOperation(Pointer(address))
    }

    public override fun toNative(obj: PhotoImportOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
