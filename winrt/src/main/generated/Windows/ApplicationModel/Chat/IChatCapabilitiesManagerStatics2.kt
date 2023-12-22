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

@ABIMarker(IChatCapabilitiesManagerStatics2.ABI::class)
@Signature("{e30d4274-d5c1-4ac9-9ffc-40e69184fec8}")
@Guid("e30d4274d5c14ac99ffc40e69184fec8")
@WinRTInterface("e30d4274d5c14ac99ffc40e69184fec8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatCapabilitiesManagerStatics2.ByReference::class)
public interface IChatCapabilitiesManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetCachedCapabilitiesAsync(address: String?, transportId: String?):
      IAsyncOperation<ChatCapabilities?>?

  @InterfaceMethod(1)
  public fun GetCapabilitiesFromNetworkAsync(address: String?, transportId: String?):
      IAsyncOperation<ChatCapabilities?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatCapabilitiesManagerStatics2> {
    public override fun getValue() = ABI.makeIChatCapabilitiesManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IChatCapabilitiesManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatCapabilitiesManagerStatics2 {
    public val __650527845_Ptr: Pointer?

    public val _650527845_VtblPtr: Pointer?
      get() = __650527845_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetCachedCapabilitiesAsync(address: String?, transportId: String?):
        IAsyncOperation<ChatCapabilities?>? {
      val fnPtr = _650527845_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatCapabilities?>>()
      val hr = fn.invokeHR(arrayOf(__650527845_Ptr, marshalToNative(address),
          marshalToNative(transportId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatCapabilities?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetCapabilitiesFromNetworkAsync(address: String?, transportId: String?):
        IAsyncOperation<ChatCapabilities?>? {
      val fnPtr = _650527845_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ChatCapabilities?>>()
      val hr = fn.invokeHR(arrayOf(__650527845_Ptr, marshalToNative(address),
          marshalToNative(transportId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ChatCapabilities?>>(result.getValue())
      return resultValue
    }
  }

  public class IChatCapabilitiesManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __650527845_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatCapabilitiesManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e30d4274d5c14ac99ffc40e69184fec8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatCapabilitiesManagerStatics2(ptr: Pointer?): WithDefault =
        IChatCapabilitiesManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatCapabilitiesManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIChatCapabilitiesManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IChatCapabilitiesManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__650527845_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatCapabilitiesManagerStatics2):
        Array<IChatCapabilitiesManagerStatics2?> = (elements as
        Array<IChatCapabilitiesManagerStatics2?>).castToImpl<IChatCapabilitiesManagerStatics2,IChatCapabilitiesManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatCapabilitiesManagerStatics2?> =
        arrayOfNulls<IChatCapabilitiesManagerStatics2_Impl>(size) as
        Array<IChatCapabilitiesManagerStatics2?>
  }
}
