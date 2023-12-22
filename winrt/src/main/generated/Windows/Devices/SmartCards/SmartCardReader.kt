package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardReader.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardReader;{1074b4e0-54c2-4df0-817a-14c14378f06c})")
@WinRTByReference(brClass = SmartCardReader.ByReference::class)
public class SmartCardReader(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardReader.WithDefault, IWinRTObject {
  private val __68226679_Interface: ISmartCardReader.WithDefault by lazy {
    as_68226679()
  }


  public override val __68226679_Ptr: JNAPointer? by lazy {
    __68226679_Interface.__68226679_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__68226679_Interface)

  private fun as_68226679(): ISmartCardReader.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardReader.ABI.makeISmartCardReader(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardReader>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardReader.ABI.makeISmartCardReader(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardReader> {
    public override fun getValue() = SmartCardReader(pointer.getPointer(0))

    public fun setValue(value: SmartCardReader): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardReader, MemoryAddress> {
    public val ISmartCardReaderStatics_Instance: ISmartCardReaderStatics by lazy {
      createISmartCardReaderStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISmartCardReaderStatics(): ISmartCardReaderStatics {
      val refiid = Guid.REFIID(ISmartCardReaderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardReader".toHandle(),refiid,interfacePtr)
      val result = ISmartCardReaderStatics.ABI.makeISmartCardReaderStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SmartCardReader {
      val address = segment.toRawLongValue()
      return SmartCardReader(Pointer(address))
    }

    public override fun toNative(obj: SmartCardReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDeviceSelector() = ABI.ISmartCardReaderStatics_Instance.GetDeviceSelector()

    public fun GetDeviceSelector(kind: SmartCardReaderKind) =
        ABI.ISmartCardReaderStatics_Instance.GetDeviceSelector(kind)

    public fun FromIdAsync(deviceId: String) =
        ABI.ISmartCardReaderStatics_Instance.FromIdAsync(deviceId)
  }
}
