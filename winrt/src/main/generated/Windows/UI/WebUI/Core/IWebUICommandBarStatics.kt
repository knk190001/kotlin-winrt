package Windows.UI.WebUI.Core

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

@ABIMarker(IWebUICommandBarStatics.ABI::class)
@Signature("{1449cdb9-a506-45be-8f42-b2837e2fe0c9}")
@Guid("1449cdb9a50645be8f42b2837e2fe0c9")
@WinRTInterface("1449cdb9a50645be8f42b2837e2fe0c9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebUICommandBarStatics.ByReference::class)
public interface IWebUICommandBarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForCurrentView(): WebUICommandBar?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebUICommandBarStatics> {
    public override fun getValue() = ABI.makeIWebUICommandBarStatics(pointer.getPointer(0))

    public fun setValue(value: IWebUICommandBarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebUICommandBarStatics {
    public val __123539082_Ptr: Pointer?

    public val _123539082_VtblPtr: Pointer?
      get() = __123539082_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForCurrentView(): WebUICommandBar? {
      val fnPtr = _123539082_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebUICommandBar>()
      val hr = fn.invokeHR(arrayOf(__123539082_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebUICommandBar>(result.getValue())
      return resultValue
    }
  }

  public class IWebUICommandBarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __123539082_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebUICommandBarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1449cdb9a50645be8f42b2837e2fe0c9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebUICommandBarStatics(ptr: Pointer?): WithDefault =
        IWebUICommandBarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebUICommandBarStatics {
      val address = segment.toRawLongValue()
      return makeIWebUICommandBarStatics(Pointer(address))
    }

    public override fun toNative(obj: IWebUICommandBarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__123539082_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebUICommandBarStatics): Array<IWebUICommandBarStatics?>
        = (elements as
        Array<IWebUICommandBarStatics?>).castToImpl<IWebUICommandBarStatics,IWebUICommandBarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebUICommandBarStatics?> =
        arrayOfNulls<IWebUICommandBarStatics_Impl>(size) as Array<IWebUICommandBarStatics?>
  }
}
