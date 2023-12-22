package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardEmulatorConnectionProperties.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardEmulatorConnectionProperties;{4e2ca5ee-f969-507d-6cf9-34e2d18df311})")
@WinRTByReference(brClass = SmartCardEmulatorConnectionProperties.ByReference::class)
public class SmartCardEmulatorConnectionProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardEmulatorConnectionProperties.WithDefault, IWinRTObject {
  private val __1821644204_Interface: ISmartCardEmulatorConnectionProperties.WithDefault by lazy {
    as_1821644204()
  }


  public override val __1821644204_Ptr: JNAPointer? by lazy {
    __1821644204_Interface.__1821644204_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1821644204_Interface)

  private fun as_1821644204(): ISmartCardEmulatorConnectionProperties.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardEmulatorConnectionProperties.ABI.makeISmartCardEmulatorConnectionProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardEmulatorConnectionProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardEmulatorConnectionProperties.ABI.makeISmartCardEmulatorConnectionProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardEmulatorConnectionProperties> {
    public override fun getValue() = SmartCardEmulatorConnectionProperties(pointer.getPointer(0))

    public fun setValue(value: SmartCardEmulatorConnectionProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardEmulatorConnectionProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SmartCardEmulatorConnectionProperties {
      val address = segment.toRawLongValue()
      return SmartCardEmulatorConnectionProperties(Pointer(address))
    }

    public override fun toNative(obj: SmartCardEmulatorConnectionProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
