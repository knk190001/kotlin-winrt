package Windows.Devices.SmartCards

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SmartCardEmulator.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardEmulator;{dfb906b2-875e-47e5-8077-e8bff1b1c6fb})")
@WinRTByReference(brClass = SmartCardEmulator.ByReference::class)
public class SmartCardEmulator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardEmulator.WithDefault, ISmartCardEmulator2.WithDefault, IWinRTObject
    {
  private val __1061892699_Interface: ISmartCardEmulator.WithDefault by lazy {
    as_1061892699()
  }


  private val __1441064649_Interface: ISmartCardEmulator2.WithDefault by lazy {
    as_1441064649()
  }


  public override val __1061892699_Ptr: JNAPointer? by lazy {
    __1061892699_Interface.__1061892699_Ptr
  }


  public override val __1441064649_Ptr: JNAPointer? by lazy {
    __1441064649_Interface.__1441064649_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1061892699_Interface, __1441064649_Interface)

  private fun as_1061892699(): ISmartCardEmulator.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardEmulator.ABI.makeISmartCardEmulator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardEmulator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardEmulator.ABI.makeISmartCardEmulator(ref.value))
  }

  private fun as_1441064649(): ISmartCardEmulator2.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardEmulator2.ABI.makeISmartCardEmulator2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardEmulator2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardEmulator2.ABI.makeISmartCardEmulator2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardEmulator> {
    public override fun getValue() = SmartCardEmulator(pointer.getPointer(0))

    public fun setValue(value: SmartCardEmulator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardEmulator, MemoryAddress> {
    public val ISmartCardEmulatorStatics3_Instance: ISmartCardEmulatorStatics3 by lazy {
      createISmartCardEmulatorStatics3()
    }


    public val ISmartCardEmulatorStatics2_Instance: ISmartCardEmulatorStatics2 by lazy {
      createISmartCardEmulatorStatics2()
    }


    public val ISmartCardEmulatorStatics_Instance: ISmartCardEmulatorStatics by lazy {
      createISmartCardEmulatorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISmartCardEmulatorStatics3(): ISmartCardEmulatorStatics3 {
      val refiid = Guid.REFIID(ISmartCardEmulatorStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardEmulator".toHandle(),refiid,interfacePtr)
      val result = ISmartCardEmulatorStatics3.ABI.makeISmartCardEmulatorStatics3(interfacePtr.value)
      return result
    }

    public fun createISmartCardEmulatorStatics2(): ISmartCardEmulatorStatics2 {
      val refiid = Guid.REFIID(ISmartCardEmulatorStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardEmulator".toHandle(),refiid,interfacePtr)
      val result = ISmartCardEmulatorStatics2.ABI.makeISmartCardEmulatorStatics2(interfacePtr.value)
      return result
    }

    public fun createISmartCardEmulatorStatics(): ISmartCardEmulatorStatics {
      val refiid = Guid.REFIID(ISmartCardEmulatorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardEmulator".toHandle(),refiid,interfacePtr)
      val result = ISmartCardEmulatorStatics.ABI.makeISmartCardEmulatorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SmartCardEmulator {
      val address = segment.toRawLongValue()
      return SmartCardEmulator(Pointer(address))
    }

    public override fun toNative(obj: SmartCardEmulator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsSupported() = ABI.ISmartCardEmulatorStatics3_Instance.IsSupported()

    public fun GetAppletIdGroupRegistrationsAsync() =
        ABI.ISmartCardEmulatorStatics2_Instance.GetAppletIdGroupRegistrationsAsync()

    public fun RegisterAppletIdGroupAsync(appletIdGroup: SmartCardAppletIdGroup) =
        ABI.ISmartCardEmulatorStatics2_Instance.RegisterAppletIdGroupAsync(appletIdGroup)

    public fun UnregisterAppletIdGroupAsync(registration: SmartCardAppletIdGroupRegistration) =
        ABI.ISmartCardEmulatorStatics2_Instance.UnregisterAppletIdGroupAsync(registration)

    public fun get_MaxAppletIdGroupRegistrations() =
        ABI.ISmartCardEmulatorStatics2_Instance.get_MaxAppletIdGroupRegistrations()

    public fun GetDefaultAsync() = ABI.ISmartCardEmulatorStatics_Instance.GetDefaultAsync()
  }
}
