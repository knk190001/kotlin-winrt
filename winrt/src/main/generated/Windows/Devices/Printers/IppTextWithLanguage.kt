package Windows.Devices.Printers

import Windows.Devices.Printers.IIppTextWithLanguageFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(IppTextWithLanguage.ABI::class)
@Signature("rc(Windows.Devices.Printers.IppTextWithLanguage;{326447a6-5149-5936-90e8-0c736036bf77})")
@WinRTByReference(brClass = IppTextWithLanguage.ByReference::class)
public class IppTextWithLanguage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIppTextWithLanguage.WithDefault, IWinRTObject {
  private val __1087097664_Interface: IIppTextWithLanguage.WithDefault by lazy {
    as_1087097664()
  }


  public override val __1087097664_Ptr: JNAPointer? by lazy {
    __1087097664_Interface.__1087097664_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1087097664_Interface)

  public constructor(language: String, text: String) : this(ABI.activate(language, text))

  private fun as_1087097664(): IIppTextWithLanguage.WithDefault {
    if(pointer == NULL) {
      return(IIppTextWithLanguage.ABI.makeIIppTextWithLanguage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIppTextWithLanguage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIppTextWithLanguage.ABI.makeIIppTextWithLanguage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IppTextWithLanguage> {
    public override fun getValue() = IppTextWithLanguage(pointer.getPointer(0))

    public fun setValue(value: IppTextWithLanguage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IppTextWithLanguage, MemoryAddress> {
    public val IIppTextWithLanguageFactory_Instance: IIppTextWithLanguageFactory by lazy {
      createIIppTextWithLanguageFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIIppTextWithLanguageFactory(): IIppTextWithLanguageFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Printers.IppTextWithLanguage".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IIppTextWithLanguageFactory.ABI.makeIIppTextWithLanguageFactory(factoryActivatorPtr.value))
    }

    public fun activate(language: String, text: String): JNAPointer? =
        IIppTextWithLanguageFactory_Instance.CreateInstance(language, text)?.pointer

    public override fun fromNative(segment: MemoryAddress): IppTextWithLanguage {
      val address = segment.toRawLongValue()
      return IppTextWithLanguage(Pointer(address))
    }

    public override fun toNative(obj: IppTextWithLanguage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
