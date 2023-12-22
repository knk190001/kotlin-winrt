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

@ABIMarker(LineBreak.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Documents.LineBreak;{09307599-7cc2-5f54-b106-728620c16f76})")
@WinRTByReference(brClass = LineBreak.ByReference::class)
public class LineBreak(
  ptr: JNAPointer? = NULL
) : Inline(ptr), ILineBreak.WithDefault, IWinRTObject {
  private val __23699410_Interface: ILineBreak.WithDefault by lazy {
    as_23699410()
  }


  public override val __23699410_Ptr: JNAPointer? by lazy {
    __23699410_Interface.__23699410_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__23699410_Interface)

  public constructor() : this(ABI.activate())

  private fun as_23699410(): ILineBreak.WithDefault {
    if(pointer == NULL) {
      return(ILineBreak.ABI.makeILineBreak(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILineBreak>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILineBreak.ABI.makeILineBreak(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LineBreak> {
    public override fun getValue() = LineBreak(pointer.getPointer(0))

    public fun setValue(value: LineBreak): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LineBreak, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Documents.LineBreak".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): LineBreak {
      val address = segment.toRawLongValue()
      return LineBreak(Pointer(address))
    }

    public override fun toNative(obj: LineBreak): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
