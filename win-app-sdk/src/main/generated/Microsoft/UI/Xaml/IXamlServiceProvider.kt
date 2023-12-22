package Microsoft.UI.Xaml

import Windows.UI.Xaml.Interop.TypeName
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

@ABIMarker(IXamlServiceProvider.ABI::class)
@Signature("{68b3a2df-8173-539f-b524-c8a2348f5afb}")
@Guid("68b3a2df8173539fb524c8a2348f5afb")
@WinRTInterface("68b3a2df8173539fb524c8a2348f5afb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlServiceProvider.ByReference::class)
public interface IXamlServiceProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetService(type: TypeName?): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlServiceProvider> {
    public override fun getValue() = ABI.makeIXamlServiceProvider(pointer.getPointer(0))

    public fun setValue(value: IXamlServiceProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlServiceProvider {
    public val __614481737_Ptr: Pointer?

    public val _614481737_VtblPtr: Pointer?
      get() = __614481737_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetService(type: TypeName?): IUnknown? {
      val fnPtr = _614481737_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__614481737_Ptr, marshalToNative(type), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IXamlServiceProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __614481737_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlServiceProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68b3a2df8173539fb524c8a2348f5afb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlServiceProvider(ptr: Pointer?): WithDefault = IXamlServiceProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlServiceProvider {
      val address = segment.toRawLongValue()
      return makeIXamlServiceProvider(Pointer(address))
    }

    public override fun toNative(obj: IXamlServiceProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__614481737_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlServiceProvider): Array<IXamlServiceProvider?> =
        (elements as
        Array<IXamlServiceProvider?>).castToImpl<IXamlServiceProvider,IXamlServiceProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlServiceProvider?> =
        arrayOfNulls<IXamlServiceProvider_Impl>(size) as Array<IXamlServiceProvider?>
  }
}
