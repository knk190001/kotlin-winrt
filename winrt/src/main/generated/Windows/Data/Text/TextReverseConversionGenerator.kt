package Windows.Data.Text

import Windows.Data.Text.ITextReverseConversionGeneratorFactory.ABI.IID
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

@ABIMarker(TextReverseConversionGenerator.ABI::class)
@Signature("rc(Windows.Data.Text.TextReverseConversionGenerator;{51e7f514-9c51-4d86-ae1b-b498fbad8313})")
@WinRTByReference(brClass = TextReverseConversionGenerator.ByReference::class)
public class TextReverseConversionGenerator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextReverseConversionGenerator.WithDefault,
    ITextReverseConversionGenerator2.WithDefault, IWinRTObject {
  private val __1885343211_Interface: ITextReverseConversionGenerator.WithDefault by lazy {
    as_1885343211()
  }


  private val __1683902553_Interface: ITextReverseConversionGenerator2.WithDefault by lazy {
    as_1683902553()
  }


  public override val __1885343211_Ptr: JNAPointer? by lazy {
    __1885343211_Interface.__1885343211_Ptr
  }


  public override val __1683902553_Ptr: JNAPointer? by lazy {
    __1683902553_Interface.__1683902553_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1885343211_Interface, __1683902553_Interface)

  public constructor(languageTag: String) : this(ABI.activate(languageTag))

  private fun as_1885343211(): ITextReverseConversionGenerator.WithDefault {
    if(pointer == NULL) {
      return(ITextReverseConversionGenerator.ABI.makeITextReverseConversionGenerator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextReverseConversionGenerator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextReverseConversionGenerator.ABI.makeITextReverseConversionGenerator(ref.value))
  }

  private fun as_1683902553(): ITextReverseConversionGenerator2.WithDefault {
    if(pointer == NULL) {
      return(ITextReverseConversionGenerator2.ABI.makeITextReverseConversionGenerator2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextReverseConversionGenerator2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextReverseConversionGenerator2.ABI.makeITextReverseConversionGenerator2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextReverseConversionGenerator> {
    public override fun getValue() = TextReverseConversionGenerator(pointer.getPointer(0))

    public fun setValue(value: TextReverseConversionGenerator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextReverseConversionGenerator, MemoryAddress> {
    public val ITextReverseConversionGeneratorFactory_Instance:
        ITextReverseConversionGeneratorFactory by lazy {
      createITextReverseConversionGeneratorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITextReverseConversionGeneratorFactory():
        ITextReverseConversionGeneratorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Text.TextReverseConversionGenerator".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITextReverseConversionGeneratorFactory.ABI.makeITextReverseConversionGeneratorFactory(factoryActivatorPtr.value))
    }

    public fun activate(languageTag: String): JNAPointer? =
        ITextReverseConversionGeneratorFactory_Instance.Create(languageTag)?.pointer

    public override fun fromNative(segment: MemoryAddress): TextReverseConversionGenerator {
      val address = segment.toRawLongValue()
      return TextReverseConversionGenerator(Pointer(address))
    }

    public override fun toNative(obj: TextReverseConversionGenerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
