package Windows.Media.Capture

import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import Windows.Media.Devices.CaptureSceneMode
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICapturedFrameControlValues.ABI::class)
@Signature("{90c65b7f-4e0d-4ca4-882d-7a144fed0a90}")
@Guid("90c65b7f4e0d4ca4882d7a144fed0a90")
@WinRTInterface("90c65b7f4e0d4ca4882d7a144fed0a90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICapturedFrameControlValues.ByReference::class)
public interface ICapturedFrameControlValues : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Exposure(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun get_ExposureCompensation(): IReference<Float>?

  @InterfaceMethod(2)
  public fun get_IsoSpeed(): IReference<WinDef.UINT>?

  @InterfaceMethod(3)
  public fun get_Focus(): IReference<WinDef.UINT>?

  @InterfaceMethod(4)
  public fun get_SceneMode(): IReference<CaptureSceneMode?>?

  @InterfaceMethod(5)
  public fun get_Flashed(): IReference<Boolean>?

  @InterfaceMethod(6)
  public fun get_FlashPowerPercent(): IReference<Float>?

  @InterfaceMethod(7)
  public fun get_WhiteBalance(): IReference<WinDef.UINT>?

  @InterfaceMethod(8)
  public fun get_ZoomFactor(): IReference<Float>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICapturedFrameControlValues> {
    public override fun getValue() = ABI.makeICapturedFrameControlValues(pointer.getPointer(0))

    public fun setValue(value: ICapturedFrameControlValues_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICapturedFrameControlValues {
    public val __1383932728_Ptr: Pointer?

    public val _1383932728_VtblPtr: Pointer?
      get() = __1383932728_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Exposure(): IReference<TimeSpan?>? {
      val fnPtr = _1383932728_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1383932728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExposureCompensation(): IReference<Float>? {
      val fnPtr = _1383932728_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Float>>()
      val hr = fn.invokeHR(arrayOf(__1383932728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Float>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsoSpeed(): IReference<WinDef.UINT>? {
      val fnPtr = _1383932728_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1383932728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Focus(): IReference<WinDef.UINT>? {
      val fnPtr = _1383932728_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1383932728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SceneMode(): IReference<CaptureSceneMode?>? {
      val fnPtr = _1383932728_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<CaptureSceneMode?>>()
      val hr = fn.invokeHR(arrayOf(__1383932728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<CaptureSceneMode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Flashed(): IReference<Boolean>? {
      val fnPtr = _1383932728_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1383932728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_FlashPowerPercent(): IReference<Float>? {
      val fnPtr = _1383932728_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Float>>()
      val hr = fn.invokeHR(arrayOf(__1383932728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Float>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_WhiteBalance(): IReference<WinDef.UINT>? {
      val fnPtr = _1383932728_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1383932728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ZoomFactor(): IReference<Float>? {
      val fnPtr = _1383932728_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Float>>()
      val hr = fn.invokeHR(arrayOf(__1383932728_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Float>>(result.getValue())
      return resultValue
    }
  }

  public class ICapturedFrameControlValues_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1383932728_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICapturedFrameControlValues, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90c65b7f4e0d4ca4882d7a144fed0a90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICapturedFrameControlValues(ptr: Pointer?): WithDefault =
        ICapturedFrameControlValues_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICapturedFrameControlValues {
      val address = segment.toRawLongValue()
      return makeICapturedFrameControlValues(Pointer(address))
    }

    public override fun toNative(obj: ICapturedFrameControlValues): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1383932728_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICapturedFrameControlValues):
        Array<ICapturedFrameControlValues?> = (elements as
        Array<ICapturedFrameControlValues?>).castToImpl<ICapturedFrameControlValues,ICapturedFrameControlValues_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICapturedFrameControlValues?> =
        arrayOfNulls<ICapturedFrameControlValues_Impl>(size) as Array<ICapturedFrameControlValues?>
  }
}
