package Windows.System.Profile

import Windows.Foundation.Collections.IIterable
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AnalyticsInfo.ABI::class)
@WinRTByReference(brClass = AnalyticsInfo.ByReference::class)
public class AnalyticsInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<AnalyticsInfo>
      {
    public override fun getValue() = AnalyticsInfo(pointer.getPointer(0))

    public fun setValue(value: AnalyticsInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnalyticsInfo, MemoryAddress> {
    public val IAnalyticsInfoStatics_Instance: IAnalyticsInfoStatics by lazy {
      createIAnalyticsInfoStatics()
    }


    public val IAnalyticsInfoStatics2_Instance: IAnalyticsInfoStatics2 by lazy {
      createIAnalyticsInfoStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAnalyticsInfoStatics(): IAnalyticsInfoStatics {
      val refiid = Guid.REFIID(IAnalyticsInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Profile.AnalyticsInfo".toHandle(),refiid,interfacePtr)
      val result = IAnalyticsInfoStatics.ABI.makeIAnalyticsInfoStatics(interfacePtr.value)
      return result
    }

    public fun createIAnalyticsInfoStatics2(): IAnalyticsInfoStatics2 {
      val refiid = Guid.REFIID(IAnalyticsInfoStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Profile.AnalyticsInfo".toHandle(),refiid,interfacePtr)
      val result = IAnalyticsInfoStatics2.ABI.makeIAnalyticsInfoStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AnalyticsInfo {
      val address = segment.toRawLongValue()
      return AnalyticsInfo(Pointer(address))
    }

    public override fun toNative(obj: AnalyticsInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_VersionInfo() = ABI.IAnalyticsInfoStatics_Instance.get_VersionInfo()

    public fun get_DeviceForm() = ABI.IAnalyticsInfoStatics_Instance.get_DeviceForm()

    public fun GetSystemPropertiesAsync(attributeNames: IIterable<String?>) =
        ABI.IAnalyticsInfoStatics2_Instance.GetSystemPropertiesAsync(attributeNames)
  }
}
