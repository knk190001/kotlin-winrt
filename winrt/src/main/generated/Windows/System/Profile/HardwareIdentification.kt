package Windows.System.Profile

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(HardwareIdentification.ABI::class)
@WinRTByReference(brClass = HardwareIdentification.ByReference::class)
public class HardwareIdentification(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HardwareIdentification> {
    public override fun getValue() = HardwareIdentification(pointer.getPointer(0))

    public fun setValue(value: HardwareIdentification): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HardwareIdentification, MemoryAddress> {
    public val IHardwareIdentificationStatics_Instance: IHardwareIdentificationStatics by lazy {
      createIHardwareIdentificationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIHardwareIdentificationStatics(): IHardwareIdentificationStatics {
      val refiid = Guid.REFIID(IHardwareIdentificationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Profile.HardwareIdentification".toHandle(),refiid,interfacePtr)
      val result =
          IHardwareIdentificationStatics.ABI.makeIHardwareIdentificationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): HardwareIdentification {
      val address = segment.toRawLongValue()
      return HardwareIdentification(Pointer(address))
    }

    public override fun toNative(obj: HardwareIdentification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetPackageSpecificToken(nonce: IBuffer) =
        ABI.IHardwareIdentificationStatics_Instance.GetPackageSpecificToken(nonce)
  }
}
