package Windows.Data.Text

import Windows.Data.Text.ITextPredictionGeneratorFactory.ABI.IID
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

@ABIMarker(TextPredictionGenerator.ABI::class)
@Signature("rc(Windows.Data.Text.TextPredictionGenerator;{5eacab07-abf1-4cb6-9d9e-326f2b468756})")
@WinRTByReference(brClass = TextPredictionGenerator.ByReference::class)
public class TextPredictionGenerator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextPredictionGenerator.WithDefault, ITextPredictionGenerator2.WithDefault,
    IWinRTObject {
  private val __1681292492_Interface: ITextPredictionGenerator.WithDefault by lazy {
    as_1681292492()
  }


  private val __580459650_Interface: ITextPredictionGenerator2.WithDefault by lazy {
    as_580459650()
  }


  public override val __1681292492_Ptr: JNAPointer? by lazy {
    __1681292492_Interface.__1681292492_Ptr
  }


  public override val __580459650_Ptr: JNAPointer? by lazy {
    __580459650_Interface.__580459650_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1681292492_Interface, __580459650_Interface)

  public constructor(languageTag: String) : this(ABI.activate(languageTag))

  private fun as_1681292492(): ITextPredictionGenerator.WithDefault {
    if(pointer == NULL) {
      return(ITextPredictionGenerator.ABI.makeITextPredictionGenerator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextPredictionGenerator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextPredictionGenerator.ABI.makeITextPredictionGenerator(ref.value))
  }

  private fun as_580459650(): ITextPredictionGenerator2.WithDefault {
    if(pointer == NULL) {
      return(ITextPredictionGenerator2.ABI.makeITextPredictionGenerator2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextPredictionGenerator2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextPredictionGenerator2.ABI.makeITextPredictionGenerator2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TextPredictionGenerator> {
    public override fun getValue() = TextPredictionGenerator(pointer.getPointer(0))

    public fun setValue(value: TextPredictionGenerator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TextPredictionGenerator, MemoryAddress> {
    public val ITextPredictionGeneratorFactory_Instance: ITextPredictionGeneratorFactory by lazy {
      createITextPredictionGeneratorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITextPredictionGeneratorFactory(): ITextPredictionGeneratorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Text.TextPredictionGenerator".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITextPredictionGeneratorFactory.ABI.makeITextPredictionGeneratorFactory(factoryActivatorPtr.value))
    }

    public fun activate(languageTag: String): JNAPointer? =
        ITextPredictionGeneratorFactory_Instance.Create(languageTag)?.pointer

    public override fun fromNative(segment: MemoryAddress): TextPredictionGenerator {
      val address = segment.toRawLongValue()
      return TextPredictionGenerator(Pointer(address))
    }

    public override fun toNative(obj: TextPredictionGenerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
