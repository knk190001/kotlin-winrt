package Windows.Services.Store

import Windows.Web.Http.HttpStatusCode
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

@ABIMarker(IStoreSendRequestResult2.ABI::class)
@Signature("{2901296f-c0b0-49d0-8e8d-aa940af9c10b}")
@Guid("2901296fc0b049d08e8daa940af9c10b")
@WinRTInterface("2901296fc0b049d08e8daa940af9c10b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreSendRequestResult2.ByReference::class)
public interface IStoreSendRequestResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HttpStatusCode(): HttpStatusCode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreSendRequestResult2> {
    public override fun getValue() = ABI.makeIStoreSendRequestResult2(pointer.getPointer(0))

    public fun setValue(value: IStoreSendRequestResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreSendRequestResult2 {
    public val __803847746_Ptr: Pointer?

    public val _803847746_VtblPtr: Pointer?
      get() = __803847746_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HttpStatusCode(): HttpStatusCode? {
      val fnPtr = _803847746_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpStatusCode>()
      val hr = fn.invokeHR(arrayOf(__803847746_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpStatusCode>(result.getValue())
      return resultValue
    }
  }

  public class IStoreSendRequestResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __803847746_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreSendRequestResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2901296fc0b049d08e8daa940af9c10b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreSendRequestResult2(ptr: Pointer?): WithDefault =
        IStoreSendRequestResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreSendRequestResult2 {
      val address = segment.toRawLongValue()
      return makeIStoreSendRequestResult2(Pointer(address))
    }

    public override fun toNative(obj: IStoreSendRequestResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__803847746_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreSendRequestResult2):
        Array<IStoreSendRequestResult2?> = (elements as
        Array<IStoreSendRequestResult2?>).castToImpl<IStoreSendRequestResult2,IStoreSendRequestResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreSendRequestResult2?> =
        arrayOfNulls<IStoreSendRequestResult2_Impl>(size) as Array<IStoreSendRequestResult2?>
  }
}
