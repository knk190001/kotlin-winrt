package Windows.UI.ViewManagement

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Rect
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IApplicationView2.ABI::class)
@Signature("{e876b196-a545-40dc-b594-450cba68cc00}")
@Guid("e876b196a54540dcb594450cba68cc00")
@WinRTInterface("e876b196a54540dcb594450cba68cc00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationView2.ByReference::class)
public interface IApplicationView2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SuppressSystemOverlays(): Boolean

  @InterfaceMethod(1)
  public fun put_SuppressSystemOverlays(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_VisibleBounds(): Rect?

  @InterfaceMethod(3)
  public fun add_VisibleBoundsChanged(handler: TypedEventHandler<ApplicationView?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_VisibleBoundsChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun SetDesiredBoundsMode(boundsMode: ApplicationViewBoundsMode?): Boolean

  @InterfaceMethod(6)
  public fun get_DesiredBoundsMode(): ApplicationViewBoundsMode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationView2> {
    public override fun getValue() = ABI.makeIApplicationView2(pointer.getPointer(0))

    public fun setValue(value: IApplicationView2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationView2 {
    public val __2067439281_Ptr: Pointer?

    public val _2067439281_VtblPtr: Pointer?
      get() = __2067439281_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SuppressSystemOverlays(): Boolean {
      val fnPtr = _2067439281_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2067439281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SuppressSystemOverlays(value: Boolean): Unit {
      val fnPtr = _2067439281_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067439281_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_VisibleBounds(): Rect? {
      val fnPtr = _2067439281_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__2067439281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_VisibleBoundsChanged(handler: TypedEventHandler<ApplicationView?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _2067439281_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2067439281_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_VisibleBoundsChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _2067439281_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067439281_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun SetDesiredBoundsMode(boundsMode: ApplicationViewBoundsMode?): Boolean {
      val fnPtr = _2067439281_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2067439281_Ptr, marshalToNative(boundsMode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_DesiredBoundsMode(): ApplicationViewBoundsMode? {
      val fnPtr = _2067439281_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationViewBoundsMode>()
      val hr = fn.invokeHR(arrayOf(__2067439281_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationViewBoundsMode>(result.getValue())
      return resultValue
    }
  }

  public class IApplicationView2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2067439281_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationView2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e876b196a54540dcb594450cba68cc00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationView2(ptr: Pointer?): WithDefault = IApplicationView2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationView2 {
      val address = segment.toRawLongValue()
      return makeIApplicationView2(Pointer(address))
    }

    public override fun toNative(obj: IApplicationView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2067439281_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationView2): Array<IApplicationView2?> = (elements
        as Array<IApplicationView2?>).castToImpl<IApplicationView2,IApplicationView2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationView2?> =
        arrayOfNulls<IApplicationView2_Impl>(size) as Array<IApplicationView2?>
  }
}
