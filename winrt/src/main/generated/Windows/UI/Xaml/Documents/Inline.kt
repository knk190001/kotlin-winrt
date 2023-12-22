package Windows.UI.Xaml.Documents

import Windows.UI.Xaml.Documents.IInlineFactory.ABI.IID
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Inline.ABI::class)
@Signature("rc(Windows.UI.Xaml.Documents.Inline;{0c92712d-1bc9-4931-8cb1-1aeadf1cc685})")
@WinRTByReference(brClass = Inline.ByReference::class)
public open class Inline(
  ptr: JNAPointer? = NULL
) : TextElement(ptr), IInline.WithDefault, IWinRTObject {
  private val __1364026687_Interface: IInline.WithDefault by lazy {
    as_1364026687()
  }


  public override val __1364026687_Ptr: JNAPointer? by lazy {
    __1364026687_Interface.__1364026687_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1364026687_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1364026687(): IInline.WithDefault {
    if(pointer == NULL) {
      return(IInline.ABI.makeIInline(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInline>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInline.ABI.makeIInline(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Inline> {
    public override fun getValue() = Inline(pointer.getPointer(0))

    public fun setValue(value: Inline): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Inline, MemoryAddress> {
    public val IInlineFactory_Instance: IInlineFactory by lazy {
      createIInlineFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInlineFactory(): IInlineFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Documents.Inline".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInlineFactory.ABI.makeIInlineFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IInlineFactory_Instance.CreateInstance(null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Inline {
      val address = segment.toRawLongValue()
      return Inline(Pointer(address))
    }

    public override fun toNative(obj: Inline): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
