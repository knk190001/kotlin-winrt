package Windows.Data.Text

import Windows.Data.Text.ITextConversionGeneratorFactory.ABI.IID
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

@ABIMarker(TextConversionGenerator.ABI::class)
@Signature("rc(Windows.Data.Text.TextConversionGenerator;{03606a5e-2aa9-4ab6-af8b-a562b63a8992})")
@WinRTByReference(brClass = TextConversionGenerator.ByReference::class)
public class TextConversionGenerator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextConversionGenerator.WithDefault, IWinRTObject {
  private val __1958047373_Interface: ITextConversionGenerator.WithDefault by lazy {
    as_1958047373()
  }


  public override val __1958047373_Ptr: JNAPointer? by lazy {
    __1958047373_Interface.__1958047373_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1958047373_Interface)

  public constructor(languageTag: String) : this(ABI.activate(languageTag))

  private fun as_1958047373(): ITextConversionGenerator.WithDefault {
    if(pointer == NULL) {
      return(ITextConversionGenerator.ABI.makeITextConversionGenerator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextConversionGenerator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextConversionGenerator.ABI.makeITextConversionGenerator(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextConversionGenerator> {
    public override fun getValue() = TextConversionGenerator(pointer.getPointer(0))

    public fun setValue(value: TextConversionGenerator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextConversionGenerator, MemoryAddress> {
    public val ITextConversionGeneratorFactory_Instance: ITextConversionGeneratorFactory by lazy {
      createITextConversionGeneratorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITextConversionGeneratorFactory(): ITextConversionGeneratorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Text.TextConversionGenerator".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITextConversionGeneratorFactory.ABI.makeITextConversionGeneratorFactory(factoryActivatorPtr.value))
    }

    public fun activate(languageTag: String): JNAPointer? =
        ITextConversionGeneratorFactory_Instance.Create(languageTag)?.pointer

    public override fun fromNative(segment: MemoryAddress): TextConversionGenerator {
      val address = segment.toRawLongValue()
      return TextConversionGenerator(Pointer(address))
    }

    public override fun toNative(obj: TextConversionGenerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
