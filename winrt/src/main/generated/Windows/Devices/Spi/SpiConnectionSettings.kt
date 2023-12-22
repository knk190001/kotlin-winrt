package Windows.Devices.Spi

import Windows.Devices.Spi.ISpiConnectionSettingsFactory.ABI.IID
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SpiConnectionSettings.ABI::class)
@Signature("rc(Windows.Devices.Spi.SpiConnectionSettings;{5283a37f-f935-4b9f-a7a7-3a7890afa5ce})")
@WinRTByReference(brClass = SpiConnectionSettings.ByReference::class)
public class SpiConnectionSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpiConnectionSettings.WithDefault, IWinRTObject {
  private val __1323586804_Interface: ISpiConnectionSettings.WithDefault by lazy {
    as_1323586804()
  }


  public override val __1323586804_Ptr: JNAPointer? by lazy {
    __1323586804_Interface.__1323586804_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1323586804_Interface)

  public constructor(chipSelectLine: Int) : this(ABI.activate(chipSelectLine))

  private fun as_1323586804(): ISpiConnectionSettings.WithDefault {
    if(pointer == NULL) {
      return(ISpiConnectionSettings.ABI.makeISpiConnectionSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpiConnectionSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpiConnectionSettings.ABI.makeISpiConnectionSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpiConnectionSettings> {
    public override fun getValue() = SpiConnectionSettings(pointer.getPointer(0))

    public fun setValue(value: SpiConnectionSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpiConnectionSettings, MemoryAddress> {
    public val ISpiConnectionSettingsFactory_Instance: ISpiConnectionSettingsFactory by lazy {
      createISpiConnectionSettingsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpiConnectionSettingsFactory(): ISpiConnectionSettingsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Spi.SpiConnectionSettings".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISpiConnectionSettingsFactory.ABI.makeISpiConnectionSettingsFactory(factoryActivatorPtr.value))
    }

    public fun activate(chipSelectLine: Int): JNAPointer? =
        ISpiConnectionSettingsFactory_Instance.Create(chipSelectLine)?.pointer

    public override fun fromNative(segment: MemoryAddress): SpiConnectionSettings {
      val address = segment.toRawLongValue()
      return SpiConnectionSettings(Pointer(address))
    }

    public override fun toNative(obj: SpiConnectionSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
