package Windows.Media.Import

import Windows.Storage.IStorageFolder
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PhotoImportSource.ABI::class)
@Signature("rc(Windows.Media.Import.PhotoImportSource;{1f8ea35e-145b-4cd6-87f1-54965a982fef})")
@WinRTByReference(brClass = PhotoImportSource.ByReference::class)
public class PhotoImportSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhotoImportSource.WithDefault, IWinRTObject {
  private val __85996163_Interface: IPhotoImportSource.WithDefault by lazy {
    as_85996163()
  }


  public override val __85996163_Ptr: JNAPointer? by lazy {
    __85996163_Interface.__85996163_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__85996163_Interface)

  private fun as_85996163(): IPhotoImportSource.WithDefault {
    if(pointer == NULL) {
      return(IPhotoImportSource.ABI.makeIPhotoImportSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhotoImportSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhotoImportSource.ABI.makeIPhotoImportSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhotoImportSource> {
    public override fun getValue() = PhotoImportSource(pointer.getPointer(0))

    public fun setValue(value: PhotoImportSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhotoImportSource, MemoryAddress> {
    public val IPhotoImportSourceStatics_Instance: IPhotoImportSourceStatics by lazy {
      createIPhotoImportSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPhotoImportSourceStatics(): IPhotoImportSourceStatics {
      val refiid = Guid.REFIID(IPhotoImportSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Import.PhotoImportSource".toHandle(),refiid,interfacePtr)
      val result = IPhotoImportSourceStatics.ABI.makeIPhotoImportSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PhotoImportSource {
      val address = segment.toRawLongValue()
      return PhotoImportSource(Pointer(address))
    }

    public override fun toNative(obj: PhotoImportSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromIdAsync(sourceId: String) =
        ABI.IPhotoImportSourceStatics_Instance.FromIdAsync(sourceId)

    public fun FromFolderAsync(sourceRootFolder: IStorageFolder) =
        ABI.IPhotoImportSourceStatics_Instance.FromFolderAsync(sourceRootFolder)
  }
}
