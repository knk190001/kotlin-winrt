package Windows.Networking.NetworkOperators

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

@ABIMarker(IHotspotAuthenticationEventDetails.ABI::class)
@Signature("{e756c791-1001-4de5-83c7-de61d88831d0}")
@Guid("e756c79110014de583c7de61d88831d0")
@WinRTInterface("e756c79110014de583c7de61d88831d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHotspotAuthenticationEventDetails.ByReference::class)
public interface IHotspotAuthenticationEventDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EventToken(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHotspotAuthenticationEventDetails> {
    public override fun getValue() =
        ABI.makeIHotspotAuthenticationEventDetails(pointer.getPointer(0))

    public fun setValue(value: IHotspotAuthenticationEventDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHotspotAuthenticationEventDetails {
    public val __1117761482_Ptr: Pointer?

    public val _1117761482_VtblPtr: Pointer?
      get() = __1117761482_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EventToken(): String? {
      val fnPtr = _1117761482_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1117761482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IHotspotAuthenticationEventDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1117761482_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHotspotAuthenticationEventDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e756c79110014de583c7de61d88831d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHotspotAuthenticationEventDetails(ptr: Pointer?): WithDefault =
        IHotspotAuthenticationEventDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHotspotAuthenticationEventDetails {
      val address = segment.toRawLongValue()
      return makeIHotspotAuthenticationEventDetails(Pointer(address))
    }

    public override fun toNative(obj: IHotspotAuthenticationEventDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1117761482_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHotspotAuthenticationEventDetails):
        Array<IHotspotAuthenticationEventDetails?> = (elements as
        Array<IHotspotAuthenticationEventDetails?>).castToImpl<IHotspotAuthenticationEventDetails,IHotspotAuthenticationEventDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHotspotAuthenticationEventDetails?> =
        arrayOfNulls<IHotspotAuthenticationEventDetails_Impl>(size) as
        Array<IHotspotAuthenticationEventDetails?>
  }
}
