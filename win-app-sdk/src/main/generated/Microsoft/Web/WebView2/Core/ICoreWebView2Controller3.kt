package Microsoft.Web.WebView2.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2Controller3.ABI::class)
@Signature("{e5bae214-791a-5d13-9b76-a257d9fda2ac}")
@Guid("e5bae214791a5d139b76a257d9fda2ac")
@WinRTInterface("e5bae214791a5d139b76a257d9fda2ac")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Controller3.ByReference::class)
public interface ICoreWebView2Controller3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RasterizationScale(): Double

  @InterfaceMethod(1)
  public fun put_RasterizationScale(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_ShouldDetectMonitorScaleChanges(): Boolean

  @InterfaceMethod(3)
  public fun put_ShouldDetectMonitorScaleChanges(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_BoundsMode(): CoreWebView2BoundsMode?

  @InterfaceMethod(5)
  public fun put_BoundsMode(value: CoreWebView2BoundsMode?): Unit

  @InterfaceMethod(6)
  public fun add_RasterizationScaleChanged(handler: TypedEventHandler<CoreWebView2Controller?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_RasterizationScaleChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Controller3> {
    public override fun getValue() = ABI.makeICoreWebView2Controller3(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Controller3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Controller3 {
    public val __1207357616_Ptr: Pointer?

    public val _1207357616_VtblPtr: Pointer?
      get() = __1207357616_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RasterizationScale(): Double {
      val fnPtr = _1207357616_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1207357616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_RasterizationScale(value: Double): Unit {
      val fnPtr = _1207357616_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1207357616_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ShouldDetectMonitorScaleChanges(): Boolean {
      val fnPtr = _1207357616_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1207357616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ShouldDetectMonitorScaleChanges(value: Boolean): Unit {
      val fnPtr = _1207357616_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1207357616_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BoundsMode(): CoreWebView2BoundsMode? {
      val fnPtr = _1207357616_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2BoundsMode>()
      val hr = fn.invokeHR(arrayOf(__1207357616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2BoundsMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_BoundsMode(value: CoreWebView2BoundsMode?): Unit {
      val fnPtr = _1207357616_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1207357616_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_RasterizationScaleChanged(handler: TypedEventHandler<CoreWebView2Controller?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1207357616_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1207357616_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_RasterizationScaleChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1207357616_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1207357616_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Controller3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1207357616_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Controller3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e5bae214791a5d139b76a257d9fda2ac")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Controller3(ptr: Pointer?): WithDefault =
        ICoreWebView2Controller3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Controller3 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Controller3(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Controller3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1207357616_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Controller3):
        Array<ICoreWebView2Controller3?> = (elements as
        Array<ICoreWebView2Controller3?>).castToImpl<ICoreWebView2Controller3,ICoreWebView2Controller3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Controller3?> =
        arrayOfNulls<ICoreWebView2Controller3_Impl>(size) as Array<ICoreWebView2Controller3?>
  }
}
