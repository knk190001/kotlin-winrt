package Windows.ApplicationModel.Calls.Provider

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

@ABIMarker(PhoneCallOriginManager.ABI::class)
@WinRTByReference(brClass = PhoneCallOriginManager.ByReference::class)
public class PhoneCallOriginManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallOriginManager> {
    public override fun getValue() = PhoneCallOriginManager(pointer.getPointer(0))

    public fun setValue(value: PhoneCallOriginManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallOriginManager, MemoryAddress> {
    public val IPhoneCallOriginManagerStatics3_Instance: IPhoneCallOriginManagerStatics3 by lazy {
      createIPhoneCallOriginManagerStatics3()
    }


    public val IPhoneCallOriginManagerStatics_Instance: IPhoneCallOriginManagerStatics by lazy {
      createIPhoneCallOriginManagerStatics()
    }


    public val IPhoneCallOriginManagerStatics2_Instance: IPhoneCallOriginManagerStatics2 by lazy {
      createIPhoneCallOriginManagerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPhoneCallOriginManagerStatics3(): IPhoneCallOriginManagerStatics3 {
      val refiid = Guid.REFIID(IPhoneCallOriginManagerStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.Provider.PhoneCallOriginManager".toHandle(),refiid,interfacePtr)
      val result =
          IPhoneCallOriginManagerStatics3.ABI.makeIPhoneCallOriginManagerStatics3(interfacePtr.value)
      return result
    }

    public fun createIPhoneCallOriginManagerStatics(): IPhoneCallOriginManagerStatics {
      val refiid = Guid.REFIID(IPhoneCallOriginManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.Provider.PhoneCallOriginManager".toHandle(),refiid,interfacePtr)
      val result =
          IPhoneCallOriginManagerStatics.ABI.makeIPhoneCallOriginManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIPhoneCallOriginManagerStatics2(): IPhoneCallOriginManagerStatics2 {
      val refiid = Guid.REFIID(IPhoneCallOriginManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.Provider.PhoneCallOriginManager".toHandle(),refiid,interfacePtr)
      val result =
          IPhoneCallOriginManagerStatics2.ABI.makeIPhoneCallOriginManagerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PhoneCallOriginManager {
      val address = segment.toRawLongValue()
      return PhoneCallOriginManager(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallOriginManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsSupported() = ABI.IPhoneCallOriginManagerStatics3_Instance.get_IsSupported()

    public fun get_IsCurrentAppActiveCallOriginApp() =
        ABI.IPhoneCallOriginManagerStatics_Instance.get_IsCurrentAppActiveCallOriginApp()

    public fun ShowPhoneCallOriginSettingsUI() =
        ABI.IPhoneCallOriginManagerStatics_Instance.ShowPhoneCallOriginSettingsUI()

    public fun SetCallOrigin(requestId: Guid.GUID, callOrigin: PhoneCallOrigin) =
        ABI.IPhoneCallOriginManagerStatics_Instance.SetCallOrigin(requestId, callOrigin)

    public fun RequestSetAsActiveCallOriginAppAsync() =
        ABI.IPhoneCallOriginManagerStatics2_Instance.RequestSetAsActiveCallOriginAppAsync()
  }
}
