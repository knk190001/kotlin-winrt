package Windows.Graphics.Display.Core

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHdmiDisplayMode.ABI::class)
@Signature("{0c06d5ad-1b90-4f51-9981-ef5a1c0ddf66}")
@Guid("0c06d5ad1b904f519981ef5a1c0ddf66")
@WinRTInterface("0c06d5ad1b904f519981ef5a1c0ddf66")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHdmiDisplayMode.ByReference::class)
public interface IHdmiDisplayMode : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResolutionWidthInRawPixels(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_ResolutionHeightInRawPixels(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_RefreshRate(): Double

  @InterfaceMethod(3)
  public fun get_StereoEnabled(): Boolean

  @InterfaceMethod(4)
  public fun get_BitsPerPixel(): WinDef.USHORT

  @InterfaceMethod(5)
  public fun IsEqual(mode: HdmiDisplayMode?): Boolean

  @InterfaceMethod(6)
  public fun get_ColorSpace(): HdmiDisplayColorSpace?

  @InterfaceMethod(7)
  public fun get_PixelEncoding(): HdmiDisplayPixelEncoding?

  @InterfaceMethod(8)
  public fun get_IsSdrLuminanceSupported(): Boolean

  @InterfaceMethod(9)
  public fun get_IsSmpte2084Supported(): Boolean

  @InterfaceMethod(10)
  public fun get_Is2086MetadataSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHdmiDisplayMode> {
    public override fun getValue() = ABI.makeIHdmiDisplayMode(pointer.getPointer(0))

    public fun setValue(value: IHdmiDisplayMode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHdmiDisplayMode {
    public val __1022497817_Ptr: Pointer?

    public val _1022497817_VtblPtr: Pointer?
      get() = __1022497817_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResolutionWidthInRawPixels(): WinDef.UINT {
      val fnPtr = _1022497817_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1022497817_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ResolutionHeightInRawPixels(): WinDef.UINT {
      val fnPtr = _1022497817_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1022497817_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_RefreshRate(): Double {
      val fnPtr = _1022497817_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1022497817_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_StereoEnabled(): Boolean {
      val fnPtr = _1022497817_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1022497817_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_BitsPerPixel(): WinDef.USHORT {
      val fnPtr = _1022497817_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1022497817_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun IsEqual(mode: HdmiDisplayMode?): Boolean {
      val fnPtr = _1022497817_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1022497817_Ptr, marshalToNative(mode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_ColorSpace(): HdmiDisplayColorSpace? {
      val fnPtr = _1022497817_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HdmiDisplayColorSpace>()
      val hr = fn.invokeHR(arrayOf(__1022497817_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HdmiDisplayColorSpace>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_PixelEncoding(): HdmiDisplayPixelEncoding? {
      val fnPtr = _1022497817_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HdmiDisplayPixelEncoding>()
      val hr = fn.invokeHR(arrayOf(__1022497817_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HdmiDisplayPixelEncoding>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_IsSdrLuminanceSupported(): Boolean {
      val fnPtr = _1022497817_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1022497817_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_IsSmpte2084Supported(): Boolean {
      val fnPtr = _1022497817_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1022497817_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_Is2086MetadataSupported(): Boolean {
      val fnPtr = _1022497817_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1022497817_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHdmiDisplayMode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1022497817_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHdmiDisplayMode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c06d5ad1b904f519981ef5a1c0ddf66")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHdmiDisplayMode(ptr: Pointer?): WithDefault = IHdmiDisplayMode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHdmiDisplayMode {
      val address = segment.toRawLongValue()
      return makeIHdmiDisplayMode(Pointer(address))
    }

    public override fun toNative(obj: IHdmiDisplayMode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1022497817_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHdmiDisplayMode): Array<IHdmiDisplayMode?> = (elements as
        Array<IHdmiDisplayMode?>).castToImpl<IHdmiDisplayMode,IHdmiDisplayMode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHdmiDisplayMode?> =
        arrayOfNulls<IHdmiDisplayMode_Impl>(size) as Array<IHdmiDisplayMode?>
  }
}
