package Windows.Devices.PointOfService

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILineDisplayCapabilities.ABI::class)
@Signature("{5a15b5d1-8dc5-4b9c-9172-303e47b70c55}")
@Guid("5a15b5d18dc54b9c9172303e47b70c55")
@WinRTInterface("5a15b5d18dc54b9c9172303e47b70c55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILineDisplayCapabilities.ByReference::class)
public interface ILineDisplayCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsStatisticsReportingSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_IsStatisticsUpdatingSupported(): Boolean

  @InterfaceMethod(2)
  public fun get_PowerReportingType(): UnifiedPosPowerReportingType?

  @InterfaceMethod(3)
  public fun get_CanChangeScreenSize(): Boolean

  @InterfaceMethod(4)
  public fun get_CanDisplayBitmaps(): Boolean

  @InterfaceMethod(5)
  public fun get_CanReadCharacterAtCursor(): Boolean

  @InterfaceMethod(6)
  public fun get_CanMapCharacterSets(): Boolean

  @InterfaceMethod(7)
  public fun get_CanDisplayCustomGlyphs(): Boolean

  @InterfaceMethod(8)
  public fun get_CanReverse(): LineDisplayTextAttributeGranularity?

  @InterfaceMethod(9)
  public fun get_CanBlink(): LineDisplayTextAttributeGranularity?

  @InterfaceMethod(10)
  public fun get_CanChangeBlinkRate(): Boolean

  @InterfaceMethod(11)
  public fun get_IsBrightnessSupported(): Boolean

  @InterfaceMethod(12)
  public fun get_IsCursorSupported(): Boolean

  @InterfaceMethod(13)
  public fun get_IsHorizontalMarqueeSupported(): Boolean

  @InterfaceMethod(14)
  public fun get_IsVerticalMarqueeSupported(): Boolean

  @InterfaceMethod(15)
  public fun get_IsInterCharacterWaitSupported(): Boolean

  @InterfaceMethod(16)
  public fun get_SupportedDescriptors(): WinDef.UINT

  @InterfaceMethod(17)
  public fun get_SupportedWindows(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILineDisplayCapabilities> {
    public override fun getValue() = ABI.makeILineDisplayCapabilities(pointer.getPointer(0))

    public fun setValue(value: ILineDisplayCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILineDisplayCapabilities {
    public val __1552664827_Ptr: Pointer?

    public val _1552664827_VtblPtr: Pointer?
      get() = __1552664827_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsStatisticsReportingSupported(): Boolean {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsStatisticsUpdatingSupported(): Boolean {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_PowerReportingType(): UnifiedPosPowerReportingType? {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UnifiedPosPowerReportingType>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UnifiedPosPowerReportingType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CanChangeScreenSize(): Boolean {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_CanDisplayBitmaps(): Boolean {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_CanReadCharacterAtCursor(): Boolean {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_CanMapCharacterSets(): Boolean {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_CanDisplayCustomGlyphs(): Boolean {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_CanReverse(): LineDisplayTextAttributeGranularity? {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayTextAttributeGranularity>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayTextAttributeGranularity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_CanBlink(): LineDisplayTextAttributeGranularity? {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<LineDisplayTextAttributeGranularity>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<LineDisplayTextAttributeGranularity>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_CanChangeBlinkRate(): Boolean {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun get_IsBrightnessSupported(): Boolean {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_IsCursorSupported(): Boolean {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_IsHorizontalMarqueeSupported(): Boolean {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_IsVerticalMarqueeSupported(): Boolean {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun get_IsInterCharacterWaitSupported(): Boolean {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(16)
    public override fun get_SupportedDescriptors(): WinDef.UINT {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun get_SupportedWindows(): WinDef.UINT {
      val fnPtr = _1552664827_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1552664827_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ILineDisplayCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1552664827_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILineDisplayCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5a15b5d18dc54b9c9172303e47b70c55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILineDisplayCapabilities(ptr: Pointer?): WithDefault =
        ILineDisplayCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILineDisplayCapabilities {
      val address = segment.toRawLongValue()
      return makeILineDisplayCapabilities(Pointer(address))
    }

    public override fun toNative(obj: ILineDisplayCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1552664827_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILineDisplayCapabilities):
        Array<ILineDisplayCapabilities?> = (elements as
        Array<ILineDisplayCapabilities?>).castToImpl<ILineDisplayCapabilities,ILineDisplayCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILineDisplayCapabilities?> =
        arrayOfNulls<ILineDisplayCapabilities_Impl>(size) as Array<ILineDisplayCapabilities?>
  }
}
