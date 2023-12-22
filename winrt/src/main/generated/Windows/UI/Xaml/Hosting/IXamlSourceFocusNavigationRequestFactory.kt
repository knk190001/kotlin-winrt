package Windows.UI.Xaml.Hosting

import Windows.Foundation.Rect
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

@ABIMarker(IXamlSourceFocusNavigationRequestFactory.ABI::class)
@Signature("{e746ab8f-b4ef-5390-97e5-cc0a2779c574}")
@Guid("e746ab8fb4ef539097e5cc0a2779c574")
@WinRTInterface("e746ab8fb4ef539097e5cc0a2779c574")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlSourceFocusNavigationRequestFactory.ByReference::class)
public interface IXamlSourceFocusNavigationRequestFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(reason: XamlSourceFocusNavigationReason?):
      XamlSourceFocusNavigationRequest?

  @InterfaceMethod(1)
  public fun CreateInstanceWithHintRect(reason: XamlSourceFocusNavigationReason?, hintRect: Rect?):
      XamlSourceFocusNavigationRequest?

  @InterfaceMethod(2)
  public fun CreateInstanceWithHintRectAndCorrelationId(
    reason: XamlSourceFocusNavigationReason?,
    hintRect: Rect?,
    correlationId: com.sun.jna.platform.win32.Guid.GUID?
  ): XamlSourceFocusNavigationRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlSourceFocusNavigationRequestFactory> {
    public override fun getValue() =
        ABI.makeIXamlSourceFocusNavigationRequestFactory(pointer.getPointer(0))

    public fun setValue(value: IXamlSourceFocusNavigationRequestFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlSourceFocusNavigationRequestFactory {
    public val __1910350206_Ptr: Pointer?

    public val _1910350206_VtblPtr: Pointer?
      get() = __1910350206_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(reason: XamlSourceFocusNavigationReason?):
        XamlSourceFocusNavigationRequest? {
      val fnPtr = _1910350206_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlSourceFocusNavigationRequest>()
      val hr = fn.invokeHR(arrayOf(__1910350206_Ptr, marshalToNative(reason), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlSourceFocusNavigationRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstanceWithHintRect(reason: XamlSourceFocusNavigationReason?,
        hintRect: Rect?): XamlSourceFocusNavigationRequest? {
      val fnPtr = _1910350206_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlSourceFocusNavigationRequest>()
      val hr = fn.invokeHR(arrayOf(__1910350206_Ptr, marshalToNative(reason),
          marshalToNative(hintRect), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlSourceFocusNavigationRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateInstanceWithHintRectAndCorrelationId(
      reason: XamlSourceFocusNavigationReason?,
      hintRect: Rect?,
      correlationId: com.sun.jna.platform.win32.Guid.GUID?
    ): XamlSourceFocusNavigationRequest? {
      val fnPtr = _1910350206_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XamlSourceFocusNavigationRequest>()
      val hr = fn.invokeHR(arrayOf(__1910350206_Ptr, marshalToNative(reason),
          marshalToNative(hintRect), marshalToNative(correlationId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XamlSourceFocusNavigationRequest>(result.getValue())
      return resultValue
    }
  }

  public class IXamlSourceFocusNavigationRequestFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1910350206_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlSourceFocusNavigationRequestFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e746ab8fb4ef539097e5cc0a2779c574")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlSourceFocusNavigationRequestFactory(ptr: Pointer?): WithDefault =
        IXamlSourceFocusNavigationRequestFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IXamlSourceFocusNavigationRequestFactory {
      val address = segment.toRawLongValue()
      return makeIXamlSourceFocusNavigationRequestFactory(Pointer(address))
    }

    public override fun toNative(obj: IXamlSourceFocusNavigationRequestFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1910350206_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlSourceFocusNavigationRequestFactory):
        Array<IXamlSourceFocusNavigationRequestFactory?> = (elements as
        Array<IXamlSourceFocusNavigationRequestFactory?>).castToImpl<IXamlSourceFocusNavigationRequestFactory,IXamlSourceFocusNavigationRequestFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlSourceFocusNavigationRequestFactory?> =
        arrayOfNulls<IXamlSourceFocusNavigationRequestFactory_Impl>(size) as
        Array<IXamlSourceFocusNavigationRequestFactory?>
  }
}
