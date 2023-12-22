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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreWebView2Profile3.ABI::class)
@Signature("{507ed587-c511-5e47-be5b-fc9ccdf179b6}")
@Guid("507ed587c5115e47be5bfc9ccdf179b6")
@WinRTInterface("507ed587c5115e47be5bfc9ccdf179b6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2Profile3.ByReference::class)
public interface ICoreWebView2Profile3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PreferredTrackingPreventionLevel(): CoreWebView2TrackingPreventionLevel?

  @InterfaceMethod(1)
  public fun put_PreferredTrackingPreventionLevel(value: CoreWebView2TrackingPreventionLevel?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2Profile3> {
    public override fun getValue() = ABI.makeICoreWebView2Profile3(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2Profile3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2Profile3 {
    public val __1990099183_Ptr: Pointer?

    public val _1990099183_VtblPtr: Pointer?
      get() = __1990099183_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PreferredTrackingPreventionLevel():
        CoreWebView2TrackingPreventionLevel? {
      val fnPtr = _1990099183_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreWebView2TrackingPreventionLevel>()
      val hr = fn.invokeHR(arrayOf(__1990099183_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreWebView2TrackingPreventionLevel>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun put_PreferredTrackingPreventionLevel(value: CoreWebView2TrackingPreventionLevel?):
        Unit {
      val fnPtr = _1990099183_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1990099183_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2Profile3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1990099183_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2Profile3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("507ed587c5115e47be5bfc9ccdf179b6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2Profile3(ptr: Pointer?): WithDefault =
        ICoreWebView2Profile3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2Profile3 {
      val address = segment.toRawLongValue()
      return makeICoreWebView2Profile3(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2Profile3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1990099183_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2Profile3): Array<ICoreWebView2Profile3?> =
        (elements as
        Array<ICoreWebView2Profile3?>).castToImpl<ICoreWebView2Profile3,ICoreWebView2Profile3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2Profile3?> =
        arrayOfNulls<ICoreWebView2Profile3_Impl>(size) as Array<ICoreWebView2Profile3?>
  }
}
