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

@ABIMarker(GattCharacteristicsResult.ABI::class)
@Signature("rc(Windows.Devices.Bluetooth.GenericAttributeProfile.GattCharacteristicsResult;{1194945c-b257-4f3e-9db7-f68bc9a9aef2})")
@WinRTByReference(brClass = GattCharacteristicsResult.ByReference::class)
public class GattCharacteristicsResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGattCharacteristicsResult.WithDefault, IWinRTObject {
  private val __818501274_Interface: IGattCharacteristicsResult.WithDefault by lazy {
    as_818501274()
  }


  public override val __818501274_Ptr: JNAPointer? by lazy {
    __818501274_Interface.__818501274_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__818501274_Interface)

  private fun as_818501274(): IGattCharacteristicsResult.WithDefault {
    if(pointer == NULL) {
      return(IGattCharacteristicsResult.ABI.makeIGattCharacteristicsResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGattCharacteristicsResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGattCharacteristicsResult.ABI.makeIGattCharacteristicsResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GattCharacteristicsResult> {
    public override fun getValue() = GattCharacteristicsResult(pointer.getPointer(0))

    public fun setValue(value: GattCharacteristicsResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GattCharacteristicsResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GattCharacteristicsResult {
      val address = segment.toRawLongValue()
      return GattCharacteristicsResult(Pointer(address))
    }

    public override fun toNative(obj: GattCharacteristicsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
