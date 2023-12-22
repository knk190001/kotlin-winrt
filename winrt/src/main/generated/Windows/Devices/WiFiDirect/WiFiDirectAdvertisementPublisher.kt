package Windows.Devices.WiFiDirect

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(WiFiDirectAdvertisementPublisher.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisher;{b35a2d1a-9b1f-45d9-925a-694d66df68ef})")
@WinRTByReference(brClass = WiFiDirectAdvertisementPublisher.ByReference::class)
public class WiFiDirectAdvertisementPublisher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectAdvertisementPublisher.WithDefault, IWinRTObject {
  private val __1049897116_Interface: IWiFiDirectAdvertisementPublisher.WithDefault by lazy {
    as_1049897116()
  }


  public override val __1049897116_Ptr: JNAPointer? by lazy {
    __1049897116_Interface.__1049897116_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1049897116_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1049897116(): IWiFiDirectAdvertisementPublisher.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectAdvertisementPublisher.ABI.makeIWiFiDirectAdvertisementPublisher(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectAdvertisementPublisher>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectAdvertisementPublisher.ABI.makeIWiFiDirectAdvertisementPublisher(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectAdvertisementPublisher> {
    public override fun getValue() = WiFiDirectAdvertisementPublisher(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectAdvertisementPublisher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectAdvertisementPublisher, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisher".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): WiFiDirectAdvertisementPublisher {
      val address = segment.toRawLongValue()
      return WiFiDirectAdvertisementPublisher(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectAdvertisementPublisher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
