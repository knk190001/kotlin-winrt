package Windows.Devices.Sms

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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

@ABIMarker(SmsDevice2.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsDevice2;{bd8a5c13-e522-46cb-b8d5-9ead30fb6c47})")
@WinRTByReference(brClass = SmsDevice2.ByReference::class)
public class SmsDevice2(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsDevice2.WithDefault, IWinRTObject {
  private val __1777874063_Interface: ISmsDevice2.WithDefault by lazy {
    as_1777874063()
  }


  public override val __1777874063_Ptr: JNAPointer? by lazy {
    __1777874063_Interface.__1777874063_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1777874063_Interface)

  private fun as_1777874063(): ISmsDevice2.WithDefault {
    if(pointer == NULL) {
      return(ISmsDevice2.ABI.makeISmsDevice2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsDevice2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsDevice2.ABI.makeISmsDevice2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SmsDevice2> {
    public override fun getValue() = SmsDevice2(pointer.getPointer(0))

    public fun setValue(value: SmsDevice2): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsDevice2, MemoryAddress> {
    public val ISmsDevice2Statics_Instance: ISmsDevice2Statics by lazy {
      createISmsDevice2Statics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISmsDevice2Statics(): ISmsDevice2Statics {
      val refiid = Guid.REFIID(ISmsDevice2Statics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Sms.SmsDevice2".toHandle(),refiid,interfacePtr)
      val result = ISmsDevice2Statics.ABI.makeISmsDevice2Statics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SmsDevice2 {
      val address = segment.toRawLongValue()
      return SmsDevice2(Pointer(address))
    }

    public override fun toNative(obj: SmsDevice2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.ISmsDevice2Statics_Instance.GetDeviceSelector()

    public fun FromId(deviceId: String) = ABI.ISmsDevice2Statics_Instance.FromId(deviceId)

    public fun GetDefault() = ABI.ISmsDevice2Statics_Instance.GetDefault()

    public fun FromParentId(parentDeviceId: String) =
        ABI.ISmsDevice2Statics_Instance.FromParentId(parentDeviceId)
  }
}
