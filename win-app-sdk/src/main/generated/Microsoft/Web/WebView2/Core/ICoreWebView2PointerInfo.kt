package Microsoft.Web.WebView2.Core

import Windows.Foundation.Point
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ICoreWebView2PointerInfo.ABI::class)
@Signature("{c3860e0d-c018-5a84-bc06-9f8f7b275dff}")
@Guid("c3860e0dc0185a84bc069f8f7b275dff")
@WinRTInterface("c3860e0dc0185a84bc069f8f7b275dff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWebView2PointerInfo.ByReference::class)
public interface ICoreWebView2PointerInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerKind(): WinDef.UINT

  @InterfaceMethod(1)
  public fun put_PointerKind(value: WinDef.UINT): Unit

  @InterfaceMethod(2)
  public fun get_PointerId(): WinDef.UINT

  @InterfaceMethod(3)
  public fun put_PointerId(value: WinDef.UINT): Unit

  @InterfaceMethod(4)
  public fun get_FrameId(): WinDef.UINT

  @InterfaceMethod(5)
  public fun put_FrameId(value: WinDef.UINT): Unit

  @InterfaceMethod(6)
  public fun get_PointerFlags(): WinDef.UINT

  @InterfaceMethod(7)
  public fun put_PointerFlags(value: WinDef.UINT): Unit

  @InterfaceMethod(8)
  public fun get_PointerDeviceRect(): Rect?

  @InterfaceMethod(9)
  public fun put_PointerDeviceRect(value: Rect?): Unit

  @InterfaceMethod(10)
  public fun get_DisplayRect(): Rect?

  @InterfaceMethod(11)
  public fun put_DisplayRect(value: Rect?): Unit

  @InterfaceMethod(12)
  public fun get_PixelLocation(): Point?

  @InterfaceMethod(13)
  public fun put_PixelLocation(value: Point?): Unit

  @InterfaceMethod(14)
  public fun get_HimetricLocation(): Point?

  @InterfaceMethod(15)
  public fun put_HimetricLocation(value: Point?): Unit

  @InterfaceMethod(16)
  public fun get_PixelLocationRaw(): Point?

  @InterfaceMethod(17)
  public fun put_PixelLocationRaw(value: Point?): Unit

  @InterfaceMethod(18)
  public fun get_HimetricLocationRaw(): Point?

  @InterfaceMethod(19)
  public fun put_HimetricLocationRaw(value: Point?): Unit

  @InterfaceMethod(20)
  public fun get_Time(): WinDef.UINT

  @InterfaceMethod(21)
  public fun put_Time(value: WinDef.UINT): Unit

  @InterfaceMethod(22)
  public fun get_HistoryCount(): WinDef.UINT

  @InterfaceMethod(23)
  public fun put_HistoryCount(value: WinDef.UINT): Unit

  @InterfaceMethod(24)
  public fun get_InputData(): Int

  @InterfaceMethod(25)
  public fun put_InputData(value: Int): Unit

  @InterfaceMethod(26)
  public fun get_KeyStates(): WinDef.UINT

  @InterfaceMethod(27)
  public fun put_KeyStates(value: WinDef.UINT): Unit

  @InterfaceMethod(28)
  public fun get_PerformanceCount(): WinDef.ULONG

  @InterfaceMethod(29)
  public fun put_PerformanceCount(value: WinDef.ULONG): Unit

  @InterfaceMethod(30)
  public fun get_ButtonChangeKind(): Int

  @InterfaceMethod(31)
  public fun put_ButtonChangeKind(value: Int): Unit

  @InterfaceMethod(32)
  public fun get_PenFlags(): WinDef.UINT

  @InterfaceMethod(33)
  public fun put_PenFlags(value: WinDef.UINT): Unit

  @InterfaceMethod(34)
  public fun get_PenMask(): WinDef.UINT

  @InterfaceMethod(35)
  public fun put_PenMask(value: WinDef.UINT): Unit

  @InterfaceMethod(36)
  public fun get_PenPressure(): WinDef.UINT

  @InterfaceMethod(37)
  public fun put_PenPressure(value: WinDef.UINT): Unit

  @InterfaceMethod(38)
  public fun get_PenRotation(): WinDef.UINT

  @InterfaceMethod(39)
  public fun put_PenRotation(value: WinDef.UINT): Unit

  @InterfaceMethod(40)
  public fun get_PenTiltX(): Int

  @InterfaceMethod(41)
  public fun put_PenTiltX(value: Int): Unit

  @InterfaceMethod(42)
  public fun get_PenTiltY(): Int

  @InterfaceMethod(43)
  public fun put_PenTiltY(value: Int): Unit

  @InterfaceMethod(44)
  public fun get_TouchFlags(): WinDef.UINT

  @InterfaceMethod(45)
  public fun put_TouchFlags(value: WinDef.UINT): Unit

  @InterfaceMethod(46)
  public fun get_TouchMask(): WinDef.UINT

  @InterfaceMethod(47)
  public fun put_TouchMask(value: WinDef.UINT): Unit

  @InterfaceMethod(48)
  public fun get_TouchContact(): Rect?

  @InterfaceMethod(49)
  public fun put_TouchContact(value: Rect?): Unit

  @InterfaceMethod(50)
  public fun get_TouchContactRaw(): Rect?

  @InterfaceMethod(51)
  public fun put_TouchContactRaw(value: Rect?): Unit

  @InterfaceMethod(52)
  public fun get_TouchOrientation(): WinDef.UINT

  @InterfaceMethod(53)
  public fun put_TouchOrientation(value: WinDef.UINT): Unit

  @InterfaceMethod(54)
  public fun get_TouchPressure(): WinDef.UINT

  @InterfaceMethod(55)
  public fun put_TouchPressure(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWebView2PointerInfo> {
    public override fun getValue() = ABI.makeICoreWebView2PointerInfo(pointer.getPointer(0))

    public fun setValue(value: ICoreWebView2PointerInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWebView2PointerInfo {
    public val __1275711428_Ptr: Pointer?

    public val _1275711428_VtblPtr: Pointer?
      get() = __1275711428_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerKind(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_PointerKind(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_PointerId(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_PointerId(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_FrameId(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_FrameId(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PointerFlags(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_PointerFlags(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_PointerDeviceRect(): Rect? {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_PointerDeviceRect(value: Rect?): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_DisplayRect(): Rect? {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_DisplayRect(value: Rect?): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_PixelLocation(): Point? {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_PixelLocation(value: Point?): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_HimetricLocation(): Point? {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_HimetricLocation(value: Point?): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_PixelLocationRaw(): Point? {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_PixelLocationRaw(value: Point?): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_HimetricLocationRaw(): Point? {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_HimetricLocationRaw(value: Point?): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_Time(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_Time(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_HistoryCount(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(23)
    public override fun put_HistoryCount(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(24)
    public override fun get_InputData(): Int {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun put_InputData(value: Int): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(26)
    public override fun get_KeyStates(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(27)
    public override fun put_KeyStates(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun get_PerformanceCount(): WinDef.ULONG {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(29)
    public override fun put_PerformanceCount(value: WinDef.ULONG): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(35L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(30)
    public override fun get_ButtonChangeKind(): Int {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(36L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(31)
    public override fun put_ButtonChangeKind(value: Int): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(37L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(32)
    public override fun get_PenFlags(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(38L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(33)
    public override fun put_PenFlags(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(39L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(34)
    public override fun get_PenMask(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(40L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(35)
    public override fun put_PenMask(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(41L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(36)
    public override fun get_PenPressure(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(42L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(37)
    public override fun put_PenPressure(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(43L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(38)
    public override fun get_PenRotation(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(44L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(39)
    public override fun put_PenRotation(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(45L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(40)
    public override fun get_PenTiltX(): Int {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(46L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(41)
    public override fun put_PenTiltX(value: Int): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(47L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(42)
    public override fun get_PenTiltY(): Int {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(48L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(43)
    public override fun put_PenTiltY(value: Int): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(49L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(44)
    public override fun get_TouchFlags(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(50L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(45)
    public override fun put_TouchFlags(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(51L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(46)
    public override fun get_TouchMask(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(52L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(47)
    public override fun put_TouchMask(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(53L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(48)
    public override fun get_TouchContact(): Rect? {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(54L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(49)
    public override fun put_TouchContact(value: Rect?): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(55L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(50)
    public override fun get_TouchContactRaw(): Rect? {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(56L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(51)
    public override fun put_TouchContactRaw(value: Rect?): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(57L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(52)
    public override fun get_TouchOrientation(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(58L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(53)
    public override fun put_TouchOrientation(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(59L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(54)
    public override fun get_TouchPressure(): WinDef.UINT {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(60L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(55)
    public override fun put_TouchPressure(value: WinDef.UINT): Unit {
      val fnPtr = _1275711428_VtblPtr!!.getPointer(61L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275711428_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWebView2PointerInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1275711428_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWebView2PointerInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3860e0dc0185a84bc069f8f7b275dff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWebView2PointerInfo(ptr: Pointer?): WithDefault =
        ICoreWebView2PointerInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWebView2PointerInfo {
      val address = segment.toRawLongValue()
      return makeICoreWebView2PointerInfo(Pointer(address))
    }

    public override fun toNative(obj: ICoreWebView2PointerInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1275711428_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWebView2PointerInfo):
        Array<ICoreWebView2PointerInfo?> = (elements as
        Array<ICoreWebView2PointerInfo?>).castToImpl<ICoreWebView2PointerInfo,ICoreWebView2PointerInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWebView2PointerInfo?> =
        arrayOfNulls<ICoreWebView2PointerInfo_Impl>(size) as Array<ICoreWebView2PointerInfo?>
  }
}
