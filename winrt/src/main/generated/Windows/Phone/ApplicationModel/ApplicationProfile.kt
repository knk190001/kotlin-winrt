package Windows.Phone.ApplicationModel

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

@ABIMarker(ApplicationProfile.ABI::class)
@WinRTByReference(brClass = ApplicationProfile.ByReference::class)
public class ApplicationProfile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ApplicationProfile> {
    public override fun getValue() = ApplicationProfile(pointer.getPointer(0))

    public fun setValue(value: ApplicationProfile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApplicationProfile, MemoryAddress> {
    public val IApplicationProfileStatics_Instance: IApplicationProfileStatics by lazy {
      createIApplicationProfileStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIApplicationProfileStatics(): IApplicationProfileStatics {
      val refiid = Guid.REFIID(IApplicationProfileStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Phone.ApplicationModel.ApplicationProfile".toHandle(),refiid,interfacePtr)
      val result = IApplicationProfileStatics.ABI.makeIApplicationProfileStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ApplicationProfile {
      val address = segment.toRawLongValue()
      return ApplicationProfile(Pointer(address))
    }

    public override fun toNative(obj: ApplicationProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Modes() = ABI.IApplicationProfileStatics_Instance.get_Modes()
  }
}
