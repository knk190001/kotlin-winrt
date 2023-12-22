package Microsoft.UI.Xaml.Controls

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SemanticZoomViewChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.SemanticZoomViewChangedEventArgs;{cf62d53d-97d3-5cef-96f3-1c413f524eca})")
@WinRTByReference(brClass = SemanticZoomViewChangedEventArgs.ByReference::class)
public class SemanticZoomViewChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISemanticZoomViewChangedEventArgs.WithDefault, IWinRTObject {
  private val __2039138008_Interface: ISemanticZoomViewChangedEventArgs.WithDefault by lazy {
    as_2039138008()
  }


  public override val __2039138008_Ptr: JNAPointer? by lazy {
    __2039138008_Interface.__2039138008_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2039138008_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2039138008(): ISemanticZoomViewChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ISemanticZoomViewChangedEventArgs.ABI.makeISemanticZoomViewChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISemanticZoomViewChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISemanticZoomViewChangedEventArgs.ABI.makeISemanticZoomViewChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SemanticZoomViewChangedEventArgs> {
    public override fun getValue() = SemanticZoomViewChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: SemanticZoomViewChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SemanticZoomViewChangedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.SemanticZoomViewChangedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SemanticZoomViewChangedEventArgs {
      val address = segment.toRawLongValue()
      return SemanticZoomViewChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: SemanticZoomViewChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
