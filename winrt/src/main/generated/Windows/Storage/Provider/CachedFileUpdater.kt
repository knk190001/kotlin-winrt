package Windows.Storage.Provider

import Windows.Storage.IStorageFile
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CachedFileUpdater.ABI::class)
@WinRTByReference(brClass = CachedFileUpdater.ByReference::class)
public class CachedFileUpdater(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CachedFileUpdater> {
    public override fun getValue() = CachedFileUpdater(pointer.getPointer(0))

    public fun setValue(value: CachedFileUpdater): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CachedFileUpdater, MemoryAddress> {
    public val ICachedFileUpdaterStatics_Instance: ICachedFileUpdaterStatics by lazy {
      createICachedFileUpdaterStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICachedFileUpdaterStatics(): ICachedFileUpdaterStatics {
      val refiid = Guid.REFIID(ICachedFileUpdaterStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.Provider.CachedFileUpdater".toHandle(),refiid,interfacePtr)
      val result = ICachedFileUpdaterStatics.ABI.makeICachedFileUpdaterStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CachedFileUpdater {
      val address = segment.toRawLongValue()
      return CachedFileUpdater(Pointer(address))
    }

    public override fun toNative(obj: CachedFileUpdater): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun SetUpdateInformation(
      `file`: IStorageFile,
      contentId: String,
      readMode: ReadActivationMode,
      writeMode: WriteActivationMode,
      options: CachedFileOptions
    ) = ABI.ICachedFileUpdaterStatics_Instance.SetUpdateInformation(file, contentId, readMode,
        writeMode, options)
  }
}
