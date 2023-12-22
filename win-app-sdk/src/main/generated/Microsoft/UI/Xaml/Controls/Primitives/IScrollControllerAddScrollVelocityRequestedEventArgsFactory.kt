package Microsoft.UI.Xaml.Controls.Primitives

import Windows.Foundation.IReference
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollControllerAddScrollVelocityRequestedEventArgsFactory.ABI::class)
@Signature("{9221d193-6f82-5e21-aacc-0b1460818ab5}")
@Guid("9221d1936f825e21aacc0b1460818ab5")
@WinRTInterface("9221d1936f825e21aacc0b1460818ab5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IScrollControllerAddScrollVelocityRequestedEventArgsFactory.ByReference::class)
public interface IScrollControllerAddScrollVelocityRequestedEventArgsFactory : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(offsetVelocity: Float, inertiaDecayRate: IReference<Float>?):
      ScrollControllerAddScrollVelocityRequestedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollControllerAddScrollVelocityRequestedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeIScrollControllerAddScrollVelocityRequestedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IScrollControllerAddScrollVelocityRequestedEventArgsFactory_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollControllerAddScrollVelocityRequestedEventArgsFactory {
    public val __1654095184_Ptr: Pointer?

    public val _1654095184_VtblPtr: Pointer?
      get() = __1654095184_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(offsetVelocity: Float, inertiaDecayRate: IReference<Float>?):
        ScrollControllerAddScrollVelocityRequestedEventArgs? {
      val fnPtr = _1654095184_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollControllerAddScrollVelocityRequestedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__1654095184_Ptr, offsetVelocity,
          marshalToNative(inertiaDecayRate), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<ScrollControllerAddScrollVelocityRequestedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class IScrollControllerAddScrollVelocityRequestedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1654095184_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollControllerAddScrollVelocityRequestedEventArgsFactory,
      MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9221d1936f825e21aacc0b1460818ab5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollControllerAddScrollVelocityRequestedEventArgsFactory(ptr: Pointer?):
        WithDefault = IScrollControllerAddScrollVelocityRequestedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IScrollControllerAddScrollVelocityRequestedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIScrollControllerAddScrollVelocityRequestedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IScrollControllerAddScrollVelocityRequestedEventArgsFactory):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1654095184_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IScrollControllerAddScrollVelocityRequestedEventArgsFactory):
        Array<IScrollControllerAddScrollVelocityRequestedEventArgsFactory?> = (elements as
        Array<IScrollControllerAddScrollVelocityRequestedEventArgsFactory?>).castToImpl<IScrollControllerAddScrollVelocityRequestedEventArgsFactory,IScrollControllerAddScrollVelocityRequestedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IScrollControllerAddScrollVelocityRequestedEventArgsFactory?> =
        arrayOfNulls<IScrollControllerAddScrollVelocityRequestedEventArgsFactory_Impl>(size) as
        Array<IScrollControllerAddScrollVelocityRequestedEventArgsFactory?>
  }
}
