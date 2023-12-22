package Windows.UI.Input.Spatial

import Windows.Perception.PerceptionTimestamp
import Windows.Perception.Spatial.SpatialCoordinateSystem
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

@ABIMarker(ISpatialInteractionSourceState.ABI::class)
@Signature("{d5c475ef-4b63-37ec-98b9-9fc652b9d2f2}")
@Guid("d5c475ef4b6337ec98b99fc652b9d2f2")
@WinRTInterface("d5c475ef4b6337ec98b99fc652b9d2f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialInteractionSourceState.ByReference::class)
public interface ISpatialInteractionSourceState : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): SpatialInteractionSource?

  @InterfaceMethod(1)
  public fun get_Properties(): SpatialInteractionSourceProperties?

  @InterfaceMethod(2)
  public fun get_IsPressed(): Boolean

  @InterfaceMethod(3)
  public fun get_Timestamp(): PerceptionTimestamp?

  @InterfaceMethod(4)
  public fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?): SpatialPointerPose?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialInteractionSourceState> {
    public override fun getValue() = ABI.makeISpatialInteractionSourceState(pointer.getPointer(0))

    public fun setValue(value: ISpatialInteractionSourceState_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialInteractionSourceState {
    public val __996687024_Ptr: Pointer?

    public val _996687024_VtblPtr: Pointer?
      get() = __996687024_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): SpatialInteractionSource? {
      val fnPtr = _996687024_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSource>()
      val hr = fn.invokeHR(arrayOf(__996687024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): SpatialInteractionSourceProperties? {
      val fnPtr = _996687024_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialInteractionSourceProperties>()
      val hr = fn.invokeHR(arrayOf(__996687024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialInteractionSourceProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsPressed(): Boolean {
      val fnPtr = _996687024_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__996687024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_Timestamp(): PerceptionTimestamp? {
      val fnPtr = _996687024_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionTimestamp>()
      val hr = fn.invokeHR(arrayOf(__996687024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionTimestamp>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun TryGetPointerPose(coordinateSystem: SpatialCoordinateSystem?):
        SpatialPointerPose? {
      val fnPtr = _996687024_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SpatialPointerPose>()
      val hr = fn.invokeHR(arrayOf(__996687024_Ptr, marshalToNative(coordinateSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SpatialPointerPose>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialInteractionSourceState_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __996687024_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialInteractionSourceState, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d5c475ef4b6337ec98b99fc652b9d2f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialInteractionSourceState(ptr: Pointer?): WithDefault =
        ISpatialInteractionSourceState_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialInteractionSourceState {
      val address = segment.toRawLongValue()
      return makeISpatialInteractionSourceState(Pointer(address))
    }

    public override fun toNative(obj: ISpatialInteractionSourceState): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__996687024_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialInteractionSourceState):
        Array<ISpatialInteractionSourceState?> = (elements as
        Array<ISpatialInteractionSourceState?>).castToImpl<ISpatialInteractionSourceState,ISpatialInteractionSourceState_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialInteractionSourceState?> =
        arrayOfNulls<ISpatialInteractionSourceState_Impl>(size) as
        Array<ISpatialInteractionSourceState?>
  }
}
