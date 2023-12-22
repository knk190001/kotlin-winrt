package Windows.Security.Authentication.Web.Provider

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebAccountProviderDeleteAccountOperation.ABI::class)
@Signature("{0abb48b8-9e01-49c9-a355-7d48caf7d6ca}")
@Guid("0abb48b89e0149c9a3557d48caf7d6ca")
@WinRTInterface("0abb48b89e0149c9a3557d48caf7d6ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebAccountProviderDeleteAccountOperation.ByReference::class)
public interface IWebAccountProviderDeleteAccountOperation : NativeMapped, IWinRTInterface,
    IWebAccountProviderOperation {
  @InterfaceMethod(0)
  public fun get_WebAccount(): WebAccount?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebAccountProviderDeleteAccountOperation> {
    public override fun getValue() =
        ABI.makeIWebAccountProviderDeleteAccountOperation(pointer.getPointer(0))

    public fun setValue(value: IWebAccountProviderDeleteAccountOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebAccountProviderDeleteAccountOperation,
      IWebAccountProviderOperation.WithDefault {
    public val __1330520666_Ptr: Pointer?

    public val _1330520666_VtblPtr: Pointer?
      get() = __1330520666_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WebAccount(): WebAccount? {
      val fnPtr = _1330520666_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebAccount>()
      val hr = fn.invokeHR(arrayOf(__1330520666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebAccount>(result.getValue())
      return resultValue
    }
  }

  public class IWebAccountProviderDeleteAccountOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IWebAccountProviderOperation {
    public override val __1287167602_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1330520666_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1330520666_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebAccountProviderDeleteAccountOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0abb48b89e0149c9a3557d48caf7d6ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebAccountProviderDeleteAccountOperation(ptr: Pointer?): WithDefault =
        IWebAccountProviderDeleteAccountOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IWebAccountProviderDeleteAccountOperation {
      val address = segment.toRawLongValue()
      return makeIWebAccountProviderDeleteAccountOperation(Pointer(address))
    }

    public override fun toNative(obj: IWebAccountProviderDeleteAccountOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1330520666_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebAccountProviderDeleteAccountOperation):
        Array<IWebAccountProviderDeleteAccountOperation?> = (elements as
        Array<IWebAccountProviderDeleteAccountOperation?>).castToImpl<IWebAccountProviderDeleteAccountOperation,IWebAccountProviderDeleteAccountOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebAccountProviderDeleteAccountOperation?> =
        arrayOfNulls<IWebAccountProviderDeleteAccountOperation_Impl>(size) as
        Array<IWebAccountProviderDeleteAccountOperation?>
  }
}
