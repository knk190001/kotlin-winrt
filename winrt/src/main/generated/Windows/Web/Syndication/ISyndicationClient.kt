package Windows.Web.Syndication

import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Foundation.Uri
import Windows.Security.Credentials.PasswordCredential
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISyndicationClient.ABI::class)
@Signature("{9e18a9b7-7249-4b45-b229-7df895a5a1f5}")
@Guid("9e18a9b772494b45b2297df895a5a1f5")
@WinRTInterface("9e18a9b772494b45b2297df895a5a1f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationClient.ByReference::class)
public interface ISyndicationClient : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ServerCredential(): PasswordCredential?

  @InterfaceMethod(1)
  public fun put_ServerCredential(value: PasswordCredential?): Unit

  @InterfaceMethod(2)
  public fun get_ProxyCredential(): PasswordCredential?

  @InterfaceMethod(3)
  public fun put_ProxyCredential(value: PasswordCredential?): Unit

  @InterfaceMethod(4)
  public fun get_MaxResponseBufferSize(): WinDef.UINT

  @InterfaceMethod(5)
  public fun put_MaxResponseBufferSize(value: WinDef.UINT): Unit

  @InterfaceMethod(6)
  public fun get_Timeout(): WinDef.UINT

  @InterfaceMethod(7)
  public fun put_Timeout(value: WinDef.UINT): Unit

  @InterfaceMethod(8)
  public fun get_BypassCacheOnRetrieve(): Boolean

  @InterfaceMethod(9)
  public fun put_BypassCacheOnRetrieve(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun SetRequestHeader(name: String?, value: String?): Unit

  @InterfaceMethod(11)
  public fun RetrieveFeedAsync(uri: Uri?): IAsyncOperationWithProgress<SyndicationFeed?,
      RetrievalProgress?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationClient> {
    public override fun getValue() = ABI.makeISyndicationClient(pointer.getPointer(0))

    public fun setValue(value: ISyndicationClient_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationClient {
    public val __796507003_Ptr: Pointer?

    public val _796507003_VtblPtr: Pointer?
      get() = __796507003_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ServerCredential(): PasswordCredential? {
      val fnPtr = _796507003_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__796507003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ServerCredential(value: PasswordCredential?): Unit {
      val fnPtr = _796507003_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__796507003_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ProxyCredential(): PasswordCredential? {
      val fnPtr = _796507003_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PasswordCredential>()
      val hr = fn.invokeHR(arrayOf(__796507003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PasswordCredential>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ProxyCredential(value: PasswordCredential?): Unit {
      val fnPtr = _796507003_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__796507003_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MaxResponseBufferSize(): WinDef.UINT {
      val fnPtr = _796507003_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__796507003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MaxResponseBufferSize(value: WinDef.UINT): Unit {
      val fnPtr = _796507003_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__796507003_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Timeout(): WinDef.UINT {
      val fnPtr = _796507003_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__796507003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Timeout(value: WinDef.UINT): Unit {
      val fnPtr = _796507003_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__796507003_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_BypassCacheOnRetrieve(): Boolean {
      val fnPtr = _796507003_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__796507003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_BypassCacheOnRetrieve(value: Boolean): Unit {
      val fnPtr = _796507003_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__796507003_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun SetRequestHeader(name: String?, value: String?): Unit {
      val fnPtr = _796507003_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__796507003_Ptr, marshalToNative(name), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun RetrieveFeedAsync(uri: Uri?): IAsyncOperationWithProgress<SyndicationFeed?,
        RetrievalProgress?>? {
      val fnPtr = _796507003_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<SyndicationFeed?,
          RetrievalProgress?>>()
      val hr = fn.invokeHR(arrayOf(__796507003_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<SyndicationFeed?,
          RetrievalProgress?>>(result.getValue())
      return resultValue
    }
  }

  public class ISyndicationClient_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __796507003_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationClient, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e18a9b772494b45b2297df895a5a1f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationClient(ptr: Pointer?): WithDefault = ISyndicationClient_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationClient {
      val address = segment.toRawLongValue()
      return makeISyndicationClient(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationClient): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__796507003_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationClient): Array<ISyndicationClient?> =
        (elements as
        Array<ISyndicationClient?>).castToImpl<ISyndicationClient,ISyndicationClient_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationClient?> =
        arrayOfNulls<ISyndicationClient_Impl>(size) as Array<ISyndicationClient?>
  }
}
