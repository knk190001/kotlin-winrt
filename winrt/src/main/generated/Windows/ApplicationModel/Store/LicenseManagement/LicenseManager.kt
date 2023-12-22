package Windows.ApplicationModel.Store.LicenseManagement

import Windows.Foundation.Collections.IIterable
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(LicenseManager.ABI::class)
@WinRTByReference(brClass = LicenseManager.ByReference::class)
public class LicenseManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LicenseManager>
      {
    public override fun getValue() = LicenseManager(pointer.getPointer(0))

    public fun setValue(value: LicenseManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LicenseManager, MemoryAddress> {
    public val ILicenseManagerStatics2_Instance: ILicenseManagerStatics2 by lazy {
      createILicenseManagerStatics2()
    }


    public val ILicenseManagerStatics_Instance: ILicenseManagerStatics by lazy {
      createILicenseManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILicenseManagerStatics2(): ILicenseManagerStatics2 {
      val refiid = Guid.REFIID(ILicenseManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.LicenseManagement.LicenseManager".toHandle(),refiid,interfacePtr)
      val result = ILicenseManagerStatics2.ABI.makeILicenseManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createILicenseManagerStatics(): ILicenseManagerStatics {
      val refiid = Guid.REFIID(ILicenseManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Store.LicenseManagement.LicenseManager".toHandle(),refiid,interfacePtr)
      val result = ILicenseManagerStatics.ABI.makeILicenseManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): LicenseManager {
      val address = segment.toRawLongValue()
      return LicenseManager(Pointer(address))
    }

    public override fun toNative(obj: LicenseManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun RefreshLicensesAsync(refreshOption: LicenseRefreshOption) =
        ABI.ILicenseManagerStatics2_Instance.RefreshLicensesAsync(refreshOption)

    public fun AddLicenseAsync(license: IBuffer) =
        ABI.ILicenseManagerStatics_Instance.AddLicenseAsync(license)

    public fun GetSatisfactionInfosAsync(contentIds: IIterable<String?>, keyIds: IIterable<String?>)
        = ABI.ILicenseManagerStatics_Instance.GetSatisfactionInfosAsync(contentIds, keyIds)
  }
}
