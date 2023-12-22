package Windows.System.Profile.SystemManufacturers

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

@ABIMarker(SmbiosInformation.ABI::class)
@WinRTByReference(brClass = SmbiosInformation.ByReference::class)
public class SmbiosInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmbiosInformation> {
    public override fun getValue() = SmbiosInformation(pointer.getPointer(0))

    public fun setValue(value: SmbiosInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmbiosInformation, MemoryAddress> {
    public val ISmbiosInformationStatics_Instance: ISmbiosInformationStatics by lazy {
      createISmbiosInformationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISmbiosInformationStatics(): ISmbiosInformationStatics {
      val refiid = Guid.REFIID(ISmbiosInformationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Profile.SystemManufacturers.SmbiosInformation".toHandle(),refiid,interfacePtr)
      val result = ISmbiosInformationStatics.ABI.makeISmbiosInformationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SmbiosInformation {
      val address = segment.toRawLongValue()
      return SmbiosInformation(Pointer(address))
    }

    public override fun toNative(obj: SmbiosInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SerialNumber() = ABI.ISmbiosInformationStatics_Instance.get_SerialNumber()
  }
}
