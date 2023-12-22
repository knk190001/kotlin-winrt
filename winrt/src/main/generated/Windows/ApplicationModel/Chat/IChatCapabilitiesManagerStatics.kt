package Windows.ApplicationModel.Chat

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IChatCapabilitiesManagerStatics.ABI::class)
@Signature("{b57a2f30-7041-458e-b0cf-7c0d9fea333a}")
@Guid("b57a2f307041458eb0cf7c0d9fea333a")
@WinRTInterface("b57a2f307041458eb0cf7c0d9fea333a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatCapabilitiesManagerStatics.ByReference::class)
public interface IChatCapabilitiesManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCachedCapabilitiesAsync(address: String?): IAsyncOperation<ChatCapabilities?>?

  @InterfaceMethod(1)
  public fun GetCapabilitiesFromNetworkAsync(address: String?): IAsyncOperation<ChatCapabilities?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatCapabilitiesManagerStatics> {
    public override fun getValue() = ABI.makeIChatCapabilitiesManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IChatCapabilitiesManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatCapabilitiesManagerStatics {
    public val __1545005421_Ptr: Pointer?

    public val _1545005421_VtblPtr: Pointer?
      get() = __1545005421_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCachedCapabilitiesAsync(address: String?):
        IAsyncOperation<ChatCapabilities?>? {
      val fnPtr = _1545005421_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatCapabilities?>>()
      val hr = fn.invokeHR(arrayOf(__1545005421_Ptr, marshalToNative(address), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatCapabilities?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCapabilitiesFromNetworkAsync(address: String?):
        IAsyncOperation<ChatCapabilities?>? {
      val fnPtr = _1545005421_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatCapabilities?>>()
      val hr = fn.invokeHR(arrayOf(__1545005421_Ptr, marshalToNative(address), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatCapabilities?>>(result.getValue())
      return resultValue
    }
  }

  public class IChatCapabilitiesManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1545005421_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatCapabilitiesManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b57a2f307041458eb0cf7c0d9fea333a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatCapabilitiesManagerStatics(ptr: Pointer?): WithDefault =
        IChatCapabilitiesManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatCapabilitiesManagerStatics {
      val address = segment.toRawLongValue()
      return makeIChatCapabilitiesManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IChatCapabilitiesManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1545005421_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatCapabilitiesManagerStatics):
        Array<IChatCapabilitiesManagerStatics?> = (elements as
        Array<IChatCapabilitiesManagerStatics?>).castToImpl<IChatCapabilitiesManagerStatics,IChatCapabilitiesManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatCapabilitiesManagerStatics?> =
        arrayOfNulls<IChatCapabilitiesManagerStatics_Impl>(size) as
        Array<IChatCapabilitiesManagerStatics?>
  }
}
