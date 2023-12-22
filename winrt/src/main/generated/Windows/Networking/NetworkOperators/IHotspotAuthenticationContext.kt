package Windows.Networking.NetworkOperators

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.Uri
import Windows.Networking.Connectivity.NetworkAdapter
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
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHotspotAuthenticationContext.ABI::class)
@Signature("{e756c791-1003-4de5-83c7-de61d88831d0}")
@Guid("e756c79110034de583c7de61d88831d0")
@WinRTInterface("e756c79110034de583c7de61d88831d0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHotspotAuthenticationContext.ByReference::class)
public interface IHotspotAuthenticationContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WirelessNetworkId(): Array<Byte>?

  @InterfaceMethod(1)
  public fun get_NetworkAdapter(): NetworkAdapter?

  @InterfaceMethod(2)
  public fun get_RedirectMessageUrl(): Uri?

  @InterfaceMethod(3)
  public fun get_RedirectMessageXml(): XmlDocument?

  @InterfaceMethod(4)
  public fun get_AuthenticationUrl(): Uri?

  @InterfaceMethod(5)
  public fun IssueCredentials(
    userName: String?,
    password: String?,
    extraParameters: String?,
    markAsManualConnectOnFailure: Boolean
  ): Unit

  @InterfaceMethod(6)
  public fun AbortAuthentication(markAsManual: Boolean): Unit

  @InterfaceMethod(7)
  public fun SkipAuthentication(): Unit

  @InterfaceMethod(8)
  public fun TriggerAttentionRequired(packageRelativeApplicationId: String?,
      applicationParameters: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHotspotAuthenticationContext> {
    public override fun getValue() = ABI.makeIHotspotAuthenticationContext(pointer.getPointer(0))

    public fun setValue(value: IHotspotAuthenticationContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHotspotAuthenticationContext {
    public val __202522879_Ptr: Pointer?

    public val _202522879_VtblPtr: Pointer?
      get() = __202522879_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WirelessNetworkId(): Array<Byte>? {
      val fnPtr = _202522879_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makePrimitiveOutArray<Byte>()
      val hr = fn.invokeHR(arrayOf(__202522879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NetworkAdapter(): NetworkAdapter? {
      val fnPtr = _202522879_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkAdapter>()
      val hr = fn.invokeHR(arrayOf(__202522879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkAdapter>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RedirectMessageUrl(): Uri? {
      val fnPtr = _202522879_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__202522879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RedirectMessageXml(): XmlDocument? {
      val fnPtr = _202522879_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__202522879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AuthenticationUrl(): Uri? {
      val fnPtr = _202522879_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__202522879_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun IssueCredentials(
      userName: String?,
      password: String?,
      extraParameters: String?,
      markAsManualConnectOnFailure: Boolean
    ): Unit {
      val fnPtr = _202522879_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__202522879_Ptr, marshalToNative(userName),
          marshalToNative(password), marshalToNative(extraParameters),
          markAsManualConnectOnFailure,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun AbortAuthentication(markAsManual: Boolean): Unit {
      val fnPtr = _202522879_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__202522879_Ptr, markAsManual,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun SkipAuthentication(): Unit {
      val fnPtr = _202522879_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__202522879_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun TriggerAttentionRequired(packageRelativeApplicationId: String?,
        applicationParameters: String?): Unit {
      val fnPtr = _202522879_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__202522879_Ptr, marshalToNative(packageRelativeApplicationId),
          marshalToNative(applicationParameters),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHotspotAuthenticationContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __202522879_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHotspotAuthenticationContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e756c79110034de583c7de61d88831d0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHotspotAuthenticationContext(ptr: Pointer?): WithDefault =
        IHotspotAuthenticationContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHotspotAuthenticationContext {
      val address = segment.toRawLongValue()
      return makeIHotspotAuthenticationContext(Pointer(address))
    }

    public override fun toNative(obj: IHotspotAuthenticationContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__202522879_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHotspotAuthenticationContext):
        Array<IHotspotAuthenticationContext?> = (elements as
        Array<IHotspotAuthenticationContext?>).castToImpl<IHotspotAuthenticationContext,IHotspotAuthenticationContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHotspotAuthenticationContext?> =
        arrayOfNulls<IHotspotAuthenticationContext_Impl>(size) as
        Array<IHotspotAuthenticationContext?>
  }
}
