package Windows.System.RemoteSystems

import Windows.Security.Credentials.WebAccount
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

@ABIMarker(IRemoteSystemWebAccountFilter.ABI::class)
@Signature("{3fb75873-87c8-5d8f-977e-f69f96d67238}")
@Guid("3fb7587387c85d8f977ef69f96d67238")
@WinRTInterface("3fb7587387c85d8f977ef69f96d67238")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemWebAccountFilter.ByReference::class)
public interface IRemoteSystemWebAccountFilter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Account(): WebAccount?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemWebAccountFilter> {
    public override fun getValue() = ABI.makeIRemoteSystemWebAccountFilter(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemWebAccountFilter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemWebAccountFilter {
    public val __1475532731_Ptr: Pointer?

    public val _1475532731_VtblPtr: Pointer?
      get() = __1475532731_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Account(): WebAccount? {
      val fnPtr = _1475532731_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccount>()
      val hr = fn.invokeHR(arrayOf(__1475532731_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccount>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemWebAccountFilter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1475532731_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemWebAccountFilter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3fb7587387c85d8f977ef69f96d67238")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemWebAccountFilter(ptr: Pointer?): WithDefault =
        IRemoteSystemWebAccountFilter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemWebAccountFilter {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemWebAccountFilter(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemWebAccountFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1475532731_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemWebAccountFilter):
        Array<IRemoteSystemWebAccountFilter?> = (elements as
        Array<IRemoteSystemWebAccountFilter?>).castToImpl<IRemoteSystemWebAccountFilter,IRemoteSystemWebAccountFilter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemWebAccountFilter?> =
        arrayOfNulls<IRemoteSystemWebAccountFilter_Impl>(size) as
        Array<IRemoteSystemWebAccountFilter?>
  }
}
