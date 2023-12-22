package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardPinPolicy.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardPinPolicy;{183ce184-4db6-4841-ac9e-2ac1f39b7304})")
@WinRTByReference(brClass = SmartCardPinPolicy.ByReference::class)
public class SmartCardPinPolicy(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardPinPolicy.WithDefault, IWinRTObject {
  private val __936023903_Interface: ISmartCardPinPolicy.WithDefault by lazy {
    as_936023903()
  }


  public override val __936023903_Ptr: JNAPointer? by lazy {
    __936023903_Interface.__936023903_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__936023903_Interface)

  public constructor() : this(ABI.activate())

  private fun as_936023903(): ISmartCardPinPolicy.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardPinPolicy.ABI.makeISmartCardPinPolicy(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardPinPolicy>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardPinPolicy.ABI.makeISmartCardPinPolicy(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardPinPolicy> {
    public override fun getValue() = SmartCardPinPolicy(pointer.getPointer(0))

    public fun setValue(value: SmartCardPinPolicy): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardPinPolicy, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardPinPolicy".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SmartCardPinPolicy {
      val address = segment.toRawLongValue()
      return SmartCardPinPolicy(Pointer(address))
    }

    public override fun toNative(obj: SmartCardPinPolicy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
