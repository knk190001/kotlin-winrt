package Windows.Networking.NetworkOperators

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

@ABIMarker(IMobileBroadbandUicc.ABI::class)
@Signature("{e634f691-525a-4ce2-8fce-aa4162579154}")
@Guid("e634f691525a4ce28fceaa4162579154")
@WinRTInterface("e634f691525a4ce28fceaa4162579154")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandUicc.ByReference::class)
public interface IMobileBroadbandUicc : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SimIccId(): String?

  @InterfaceMethod(1)
  public fun GetUiccAppsAsync(): IAsyncOperation<MobileBroadbandUiccAppsResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandUicc> {
    public override fun getValue() = ABI.makeIMobileBroadbandUicc(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandUicc_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandUicc {
    public val __2070207952_Ptr: Pointer?

    public val _2070207952_VtblPtr: Pointer?
      get() = __2070207952_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SimIccId(): String? {
      val fnPtr = _2070207952_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2070207952_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetUiccAppsAsync(): IAsyncOperation<MobileBroadbandUiccAppsResult?>? {
      val fnPtr = _2070207952_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MobileBroadbandUiccAppsResult?>>()
      val hr = fn.invokeHR(arrayOf(__2070207952_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MobileBroadbandUiccAppsResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandUicc_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2070207952_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandUicc, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e634f691525a4ce28fceaa4162579154")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandUicc(ptr: Pointer?): WithDefault = IMobileBroadbandUicc_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandUicc {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandUicc(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandUicc): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2070207952_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandUicc): Array<IMobileBroadbandUicc?> =
        (elements as
        Array<IMobileBroadbandUicc?>).castToImpl<IMobileBroadbandUicc,IMobileBroadbandUicc_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandUicc?> =
        arrayOfNulls<IMobileBroadbandUicc_Impl>(size) as Array<IMobileBroadbandUicc?>
  }
}
