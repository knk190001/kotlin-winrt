package Windows.UI.WebUI.Core

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

@ABIMarker(IWebUICommandBarBitmapIconFactory.ABI::class)
@Signature("{f3f7d78a-7673-444a-be62-ac12d31c2231}")
@Guid("f3f7d78a7673444abe62ac12d31c2231")
@WinRTInterface("f3f7d78a7673444abe62ac12d31c2231")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUICommandBarBitmapIconFactory.ByReference::class)
public interface IWebUICommandBarBitmapIconFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(uri: Uri?): WebUICommandBarBitmapIcon?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUICommandBarBitmapIconFactory> {
    public override fun getValue() =
        ABI.makeIWebUICommandBarBitmapIconFactory(pointer.getPointer(0))

    public fun setValue(value: IWebUICommandBarBitmapIconFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUICommandBarBitmapIconFactory {
    public val __2000146983_Ptr: Pointer?

    public val _2000146983_VtblPtr: Pointer?
      get() = __2000146983_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(uri: Uri?): WebUICommandBarBitmapIcon? {
      val fnPtr = _2000146983_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebUICommandBarBitmapIcon>()
      val hr = fn.invokeHR(arrayOf(__2000146983_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebUICommandBarBitmapIcon>(result.getValue())
      return resultValue
    }
  }

  public class IWebUICommandBarBitmapIconFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2000146983_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUICommandBarBitmapIconFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f3f7d78a7673444abe62ac12d31c2231")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUICommandBarBitmapIconFactory(ptr: Pointer?): WithDefault =
        IWebUICommandBarBitmapIconFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUICommandBarBitmapIconFactory {
      val address = segment.toRawLongValue()
      return makeIWebUICommandBarBitmapIconFactory(Pointer(address))
    }

    public override fun toNative(obj: IWebUICommandBarBitmapIconFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2000146983_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUICommandBarBitmapIconFactory):
        Array<IWebUICommandBarBitmapIconFactory?> = (elements as
        Array<IWebUICommandBarBitmapIconFactory?>).castToImpl<IWebUICommandBarBitmapIconFactory,IWebUICommandBarBitmapIconFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUICommandBarBitmapIconFactory?> =
        arrayOfNulls<IWebUICommandBarBitmapIconFactory_Impl>(size) as
        Array<IWebUICommandBarBitmapIconFactory?>
  }
}
