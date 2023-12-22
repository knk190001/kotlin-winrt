package Windows.Services.Maps.LocalSearch

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

@ABIMarker(PlaceInfoHelper.ABI::class)
@WinRTByReference(brClass = PlaceInfoHelper.ByReference::class)
public class PlaceInfoHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlaceInfoHelper> {
    public override fun getValue() = PlaceInfoHelper(pointer.getPointer(0))

    public fun setValue(value: PlaceInfoHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlaceInfoHelper, MemoryAddress> {
    public val IPlaceInfoHelperStatics_Instance: IPlaceInfoHelperStatics by lazy {
      createIPlaceInfoHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPlaceInfoHelperStatics(): IPlaceInfoHelperStatics {
      val refiid = Guid.REFIID(IPlaceInfoHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.LocalSearch.PlaceInfoHelper".toHandle(),refiid,interfacePtr)
      val result = IPlaceInfoHelperStatics.ABI.makeIPlaceInfoHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PlaceInfoHelper {
      val address = segment.toRawLongValue()
      return PlaceInfoHelper(Pointer(address))
    }

    public override fun toNative(obj: PlaceInfoHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromLocalLocation(location: LocalLocation) =
        ABI.IPlaceInfoHelperStatics_Instance.CreateFromLocalLocation(location)
  }
}
