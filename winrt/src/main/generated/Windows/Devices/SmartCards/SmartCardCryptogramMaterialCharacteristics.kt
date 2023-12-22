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

@ABIMarker(SmartCardCryptogramMaterialCharacteristics.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardCryptogramMaterialCharacteristics;{fc9ac5cc-c1d7-4153-923b-a2d43c6c8d49})")
@WinRTByReference(brClass = SmartCardCryptogramMaterialCharacteristics.ByReference::class)
public class SmartCardCryptogramMaterialCharacteristics(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardCryptogramMaterialCharacteristics.WithDefault, IWinRTObject {
  private val __918976557_Interface: ISmartCardCryptogramMaterialCharacteristics.WithDefault by
      lazy {
    as_918976557()
  }


  public override val __918976557_Ptr: JNAPointer? by lazy {
    __918976557_Interface.__918976557_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__918976557_Interface)

  public constructor() : this(ABI.activate())

  private fun as_918976557(): ISmartCardCryptogramMaterialCharacteristics.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardCryptogramMaterialCharacteristics.ABI.makeISmartCardCryptogramMaterialCharacteristics(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardCryptogramMaterialCharacteristics>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardCryptogramMaterialCharacteristics.ABI.makeISmartCardCryptogramMaterialCharacteristics(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardCryptogramMaterialCharacteristics> {
    public override fun getValue() =
        SmartCardCryptogramMaterialCharacteristics(pointer.getPointer(0))

    public fun setValue(value: SmartCardCryptogramMaterialCharacteristics): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardCryptogramMaterialCharacteristics, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardCryptogramMaterialCharacteristics".toHandle(),
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
        SmartCardCryptogramMaterialCharacteristics {
      val address = segment.toRawLongValue()
      return SmartCardCryptogramMaterialCharacteristics(Pointer(address))
    }

    public override fun toNative(obj: SmartCardCryptogramMaterialCharacteristics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
