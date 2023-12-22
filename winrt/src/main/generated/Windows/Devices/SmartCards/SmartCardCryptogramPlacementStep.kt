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

@ABIMarker(SmartCardCryptogramPlacementStep.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardCryptogramPlacementStep;{947b03eb-8342-4792-a2e5-925636378a53})")
@WinRTByReference(brClass = SmartCardCryptogramPlacementStep.ByReference::class)
public class SmartCardCryptogramPlacementStep(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardCryptogramPlacementStep.WithDefault, IWinRTObject {
  private val __1885416557_Interface: ISmartCardCryptogramPlacementStep.WithDefault by lazy {
    as_1885416557()
  }


  public override val __1885416557_Ptr: JNAPointer? by lazy {
    __1885416557_Interface.__1885416557_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1885416557_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1885416557(): ISmartCardCryptogramPlacementStep.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardCryptogramPlacementStep.ABI.makeISmartCardCryptogramPlacementStep(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardCryptogramPlacementStep>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardCryptogramPlacementStep.ABI.makeISmartCardCryptogramPlacementStep(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardCryptogramPlacementStep> {
    public override fun getValue() = SmartCardCryptogramPlacementStep(pointer.getPointer(0))

    public fun setValue(value: SmartCardCryptogramPlacementStep): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardCryptogramPlacementStep, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardCryptogramPlacementStep".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SmartCardCryptogramPlacementStep {
      val address = segment.toRawLongValue()
      return SmartCardCryptogramPlacementStep(Pointer(address))
    }

    public override fun toNative(obj: SmartCardCryptogramPlacementStep): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
