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

@ABIMarker(INonVirtualizingLayoutContextOverrides.ABI::class)
@Signature("{995cf544-5d3f-5f44-b537-fd13650c745c}")
@Guid("995cf5445d3f5f44b537fd13650c745c")
@WinRTInterface("995cf5445d3f5f44b537fd13650c745c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INonVirtualizingLayoutContextOverrides.ByReference::class)
public interface INonVirtualizingLayoutContextOverrides : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChildrenCore(): IVectorView<UIElement?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INonVirtualizingLayoutContextOverrides> {
    public override fun getValue() =
        ABI.makeINonVirtualizingLayoutContextOverrides(pointer.getPointer(0))

    public fun setValue(value: INonVirtualizingLayoutContextOverrides_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INonVirtualizingLayoutContextOverrides {
    public val __702821554_Ptr: Pointer?

    public val _702821554_VtblPtr: Pointer?
      get() = __702821554_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChildrenCore(): IVectorView<UIElement?>? {
      val fnPtr = _702821554_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<UIElement?>>()
      val hr = fn.invokeHR(arrayOf(__702821554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<UIElement?>>(result.getValue())
      return resultValue
    }
  }

  public class INonVirtualizingLayoutContextOverrides_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __702821554_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INonVirtualizingLayoutContextOverrides, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("995cf5445d3f5f44b537fd13650c745c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINonVirtualizingLayoutContextOverrides(ptr: Pointer?): WithDefault =
        INonVirtualizingLayoutContextOverrides_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INonVirtualizingLayoutContextOverrides {
      val address = segment.toRawLongValue()
      return makeINonVirtualizingLayoutContextOverrides(Pointer(address))
    }

    public override fun toNative(obj: INonVirtualizingLayoutContextOverrides): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__702821554_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INonVirtualizingLayoutContextOverrides):
        Array<INonVirtualizingLayoutContextOverrides?> = (elements as
        Array<INonVirtualizingLayoutContextOverrides?>).castToImpl<INonVirtualizingLayoutContextOverrides,INonVirtualizingLayoutContextOverrides_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INonVirtualizingLayoutContextOverrides?> =
        arrayOfNulls<INonVirtualizingLayoutContextOverrides_Impl>(size) as
        Array<INonVirtualizingLayoutContextOverrides?>
  }
}
