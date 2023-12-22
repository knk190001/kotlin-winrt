package Windows.UI.Input.Preview.Injection

import Windows.Gaming.Input.GamepadReading
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

@ABIMarker(InjectedInputGamepadInfo.ABI::class)
@Signature("rc(Windows.UI.Input.Preview.Injection.InjectedInputGamepadInfo;{20ae9a3f-df11-4572-a9ab-d75b8a5e48ad})")
@WinRTByReference(brClass = InjectedInputGamepadInfo.ByReference::class)
public class InjectedInputGamepadInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInjectedInputGamepadInfo.WithDefault, IWinRTObject {
  private val __126227712_Interface: IInjectedInputGamepadInfo.WithDefault by lazy {
    as_126227712()
  }


  public override val __126227712_Ptr: JNAPointer? by lazy {
    __126227712_Interface.__126227712_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__126227712_Interface)

  public constructor() : this(ABI.activate())

  public constructor(reading: GamepadReading) : this(ABI.activate(reading))

  private fun as_126227712(): IInjectedInputGamepadInfo.WithDefault {
    if(pointer == NULL) {
      return(IInjectedInputGamepadInfo.ABI.makeIInjectedInputGamepadInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInjectedInputGamepadInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInjectedInputGamepadInfo.ABI.makeIInjectedInputGamepadInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InjectedInputGamepadInfo> {
    public override fun getValue() = InjectedInputGamepadInfo(pointer.getPointer(0))

    public fun setValue(value: InjectedInputGamepadInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InjectedInputGamepadInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IInjectedInputGamepadInfoFactory_Instance: IInjectedInputGamepadInfoFactory by lazy {
      createIInjectedInputGamepadInfoFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Preview.Injection.InjectedInputGamepadInfo".toHandle(),
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

    public fun createIInjectedInputGamepadInfoFactory(): IInjectedInputGamepadInfoFactory {
      val refiid = Guid.REFIID(IInjectedInputGamepadInfoFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Preview.Injection.InjectedInputGamepadInfo".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInjectedInputGamepadInfoFactory.ABI.makeIInjectedInputGamepadInfoFactory(factoryActivatorPtr.value))
    }

    public fun activate(reading: GamepadReading): JNAPointer? =
        IInjectedInputGamepadInfoFactory_Instance.CreateInstance(reading)?.pointer

    public override fun fromNative(segment: MemoryAddress): InjectedInputGamepadInfo {
      val address = segment.toRawLongValue()
      return InjectedInputGamepadInfo(Pointer(address))
    }

    public override fun toNative(obj: InjectedInputGamepadInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
