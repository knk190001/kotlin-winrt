package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ISwipeControlFactory.ABI::class)
@Signature("{6e9213f4-30c1-56ca-9905-46aa1a83dfc1}")
@Guid("6e9213f430c156ca990546aa1a83dfc1")
@WinRTInterface("6e9213f430c156ca990546aa1a83dfc1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeControlFactory.ByReference::class)
public interface ISwipeControlFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): SwipeControl?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwipeControlFactory> {
    public override fun getValue() = ABI.makeISwipeControlFactory(pointer.getPointer(0))

    public fun setValue(value: ISwipeControlFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeControlFactory {
    public val __158489184_Ptr: Pointer?

    public val _158489184_VtblPtr: Pointer?
      get() = __158489184_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        SwipeControl? {
      val fnPtr = _158489184_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SwipeControl>()
      val hr = fn.invokeHR(arrayOf(__158489184_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SwipeControl>(result.getValue())
      return resultValue
    }
  }

  public class ISwipeControlFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __158489184_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeControlFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e9213f430c156ca990546aa1a83dfc1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeControlFactory(ptr: Pointer?): WithDefault = ISwipeControlFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeControlFactory {
      val address = segment.toRawLongValue()
      return makeISwipeControlFactory(Pointer(address))
    }

    public override fun toNative(obj: ISwipeControlFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__158489184_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeControlFactory): Array<ISwipeControlFactory?> =
        (elements as
        Array<ISwipeControlFactory?>).castToImpl<ISwipeControlFactory,ISwipeControlFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeControlFactory?> =
        arrayOfNulls<ISwipeControlFactory_Impl>(size) as Array<ISwipeControlFactory?>
  }
}
