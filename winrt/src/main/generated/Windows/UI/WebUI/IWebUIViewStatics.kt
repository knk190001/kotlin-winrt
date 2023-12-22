package Windows.UI.WebUI

import Windows.Foundation.IAsyncOperation
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWebUIViewStatics.ABI::class)
@Signature("{b591e668-8e59-44f9-8803-1b24c9149d30}")
@Guid("b591e6688e5944f988031b24c9149d30")
@WinRTInterface("b591e6688e5944f988031b24c9149d30")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUIViewStatics.ByReference::class)
public interface IWebUIViewStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAsync(): IAsyncOperation<WebUIView?>?

  @InterfaceMethod(1)
  public fun CreateAsync(uri: Uri?): IAsyncOperation<WebUIView?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUIViewStatics> {
    public override fun getValue() = ABI.makeIWebUIViewStatics(pointer.getPointer(0))

    public fun setValue(value: IWebUIViewStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUIViewStatics {
    public val __2140280520_Ptr: Pointer?

    public val _2140280520_VtblPtr: Pointer?
      get() = __2140280520_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAsync(): IAsyncOperation<WebUIView?>? {
      val fnPtr = _2140280520_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebUIView?>>()
      val hr = fn.invokeHR(arrayOf(__2140280520_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebUIView?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateAsync(uri: Uri?): IAsyncOperation<WebUIView?>? {
      val fnPtr = _2140280520_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WebUIView?>>()
      val hr = fn.invokeHR(arrayOf(__2140280520_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WebUIView?>>(result.getValue())
      return resultValue
    }
  }

  public class IWebUIViewStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2140280520_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUIViewStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b591e6688e5944f988031b24c9149d30")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUIViewStatics(ptr: Pointer?): WithDefault = IWebUIViewStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUIViewStatics {
      val address = segment.toRawLongValue()
      return makeIWebUIViewStatics(Pointer(address))
    }

    public override fun toNative(obj: IWebUIViewStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2140280520_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUIViewStatics): Array<IWebUIViewStatics?> = (elements
        as Array<IWebUIViewStatics?>).castToImpl<IWebUIViewStatics,IWebUIViewStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUIViewStatics?> =
        arrayOfNulls<IWebUIViewStatics_Impl>(size) as Array<IWebUIViewStatics?>
  }
}
