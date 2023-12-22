package Windows.Services.Maps.LocalSearch

import Windows.Devices.Geolocation.Geocircle
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LocalLocationFinder.ABI::class)
@WinRTByReference(brClass = LocalLocationFinder.ByReference::class)
public class LocalLocationFinder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LocalLocationFinder> {
    public override fun getValue() = LocalLocationFinder(pointer.getPointer(0))

    public fun setValue(value: LocalLocationFinder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LocalLocationFinder, MemoryAddress> {
    public val ILocalLocationFinderStatics_Instance: ILocalLocationFinderStatics by lazy {
      createILocalLocationFinderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILocalLocationFinderStatics(): ILocalLocationFinderStatics {
      val refiid = Guid.REFIID(ILocalLocationFinderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.LocalSearch.LocalLocationFinder".toHandle(),refiid,interfacePtr)
      val result =
          ILocalLocationFinderStatics.ABI.makeILocalLocationFinderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LocalLocationFinder {
      val address = segment.toRawLongValue()
      return LocalLocationFinder(Pointer(address))
    }

    public override fun toNative(obj: LocalLocationFinder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindLocalLocationsAsync(
      searchTerm: String,
      searchArea: Geocircle,
      localCategory: String,
      maxResults: WinDef.UINT
    ) = ABI.ILocalLocationFinderStatics_Instance.FindLocalLocationsAsync(searchTerm, searchArea,
        localCategory, maxResults)
  }
}
