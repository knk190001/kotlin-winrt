package Windows.Security.Authentication.Web.Core

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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebProviderErrorFactory.ABI::class)
@Signature("{e3c40a2d-89ef-4e37-847f-a8b9d5a32910}")
@Guid("e3c40a2d89ef4e37847fa8b9d5a32910")
@WinRTInterface("e3c40a2d89ef4e37847fa8b9d5a32910")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebProviderErrorFactory.ByReference::class)
public interface IWebProviderErrorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(errorCode: WinDef.UINT, errorMessage: String?): WebProviderError?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebProviderErrorFactory> {
    public override fun getValue() = ABI.makeIWebProviderErrorFactory(pointer.getPointer(0))

    public fun setValue(value: IWebProviderErrorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebProviderErrorFactory {
    public val __1112450102_Ptr: Pointer?

    public val _1112450102_VtblPtr: Pointer?
      get() = __1112450102_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(errorCode: WinDef.UINT, errorMessage: String?): WebProviderError? {
      val fnPtr = _1112450102_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebProviderError>()
      val hr = fn.invokeHR(arrayOf(__1112450102_Ptr, errorCode, marshalToNative(errorMessage),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebProviderError>(result.getValue())
      return resultValue
    }
  }

  public class IWebProviderErrorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1112450102_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebProviderErrorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3c40a2d89ef4e37847fa8b9d5a32910")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebProviderErrorFactory(ptr: Pointer?): WithDefault =
        IWebProviderErrorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebProviderErrorFactory {
      val address = segment.toRawLongValue()
      return makeIWebProviderErrorFactory(Pointer(address))
    }

    public override fun toNative(obj: IWebProviderErrorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1112450102_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebProviderErrorFactory):
        Array<IWebProviderErrorFactory?> = (elements as
        Array<IWebProviderErrorFactory?>).castToImpl<IWebProviderErrorFactory,IWebProviderErrorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebProviderErrorFactory?> =
        arrayOfNulls<IWebProviderErrorFactory_Impl>(size) as Array<IWebProviderErrorFactory?>
  }
}
