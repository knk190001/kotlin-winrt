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

@ABIMarker(IPathIconFactory.ABI::class)
@Signature("{8e88f087-f2cd-581c-91ca-a99335ca9599}")
@Guid("8e88f087f2cd581c91caa99335ca9599")
@WinRTInterface("8e88f087f2cd581c91caa99335ca9599")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathIconFactory.ByReference::class)
public interface IPathIconFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): PathIcon?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPathIconFactory> {
    public override fun getValue() = ABI.makeIPathIconFactory(pointer.getPointer(0))

    public fun setValue(value: IPathIconFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathIconFactory {
    public val __844564411_Ptr: Pointer?

    public val _844564411_VtblPtr: Pointer?
      get() = __844564411_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        PathIcon? {
      val fnPtr = _844564411_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PathIcon>()
      val hr = fn.invokeHR(arrayOf(__844564411_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PathIcon>(result.getValue())
      return resultValue
    }
  }

  public class IPathIconFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __844564411_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathIconFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8e88f087f2cd581c91caa99335ca9599")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathIconFactory(ptr: Pointer?): WithDefault = IPathIconFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathIconFactory {
      val address = segment.toRawLongValue()
      return makeIPathIconFactory(Pointer(address))
    }

    public override fun toNative(obj: IPathIconFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__844564411_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathIconFactory): Array<IPathIconFactory?> = (elements as
        Array<IPathIconFactory?>).castToImpl<IPathIconFactory,IPathIconFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathIconFactory?> =
        arrayOfNulls<IPathIconFactory_Impl>(size) as Array<IPathIconFactory?>
  }
}
