package Windows.Devices.Input.Preview

import Windows.Devices.HumanInterfaceDevice.HidInputReport
import Windows.Foundation.IReference
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

@ABIMarker(IGazePointPreview.ABI::class)
@Signature("{e79e7eea-b389-11e7-b201-c8d3ffb75721}")
@Guid("e79e7eeab38911e7b201c8d3ffb75721")
@WinRTInterface("e79e7eeab38911e7b201c8d3ffb75721")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGazePointPreview.ByReference::class)
public interface IGazePointPreview : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceDevice(): GazeDevicePreview?

  @InterfaceMethod(1)
  public fun get_EyeGazePosition(): IReference<Point?>?

  @InterfaceMethod(2)
  public fun get_HeadGazePosition(): IReference<Point?>?

  @InterfaceMethod(3)
  public fun get_Timestamp(): WinDef.ULONG

  @InterfaceMethod(4)
  public fun get_HidInputReport(): HidInputReport?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGazePointPreview> {
    public override fun getValue() = ABI.makeIGazePointPreview(pointer.getPointer(0))

    public fun setValue(value: IGazePointPreview_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGazePointPreview {
    public val __270998782_Ptr: Pointer?

    public val _270998782_VtblPtr: Pointer?
      get() = __270998782_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceDevice(): GazeDevicePreview? {
      val fnPtr = _270998782_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GazeDevicePreview>()
      val hr = fn.invokeHR(arrayOf(__270998782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GazeDevicePreview>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EyeGazePosition(): IReference<Point?>? {
      val fnPtr = _270998782_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Point?>>()
      val hr = fn.invokeHR(arrayOf(__270998782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Point?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_HeadGazePosition(): IReference<Point?>? {
      val fnPtr = _270998782_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Point?>>()
      val hr = fn.invokeHR(arrayOf(__270998782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Point?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Timestamp(): WinDef.ULONG {
      val fnPtr = _270998782_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__270998782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_HidInputReport(): HidInputReport? {
      val fnPtr = _270998782_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidInputReport>()
      val hr = fn.invokeHR(arrayOf(__270998782_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidInputReport>(result.getValue())
      return resultValue
    }
  }

  public class IGazePointPreview_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __270998782_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGazePointPreview, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e79e7eeab38911e7b201c8d3ffb75721")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGazePointPreview(ptr: Pointer?): WithDefault = IGazePointPreview_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGazePointPreview {
      val address = segment.toRawLongValue()
      return makeIGazePointPreview(Pointer(address))
    }

    public override fun toNative(obj: IGazePointPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__270998782_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGazePointPreview): Array<IGazePointPreview?> = (elements
        as Array<IGazePointPreview?>).castToImpl<IGazePointPreview,IGazePointPreview_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGazePointPreview?> =
        arrayOfNulls<IGazePointPreview_Impl>(size) as Array<IGazePointPreview?>
  }
}
