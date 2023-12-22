package Windows.Devices.Usb

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

@ABIMarker(UsbDeviceClass.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbDeviceClass;{051942f9-845e-47eb-b12a-38f2f617afe7})")
@WinRTByReference(brClass = UsbDeviceClass.ByReference::class)
public class UsbDeviceClass(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbDeviceClass.WithDefault, IWinRTObject {
  private val __567250273_Interface: IUsbDeviceClass.WithDefault by lazy {
    as_567250273()
  }


  public override val __567250273_Ptr: JNAPointer? by lazy {
    __567250273_Interface.__567250273_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__567250273_Interface)

  public constructor() : this(ABI.activate())

  private fun as_567250273(): IUsbDeviceClass.WithDefault {
    if(pointer == NULL) {
      return(IUsbDeviceClass.ABI.makeIUsbDeviceClass(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbDeviceClass>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbDeviceClass.ABI.makeIUsbDeviceClass(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UsbDeviceClass>
      {
    public override fun getValue() = UsbDeviceClass(pointer.getPointer(0))

    public fun setValue(value: UsbDeviceClass): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbDeviceClass, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Devices.Usb.UsbDeviceClass".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): UsbDeviceClass {
      val address = segment.toRawLongValue()
      return UsbDeviceClass(Pointer(address))
    }

    public override fun toNative(obj: UsbDeviceClass): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
