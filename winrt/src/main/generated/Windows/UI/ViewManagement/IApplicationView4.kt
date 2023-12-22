package Windows.UI.ViewManagement

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IApplicationView4.ABI::class)
@Signature("{15e5cbec-9e0f-46b5-bc3f-9bf653e74b5e}")
@Guid("15e5cbec9e0f46b5bc3f9bf653e74b5e")
@WinRTInterface("15e5cbec9e0f46b5bc3f9bf653e74b5e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationView4.ByReference::class)
public interface IApplicationView4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ViewMode(): ApplicationViewMode?

  @InterfaceMethod(1)
  public fun IsViewModeSupported(viewMode: ApplicationViewMode?): Boolean

  @InterfaceMethod(2)
  public fun TryEnterViewModeAsync(viewMode: ApplicationViewMode?): IAsyncOperation<Boolean>?

  @InterfaceMethod(3)
  public fun TryEnterViewModeAsync(viewMode: ApplicationViewMode?,
      viewModePreferences: ViewModePreferences?): IAsyncOperation<Boolean>?

  @InterfaceMethod(4)
  public fun TryConsolidateAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationView4> {
    public override fun getValue() = ABI.makeIApplicationView4(pointer.getPointer(0))

    public fun setValue(value: IApplicationView4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationView4 {
    public val __2067439279_Ptr: Pointer?

    public val _2067439279_VtblPtr: Pointer?
      get() = __2067439279_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ViewMode(): ApplicationViewMode? {
      val fnPtr = _2067439279_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationViewMode>()
      val hr = fn.invokeHR(arrayOf(__2067439279_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationViewMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun IsViewModeSupported(viewMode: ApplicationViewMode?): Boolean {
      val fnPtr = _2067439279_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2067439279_Ptr, marshalToNative(viewMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun TryEnterViewModeAsync(viewMode: ApplicationViewMode?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _2067439279_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2067439279_Ptr, marshalToNative(viewMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun TryEnterViewModeAsync(viewMode: ApplicationViewMode?,
        viewModePreferences: ViewModePreferences?): IAsyncOperation<Boolean>? {
      val fnPtr = _2067439279_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2067439279_Ptr, marshalToNative(viewMode),
          marshalToNative(viewModePreferences), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun TryConsolidateAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _2067439279_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__2067439279_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationView4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2067439279_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationView4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("15e5cbec9e0f46b5bc3f9bf653e74b5e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationView4(ptr: Pointer?): WithDefault = IApplicationView4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationView4 {
      val address = segment.toRawLongValue()
      return makeIApplicationView4(Pointer(address))
    }

    public override fun toNative(obj: IApplicationView4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2067439279_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationView4): Array<IApplicationView4?> = (elements
        as Array<IApplicationView4?>).castToImpl<IApplicationView4,IApplicationView4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationView4?> =
        arrayOfNulls<IApplicationView4_Impl>(size) as Array<IApplicationView4?>
  }
}
