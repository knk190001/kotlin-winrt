package Windows.UI.Composition

import Windows.UI.Color
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

@ABIMarker(IDelegatedInkTrailVisual.ABI::class)
@Signature("{856e60b1-e1ab-5b23-8e3d-d513f221c998}")
@Guid("856e60b1e1ab5b238e3dd513f221c998")
@WinRTInterface("856e60b1e1ab5b238e3dd513f221c998")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDelegatedInkTrailVisual.ByReference::class)
public interface IDelegatedInkTrailVisual : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AddTrailPoints(inkPoints: Array<InkTrailPoint?>): WinDef.UINT

  @InterfaceMethod(1)
  public fun AddTrailPointsWithPrediction(inkPoints: Array<InkTrailPoint?>,
      predictedInkPoints: Array<InkTrailPoint?>): WinDef.UINT

  @InterfaceMethod(2)
  public fun RemoveTrailPoints(generationId: WinDef.UINT): Unit

  @InterfaceMethod(3)
  public fun StartNewTrail(color: Color?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDelegatedInkTrailVisual> {
    public override fun getValue() = ABI.makeIDelegatedInkTrailVisual(pointer.getPointer(0))

    public fun setValue(value: IDelegatedInkTrailVisual_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDelegatedInkTrailVisual {
    public val __813954833_Ptr: Pointer?

    public val _813954833_VtblPtr: Pointer?
      get() = __813954833_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AddTrailPoints(inkPoints: Array<InkTrailPoint?>): WinDef.UINT {
      val fnPtr = _813954833_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__813954833_Ptr, inkPoints.size,marshalToNative(inkPoints),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun AddTrailPointsWithPrediction(inkPoints: Array<InkTrailPoint?>,
        predictedInkPoints: Array<InkTrailPoint?>): WinDef.UINT {
      val fnPtr = _813954833_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__813954833_Ptr, inkPoints.size,marshalToNative(inkPoints),
          predictedInkPoints.size,marshalToNative(predictedInkPoints), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun RemoveTrailPoints(generationId: WinDef.UINT): Unit {
      val fnPtr = _813954833_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__813954833_Ptr, generationId,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun StartNewTrail(color: Color?): Unit {
      val fnPtr = _813954833_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__813954833_Ptr, marshalToNative(color),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDelegatedInkTrailVisual_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __813954833_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDelegatedInkTrailVisual, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("856e60b1e1ab5b238e3dd513f221c998")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDelegatedInkTrailVisual(ptr: Pointer?): WithDefault =
        IDelegatedInkTrailVisual_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDelegatedInkTrailVisual {
      val address = segment.toRawLongValue()
      return makeIDelegatedInkTrailVisual(Pointer(address))
    }

    public override fun toNative(obj: IDelegatedInkTrailVisual): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__813954833_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDelegatedInkTrailVisual):
        Array<IDelegatedInkTrailVisual?> = (elements as
        Array<IDelegatedInkTrailVisual?>).castToImpl<IDelegatedInkTrailVisual,IDelegatedInkTrailVisual_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDelegatedInkTrailVisual?> =
        arrayOfNulls<IDelegatedInkTrailVisual_Impl>(size) as Array<IDelegatedInkTrailVisual?>
  }
}
