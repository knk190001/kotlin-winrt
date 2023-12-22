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

@ABIMarker(Underline.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Documents.Underline;{68aaec6e-ea71-5ed2-b83e-91684b25efb9})")
@WinRTByReference(brClass = Underline.ByReference::class)
public class Underline(
  ptr: JNAPointer? = NULL
) : Span(ptr), IUnderline.WithDefault, IWinRTObject {
  private val __772248975_Interface: IUnderline.WithDefault by lazy {
    as_772248975()
  }


  public override val __772248975_Ptr: JNAPointer? by lazy {
    __772248975_Interface.__772248975_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__772248975_Interface)

  public constructor() : this(ABI.activate())

  private fun as_772248975(): IUnderline.WithDefault {
    if(pointer == NULL) {
      return(IUnderline.ABI.makeIUnderline(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUnderline>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUnderline.ABI.makeIUnderline(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Underline> {
    public override fun getValue() = Underline(pointer.getPointer(0))

    public fun setValue(value: Underline): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Underline, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Documents.Underline".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): Underline {
      val address = segment.toRawLongValue()
      return Underline(Pointer(address))
    }

    public override fun toNative(obj: Underline): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
