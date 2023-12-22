package Windows.ApplicationModel.AppService

import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(IStatelessAppServiceResponse.ABI::class)
@Signature("{43754af7-a9ec-52fe-82e7-939b68dc9388}")
@Guid("43754af7a9ec52fe82e7939b68dc9388")
@WinRTInterface("43754af7a9ec52fe82e7939b68dc9388")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStatelessAppServiceResponse.ByReference::class)
public interface IStatelessAppServiceResponse : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Message(): ValueSet?

  @InterfaceMethod(1)
  public fun get_Status(): StatelessAppServiceResponseStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStatelessAppServiceResponse> {
    public override fun getValue() = ABI.makeIStatelessAppServiceResponse(pointer.getPointer(0))

    public fun setValue(value: IStatelessAppServiceResponse_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStatelessAppServiceResponse {
    public val __1399948396_Ptr: Pointer?

    public val _1399948396_VtblPtr: Pointer?
      get() = __1399948396_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Message(): ValueSet? {
      val fnPtr = _1399948396_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__1399948396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): StatelessAppServiceResponseStatus? {
      val fnPtr = _1399948396_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StatelessAppServiceResponseStatus>()
      val hr = fn.invokeHR(arrayOf(__1399948396_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StatelessAppServiceResponseStatus>(result.getValue())
      return resultValue
    }
  }

  public class IStatelessAppServiceResponse_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1399948396_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStatelessAppServiceResponse, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("43754af7a9ec52fe82e7939b68dc9388")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStatelessAppServiceResponse(ptr: Pointer?): WithDefault =
        IStatelessAppServiceResponse_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStatelessAppServiceResponse {
      val address = segment.toRawLongValue()
      return makeIStatelessAppServiceResponse(Pointer(address))
    }

    public override fun toNative(obj: IStatelessAppServiceResponse): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1399948396_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStatelessAppServiceResponse):
        Array<IStatelessAppServiceResponse?> = (elements as
        Array<IStatelessAppServiceResponse?>).castToImpl<IStatelessAppServiceResponse,IStatelessAppServiceResponse_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStatelessAppServiceResponse?> =
        arrayOfNulls<IStatelessAppServiceResponse_Impl>(size) as
        Array<IStatelessAppServiceResponse?>
  }
}
