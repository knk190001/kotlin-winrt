package Microsoft.Web.WebView2.Core

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

@ABIMarker(ICoreWebView2Profile.ABI::class)
@Signature("{d4bdd25c-a2db-5c03-9659-abdeb9793621}")
@Guid("d4bdd25ca2db5c039659abdeb9793621")
@WinRTInterface("d4bdd25ca2db5c039659abdeb9793621")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Profile.ByReference::class)
public interface ICoreWebView2Profile : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProfileName(): String?

  @InterfaceMethod(1)
  public fun get_IsInPrivateModeEnabled(): Boolean

  @InterfaceMethod(2)
  public fun get_ProfilePath(): String?

  @InterfaceMethod(3)
  public fun get_DefaultDownloadFolderPath(): String?

  @InterfaceMethod(4)
  public fun put_DefaultDownloadFolderPath(value: String?): Unit

  @InterfaceMethod(5)
  public fun get_PreferredColorScheme(): CoreWebView2PreferredColorScheme?

  @InterfaceMethod(6)
  public fun put_PreferredColorScheme(value: CoreWebView2PreferredColorScheme?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Profile> {
    public override fun getValue() = ABI.makeICoreWebView2Profile(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Profile_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Profile {
    public val __618386078_Ptr: Pointer?

    public val _618386078_VtblPtr: Pointer?
      get() = __618386078_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProfileName(): String? {
      val fnPtr = _618386078_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__618386078_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsInPrivateModeEnabled(): Boolean {
      val fnPtr = _618386078_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__618386078_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ProfilePath(): String? {
      val fnPtr = _618386078_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__618386078_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DefaultDownloadFolderPath(): String? {
      val fnPtr = _618386078_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__618386078_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_DefaultDownloadFolderPath(value: String?): Unit {
      val fnPtr = _618386078_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__618386078_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_PreferredColorScheme(): CoreWebView2PreferredColorScheme? {
      val fnPtr = _618386078_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2PreferredColorScheme>()
      val hr = fn.invokeHR(arrayOf(__618386078_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2PreferredColorScheme>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_PreferredColorScheme(value: CoreWebView2PreferredColorScheme?): Unit {
      val fnPtr = _618386078_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__618386078_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Profile_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __618386078_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Profile, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4bdd25ca2db5c039659abdeb9793621")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Profile(ptr: Pointer?): WithDefault = ICoreWebView2Profile_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Profile {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Profile(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Profile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__618386078_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Profile): Array<ICoreWebView2Profile?> =
        (elements as
        Array<ICoreWebView2Profile?>).castToImpl<ICoreWebView2Profile,ICoreWebView2Profile_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Profile?> =
        arrayOfNulls<ICoreWebView2Profile_Impl>(size) as Array<ICoreWebView2Profile?>
  }
}
