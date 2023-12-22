package Microsoft.Graphics.Display

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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayAdvancedColorInfo.ABI::class)
@Signature("{b44f0f47-7065-5175-ba3e-714489c85a3e}")
@Guid("b44f0f4770655175ba3e714489c85a3e")
@WinRTInterface("b44f0f4770655175ba3e714489c85a3e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayAdvancedColorInfo.ByReference::class)
public interface IDisplayAdvancedColorInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentAdvancedColorKind(): DisplayAdvancedColorKind?

  @InterfaceMethod(1)
  public fun get_RedPrimary(): Point?

  @InterfaceMethod(2)
  public fun get_GreenPrimary(): Point?

  @InterfaceMethod(3)
  public fun get_BluePrimary(): Point?

  @InterfaceMethod(4)
  public fun get_WhitePoint(): Point?

  @InterfaceMethod(5)
  public fun get_MaxLuminanceInNits(): Double

  @InterfaceMethod(6)
  public fun get_MinLuminanceInNits(): Double

  @InterfaceMethod(7)
  public fun get_MaxAverageFullFrameLuminanceInNits(): Double

  @InterfaceMethod(8)
  public fun get_SdrWhiteLevelInNits(): Double

  @InterfaceMethod(9)
  public fun IsHdrMetadataFormatCurrentlySupported(format: DisplayHdrMetadataFormat?): Boolean

  @InterfaceMethod(10)
  public fun IsAdvancedColorKindAvailable(kind: DisplayAdvancedColorKind?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayAdvancedColorInfo> {
    public override fun getValue() = ABI.makeIDisplayAdvancedColorInfo(pointer.getPointer(0))

    public fun setValue(value: IDisplayAdvancedColorInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayAdvancedColorInfo {
    public val __1022515415_Ptr: Pointer?

    public val _1022515415_VtblPtr: Pointer?
      get() = __1022515415_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentAdvancedColorKind(): DisplayAdvancedColorKind? {
      val fnPtr = _1022515415_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayAdvancedColorKind>()
      val hr = fn.invokeHR(arrayOf(__1022515415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayAdvancedColorKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RedPrimary(): Point? {
      val fnPtr = _1022515415_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1022515415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_GreenPrimary(): Point? {
      val fnPtr = _1022515415_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1022515415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BluePrimary(): Point? {
      val fnPtr = _1022515415_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1022515415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_WhitePoint(): Point? {
      val fnPtr = _1022515415_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1022515415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_MaxLuminanceInNits(): Double {
      val fnPtr = _1022515415_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1022515415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_MinLuminanceInNits(): Double {
      val fnPtr = _1022515415_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1022515415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_MaxAverageFullFrameLuminanceInNits(): Double {
      val fnPtr = _1022515415_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1022515415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_SdrWhiteLevelInNits(): Double {
      val fnPtr = _1022515415_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1022515415_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun IsHdrMetadataFormatCurrentlySupported(format: DisplayHdrMetadataFormat?):
        Boolean {
      val fnPtr = _1022515415_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1022515415_Ptr, marshalToNative(format), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun IsAdvancedColorKindAvailable(kind: DisplayAdvancedColorKind?): Boolean {
      val fnPtr = _1022515415_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1022515415_Ptr, marshalToNative(kind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDisplayAdvancedColorInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1022515415_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayAdvancedColorInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b44f0f4770655175ba3e714489c85a3e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayAdvancedColorInfo(ptr: Pointer?): WithDefault =
        IDisplayAdvancedColorInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayAdvancedColorInfo {
      val address = segment.toRawLongValue()
      return makeIDisplayAdvancedColorInfo(Pointer(address))
    }

    public override fun toNative(obj: IDisplayAdvancedColorInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1022515415_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayAdvancedColorInfo):
        Array<IDisplayAdvancedColorInfo?> = (elements as
        Array<IDisplayAdvancedColorInfo?>).castToImpl<IDisplayAdvancedColorInfo,IDisplayAdvancedColorInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayAdvancedColorInfo?> =
        arrayOfNulls<IDisplayAdvancedColorInfo_Impl>(size) as Array<IDisplayAdvancedColorInfo?>
  }
}
