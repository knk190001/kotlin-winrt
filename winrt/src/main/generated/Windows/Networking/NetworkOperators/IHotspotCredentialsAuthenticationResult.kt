package Windows.Networking.NetworkOperators

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.Uri
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHotspotCredentialsAuthenticationResult.ABI::class)
@Signature("{e756c791-1005-4de5-83c7-de61d88831d0}")
@Guid("e756c79110054de583c7de61d88831d0")
@WinRTInterface("e756c79110054de583c7de61d88831d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHotspotCredentialsAuthenticationResult.ByReference::class)
public interface IHotspotCredentialsAuthenticationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HasNetworkErrorOccurred(): Boolean

  @InterfaceMethod(1)
  public fun get_ResponseCode(): HotspotAuthenticationResponseCode?

  @InterfaceMethod(2)
  public fun get_LogoffUrl(): Uri?

  @InterfaceMethod(3)
  public fun get_AuthenticationReplyXml(): XmlDocument?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHotspotCredentialsAuthenticationResult> {
    public override fun getValue() =
        ABI.makeIHotspotCredentialsAuthenticationResult(pointer.getPointer(0))

    public fun setValue(value: IHotspotCredentialsAuthenticationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHotspotCredentialsAuthenticationResult {
    public val __22950853_Ptr: Pointer?

    public val _22950853_VtblPtr: Pointer?
      get() = __22950853_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HasNetworkErrorOccurred(): Boolean {
      val fnPtr = _22950853_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__22950853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ResponseCode(): HotspotAuthenticationResponseCode? {
      val fnPtr = _22950853_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HotspotAuthenticationResponseCode>()
      val hr = fn.invokeHR(arrayOf(__22950853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HotspotAuthenticationResponseCode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LogoffUrl(): Uri? {
      val fnPtr = _22950853_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__22950853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AuthenticationReplyXml(): XmlDocument? {
      val fnPtr = _22950853_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__22950853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }
  }

  public class IHotspotCredentialsAuthenticationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __22950853_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHotspotCredentialsAuthenticationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e756c79110054de583c7de61d88831d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHotspotCredentialsAuthenticationResult(ptr: Pointer?): WithDefault =
        IHotspotCredentialsAuthenticationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHotspotCredentialsAuthenticationResult {
      val address = segment.toRawLongValue()
      return makeIHotspotCredentialsAuthenticationResult(Pointer(address))
    }

    public override fun toNative(obj: IHotspotCredentialsAuthenticationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__22950853_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHotspotCredentialsAuthenticationResult):
        Array<IHotspotCredentialsAuthenticationResult?> = (elements as
        Array<IHotspotCredentialsAuthenticationResult?>).castToImpl<IHotspotCredentialsAuthenticationResult,IHotspotCredentialsAuthenticationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHotspotCredentialsAuthenticationResult?> =
        arrayOfNulls<IHotspotCredentialsAuthenticationResult_Impl>(size) as
        Array<IHotspotCredentialsAuthenticationResult?>
  }
}
