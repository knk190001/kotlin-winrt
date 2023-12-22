package Microsoft.UI.Input

import Windows.Foundation.Point
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

@ABIMarker(INonClientCaptionTappedEventArgs.ABI::class)
@Signature("{3d173531-991f-5753-b7e0-14a121c3cd2d}")
@Guid("3d173531991f5753b7e014a121c3cd2d")
@WinRTInterface("3d173531991f5753b7e014a121c3cd2d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INonClientCaptionTappedEventArgs.ByReference::class)
public interface INonClientCaptionTappedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Point(): Point?

  @InterfaceMethod(1)
  public fun get_PointerDeviceType(): PointerDeviceType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INonClientCaptionTappedEventArgs> {
    public override fun getValue() = ABI.makeINonClientCaptionTappedEventArgs(pointer.getPointer(0))

    public fun setValue(value: INonClientCaptionTappedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INonClientCaptionTappedEventArgs {
    public val __2100664612_Ptr: Pointer?

    public val _2100664612_VtblPtr: Pointer?
      get() = __2100664612_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Point(): Point? {
      val fnPtr = _2100664612_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__2100664612_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _2100664612_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__2100664612_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }
  }

  public class INonClientCaptionTappedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2100664612_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INonClientCaptionTappedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d173531991f5753b7e014a121c3cd2d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINonClientCaptionTappedEventArgs(ptr: Pointer?): WithDefault =
        INonClientCaptionTappedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INonClientCaptionTappedEventArgs {
      val address = segment.toRawLongValue()
      return makeINonClientCaptionTappedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INonClientCaptionTappedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2100664612_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INonClientCaptionTappedEventArgs):
        Array<INonClientCaptionTappedEventArgs?> = (elements as
        Array<INonClientCaptionTappedEventArgs?>).castToImpl<INonClientCaptionTappedEventArgs,INonClientCaptionTappedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INonClientCaptionTappedEventArgs?> =
        arrayOfNulls<INonClientCaptionTappedEventArgs_Impl>(size) as
        Array<INonClientCaptionTappedEventArgs?>
  }
}
