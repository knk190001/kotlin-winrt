package Windows.Devices.Spi.Provider

import Windows.Devices.Spi.Provider.IProviderSpiConnectionSettingsFactory.ABI.IID
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

@ABIMarker(ProviderSpiConnectionSettings.ABI::class)
@Signature("rc(Windows.Devices.Spi.Provider.ProviderSpiConnectionSettings;{f6034550-a542-4ec0-9601-a4dd68f8697b})")
@WinRTByReference(brClass = ProviderSpiConnectionSettings.ByReference::class)
public class ProviderSpiConnectionSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProviderSpiConnectionSettings.WithDefault, IWinRTObject {
  private val __2129708318_Interface: IProviderSpiConnectionSettings.WithDefault by lazy {
    as_2129708318()
  }


  public override val __2129708318_Ptr: JNAPointer? by lazy {
    __2129708318_Interface.__2129708318_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2129708318_Interface)

  public constructor(chipSelectLine: Int) : this(ABI.activate(chipSelectLine))

  private fun as_2129708318(): IProviderSpiConnectionSettings.WithDefault {
    if(pointer == NULL) {
      return(IProviderSpiConnectionSettings.ABI.makeIProviderSpiConnectionSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProviderSpiConnectionSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProviderSpiConnectionSettings.ABI.makeIProviderSpiConnectionSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProviderSpiConnectionSettings> {
    public override fun getValue() = ProviderSpiConnectionSettings(pointer.getPointer(0))

    public fun setValue(value: ProviderSpiConnectionSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProviderSpiConnectionSettings, MemoryAddress> {
    public val IProviderSpiConnectionSettingsFactory_Instance: IProviderSpiConnectionSettingsFactory
        by lazy {
      createIProviderSpiConnectionSettingsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProviderSpiConnectionSettingsFactory():
        IProviderSpiConnectionSettingsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Spi.Provider.ProviderSpiConnectionSettings".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IProviderSpiConnectionSettingsFactory.ABI.makeIProviderSpiConnectionSettingsFactory(factoryActivatorPtr.value))
    }

    public fun activate(chipSelectLine: Int): JNAPointer? =
        IProviderSpiConnectionSettingsFactory_Instance.Create(chipSelectLine)?.pointer

    public override fun fromNative(segment: MemoryAddress): ProviderSpiConnectionSettings {
      val address = segment.toRawLongValue()
      return ProviderSpiConnectionSettings(Pointer(address))
    }

    public override fun toNative(obj: ProviderSpiConnectionSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
