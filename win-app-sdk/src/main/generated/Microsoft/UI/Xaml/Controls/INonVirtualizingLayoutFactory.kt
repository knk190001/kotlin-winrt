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

@ABIMarker(INonVirtualizingLayoutFactory.ABI::class)
@Signature("{a16d2d12-dbac-5ce0-aef5-09171a4d3571}")
@Guid("a16d2d12dbac5ce0aef509171a4d3571")
@WinRTInterface("a16d2d12dbac5ce0aef509171a4d3571")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INonVirtualizingLayoutFactory.ByReference::class)
public interface INonVirtualizingLayoutFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      NonVirtualizingLayout?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INonVirtualizingLayoutFactory> {
    public override fun getValue() = ABI.makeINonVirtualizingLayoutFactory(pointer.getPointer(0))

    public fun setValue(value: INonVirtualizingLayoutFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INonVirtualizingLayoutFactory {
    public val __1234719284_Ptr: Pointer?

    public val _1234719284_VtblPtr: Pointer?
      get() = __1234719284_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        NonVirtualizingLayout? {
      val fnPtr = _1234719284_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NonVirtualizingLayout>()
      val hr = fn.invokeHR(arrayOf(__1234719284_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NonVirtualizingLayout>(result.getValue())
      return resultValue
    }
  }

  public class INonVirtualizingLayoutFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1234719284_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INonVirtualizingLayoutFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a16d2d12dbac5ce0aef509171a4d3571")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINonVirtualizingLayoutFactory(ptr: Pointer?): WithDefault =
        INonVirtualizingLayoutFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INonVirtualizingLayoutFactory {
      val address = segment.toRawLongValue()
      return makeINonVirtualizingLayoutFactory(Pointer(address))
    }

    public override fun toNative(obj: INonVirtualizingLayoutFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1234719284_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INonVirtualizingLayoutFactory):
        Array<INonVirtualizingLayoutFactory?> = (elements as
        Array<INonVirtualizingLayoutFactory?>).castToImpl<INonVirtualizingLayoutFactory,INonVirtualizingLayoutFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INonVirtualizingLayoutFactory?> =
        arrayOfNulls<INonVirtualizingLayoutFactory_Impl>(size) as
        Array<INonVirtualizingLayoutFactory?>
  }
}
