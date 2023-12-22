package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IVectorView
import Windows.Networking.Connectivity.ConnectionProfile
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

@ABIMarker(IMobileBroadbandAccount2.ABI::class)
@Signature("{38f52f1c-1136-4257-959f-b658a352b6d4}")
@Guid("38f52f1c11364257959fb658a352b6d4")
@WinRTInterface("38f52f1c11364257959fb658a352b6d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandAccount2.ByReference::class)
public interface IMobileBroadbandAccount2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetConnectionProfiles(): IVectorView<ConnectionProfile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandAccount2> {
    public override fun getValue() = ABI.makeIMobileBroadbandAccount2(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandAccount2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandAccount2 {
    public val __1187092961_Ptr: Pointer?

    public val _1187092961_VtblPtr: Pointer?
      get() = __1187092961_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetConnectionProfiles(): IVectorView<ConnectionProfile?>? {
      val fnPtr = _1187092961_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ConnectionProfile?>>()
      val hr = fn.invokeHR(arrayOf(__1187092961_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<ConnectionProfile?>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandAccount2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1187092961_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandAccount2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38f52f1c11364257959fb658a352b6d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandAccount2(ptr: Pointer?): WithDefault =
        IMobileBroadbandAccount2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandAccount2 {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandAccount2(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandAccount2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1187092961_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandAccount2):
        Array<IMobileBroadbandAccount2?> = (elements as
        Array<IMobileBroadbandAccount2?>).castToImpl<IMobileBroadbandAccount2,IMobileBroadbandAccount2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandAccount2?> =
        arrayOfNulls<IMobileBroadbandAccount2_Impl>(size) as Array<IMobileBroadbandAccount2?>
  }
}
