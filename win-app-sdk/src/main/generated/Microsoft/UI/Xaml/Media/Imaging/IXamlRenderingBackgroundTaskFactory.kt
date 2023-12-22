package Microsoft.UI.Xaml.Media.Imaging

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IXamlRenderingBackgroundTaskFactory.ABI::class)
@Signature("{205247a3-9ffe-599a-a21a-7181442a9d75}")
@Guid("205247a39ffe599aa21a7181442a9d75")
@WinRTInterface("205247a39ffe599aa21a7181442a9d75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlRenderingBackgroundTaskFactory.ByReference::class)
public interface IXamlRenderingBackgroundTaskFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
      XamlRenderingBackgroundTask?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlRenderingBackgroundTaskFactory> {
    public override fun getValue() =
        ABI.makeIXamlRenderingBackgroundTaskFactory(pointer.getPointer(0))

    public fun setValue(value: IXamlRenderingBackgroundTaskFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlRenderingBackgroundTaskFactory {
    public val __821040986_Ptr: Pointer?

    public val _821040986_VtblPtr: Pointer?
      get() = __821040986_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        XamlRenderingBackgroundTask? {
      val fnPtr = _821040986_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlRenderingBackgroundTask>()
      val hr = fn.invokeHR(arrayOf(__821040986_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlRenderingBackgroundTask>(result.getValue())
      return resultValue
    }
  }

  public class IXamlRenderingBackgroundTaskFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __821040986_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlRenderingBackgroundTaskFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("205247a39ffe599aa21a7181442a9d75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlRenderingBackgroundTaskFactory(ptr: Pointer?): WithDefault =
        IXamlRenderingBackgroundTaskFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlRenderingBackgroundTaskFactory {
      val address = segment.toRawLongValue()
      return makeIXamlRenderingBackgroundTaskFactory(Pointer(address))
    }

    public override fun toNative(obj: IXamlRenderingBackgroundTaskFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__821040986_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlRenderingBackgroundTaskFactory):
        Array<IXamlRenderingBackgroundTaskFactory?> = (elements as
        Array<IXamlRenderingBackgroundTaskFactory?>).castToImpl<IXamlRenderingBackgroundTaskFactory,IXamlRenderingBackgroundTaskFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlRenderingBackgroundTaskFactory?> =
        arrayOfNulls<IXamlRenderingBackgroundTaskFactory_Impl>(size) as
        Array<IXamlRenderingBackgroundTaskFactory?>
  }
}
