package Windows.Media.Protection.PlayReady

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

@ABIMarker(INDLicenseFetchResult.ABI::class)
@Signature("{21d39698-aa62-45ff-a5ff-8037e5433825}")
@Guid("21d39698aa6245ffa5ff8037e5433825")
@WinRTInterface("21d39698aa6245ffa5ff8037e5433825")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDLicenseFetchResult.ByReference::class)
public interface INDLicenseFetchResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResponseCustomData(): INDCustomData?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDLicenseFetchResult> {
    public override fun getValue() = ABI.makeINDLicenseFetchResult(pointer.getPointer(0))

    public fun setValue(value: INDLicenseFetchResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDLicenseFetchResult {
    public val __649249370_Ptr: Pointer?

    public val _649249370_VtblPtr: Pointer?
      get() = __649249370_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResponseCustomData(): INDCustomData? {
      val fnPtr = _649249370_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<INDCustomData>()
      val hr = fn.invokeHR(arrayOf(__649249370_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<INDCustomData>(result.getValue())
      return resultValue
    }
  }

  public class INDLicenseFetchResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __649249370_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDLicenseFetchResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("21d39698aa6245ffa5ff8037e5433825")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDLicenseFetchResult(ptr: Pointer?): WithDefault =
        INDLicenseFetchResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDLicenseFetchResult {
      val address = segment.toRawLongValue()
      return makeINDLicenseFetchResult(Pointer(address))
    }

    public override fun toNative(obj: INDLicenseFetchResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__649249370_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDLicenseFetchResult): Array<INDLicenseFetchResult?> =
        (elements as
        Array<INDLicenseFetchResult?>).castToImpl<INDLicenseFetchResult,INDLicenseFetchResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDLicenseFetchResult?> =
        arrayOfNulls<INDLicenseFetchResult_Impl>(size) as Array<INDLicenseFetchResult?>
  }
}
