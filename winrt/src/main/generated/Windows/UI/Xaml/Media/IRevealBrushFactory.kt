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

@ABIMarker(IRevealBrushFactory.ABI::class)
@Signature("{9d9379ce-e3a0-4aaf-be37-ea9d9dd43105}")
@Guid("9d9379cee3a04aafbe37ea9d9dd43105")
@WinRTInterface("9d9379cee3a04aafbe37ea9d9dd43105")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRevealBrushFactory.ByReference::class)
public interface IRevealBrushFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): RevealBrush?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRevealBrushFactory> {
    public override fun getValue() = ABI.makeIRevealBrushFactory(pointer.getPointer(0))

    public fun setValue(value: IRevealBrushFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRevealBrushFactory {
    public val __19167193_Ptr: Pointer?

    public val _19167193_VtblPtr: Pointer?
      get() = __19167193_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        RevealBrush? {
      val fnPtr = _19167193_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RevealBrush>()
      val hr = fn.invokeHR(arrayOf(__19167193_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RevealBrush>(result.getValue())
      return resultValue
    }
  }

  public class IRevealBrushFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __19167193_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRevealBrushFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d9379cee3a04aafbe37ea9d9dd43105")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRevealBrushFactory(ptr: Pointer?): WithDefault = IRevealBrushFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRevealBrushFactory {
      val address = segment.toRawLongValue()
      return makeIRevealBrushFactory(Pointer(address))
    }

    public override fun toNative(obj: IRevealBrushFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__19167193_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRevealBrushFactory): Array<IRevealBrushFactory?> =
        (elements as
        Array<IRevealBrushFactory?>).castToImpl<IRevealBrushFactory,IRevealBrushFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRevealBrushFactory?> =
        arrayOfNulls<IRevealBrushFactory_Impl>(size) as Array<IRevealBrushFactory?>
  }
}
