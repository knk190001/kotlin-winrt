package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(GattClientNotificationResult.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattClientNotificationResult;{506d5599-0112-419a-8e3b-ae21afabd2c2})")
@WinRTByReference(brClass = GattClientNotificationResult.ByReference::class)
public class GattClientNotificationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattClientNotificationResult.WithDefault,
    IGattClientNotificationResult2.WithDefault, IWinRTObject {
  private val __932522958_Interface: IGattClientNotificationResult.WithDefault by lazy {
    as_932522958()
  }


  private val __1156559324_Interface: IGattClientNotificationResult2.WithDefault by lazy {
    as_1156559324()
  }


  public override val __932522958_Ptr: JNAPointer? by lazy {
    __932522958_Interface.__932522958_Ptr
  }


  public override val __1156559324_Ptr: JNAPointer? by lazy {
    __1156559324_Interface.__1156559324_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__932522958_Interface, __1156559324_Interface)

  private fun as_932522958(): IGattClientNotificationResult.WithDefault {
    if(pointer == NULL) {
      return(IGattClientNotificationResult.ABI.makeIGattClientNotificationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattClientNotificationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattClientNotificationResult.ABI.makeIGattClientNotificationResult(ref.value))
  }

  private fun as_1156559324(): IGattClientNotificationResult2.WithDefault {
    if(pointer == NULL) {
      return(IGattClientNotificationResult2.ABI.makeIGattClientNotificationResult2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattClientNotificationResult2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattClientNotificationResult2.ABI.makeIGattClientNotificationResult2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattClientNotificationResult> {
    public override fun getValue() = GattClientNotificationResult(pointer.getPointer(0))

    public fun setValue(value: GattClientNotificationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattClientNotificationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattClientNotificationResult {
      val address = segment.toRawLongValue()
      return GattClientNotificationResult(Pointer(address))
    }

    public override fun toNative(obj: GattClientNotificationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
