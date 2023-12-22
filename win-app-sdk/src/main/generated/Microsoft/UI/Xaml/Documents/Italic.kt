package Microsoft.UI.Xaml.Documents

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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(Italic.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Documents.Italic;{ca3cbebd-7a8d-5d7a-8fdf-538e8a680f6c})")
@WinRTByReference(brClass = Italic.ByReference::class)
public class Italic(
  ptr: JNAPointer? = NULL
) : Span(ptr), IItalic.WithDefault, IWinRTObject {
  private val __1833998925_Interface: IItalic.WithDefault by lazy {
    as_1833998925()
  }


  public override val __1833998925_Ptr: JNAPointer? by lazy {
    __1833998925_Interface.__1833998925_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1833998925_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1833998925(): IItalic.WithDefault {
    if(pointer == NULL) {
      return(IItalic.ABI.makeIItalic(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItalic>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItalic.ABI.makeIItalic(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Italic> {
    public override fun getValue() = Italic(pointer.getPointer(0))

    public fun setValue(value: Italic): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Italic, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Documents.Italic".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): Italic {
      val address = segment.toRawLongValue()
      return Italic(Pointer(address))
    }

    public override fun toNative(obj: Italic): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
