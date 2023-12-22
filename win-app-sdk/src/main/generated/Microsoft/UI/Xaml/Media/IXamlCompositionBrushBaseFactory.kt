package Microsoft.UI.Xaml.Media

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

@ABIMarker(IXamlCompositionBrushBaseFactory.ABI::class)
@Signature("{b1626d56-0f6f-5416-ada4-5c8105d3f082}")
@Guid("b1626d560f6f5416ada45c8105d3f082")
@WinRTInterface("b1626d560f6f5416ada45c8105d3f082")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlCompositionBrushBaseFactory.ByReference::class)
public interface IXamlCompositionBrushBaseFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      XamlCompositionBrushBase?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlCompositionBrushBaseFactory> {
    public override fun getValue() = ABI.makeIXamlCompositionBrushBaseFactory(pointer.getPointer(0))

    public fun setValue(value: IXamlCompositionBrushBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlCompositionBrushBaseFactory {
    public val __1987510928_Ptr: Pointer?

    public val _1987510928_VtblPtr: Pointer?
      get() = __1987510928_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        XamlCompositionBrushBase? {
      val fnPtr = _1987510928_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlCompositionBrushBase>()
      val hr = fn.invokeHR(arrayOf(__1987510928_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlCompositionBrushBase>(result.getValue())
      return resultValue
    }
  }

  public class IXamlCompositionBrushBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1987510928_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlCompositionBrushBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1626d560f6f5416ada45c8105d3f082")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlCompositionBrushBaseFactory(ptr: Pointer?): WithDefault =
        IXamlCompositionBrushBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlCompositionBrushBaseFactory {
      val address = segment.toRawLongValue()
      return makeIXamlCompositionBrushBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: IXamlCompositionBrushBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1987510928_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlCompositionBrushBaseFactory):
        Array<IXamlCompositionBrushBaseFactory?> = (elements as
        Array<IXamlCompositionBrushBaseFactory?>).castToImpl<IXamlCompositionBrushBaseFactory,IXamlCompositionBrushBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlCompositionBrushBaseFactory?> =
        arrayOfNulls<IXamlCompositionBrushBaseFactory_Impl>(size) as
        Array<IXamlCompositionBrushBaseFactory?>
  }
}
