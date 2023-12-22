package Windows.UI.Text

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

@ABIMarker(RichEditTextDocument.ABI::class)
@Signature("rc(Windows.UI.Text.RichEditTextDocument;{f2311112-8c89-49c9-9118-f057cbb814ee})")
@WinRTByReference(brClass = RichEditTextDocument.ByReference::class)
public class RichEditTextDocument(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITextDocument2.WithDefault, ITextDocument3.WithDefault,
    ITextDocument4.WithDefault, ITextDocument.WithDefault, IWinRTObject {
  private val __145749795_Interface: ITextDocument2.WithDefault by lazy {
    as_145749795()
  }


  private val __145749794_Interface: ITextDocument3.WithDefault by lazy {
    as_145749794()
  }


  private val __145749793_Interface: ITextDocument4.WithDefault by lazy {
    as_145749793()
  }


  private val __965129717_Interface: ITextDocument.WithDefault by lazy {
    as_965129717()
  }


  public override val __145749795_Ptr: JNAPointer? by lazy {
    __145749795_Interface.__145749795_Ptr
  }


  public override val __145749794_Ptr: JNAPointer? by lazy {
    __145749794_Interface.__145749794_Ptr
  }


  public override val __145749793_Ptr: JNAPointer? by lazy {
    __145749793_Interface.__145749793_Ptr
  }


  public override val __965129717_Ptr: JNAPointer? by lazy {
    __965129717_Interface.__965129717_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__145749795_Interface, __145749794_Interface, __145749793_Interface,
        __965129717_Interface)

  private fun as_145749795(): ITextDocument2.WithDefault {
    if(pointer == NULL) {
      return(ITextDocument2.ABI.makeITextDocument2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextDocument2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextDocument2.ABI.makeITextDocument2(ref.value))
  }

  private fun as_145749794(): ITextDocument3.WithDefault {
    if(pointer == NULL) {
      return(ITextDocument3.ABI.makeITextDocument3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextDocument3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextDocument3.ABI.makeITextDocument3(ref.value))
  }

  private fun as_145749793(): ITextDocument4.WithDefault {
    if(pointer == NULL) {
      return(ITextDocument4.ABI.makeITextDocument4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextDocument4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextDocument4.ABI.makeITextDocument4(ref.value))
  }

  private fun as_965129717(): ITextDocument.WithDefault {
    if(pointer == NULL) {
      return(ITextDocument.ABI.makeITextDocument(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITextDocument>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITextDocument.ABI.makeITextDocument(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RichEditTextDocument> {
    public override fun getValue() = RichEditTextDocument(pointer.getPointer(0))

    public fun setValue(value: RichEditTextDocument): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RichEditTextDocument, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RichEditTextDocument {
      val address = segment.toRawLongValue()
      return RichEditTextDocument(Pointer(address))
    }

    public override fun toNative(obj: RichEditTextDocument): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
