package Windows.Devices.WiFiDirect.Services

import Windows.Devices.WiFiDirect.Services.IWiFiDirectServiceAdvertiserFactory.ABI.IID
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

@ABIMarker(WiFiDirectServiceAdvertiser.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertiser;{a4aa1ee1-9d8f-4f4f-93ee-7ddea2e37f46})")
@WinRTByReference(brClass = WiFiDirectServiceAdvertiser.ByReference::class)
public class WiFiDirectServiceAdvertiser(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectServiceAdvertiser.WithDefault, IWinRTObject {
  private val __1356357141_Interface: IWiFiDirectServiceAdvertiser.WithDefault by lazy {
    as_1356357141()
  }


  public override val __1356357141_Ptr: JNAPointer? by lazy {
    __1356357141_Interface.__1356357141_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1356357141_Interface)

  public constructor(serviceName: String) : this(ABI.activate(serviceName))

  private fun as_1356357141(): IWiFiDirectServiceAdvertiser.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectServiceAdvertiser.ABI.makeIWiFiDirectServiceAdvertiser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectServiceAdvertiser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectServiceAdvertiser.ABI.makeIWiFiDirectServiceAdvertiser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectServiceAdvertiser> {
    public override fun getValue() = WiFiDirectServiceAdvertiser(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectServiceAdvertiser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectServiceAdvertiser, MemoryAddress> {
    public val IWiFiDirectServiceAdvertiserFactory_Instance: IWiFiDirectServiceAdvertiserFactory by
        lazy {
      createIWiFiDirectServiceAdvertiserFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWiFiDirectServiceAdvertiserFactory(): IWiFiDirectServiceAdvertiserFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAdvertiser".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IWiFiDirectServiceAdvertiserFactory.ABI.makeIWiFiDirectServiceAdvertiserFactory(factoryActivatorPtr.value))
    }

    public fun activate(serviceName: String): JNAPointer? =
        IWiFiDirectServiceAdvertiserFactory_Instance.CreateWiFiDirectServiceAdvertiser(serviceName)?.pointer

    public override fun fromNative(segment: MemoryAddress): WiFiDirectServiceAdvertiser {
      val address = segment.toRawLongValue()
      return WiFiDirectServiceAdvertiser(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectServiceAdvertiser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
