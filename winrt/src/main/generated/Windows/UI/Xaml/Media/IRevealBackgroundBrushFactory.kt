package Windows.UI.Xaml.Media

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

@ABIMarker(IRevealBackgroundBrushFactory.ABI::class)
@Signature("{8c56bcaa-02a5-4f45-8506-8d39228f5d3f}")
@Guid("8c56bcaa02a54f4585068d39228f5d3f")
@WinRTInterface("8c56bcaa02a54f4585068d39228f5d3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRevealBackgroundBrushFactory.ByReference::class)
public interface IRevealBackgroundBrushFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      RevealBackgroundBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRevealBackgroundBrushFactory> {
    public override fun getValue() = ABI.makeIRevealBackgroundBrushFactory(pointer.getPointer(0))

    public fun setValue(value: IRevealBackgroundBrushFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRevealBackgroundBrushFactory {
    public val __600530151_Ptr: Pointer?

    public val _600530151_VtblPtr: Pointer?
      get() = __600530151_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RevealBackgroundBrush? {
      val fnPtr = _600530151_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RevealBackgroundBrush>()
      val hr = fn.invokeHR(arrayOf(__600530151_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RevealBackgroundBrush>(result.getValue())
      return resultValue
    }
  }

  public class IRevealBackgroundBrushFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __600530151_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRevealBackgroundBrushFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c56bcaa02a54f4585068d39228f5d3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRevealBackgroundBrushFactory(ptr: Pointer?): WithDefault =
        IRevealBackgroundBrushFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRevealBackgroundBrushFactory {
      val address = segment.toRawLongValue()
      return makeIRevealBackgroundBrushFactory(Pointer(address))
    }

    public override fun toNative(obj: IRevealBackgroundBrushFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__600530151_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRevealBackgroundBrushFactory):
        Array<IRevealBackgroundBrushFactory?> = (elements as
        Array<IRevealBackgroundBrushFactory?>).castToImpl<IRevealBackgroundBrushFactory,IRevealBackgroundBrushFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRevealBackgroundBrushFactory?> =
        arrayOfNulls<IRevealBackgroundBrushFactory_Impl>(size) as
        Array<IRevealBackgroundBrushFactory?>
  }
}
