package Windows.System.Profile

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(SharedModeSettings.ABI::class)
@WinRTByReference(brClass = SharedModeSettings.ByReference::class)
public class SharedModeSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SharedModeSettings> {
    public override fun getValue() = SharedModeSettings(pointer.getPointer(0))

    public fun setValue(value: SharedModeSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SharedModeSettings, MemoryAddress> {
    public val ISharedModeSettingsStatics2_Instance: ISharedModeSettingsStatics2 by lazy {
      createISharedModeSettingsStatics2()
    }


    public val ISharedModeSettingsStatics_Instance: ISharedModeSettingsStatics by lazy {
      createISharedModeSettingsStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISharedModeSettingsStatics2(): ISharedModeSettingsStatics2 {
      val refiid = Guid.REFIID(ISharedModeSettingsStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Profile.SharedModeSettings".toHandle(),refiid,interfacePtr)
      val result =
          ISharedModeSettingsStatics2.ABI.makeISharedModeSettingsStatics2(interfacePtr.value)
      return result
    }

    public fun createISharedModeSettingsStatics(): ISharedModeSettingsStatics {
      val refiid = Guid.REFIID(ISharedModeSettingsStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Profile.SharedModeSettings".toHandle(),refiid,interfacePtr)
      val result = ISharedModeSettingsStatics.ABI.makeISharedModeSettingsStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SharedModeSettings {
      val address = segment.toRawLongValue()
      return SharedModeSettings(Pointer(address))
    }

    public override fun toNative(obj: SharedModeSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ShouldAvoidLocalStorage() =
        ABI.ISharedModeSettingsStatics2_Instance.get_ShouldAvoidLocalStorage()

    public fun get_IsEnabled() = ABI.ISharedModeSettingsStatics_Instance.get_IsEnabled()
  }
}
