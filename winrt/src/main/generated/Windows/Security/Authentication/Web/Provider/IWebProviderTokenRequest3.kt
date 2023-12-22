package Windows.Security.Authentication.Web.Provider

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebProviderTokenRequest3.ABI::class)
@Signature("{1b2716aa-4289-446e-9256-dafb6f66a51e}")
@Guid("1b2716aa4289446e9256dafb6f66a51e")
@WinRTInterface("1b2716aa4289446e9256dafb6f66a51e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebProviderTokenRequest3.ByReference::class)
public interface IWebProviderTokenRequest3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ApplicationPackageFamilyName(): String?

  @InterfaceMethod(1)
  public fun get_ApplicationProcessName(): String?

  @InterfaceMethod(2)
  public fun CheckApplicationForCapabilityAsync(capabilityName: String?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebProviderTokenRequest3> {
    public override fun getValue() = ABI.makeIWebProviderTokenRequest3(pointer.getPointer(0))

    public fun setValue(value: IWebProviderTokenRequest3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebProviderTokenRequest3 {
    public val __724753443_Ptr: Pointer?

    public val _724753443_VtblPtr: Pointer?
      get() = __724753443_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ApplicationPackageFamilyName(): String? {
      val fnPtr = _724753443_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__724753443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ApplicationProcessName(): String? {
      val fnPtr = _724753443_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__724753443_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CheckApplicationForCapabilityAsync(capabilityName: String?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _724753443_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__724753443_Ptr, marshalToNative(capabilityName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IWebProviderTokenRequest3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __724753443_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebProviderTokenRequest3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b2716aa4289446e9256dafb6f66a51e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebProviderTokenRequest3(ptr: Pointer?): WithDefault =
        IWebProviderTokenRequest3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebProviderTokenRequest3 {
      val address = segment.toRawLongValue()
      return makeIWebProviderTokenRequest3(Pointer(address))
    }

    public override fun toNative(obj: IWebProviderTokenRequest3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__724753443_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebProviderTokenRequest3):
        Array<IWebProviderTokenRequest3?> = (elements as
        Array<IWebProviderTokenRequest3?>).castToImpl<IWebProviderTokenRequest3,IWebProviderTokenRequest3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebProviderTokenRequest3?> =
        arrayOfNulls<IWebProviderTokenRequest3_Impl>(size) as Array<IWebProviderTokenRequest3?>
  }
}
