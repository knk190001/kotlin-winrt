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

@ABIMarker(IRevealBorderBrushFactory.ABI::class)
@Signature("{94c25298-f5f8-4482-a25c-6758501a8626}")
@Guid("94c25298f5f84482a25c6758501a8626")
@WinRTInterface("94c25298f5f84482a25c6758501a8626")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRevealBorderBrushFactory.ByReference::class)
public interface IRevealBorderBrushFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): RevealBorderBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRevealBorderBrushFactory> {
    public override fun getValue() = ABI.makeIRevealBorderBrushFactory(pointer.getPointer(0))

    public fun setValue(value: IRevealBorderBrushFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRevealBorderBrushFactory {
    public val __335113061_Ptr: Pointer?

    public val _335113061_VtblPtr: Pointer?
      get() = __335113061_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RevealBorderBrush? {
      val fnPtr = _335113061_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RevealBorderBrush>()
      val hr = fn.invokeHR(arrayOf(__335113061_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RevealBorderBrush>(result.getValue())
      return resultValue
    }
  }

  public class IRevealBorderBrushFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __335113061_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRevealBorderBrushFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("94c25298f5f84482a25c6758501a8626")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRevealBorderBrushFactory(ptr: Pointer?): WithDefault =
        IRevealBorderBrushFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRevealBorderBrushFactory {
      val address = segment.toRawLongValue()
      return makeIRevealBorderBrushFactory(Pointer(address))
    }

    public override fun toNative(obj: IRevealBorderBrushFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__335113061_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRevealBorderBrushFactory):
        Array<IRevealBorderBrushFactory?> = (elements as
        Array<IRevealBorderBrushFactory?>).castToImpl<IRevealBorderBrushFactory,IRevealBorderBrushFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRevealBorderBrushFactory?> =
        arrayOfNulls<IRevealBorderBrushFactory_Impl>(size) as Array<IRevealBorderBrushFactory?>
  }
}
