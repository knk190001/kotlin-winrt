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

@ABIMarker(IHolographicFramePresentationReport.ABI::class)
@Signature("{80baf614-f2f4-4c8a-8de3-065c78f6d5de}")
@Guid("80baf614f2f44c8a8de3065c78f6d5de")
@WinRTInterface("80baf614f2f44c8a8de3065c78f6d5de")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHolographicFramePresentationReport.ByReference::class)
public interface IHolographicFramePresentationReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CompositorGpuDuration(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_AppGpuDuration(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_AppGpuOverrun(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_MissedPresentationOpportunityCount(): WinDef.UINT

  @InterfaceMethod(4)
  public fun get_PresentationCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHolographicFramePresentationReport> {
    public override fun getValue() =
        ABI.makeIHolographicFramePresentationReport(pointer.getPointer(0))

    public fun setValue(value: IHolographicFramePresentationReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHolographicFramePresentationReport {
    public val __1043341760_Ptr: Pointer?

    public val _1043341760_VtblPtr: Pointer?
      get() = __1043341760_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CompositorGpuDuration(): TimeSpan? {
      val fnPtr = _1043341760_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1043341760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AppGpuDuration(): TimeSpan? {
      val fnPtr = _1043341760_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1043341760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AppGpuOverrun(): TimeSpan? {
      val fnPtr = _1043341760_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1043341760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MissedPresentationOpportunityCount(): WinDef.UINT {
      val fnPtr = _1043341760_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1043341760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_PresentationCount(): WinDef.UINT {
      val fnPtr = _1043341760_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1043341760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IHolographicFramePresentationReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1043341760_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHolographicFramePresentationReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80baf614f2f44c8a8de3065c78f6d5de")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHolographicFramePresentationReport(ptr: Pointer?): WithDefault =
        IHolographicFramePresentationReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHolographicFramePresentationReport {
      val address = segment.toRawLongValue()
      return makeIHolographicFramePresentationReport(Pointer(address))
    }

    public override fun toNative(obj: IHolographicFramePresentationReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1043341760_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHolographicFramePresentationReport):
        Array<IHolographicFramePresentationReport?> = (elements as
        Array<IHolographicFramePresentationReport?>).castToImpl<IHolographicFramePresentationReport,IHolographicFramePresentationReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHolographicFramePresentationReport?> =
        arrayOfNulls<IHolographicFramePresentationReport_Impl>(size) as
        Array<IHolographicFramePresentationReport?>
  }
}
