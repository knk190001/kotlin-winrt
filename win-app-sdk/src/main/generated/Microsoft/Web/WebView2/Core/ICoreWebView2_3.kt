package Microsoft.Web.WebView2.Core

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2_3.ABI::class)
@Signature("{a8c76ae7-6170-5dfe-8f00-79cd76a9b4d9}")
@Guid("a8c76ae761705dfe8f0079cd76a9b4d9")
@WinRTInterface("a8c76ae761705dfe8f0079cd76a9b4d9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2_3.ByReference::class)
public interface ICoreWebView2_3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSuspended(): Boolean

  @InterfaceMethod(1)
  public fun TrySuspendAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun Resume(): Unit

  @InterfaceMethod(3)
  public fun SetVirtualHostNameToFolderMapping(
    hostName: String?,
    folderPath: String?,
    accessKind: CoreWebView2HostResourceAccessKind?
  ): Unit

  @InterfaceMethod(4)
  public fun ClearVirtualHostNameToFolderMapping(hostName: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2_3> {
    public override fun getValue() = ABI.makeICoreWebView2_3(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2_3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2_3 {
    public val __335594437_Ptr: Pointer?

    public val _335594437_VtblPtr: Pointer?
      get() = __335594437_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSuspended(): Boolean {
      val fnPtr = _335594437_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__335594437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun TrySuspendAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _335594437_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__335594437_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Resume(): Unit {
      val fnPtr = _335594437_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594437_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun SetVirtualHostNameToFolderMapping(
      hostName: String?,
      folderPath: String?,
      accessKind: CoreWebView2HostResourceAccessKind?
    ): Unit {
      val fnPtr = _335594437_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594437_Ptr, marshalToNative(hostName),
          marshalToNative(folderPath), marshalToNative(accessKind),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun ClearVirtualHostNameToFolderMapping(hostName: String?): Unit {
      val fnPtr = _335594437_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__335594437_Ptr, marshalToNative(hostName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2_3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __335594437_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2_3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a8c76ae761705dfe8f0079cd76a9b4d9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2_3(ptr: Pointer?): WithDefault = ICoreWebView2_3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2_3 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2_3(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2_3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__335594437_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2_3): Array<ICoreWebView2_3?> = (elements as
        Array<ICoreWebView2_3?>).castToImpl<ICoreWebView2_3,ICoreWebView2_3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2_3?> =
        arrayOfNulls<ICoreWebView2_3_Impl>(size) as Array<ICoreWebView2_3?>
  }
}
