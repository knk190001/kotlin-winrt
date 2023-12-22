package Windows.Security.Authentication.Web.Provider

import Windows.Foundation.Collections.IVector
import Windows.Foundation.DateTime
import Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IWebAccountProviderTokenOperation.ABI::class)
@Signature("{95c613be-2034-4c38-9434-d26c14b2b4b2}")
@Guid("95c613be20344c389434d26c14b2b4b2")
@WinRTInterface("95c613be20344c389434d26c14b2b4b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProviderTokenOperation.ByReference::class)
public interface IWebAccountProviderTokenOperation : NativeMapped, IWinRTInterface,
    IWebAccountProviderOperation {
  @InterfaceMethod(0)
  public fun get_ProviderRequest(): WebProviderTokenRequest?

  @InterfaceMethod(1)
  public fun get_ProviderResponses(): IVector<WebProviderTokenResponse?>?

  @InterfaceMethod(2)
  public fun put_CacheExpirationTime(value: DateTime?): Unit

  @InterfaceMethod(3)
  public fun get_CacheExpirationTime(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProviderTokenOperation> {
    public override fun getValue() =
        ABI.makeIWebAccountProviderTokenOperation(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProviderTokenOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProviderTokenOperation,
      IWebAccountProviderOperation.WithDefault {
    public val __742558019_Ptr: Pointer?

    public val _742558019_VtblPtr: Pointer?
      get() = __742558019_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProviderRequest(): WebProviderTokenRequest? {
      val fnPtr = _742558019_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebProviderTokenRequest>()
      val hr = fn.invokeHR(arrayOf(__742558019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebProviderTokenRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProviderResponses(): IVector<WebProviderTokenResponse?>? {
      val fnPtr = _742558019_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WebProviderTokenResponse?>>()
      val hr = fn.invokeHR(arrayOf(__742558019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<WebProviderTokenResponse?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_CacheExpirationTime(value: DateTime?): Unit {
      val fnPtr = _742558019_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__742558019_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_CacheExpirationTime(): DateTime? {
      val fnPtr = _742558019_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__742558019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountProviderTokenOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebAccountProviderOperation {
    public override val __1287167602_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_742558019_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __742558019_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProviderTokenOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95c613be20344c389434d26c14b2b4b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProviderTokenOperation(ptr: Pointer?): WithDefault =
        IWebAccountProviderTokenOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebAccountProviderTokenOperation {
      val address = segment.toRawLongValue()
      return makeIWebAccountProviderTokenOperation(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProviderTokenOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__742558019_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProviderTokenOperation):
        Array<IWebAccountProviderTokenOperation?> = (elements as
        Array<IWebAccountProviderTokenOperation?>).castToImpl<IWebAccountProviderTokenOperation,IWebAccountProviderTokenOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProviderTokenOperation?> =
        arrayOfNulls<IWebAccountProviderTokenOperation_Impl>(size) as
        Array<IWebAccountProviderTokenOperation?>
  }
}
