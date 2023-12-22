package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IMobileBroadbandUiccAppsResult.ABI::class)
@Signature("{744930eb-8157-4a41-8494-6bf54c9b1d2b}")
@Guid("744930eb81574a4184946bf54c9b1d2b")
@WinRTInterface("744930eb81574a4184946bf54c9b1d2b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandUiccAppsResult.ByReference::class)
public interface IMobileBroadbandUiccAppsResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): MobileBroadbandUiccAppOperationStatus?

  @InterfaceMethod(1)
  public fun get_UiccApps(): IVectorView<MobileBroadbandUiccApp?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandUiccAppsResult> {
    public override fun getValue() = ABI.makeIMobileBroadbandUiccAppsResult(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandUiccAppsResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandUiccAppsResult {
    public val __1246534785_Ptr: Pointer?

    public val _1246534785_VtblPtr: Pointer?
      get() = __1246534785_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): MobileBroadbandUiccAppOperationStatus? {
      val fnPtr = _1246534785_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandUiccAppOperationStatus>()
      val hr = fn.invokeHR(arrayOf(__1246534785_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandUiccAppOperationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UiccApps(): IVectorView<MobileBroadbandUiccApp?>? {
      val fnPtr = _1246534785_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MobileBroadbandUiccApp?>>()
      val hr = fn.invokeHR(arrayOf(__1246534785_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MobileBroadbandUiccApp?>>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandUiccAppsResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1246534785_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandUiccAppsResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("744930eb81574a4184946bf54c9b1d2b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandUiccAppsResult(ptr: Pointer?): WithDefault =
        IMobileBroadbandUiccAppsResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandUiccAppsResult {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandUiccAppsResult(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandUiccAppsResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1246534785_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandUiccAppsResult):
        Array<IMobileBroadbandUiccAppsResult?> = (elements as
        Array<IMobileBroadbandUiccAppsResult?>).castToImpl<IMobileBroadbandUiccAppsResult,IMobileBroadbandUiccAppsResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandUiccAppsResult?> =
        arrayOfNulls<IMobileBroadbandUiccAppsResult_Impl>(size) as
        Array<IMobileBroadbandUiccAppsResult?>
  }
}
