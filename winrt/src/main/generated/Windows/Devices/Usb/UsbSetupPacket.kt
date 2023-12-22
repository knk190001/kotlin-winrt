package Windows.Devices.Usb

import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(UsbSetupPacket.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbSetupPacket;{104ba132-c78f-4c51-b654-e49d02f2cb03})")
@WinRTByReference(brClass = UsbSetupPacket.ByReference::class)
public class UsbSetupPacket(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbSetupPacket.WithDefault, IWinRTObject {
  private val __619039934_Interface: IUsbSetupPacket.WithDefault by lazy {
    as_619039934()
  }


  public override val __619039934_Ptr: JNAPointer? by lazy {
    __619039934_Interface.__619039934_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__619039934_Interface)

  public constructor() : this(ABI.activate())

  public constructor(eightByteBuffer: IBuffer) : this(ABI.activate(eightByteBuffer))

  private fun as_619039934(): IUsbSetupPacket.WithDefault {
    if(pointer == NULL) {
      return(IUsbSetupPacket.ABI.makeIUsbSetupPacket(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbSetupPacket>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbSetupPacket.ABI.makeIUsbSetupPacket(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UsbSetupPacket>
      {
    public override fun getValue() = UsbSetupPacket(pointer.getPointer(0))

    public fun setValue(value: UsbSetupPacket): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbSetupPacket, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IUsbSetupPacketFactory_Instance: IUsbSetupPacketFactory by lazy {
      createIUsbSetupPacketFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Devices.Usb.UsbSetupPacket".toHandle(),
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

    public fun createIUsbSetupPacketFactory(): IUsbSetupPacketFactory {
      val refiid = Guid.REFIID(IUsbSetupPacketFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Usb.UsbSetupPacket".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IUsbSetupPacketFactory.ABI.makeIUsbSetupPacketFactory(factoryActivatorPtr.value))
    }

    public fun activate(eightByteBuffer: IBuffer): JNAPointer? =
        IUsbSetupPacketFactory_Instance.CreateWithEightByteBuffer(eightByteBuffer)?.pointer

    public override fun fromNative(segment: MemoryAddress): UsbSetupPacket {
      val address = segment.toRawLongValue()
      return UsbSetupPacket(Pointer(address))
    }

    public override fun toNative(obj: UsbSetupPacket): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
