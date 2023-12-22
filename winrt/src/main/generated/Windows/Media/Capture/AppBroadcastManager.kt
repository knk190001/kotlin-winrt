package Windows.Media.Capture

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

@ABIMarker(AppBroadcastManager.ABI::class)
@WinRTByReference(brClass = AppBroadcastManager.ByReference::class)
public class AppBroadcastManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AppBroadcastManager> {
    public override fun getValue() = AppBroadcastManager(pointer.getPointer(0))

    public fun setValue(value: AppBroadcastManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AppBroadcastManager, MemoryAddress> {
    public val IAppBroadcastManagerStatics_Instance: IAppBroadcastManagerStatics by lazy {
      createIAppBroadcastManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAppBroadcastManagerStatics(): IAppBroadcastManagerStatics {
      val refiid = Guid.REFIID(IAppBroadcastManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Capture.AppBroadcastManager".toHandle(),refiid,interfacePtr)
      val result =
          IAppBroadcastManagerStatics.ABI.makeIAppBroadcastManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AppBroadcastManager {
      val address = segment.toRawLongValue()
      return AppBroadcastManager(Pointer(address))
    }

    public override fun toNative(obj: AppBroadcastManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetGlobalSettings() = ABI.IAppBroadcastManagerStatics_Instance.GetGlobalSettings()

    public fun ApplyGlobalSettings(value: AppBroadcastGlobalSettings) =
        ABI.IAppBroadcastManagerStatics_Instance.ApplyGlobalSettings(value)

    public fun GetProviderSettings() =
        ABI.IAppBroadcastManagerStatics_Instance.GetProviderSettings()

    public fun ApplyProviderSettings(value: AppBroadcastProviderSettings) =
        ABI.IAppBroadcastManagerStatics_Instance.ApplyProviderSettings(value)
  }
}
