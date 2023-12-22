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

@ABIMarker(SmartCardCryptogramGenerator.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardCryptogramGenerator;{e39f587b-edd3-4e49-b594-0ff5e4d0c76f})")
@WinRTByReference(brClass = SmartCardCryptogramGenerator.ByReference::class)
public class SmartCardCryptogramGenerator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardCryptogramGenerator.WithDefault,
    ISmartCardCryptogramGenerator2.WithDefault, IWinRTObject {
  private val __185617429_Interface: ISmartCardCryptogramGenerator.WithDefault by lazy {
    as_185617429()
  }


  private val __1459173053_Interface: ISmartCardCryptogramGenerator2.WithDefault by lazy {
    as_1459173053()
  }


  public override val __185617429_Ptr: JNAPointer? by lazy {
    __185617429_Interface.__185617429_Ptr
  }


  public override val __1459173053_Ptr: JNAPointer? by lazy {
    __1459173053_Interface.__1459173053_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__185617429_Interface, __1459173053_Interface)

  private fun as_185617429(): ISmartCardCryptogramGenerator.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardCryptogramGenerator.ABI.makeISmartCardCryptogramGenerator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardCryptogramGenerator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardCryptogramGenerator.ABI.makeISmartCardCryptogramGenerator(ref.value))
  }

  private fun as_1459173053(): ISmartCardCryptogramGenerator2.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardCryptogramGenerator2.ABI.makeISmartCardCryptogramGenerator2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardCryptogramGenerator2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardCryptogramGenerator2.ABI.makeISmartCardCryptogramGenerator2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardCryptogramGenerator> {
    public override fun getValue() = SmartCardCryptogramGenerator(pointer.getPointer(0))

    public fun setValue(value: SmartCardCryptogramGenerator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardCryptogramGenerator, MemoryAddress> {
    public val ISmartCardCryptogramGeneratorStatics_Instance: ISmartCardCryptogramGeneratorStatics
        by lazy {
      createISmartCardCryptogramGeneratorStatics()
    }


    public val ISmartCardCryptogramGeneratorStatics2_Instance: ISmartCardCryptogramGeneratorStatics2
        by lazy {
      createISmartCardCryptogramGeneratorStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISmartCardCryptogramGeneratorStatics(): ISmartCardCryptogramGeneratorStatics {
      val refiid = Guid.REFIID(ISmartCardCryptogramGeneratorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardCryptogramGenerator".toHandle(),refiid,interfacePtr)
      val result =
          ISmartCardCryptogramGeneratorStatics.ABI.makeISmartCardCryptogramGeneratorStatics(interfacePtr.value)
      return result
    }

    public fun createISmartCardCryptogramGeneratorStatics2():
        ISmartCardCryptogramGeneratorStatics2 {
      val refiid = Guid.REFIID(ISmartCardCryptogramGeneratorStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.SmartCards.SmartCardCryptogramGenerator".toHandle(),refiid,interfacePtr)
      val result =
          ISmartCardCryptogramGeneratorStatics2.ABI.makeISmartCardCryptogramGeneratorStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SmartCardCryptogramGenerator {
      val address = segment.toRawLongValue()
      return SmartCardCryptogramGenerator(Pointer(address))
    }

    public override fun toNative(obj: SmartCardCryptogramGenerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetSmartCardCryptogramGeneratorAsync() =
        ABI.ISmartCardCryptogramGeneratorStatics_Instance.GetSmartCardCryptogramGeneratorAsync()

    public fun IsSupported() = ABI.ISmartCardCryptogramGeneratorStatics2_Instance.IsSupported()
  }
}
