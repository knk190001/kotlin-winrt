package Windows.UI.Xaml.Input

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IManipulationStartedRoutedEventArgsFactory.ABI::class)
@Signature("{84c1daa7-7272-4463-b6c3-a40b9ba151fc}")
@Guid("84c1daa772724463b6c3a40b9ba151fc")
@WinRTInterface("84c1daa772724463b6c3a40b9ba151fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IManipulationStartedRoutedEventArgsFactory.ByReference::class)
public interface IManipulationStartedRoutedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      ManipulationStartedRoutedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IManipulationStartedRoutedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIManipulationStartedRoutedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IManipulationStartedRoutedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IManipulationStartedRoutedEventArgsFactory {
    public val __1172850940_Ptr: Pointer?

    public val _1172850940_VtblPtr: Pointer?
      get() = __1172850940_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        ManipulationStartedRoutedEventArgs? {
      val fnPtr = _1172850940_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ManipulationStartedRoutedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__1172850940_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ManipulationStartedRoutedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IManipulationStartedRoutedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1172850940_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IManipulationStartedRoutedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84c1daa772724463b6c3a40b9ba151fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIManipulationStartedRoutedEventArgsFactory(ptr: Pointer?): WithDefault =
        IManipulationStartedRoutedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IManipulationStartedRoutedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIManipulationStartedRoutedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IManipulationStartedRoutedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1172850940_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IManipulationStartedRoutedEventArgsFactory):
        Array<IManipulationStartedRoutedEventArgsFactory?> = (elements as
        Array<IManipulationStartedRoutedEventArgsFactory?>).castToImpl<IManipulationStartedRoutedEventArgsFactory,IManipulationStartedRoutedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IManipulationStartedRoutedEventArgsFactory?> =
        arrayOfNulls<IManipulationStartedRoutedEventArgsFactory_Impl>(size) as
        Array<IManipulationStartedRoutedEventArgsFactory?>
  }
}
