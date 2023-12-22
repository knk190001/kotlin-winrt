package Windows.Media.Import

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(PhotoImportManager.ABI::class)
@WinRTByReference(brClass = PhotoImportManager.ByReference::class)
public class PhotoImportManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhotoImportManager> {
    public override fun getValue() = PhotoImportManager(pointer.getPointer(0))

    public fun setValue(value: PhotoImportManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhotoImportManager, MemoryAddress> {
    public val IPhotoImportManagerStatics_Instance: IPhotoImportManagerStatics by lazy {
      createIPhotoImportManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPhotoImportManagerStatics(): IPhotoImportManagerStatics {
      val refiid = Guid.REFIID(IPhotoImportManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Import.PhotoImportManager".toHandle(),refiid,interfacePtr)
      val result = IPhotoImportManagerStatics.ABI.makeIPhotoImportManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PhotoImportManager {
      val address = segment.toRawLongValue()
      return PhotoImportManager(Pointer(address))
    }

    public override fun toNative(obj: PhotoImportManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupportedAsync() = ABI.IPhotoImportManagerStatics_Instance.IsSupportedAsync()

    public fun FindAllSourcesAsync() = ABI.IPhotoImportManagerStatics_Instance.FindAllSourcesAsync()

    public fun GetPendingOperations() =
        ABI.IPhotoImportManagerStatics_Instance.GetPendingOperations()
  }
}
