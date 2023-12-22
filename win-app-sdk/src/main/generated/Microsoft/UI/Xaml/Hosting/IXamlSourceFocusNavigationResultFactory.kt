package Microsoft.UI.Xaml.Hosting

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXamlSourceFocusNavigationResultFactory.ABI::class)
@Signature("{f533f53b-5c00-5c88-9a41-3888cb86e495}")
@Guid("f533f53b5c005c889a413888cb86e495")
@WinRTInterface("f533f53b5c005c889a413888cb86e495")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlSourceFocusNavigationResultFactory.ByReference::class)
public interface IXamlSourceFocusNavigationResultFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(focusMoved: Boolean): XamlSourceFocusNavigationResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlSourceFocusNavigationResultFactory> {
    public override fun getValue() =
        ABI.makeIXamlSourceFocusNavigationResultFactory(pointer.getPointer(0))

    public fun setValue(value: IXamlSourceFocusNavigationResultFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlSourceFocusNavigationResultFactory {
    public val __358540033_Ptr: Pointer?

    public val _358540033_VtblPtr: Pointer?
      get() = __358540033_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(focusMoved: Boolean): XamlSourceFocusNavigationResult? {
      val fnPtr = _358540033_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlSourceFocusNavigationResult>()
      val hr = fn.invokeHR(arrayOf(__358540033_Ptr, focusMoved, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlSourceFocusNavigationResult>(result.getValue())
      return resultValue
    }
  }

  public class IXamlSourceFocusNavigationResultFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __358540033_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlSourceFocusNavigationResultFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f533f53b5c005c889a413888cb86e495")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlSourceFocusNavigationResultFactory(ptr: Pointer?): WithDefault =
        IXamlSourceFocusNavigationResultFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IXamlSourceFocusNavigationResultFactory {
      val address = segment.toRawLongValue()
      return makeIXamlSourceFocusNavigationResultFactory(Pointer(address))
    }

    public override fun toNative(obj: IXamlSourceFocusNavigationResultFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__358540033_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlSourceFocusNavigationResultFactory):
        Array<IXamlSourceFocusNavigationResultFactory?> = (elements as
        Array<IXamlSourceFocusNavigationResultFactory?>).castToImpl<IXamlSourceFocusNavigationResultFactory,IXamlSourceFocusNavigationResultFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlSourceFocusNavigationResultFactory?> =
        arrayOfNulls<IXamlSourceFocusNavigationResultFactory_Impl>(size) as
        Array<IXamlSourceFocusNavigationResultFactory?>
  }
}
