package Windows.UI.ViewManagement

import Windows.Foundation.Size
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

@ABIMarker(IApplicationView3.ABI::class)
@Signature("{903c9ce5-793a-4fdf-a2b2-af1ac21e3108}")
@Guid("903c9ce5793a4fdfa2b2af1ac21e3108")
@WinRTInterface("903c9ce5793a4fdfa2b2af1ac21e3108")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationView3.ByReference::class)
public interface IApplicationView3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TitleBar(): ApplicationViewTitleBar?

  @InterfaceMethod(1)
  public fun get_FullScreenSystemOverlayMode(): FullScreenSystemOverlayMode?

  @InterfaceMethod(2)
  public fun put_FullScreenSystemOverlayMode(value: FullScreenSystemOverlayMode?): Unit

  @InterfaceMethod(3)
  public fun get_IsFullScreenMode(): Boolean

  @InterfaceMethod(4)
  public fun TryEnterFullScreenMode(): Boolean

  @InterfaceMethod(5)
  public fun ExitFullScreenMode(): Unit

  @InterfaceMethod(6)
  public fun ShowStandardSystemOverlays(): Unit

  @InterfaceMethod(7)
  public fun TryResizeView(value: Size?): Boolean

  @InterfaceMethod(8)
  public fun SetPreferredMinSize(minSize: Size?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationView3> {
    public override fun getValue() = ABI.makeIApplicationView3(pointer.getPointer(0))

    public fun setValue(value: IApplicationView3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationView3 {
    public val __2067439280_Ptr: Pointer?

    public val _2067439280_VtblPtr: Pointer?
      get() = __2067439280_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TitleBar(): ApplicationViewTitleBar? {
      val fnPtr = _2067439280_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ApplicationViewTitleBar>()
      val hr = fn.invokeHR(arrayOf(__2067439280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ApplicationViewTitleBar>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FullScreenSystemOverlayMode(): FullScreenSystemOverlayMode? {
      val fnPtr = _2067439280_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FullScreenSystemOverlayMode>()
      val hr = fn.invokeHR(arrayOf(__2067439280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FullScreenSystemOverlayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_FullScreenSystemOverlayMode(value: FullScreenSystemOverlayMode?): Unit {
      val fnPtr = _2067439280_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067439280_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsFullScreenMode(): Boolean {
      val fnPtr = _2067439280_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2067439280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun TryEnterFullScreenMode(): Boolean {
      val fnPtr = _2067439280_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2067439280_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun ExitFullScreenMode(): Unit {
      val fnPtr = _2067439280_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067439280_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun ShowStandardSystemOverlays(): Unit {
      val fnPtr = _2067439280_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067439280_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun TryResizeView(value: Size?): Boolean {
      val fnPtr = _2067439280_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2067439280_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun SetPreferredMinSize(minSize: Size?): Unit {
      val fnPtr = _2067439280_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2067439280_Ptr, marshalToNative(minSize),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IApplicationView3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2067439280_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationView3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("903c9ce5793a4fdfa2b2af1ac21e3108")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationView3(ptr: Pointer?): WithDefault = IApplicationView3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationView3 {
      val address = segment.toRawLongValue()
      return makeIApplicationView3(Pointer(address))
    }

    public override fun toNative(obj: IApplicationView3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2067439280_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationView3): Array<IApplicationView3?> = (elements
        as Array<IApplicationView3?>).castToImpl<IApplicationView3,IApplicationView3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationView3?> =
        arrayOfNulls<IApplicationView3_Impl>(size) as Array<IApplicationView3?>
  }
}
