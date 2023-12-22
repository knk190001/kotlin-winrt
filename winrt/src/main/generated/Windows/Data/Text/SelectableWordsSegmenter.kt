package Windows.Data.Text

import Windows.Data.Text.ISelectableWordsSegmenterFactory.ABI.IID
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

@ABIMarker(SelectableWordsSegmenter.ABI::class)
@Signature("rc(Windows.Data.Text.SelectableWordsSegmenter;{f6dc31e7-4b13-45c5-8897-7d71269e085d})")
@WinRTByReference(brClass = SelectableWordsSegmenter.ByReference::class)
public class SelectableWordsSegmenter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISelectableWordsSegmenter.WithDefault, IWinRTObject {
  private val __657830544_Interface: ISelectableWordsSegmenter.WithDefault by lazy {
    as_657830544()
  }


  public override val __657830544_Ptr: JNAPointer? by lazy {
    __657830544_Interface.__657830544_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__657830544_Interface)

  public constructor(language: String) : this(ABI.activate(language))

  private fun as_657830544(): ISelectableWordsSegmenter.WithDefault {
    if(pointer == NULL) {
      return(ISelectableWordsSegmenter.ABI.makeISelectableWordsSegmenter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectableWordsSegmenter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectableWordsSegmenter.ABI.makeISelectableWordsSegmenter(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SelectableWordsSegmenter> {
    public override fun getValue() = SelectableWordsSegmenter(pointer.getPointer(0))

    public fun setValue(value: SelectableWordsSegmenter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SelectableWordsSegmenter, MemoryAddress> {
    public val ISelectableWordsSegmenterFactory_Instance: ISelectableWordsSegmenterFactory by lazy {
      createISelectableWordsSegmenterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISelectableWordsSegmenterFactory(): ISelectableWordsSegmenterFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Text.SelectableWordsSegmenter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISelectableWordsSegmenterFactory.ABI.makeISelectableWordsSegmenterFactory(factoryActivatorPtr.value))
    }

    public fun activate(language: String): JNAPointer? =
        ISelectableWordsSegmenterFactory_Instance.CreateWithLanguage(language)?.pointer

    public override fun fromNative(segment: MemoryAddress): SelectableWordsSegmenter {
      val address = segment.toRawLongValue()
      return SelectableWordsSegmenter(Pointer(address))
    }

    public override fun toNative(obj: SelectableWordsSegmenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
