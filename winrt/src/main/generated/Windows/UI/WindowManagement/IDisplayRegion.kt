package Windows.UI.WindowManagement

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Point
import Windows.Foundation.Size
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayRegion.ABI::class)
@Signature("{db50c3a2-4094-5f47-8cb1-ea01ddafaa94}")
@Guid("db50c3a240945f478cb1ea01ddafaa94")
@WinRTInterface("db50c3a240945f478cb1ea01ddafaa94")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayRegion.ByReference::class)
public interface IDisplayRegion : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayMonitorDeviceId(): String?

  @InterfaceMethod(1)
  public fun get_IsVisible(): Boolean

  @InterfaceMethod(2)
  public fun get_WorkAreaOffset(): Point?

  @InterfaceMethod(3)
  public fun get_WorkAreaSize(): Size?

  @InterfaceMethod(4)
  public fun get_WindowingEnvironment(): WindowingEnvironment?

  @InterfaceMethod(5)
  public fun add_Changed(handler: TypedEventHandler<DisplayRegion?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Changed(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDisplayRegion>
      {
    public override fun getValue() = ABI.makeIDisplayRegion(pointer.getPointer(0))

    public fun setValue(value: IDisplayRegion_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayRegion {
    public val __1982628239_Ptr: Pointer?

    public val _1982628239_VtblPtr: Pointer?
      get() = __1982628239_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayMonitorDeviceId(): String? {
      val fnPtr = _1982628239_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1982628239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsVisible(): Boolean {
      val fnPtr = _1982628239_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1982628239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_WorkAreaOffset(): Point? {
      val fnPtr = _1982628239_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1982628239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_WorkAreaSize(): Size? {
      val fnPtr = _1982628239_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__1982628239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_WindowingEnvironment(): WindowingEnvironment? {
      val fnPtr = _1982628239_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowingEnvironment>()
      val hr = fn.invokeHR(arrayOf(__1982628239_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowingEnvironment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun add_Changed(handler: TypedEventHandler<DisplayRegion?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1982628239_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1982628239_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Changed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1982628239_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1982628239_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplayRegion_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1982628239_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayRegion, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db50c3a240945f478cb1ea01ddafaa94")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayRegion(ptr: Pointer?): WithDefault = IDisplayRegion_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayRegion {
      val address = segment.toRawLongValue()
      return makeIDisplayRegion(Pointer(address))
    }

    public override fun toNative(obj: IDisplayRegion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1982628239_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayRegion): Array<IDisplayRegion?> = (elements as
        Array<IDisplayRegion?>).castToImpl<IDisplayRegion,IDisplayRegion_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayRegion?> =
        arrayOfNulls<IDisplayRegion_Impl>(size) as Array<IDisplayRegion?>
  }
}
