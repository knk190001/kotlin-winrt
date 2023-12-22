package Windows.UI.Xaml

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

@ABIMarker(VisualStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.VisualStateChangedEventArgs;{fe216ab1-f31f-4791-8989-c70e1d9b59ff})")
@WinRTByReference(brClass = VisualStateChangedEventArgs.ByReference::class)
public class VisualStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVisualStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __2016071682_Interface: IVisualStateChangedEventArgs.WithDefault by lazy {
    as_2016071682()
  }


  public override val __2016071682_Ptr: JNAPointer? by lazy {
    __2016071682_Interface.__2016071682_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2016071682_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2016071682(): IVisualStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IVisualStateChangedEventArgs.ABI.makeIVisualStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualStateChangedEventArgs.ABI.makeIVisualStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VisualStateChangedEventArgs> {
    public override fun getValue() = VisualStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: VisualStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VisualStateChangedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.VisualStateChangedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): VisualStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return VisualStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: VisualStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
