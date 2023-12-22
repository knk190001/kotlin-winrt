package Windows.Storage

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

@ABIMarker(CachedFileManager.ABI::class)
@WinRTByReference(brClass = CachedFileManager.ByReference::class)
public class CachedFileManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CachedFileManager> {
    public override fun getValue() = CachedFileManager(pointer.getPointer(0))

    public fun setValue(value: CachedFileManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CachedFileManager, MemoryAddress> {
    public val ICachedFileManagerStatics_Instance: ICachedFileManagerStatics by lazy {
      createICachedFileManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICachedFileManagerStatics(): ICachedFileManagerStatics {
      val refiid = Guid.REFIID(ICachedFileManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.CachedFileManager".toHandle(),refiid,interfacePtr)
      val result = ICachedFileManagerStatics.ABI.makeICachedFileManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CachedFileManager {
      val address = segment.toRawLongValue()
      return CachedFileManager(Pointer(address))
    }

    public override fun toNative(obj: CachedFileManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun DeferUpdates(`file`: IStorageFile) =
        ABI.ICachedFileManagerStatics_Instance.DeferUpdates(file)

    public fun CompleteUpdatesAsync(`file`: IStorageFile) =
        ABI.ICachedFileManagerStatics_Instance.CompleteUpdatesAsync(file)
  }
}
