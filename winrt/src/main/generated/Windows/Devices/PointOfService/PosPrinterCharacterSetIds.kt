package Windows.Devices.PointOfService

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

@ABIMarker(PosPrinterCharacterSetIds.ABI::class)
@WinRTByReference(brClass = PosPrinterCharacterSetIds.ByReference::class)
public class PosPrinterCharacterSetIds(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PosPrinterCharacterSetIds> {
    public override fun getValue() = PosPrinterCharacterSetIds(pointer.getPointer(0))

    public fun setValue(value: PosPrinterCharacterSetIds): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PosPrinterCharacterSetIds, MemoryAddress> {
    public val IPosPrinterCharacterSetIdsStatics_Instance: IPosPrinterCharacterSetIdsStatics by
        lazy {
      createIPosPrinterCharacterSetIdsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPosPrinterCharacterSetIdsStatics(): IPosPrinterCharacterSetIdsStatics {
      val refiid = Guid.REFIID(IPosPrinterCharacterSetIdsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.PointOfService.PosPrinterCharacterSetIds".toHandle(),refiid,interfacePtr)
      val result =
          IPosPrinterCharacterSetIdsStatics.ABI.makeIPosPrinterCharacterSetIdsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PosPrinterCharacterSetIds {
      val address = segment.toRawLongValue()
      return PosPrinterCharacterSetIds(Pointer(address))
    }

    public override fun toNative(obj: PosPrinterCharacterSetIds): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Utf16LE() = ABI.IPosPrinterCharacterSetIdsStatics_Instance.get_Utf16LE()

    public fun get_Ascii() = ABI.IPosPrinterCharacterSetIdsStatics_Instance.get_Ascii()

    public fun get_Ansi() = ABI.IPosPrinterCharacterSetIdsStatics_Instance.get_Ansi()
  }
}
