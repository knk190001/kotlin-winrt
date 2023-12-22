package Windows.Security.Authentication.Web.Provider

import Windows.Foundation.Uri
import Windows.Security.Authentication.Web.Provider.IWebAccountProviderOperation.ABI.IID
import Windows.Security.Credentials.WebAccount
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebAccountProviderSignOutAccountOperation.ABI::class)
@Signature("{b890e21d-0c55-47bc-8c72-04a6fc7cac07}")
@Guid("b890e21d0c5547bc8c7204a6fc7cac07")
@WinRTInterface("b890e21d0c5547bc8c7204a6fc7cac07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProviderSignOutAccountOperation.ByReference::class)
public interface IWebAccountProviderSignOutAccountOperation : NativeMapped, IWinRTInterface,
    IWebAccountProviderOperation {
  @InterfaceMethod(0)
  public fun get_WebAccount(): WebAccount?

  @InterfaceMethod(1)
  public fun get_ApplicationCallbackUri(): Uri?

  @InterfaceMethod(2)
  public fun get_ClientId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProviderSignOutAccountOperation> {
    public override fun getValue() =
        ABI.makeIWebAccountProviderSignOutAccountOperation(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProviderSignOutAccountOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProviderSignOutAccountOperation,
      IWebAccountProviderOperation.WithDefault {
    public val __1055444470_Ptr: Pointer?

    public val _1055444470_VtblPtr: Pointer?
      get() = __1055444470_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WebAccount(): WebAccount? {
      val fnPtr = _1055444470_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccount>()
      val hr = fn.invokeHR(arrayOf(__1055444470_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccount>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ApplicationCallbackUri(): Uri? {
      val fnPtr = _1055444470_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1055444470_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ClientId(): String? {
      val fnPtr = _1055444470_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1055444470_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountProviderSignOutAccountOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebAccountProviderOperation {
    public override val __1287167602_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1055444470_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1055444470_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProviderSignOutAccountOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b890e21d0c5547bc8c7204a6fc7cac07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProviderSignOutAccountOperation(ptr: Pointer?): WithDefault =
        IWebAccountProviderSignOutAccountOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebAccountProviderSignOutAccountOperation {
      val address = segment.toRawLongValue()
      return makeIWebAccountProviderSignOutAccountOperation(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProviderSignOutAccountOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1055444470_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProviderSignOutAccountOperation):
        Array<IWebAccountProviderSignOutAccountOperation?> = (elements as
        Array<IWebAccountProviderSignOutAccountOperation?>).castToImpl<IWebAccountProviderSignOutAccountOperation,IWebAccountProviderSignOutAccountOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProviderSignOutAccountOperation?> =
        arrayOfNulls<IWebAccountProviderSignOutAccountOperation_Impl>(size) as
        Array<IWebAccountProviderSignOutAccountOperation?>
  }
}
