package Windows.Networking.NetworkOperators

import Windows.Foundation.Uri
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandAccount3.ABI::class)
@Signature("{092a1e21-9379-4b9b-ad31-d5fee2f748c6}")
@Guid("092a1e2193794b9bad31d5fee2f748c6")
@WinRTInterface("092a1e2193794b9bad31d5fee2f748c6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandAccount3.ByReference::class)
public interface IMobileBroadbandAccount3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AccountExperienceUrl(): Uri?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandAccount3> {
    public override fun getValue() = ABI.makeIMobileBroadbandAccount3(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandAccount3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandAccount3 {
    public val __1187092962_Ptr: Pointer?

    public val _1187092962_VtblPtr: Pointer?
      get() = __1187092962_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AccountExperienceUrl(): Uri? {
      val fnPtr = _1187092962_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1187092962_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandAccount3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1187092962_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandAccount3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("092a1e2193794b9bad31d5fee2f748c6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandAccount3(ptr: Pointer?): WithDefault =
        IMobileBroadbandAccount3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandAccount3 {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandAccount3(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandAccount3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1187092962_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandAccount3):
        Array<IMobileBroadbandAccount3?> = (elements as
        Array<IMobileBroadbandAccount3?>).castToImpl<IMobileBroadbandAccount3,IMobileBroadbandAccount3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandAccount3?> =
        arrayOfNulls<IMobileBroadbandAccount3_Impl>(size) as Array<IMobileBroadbandAccount3?>
  }
}
