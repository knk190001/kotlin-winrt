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

@ABIMarker(GattServiceProviderResult.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattServiceProviderResult;{764696d8-c53e-428c-8a48-67afe02c3ae6})")
@WinRTByReference(brClass = GattServiceProviderResult.ByReference::class)
public class GattServiceProviderResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattServiceProviderResult.WithDefault, IWinRTObject {
  private val __612143704_Interface: IGattServiceProviderResult.WithDefault by lazy {
    as_612143704()
  }


  public override val __612143704_Ptr: JNAPointer? by lazy {
    __612143704_Interface.__612143704_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__612143704_Interface)

  private fun as_612143704(): IGattServiceProviderResult.WithDefault {
    if(pointer == NULL) {
      return(IGattServiceProviderResult.ABI.makeIGattServiceProviderResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattServiceProviderResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattServiceProviderResult.ABI.makeIGattServiceProviderResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattServiceProviderResult> {
    public override fun getValue() = GattServiceProviderResult(pointer.getPointer(0))

    public fun setValue(value: GattServiceProviderResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattServiceProviderResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattServiceProviderResult {
      val address = segment.toRawLongValue()
      return GattServiceProviderResult(Pointer(address))
    }

    public override fun toNative(obj: GattServiceProviderResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
