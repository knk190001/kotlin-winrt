package Windows.Graphics.Holographic

import Windows.Foundation.TimeSpan
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

@ABIMarker(IHolographicFrameRenderingReport.ABI::class)
@Signature("{05f32de4-e384-51b3-b934-f0d3a0f78606}")
@Guid("05f32de4e38451b3b934f0d3a0f78606")
@WinRTInterface("05f32de4e38451b3b934f0d3a0f78606")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicFrameRenderingReport.ByReference::class)
public interface IHolographicFrameRenderingReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameId(): HolographicFrameId?

  @InterfaceMethod(1)
  public fun get_MissedLatchCount(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_SystemRelativeFrameReadyTime(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_SystemRelativeActualGpuFinishTime(): TimeSpan?

  @InterfaceMethod(4)
  public fun get_SystemRelativeTargetLatchTime(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicFrameRenderingReport> {
    public override fun getValue() = ABI.makeIHolographicFrameRenderingReport(pointer.getPointer(0))

    public fun setValue(value: IHolographicFrameRenderingReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicFrameRenderingReport {
    public val __195299022_Ptr: Pointer?

    public val _195299022_VtblPtr: Pointer?
      get() = __195299022_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameId(): HolographicFrameId? {
      val fnPtr = _195299022_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicFrameId>()
      val hr = fn.invokeHR(arrayOf(__195299022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicFrameId>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MissedLatchCount(): WinDef.UINT {
      val fnPtr = _195299022_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__195299022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_SystemRelativeFrameReadyTime(): TimeSpan? {
      val fnPtr = _195299022_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__195299022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SystemRelativeActualGpuFinishTime(): TimeSpan? {
      val fnPtr = _195299022_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__195299022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SystemRelativeTargetLatchTime(): TimeSpan? {
      val fnPtr = _195299022_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__195299022_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicFrameRenderingReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __195299022_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicFrameRenderingReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05f32de4e38451b3b934f0d3a0f78606")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicFrameRenderingReport(ptr: Pointer?): WithDefault =
        IHolographicFrameRenderingReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicFrameRenderingReport {
      val address = segment.toRawLongValue()
      return makeIHolographicFrameRenderingReport(Pointer(address))
    }

    public override fun toNative(obj: IHolographicFrameRenderingReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__195299022_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicFrameRenderingReport):
        Array<IHolographicFrameRenderingReport?> = (elements as
        Array<IHolographicFrameRenderingReport?>).castToImpl<IHolographicFrameRenderingReport,IHolographicFrameRenderingReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicFrameRenderingReport?> =
        arrayOfNulls<IHolographicFrameRenderingReport_Impl>(size) as
        Array<IHolographicFrameRenderingReport?>
  }
}
