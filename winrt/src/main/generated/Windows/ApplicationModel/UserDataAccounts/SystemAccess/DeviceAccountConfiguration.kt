package Windows.ApplicationModel.UserDataAccounts.SystemAccess

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

@ABIMarker(DeviceAccountConfiguration.ABI::class)
@Signature("rc(Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountConfiguration;{ad0123a3-fbdc-4d1b-be43-5a27ea4a1b63})")
@WinRTByReference(brClass = DeviceAccountConfiguration.ByReference::class)
public class DeviceAccountConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceAccountConfiguration.WithDefault,
    IDeviceAccountConfiguration2.WithDefault, IWinRTObject {
  private val __1669010156_Interface: IDeviceAccountConfiguration.WithDefault by lazy {
    as_1669010156()
  }


  private val __199707334_Interface: IDeviceAccountConfiguration2.WithDefault by lazy {
    as_199707334()
  }


  public override val __1669010156_Ptr: JNAPointer? by lazy {
    __1669010156_Interface.__1669010156_Ptr
  }


  public override val __199707334_Ptr: JNAPointer? by lazy {
    __199707334_Interface.__199707334_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1669010156_Interface, __199707334_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1669010156(): IDeviceAccountConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IDeviceAccountConfiguration.ABI.makeIDeviceAccountConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceAccountConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceAccountConfiguration.ABI.makeIDeviceAccountConfiguration(ref.value))
  }

  private fun as_199707334(): IDeviceAccountConfiguration2.WithDefault {
    if(pointer == NULL) {
      return(IDeviceAccountConfiguration2.ABI.makeIDeviceAccountConfiguration2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceAccountConfiguration2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceAccountConfiguration2.ABI.makeIDeviceAccountConfiguration2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceAccountConfiguration> {
    public override fun getValue() = DeviceAccountConfiguration(pointer.getPointer(0))

    public fun setValue(value: DeviceAccountConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceAccountConfiguration, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.UserDataAccounts.SystemAccess.DeviceAccountConfiguration".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): DeviceAccountConfiguration {
      val address = segment.toRawLongValue()
      return DeviceAccountConfiguration(Pointer(address))
    }

    public override fun toNative(obj: DeviceAccountConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
