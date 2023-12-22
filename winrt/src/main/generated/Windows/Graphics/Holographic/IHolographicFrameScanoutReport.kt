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

@ABIMarker(IHolographicFrameScanoutReport.ABI::class)
@Signature("{0ebbe606-03a0-5ca0-b46e-bba068d7233f}")
@Guid("0ebbe60603a05ca0b46ebba068d7233f")
@WinRTInterface("0ebbe60603a05ca0b46ebba068d7233f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicFrameScanoutReport.ByReference::class)
public interface IHolographicFrameScanoutReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RenderingReport(): HolographicFrameRenderingReport?

  @InterfaceMethod(1)
  public fun get_MissedScanoutCount(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_SystemRelativeLatchTime(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_SystemRelativeScanoutStartTime(): TimeSpan?

  @InterfaceMethod(4)
  public fun get_SystemRelativePhotonTime(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicFrameScanoutReport> {
    public override fun getValue() = ABI.makeIHolographicFrameScanoutReport(pointer.getPointer(0))

    public fun setValue(value: IHolographicFrameScanoutReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicFrameScanoutReport {
    public val __1008726093_Ptr: Pointer?

    public val _1008726093_VtblPtr: Pointer?
      get() = __1008726093_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RenderingReport(): HolographicFrameRenderingReport? {
      val fnPtr = _1008726093_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HolographicFrameRenderingReport>()
      val hr = fn.invokeHR(arrayOf(__1008726093_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HolographicFrameRenderingReport>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MissedScanoutCount(): WinDef.UINT {
      val fnPtr = _1008726093_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1008726093_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_SystemRelativeLatchTime(): TimeSpan? {
      val fnPtr = _1008726093_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1008726093_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SystemRelativeScanoutStartTime(): TimeSpan? {
      val fnPtr = _1008726093_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1008726093_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SystemRelativePhotonTime(): TimeSpan? {
      val fnPtr = _1008726093_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1008726093_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class IHolographicFrameScanoutReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1008726093_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicFrameScanoutReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ebbe60603a05ca0b46ebba068d7233f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicFrameScanoutReport(ptr: Pointer?): WithDefault =
        IHolographicFrameScanoutReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicFrameScanoutReport {
      val address = segment.toRawLongValue()
      return makeIHolographicFrameScanoutReport(Pointer(address))
    }

    public override fun toNative(obj: IHolographicFrameScanoutReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1008726093_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicFrameScanoutReport):
        Array<IHolographicFrameScanoutReport?> = (elements as
        Array<IHolographicFrameScanoutReport?>).castToImpl<IHolographicFrameScanoutReport,IHolographicFrameScanoutReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicFrameScanoutReport?> =
        arrayOfNulls<IHolographicFrameScanoutReport_Impl>(size) as
        Array<IHolographicFrameScanoutReport?>
  }
}
