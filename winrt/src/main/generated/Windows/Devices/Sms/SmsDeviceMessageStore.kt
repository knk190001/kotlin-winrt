package Windows.Devices.Sms

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SmsDeviceMessageStore.ABI::class)
@Signature("rc(Windows.Devices.Sms.SmsDeviceMessageStore;{9889f253-f188-4427-8d54-ce0c2423c5c1})")
@WinRTByReference(brClass = SmsDeviceMessageStore.ByReference::class)
public class SmsDeviceMessageStore(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmsDeviceMessageStore.WithDefault, IWinRTObject {
  private val __928864067_Interface: ISmsDeviceMessageStore.WithDefault by lazy {
    as_928864067()
  }


  public override val __928864067_Ptr: JNAPointer? by lazy {
    __928864067_Interface.__928864067_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__928864067_Interface)

  private fun as_928864067(): ISmsDeviceMessageStore.WithDefault {
    if(pointer == NULL) {
      return(ISmsDeviceMessageStore.ABI.makeISmsDeviceMessageStore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmsDeviceMessageStore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmsDeviceMessageStore.ABI.makeISmsDeviceMessageStore(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmsDeviceMessageStore> {
    public override fun getValue() = SmsDeviceMessageStore(pointer.getPointer(0))

    public fun setValue(value: SmsDeviceMessageStore): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmsDeviceMessageStore, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmsDeviceMessageStore {
      val address = segment.toRawLongValue()
      return SmsDeviceMessageStore(Pointer(address))
    }

    public override fun toNative(obj: SmsDeviceMessageStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
