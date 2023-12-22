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

@ABIMarker(WiFiDirectConnectionListener.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.WiFiDirectConnectionListener;{699c1b0d-8d13-4ee9-b9ec-9c72f8251f7d})")
@WinRTByReference(brClass = WiFiDirectConnectionListener.ByReference::class)
public class WiFiDirectConnectionListener(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectConnectionListener.WithDefault, IWinRTObject {
  private val __1446749665_Interface: IWiFiDirectConnectionListener.WithDefault by lazy {
    as_1446749665()
  }


  public override val __1446749665_Ptr: JNAPointer? by lazy {
    __1446749665_Interface.__1446749665_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1446749665_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1446749665(): IWiFiDirectConnectionListener.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectConnectionListener.ABI.makeIWiFiDirectConnectionListener(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectConnectionListener>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectConnectionListener.ABI.makeIWiFiDirectConnectionListener(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectConnectionListener> {
    public override fun getValue() = WiFiDirectConnectionListener(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectConnectionListener): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectConnectionListener, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.WiFiDirect.WiFiDirectConnectionListener".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): WiFiDirectConnectionListener {
      val address = segment.toRawLongValue()
      return WiFiDirectConnectionListener(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectConnectionListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
