package Windows.Networking.Connectivity

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

@ABIMarker(IWlanConnectionProfileDetails.ABI::class)
@Signature("{562098cb-b35a-4bf1-a884-b7557e88ff86}")
@Guid("562098cbb35a4bf1a884b7557e88ff86")
@WinRTInterface("562098cbb35a4bf1a884b7557e88ff86")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWlanConnectionProfileDetails.ByReference::class)
public interface IWlanConnectionProfileDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetConnectedSsid(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWlanConnectionProfileDetails> {
    public override fun getValue() = ABI.makeIWlanConnectionProfileDetails(pointer.getPointer(0))

    public fun setValue(value: IWlanConnectionProfileDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWlanConnectionProfileDetails {
    public val __1680900476_Ptr: Pointer?

    public val _1680900476_VtblPtr: Pointer?
      get() = __1680900476_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetConnectedSsid(): String? {
      val fnPtr = _1680900476_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1680900476_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWlanConnectionProfileDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1680900476_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWlanConnectionProfileDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("562098cbb35a4bf1a884b7557e88ff86")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWlanConnectionProfileDetails(ptr: Pointer?): WithDefault =
        IWlanConnectionProfileDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWlanConnectionProfileDetails {
      val address = segment.toRawLongValue()
      return makeIWlanConnectionProfileDetails(Pointer(address))
    }

    public override fun toNative(obj: IWlanConnectionProfileDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1680900476_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWlanConnectionProfileDetails):
        Array<IWlanConnectionProfileDetails?> = (elements as
        Array<IWlanConnectionProfileDetails?>).castToImpl<IWlanConnectionProfileDetails,IWlanConnectionProfileDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWlanConnectionProfileDetails?> =
        arrayOfNulls<IWlanConnectionProfileDetails_Impl>(size) as
        Array<IWlanConnectionProfileDetails?>
  }
}
