package Windows.UI.Xaml.Input

import Windows.UI.Xaml.RoutedEventArgs
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

@ABIMarker(RightTappedRoutedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.RightTappedRoutedEventArgs;{6834869d-7bd5-4033-b237-172f79abe393})")
@WinRTByReference(brClass = RightTappedRoutedEventArgs.ByReference::class)
public class RightTappedRoutedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IRightTappedRoutedEventArgs.WithDefault, IWinRTObject {
  private val __1093445622_Interface: IRightTappedRoutedEventArgs.WithDefault by lazy {
    as_1093445622()
  }


  public override val __1093445622_Ptr: JNAPointer? by lazy {
    __1093445622_Interface.__1093445622_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1093445622_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1093445622(): IRightTappedRoutedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRightTappedRoutedEventArgs.ABI.makeIRightTappedRoutedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRightTappedRoutedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRightTappedRoutedEventArgs.ABI.makeIRightTappedRoutedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RightTappedRoutedEventArgs> {
    public override fun getValue() = RightTappedRoutedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RightTappedRoutedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RightTappedRoutedEventArgs, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.RightTappedRoutedEventArgs".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): RightTappedRoutedEventArgs {
      val address = segment.toRawLongValue()
      return RightTappedRoutedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RightTappedRoutedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
