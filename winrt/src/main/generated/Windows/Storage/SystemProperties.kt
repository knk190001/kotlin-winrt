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

@ABIMarker(SystemProperties.ABI::class)
@WinRTByReference(brClass = SystemProperties.ByReference::class)
public class SystemProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemProperties> {
    public override fun getValue() = SystemProperties(pointer.getPointer(0))

    public fun setValue(value: SystemProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemProperties, MemoryAddress> {
    public val ISystemProperties_Instance: ISystemProperties by lazy {
      createISystemProperties()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemProperties(): ISystemProperties {
      val refiid = Guid.REFIID(ISystemProperties.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Storage.SystemProperties".toHandle(),refiid,interfacePtr)
      val result = ISystemProperties.ABI.makeISystemProperties(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SystemProperties {
      val address = segment.toRawLongValue()
      return SystemProperties(Pointer(address))
    }

    public override fun toNative(obj: SystemProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Author() = ABI.ISystemProperties_Instance.get_Author()

    public fun get_Comment() = ABI.ISystemProperties_Instance.get_Comment()

    public fun get_ItemNameDisplay() = ABI.ISystemProperties_Instance.get_ItemNameDisplay()

    public fun get_Keywords() = ABI.ISystemProperties_Instance.get_Keywords()

    public fun get_Rating() = ABI.ISystemProperties_Instance.get_Rating()

    public fun get_Title() = ABI.ISystemProperties_Instance.get_Title()

    public fun get_Audio() = ABI.ISystemProperties_Instance.get_Audio()

    public fun get_GPS() = ABI.ISystemProperties_Instance.get_GPS()

    public fun get_Media() = ABI.ISystemProperties_Instance.get_Media()

    public fun get_Music() = ABI.ISystemProperties_Instance.get_Music()

    public fun get_Photo() = ABI.ISystemProperties_Instance.get_Photo()

    public fun get_Video() = ABI.ISystemProperties_Instance.get_Video()

    public fun get_Image() = ABI.ISystemProperties_Instance.get_Image()
  }
}
