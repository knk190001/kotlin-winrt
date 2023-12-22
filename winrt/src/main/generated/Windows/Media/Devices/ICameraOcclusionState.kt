package Windows.Media.Devices

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICameraOcclusionState.ABI::class)
@Signature("{430adeb8-6842-5e55-9bde-04b4ef3a8a57}")
@Guid("430adeb868425e559bde04b4ef3a8a57")
@WinRTInterface("430adeb868425e559bde04b4ef3a8a57")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICameraOcclusionState.ByReference::class)
public interface ICameraOcclusionState : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsOccluded(): Boolean

  @InterfaceMethod(1)
  public fun IsOcclusionKind(occlusionKind: CameraOcclusionKind?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICameraOcclusionState> {
    public override fun getValue() = ABI.makeICameraOcclusionState(pointer.getPointer(0))

    public fun setValue(value: ICameraOcclusionState_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICameraOcclusionState {
    public val __401809366_Ptr: Pointer?

    public val _401809366_VtblPtr: Pointer?
      get() = __401809366_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsOccluded(): Boolean {
      val fnPtr = _401809366_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__401809366_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun IsOcclusionKind(occlusionKind: CameraOcclusionKind?): Boolean {
      val fnPtr = _401809366_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__401809366_Ptr, marshalToNative(occlusionKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ICameraOcclusionState_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __401809366_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICameraOcclusionState, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("430adeb868425e559bde04b4ef3a8a57")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICameraOcclusionState(ptr: Pointer?): WithDefault =
        ICameraOcclusionState_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICameraOcclusionState {
      val address = segment.toRawLongValue()
      return makeICameraOcclusionState(Pointer(address))
    }

    public override fun toNative(obj: ICameraOcclusionState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__401809366_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICameraOcclusionState): Array<ICameraOcclusionState?> =
        (elements as
        Array<ICameraOcclusionState?>).castToImpl<ICameraOcclusionState,ICameraOcclusionState_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICameraOcclusionState?> =
        arrayOfNulls<ICameraOcclusionState_Impl>(size) as Array<ICameraOcclusionState?>
  }
}
