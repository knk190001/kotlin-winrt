package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.UIElement
import Windows.Foundation.Collections.IVectorView
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INonVirtualizingLayoutContext.ABI::class)
@Signature("{1e378538-f33c-5410-82cc-ca6f06d5e259}")
@Guid("1e378538f33c541082ccca6f06d5e259")
@WinRTInterface("1e378538f33c541082ccca6f06d5e259")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INonVirtualizingLayoutContext.ByReference::class)
public interface INonVirtualizingLayoutContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Children(): IVectorView<UIElement?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INonVirtualizingLayoutContext> {
    public override fun getValue() = ABI.makeINonVirtualizingLayoutContext(pointer.getPointer(0))

    public fun setValue(value: INonVirtualizingLayoutContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INonVirtualizingLayoutContext {
    public val __1016834343_Ptr: Pointer?

    public val _1016834343_VtblPtr: Pointer?
      get() = __1016834343_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Children(): IVectorView<UIElement?>? {
      val fnPtr = _1016834343_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UIElement?>>()
      val hr = fn.invokeHR(arrayOf(__1016834343_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UIElement?>>(result.getValue())
      return resultValue
    }
  }

  public class INonVirtualizingLayoutContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1016834343_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INonVirtualizingLayoutContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e378538f33c541082ccca6f06d5e259")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINonVirtualizingLayoutContext(ptr: Pointer?): WithDefault =
        INonVirtualizingLayoutContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INonVirtualizingLayoutContext {
      val address = segment.toRawLongValue()
      return makeINonVirtualizingLayoutContext(Pointer(address))
    }

    public override fun toNative(obj: INonVirtualizingLayoutContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1016834343_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INonVirtualizingLayoutContext):
        Array<INonVirtualizingLayoutContext?> = (elements as
        Array<INonVirtualizingLayoutContext?>).castToImpl<INonVirtualizingLayoutContext,INonVirtualizingLayoutContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INonVirtualizingLayoutContext?> =
        arrayOfNulls<INonVirtualizingLayoutContext_Impl>(size) as
        Array<INonVirtualizingLayoutContext?>
  }
}
