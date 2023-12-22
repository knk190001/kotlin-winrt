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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2EnvironmentStatics.ABI::class)
@Signature("{0e33f804-f20b-5635-8491-162aaa27517b}")
@Guid("0e33f804f20b56358491162aaa27517b")
@WinRTInterface("0e33f804f20b56358491162aaa27517b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2EnvironmentStatics.ByReference::class)
public interface ICoreWebView2EnvironmentStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAsync(): IAsyncOperation<CoreWebView2Environment?>?

  @InterfaceMethod(1)
  public fun CreateWithOptionsAsync(
    browserExecutableFolder: String?,
    userDataFolder: String?,
    options: CoreWebView2EnvironmentOptions?
  ): IAsyncOperation<CoreWebView2Environment?>?

  @InterfaceMethod(2)
  public fun GetAvailableBrowserVersionString(): String?

  @InterfaceMethod(3)
  public fun GetAvailableBrowserVersionString(browserExecutableFolder: String?): String?

  @InterfaceMethod(4)
  public fun CompareBrowserVersionString(browserVersionString1: String?,
      browserVersionString2: String?): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2EnvironmentStatics> {
    public override fun getValue() = ABI.makeICoreWebView2EnvironmentStatics(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2EnvironmentStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2EnvironmentStatics {
    public val __1215006503_Ptr: Pointer?

    public val _1215006503_VtblPtr: Pointer?
      get() = __1215006503_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAsync(): IAsyncOperation<CoreWebView2Environment?>? {
      val fnPtr = _1215006503_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CoreWebView2Environment?>>()
      val hr = fn.invokeHR(arrayOf(__1215006503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CoreWebView2Environment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithOptionsAsync(
      browserExecutableFolder: String?,
      userDataFolder: String?,
      options: CoreWebView2EnvironmentOptions?
    ): IAsyncOperation<CoreWebView2Environment?>? {
      val fnPtr = _1215006503_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<CoreWebView2Environment?>>()
      val hr = fn.invokeHR(arrayOf(__1215006503_Ptr, marshalToNative(browserExecutableFolder),
          marshalToNative(userDataFolder), marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<CoreWebView2Environment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetAvailableBrowserVersionString(): String? {
      val fnPtr = _1215006503_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1215006503_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetAvailableBrowserVersionString(browserExecutableFolder: String?):
        String? {
      val fnPtr = _1215006503_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1215006503_Ptr, marshalToNative(browserExecutableFolder),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CompareBrowserVersionString(browserVersionString1: String?,
        browserVersionString2: String?): Int {
      val fnPtr = _1215006503_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1215006503_Ptr, marshalToNative(browserVersionString1),
          marshalToNative(browserVersionString2), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ICoreWebView2EnvironmentStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1215006503_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2EnvironmentStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e33f804f20b56358491162aaa27517b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2EnvironmentStatics(ptr: Pointer?): WithDefault =
        ICoreWebView2EnvironmentStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2EnvironmentStatics {
      val address = segment.toRawLongValue()
      return makeICoreWebView2EnvironmentStatics(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2EnvironmentStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1215006503_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2EnvironmentStatics):
        Array<ICoreWebView2EnvironmentStatics?> = (elements as
        Array<ICoreWebView2EnvironmentStatics?>).castToImpl<ICoreWebView2EnvironmentStatics,ICoreWebView2EnvironmentStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2EnvironmentStatics?> =
        arrayOfNulls<ICoreWebView2EnvironmentStatics_Impl>(size) as
        Array<ICoreWebView2EnvironmentStatics?>
  }
}
