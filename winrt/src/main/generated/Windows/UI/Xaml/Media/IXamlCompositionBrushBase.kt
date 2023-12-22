package Windows.UI.Xaml.Media

import Windows.UI.Color
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

@ABIMarker(IXamlCompositionBrushBase.ABI::class)
@Signature("{03e432d9-b35c-4a79-811c-c5652004da0e}")
@Guid("03e432d9b35c4a79811cc5652004da0e")
@WinRTInterface("03e432d9b35c4a79811cc5652004da0e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlCompositionBrushBase.ByReference::class)
public interface IXamlCompositionBrushBase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FallbackColor(): Color?

  @InterfaceMethod(1)
  public fun put_FallbackColor(value: Color?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlCompositionBrushBase> {
    public override fun getValue() = ABI.makeIXamlCompositionBrushBase(pointer.getPointer(0))

    public fun setValue(value: IXamlCompositionBrushBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlCompositionBrushBase {
    public val __1338728197_Ptr: Pointer?

    public val _1338728197_VtblPtr: Pointer?
      get() = __1338728197_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FallbackColor(): Color? {
      val fnPtr = _1338728197_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1338728197_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_FallbackColor(value: Color?): Unit {
      val fnPtr = _1338728197_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1338728197_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlCompositionBrushBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1338728197_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlCompositionBrushBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03e432d9b35c4a79811cc5652004da0e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlCompositionBrushBase(ptr: Pointer?): WithDefault =
        IXamlCompositionBrushBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlCompositionBrushBase {
      val address = segment.toRawLongValue()
      return makeIXamlCompositionBrushBase(Pointer(address))
    }

    public override fun toNative(obj: IXamlCompositionBrushBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1338728197_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlCompositionBrushBase):
        Array<IXamlCompositionBrushBase?> = (elements as
        Array<IXamlCompositionBrushBase?>).castToImpl<IXamlCompositionBrushBase,IXamlCompositionBrushBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlCompositionBrushBase?> =
        arrayOfNulls<IXamlCompositionBrushBase_Impl>(size) as Array<IXamlCompositionBrushBase?>
  }
}
