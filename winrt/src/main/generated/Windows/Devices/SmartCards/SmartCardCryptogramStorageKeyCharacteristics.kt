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

@ABIMarker(SmartCardCryptogramStorageKeyCharacteristics.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardCryptogramStorageKeyCharacteristics;{8552546e-4457-4825-b464-635471a39f5c})")
@WinRTByReference(brClass = SmartCardCryptogramStorageKeyCharacteristics.ByReference::class)
public class SmartCardCryptogramStorageKeyCharacteristics(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardCryptogramStorageKeyCharacteristics.WithDefault, IWinRTObject {
  private val __517946122_Interface: ISmartCardCryptogramStorageKeyCharacteristics.WithDefault by
      lazy {
    as_517946122()
  }


  public override val __517946122_Ptr: JNAPointer? by lazy {
    __517946122_Interface.__517946122_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__517946122_Interface)

  public constructor() : this(ABI.activate())

  private fun as_517946122(): ISmartCardCryptogramStorageKeyCharacteristics.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardCryptogramStorageKeyCharacteristics.ABI.makeISmartCardCryptogramStorageKeyCharacteristics(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardCryptogramStorageKeyCharacteristics>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardCryptogramStorageKeyCharacteristics.ABI.makeISmartCardCryptogramStorageKeyCharacteristics(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardCryptogramStorageKeyCharacteristics> {
    public override fun getValue() =
        SmartCardCryptogramStorageKeyCharacteristics(pointer.getPointer(0))

    public fun setValue(value: SmartCardCryptogramStorageKeyCharacteristics): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardCryptogramStorageKeyCharacteristics, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardCryptogramStorageKeyCharacteristics".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress):
        SmartCardCryptogramStorageKeyCharacteristics {
      val address = segment.toRawLongValue()
      return SmartCardCryptogramStorageKeyCharacteristics(Pointer(address))
    }

    public override fun toNative(obj: SmartCardCryptogramStorageKeyCharacteristics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
