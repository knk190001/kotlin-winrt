package Windows.Perception.People

import Windows.Foundation.IReference
import Windows.Perception.PerceptionTimestamp
import Windows.Perception.Spatial.SpatialRay
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

@ABIMarker(IEyesPose.ABI::class)
@Signature("{682a9b23-8a1e-5b86-a060-906ffacb62a4}")
@Guid("682a9b238a1e5b86a060906ffacb62a4")
@WinRTInterface("682a9b238a1e5b86a060906ffacb62a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEyesPose.ByReference::class)
public interface IEyesPose : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsCalibrationValid(): Boolean

  @InterfaceMethod(1)
  public fun get_Gaze(): IReference<SpatialRay?>?

  @InterfaceMethod(2)
  public fun get_UpdateTimestamp(): PerceptionTimestamp?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IEyesPose> {
    public override fun getValue() = ABI.makeIEyesPose(pointer.getPointer(0))

    public fun setValue(value: IEyesPose_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEyesPose {
    public val __696646895_Ptr: Pointer?

    public val _696646895_VtblPtr: Pointer?
      get() = __696646895_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsCalibrationValid(): Boolean {
      val fnPtr = _696646895_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__696646895_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Gaze(): IReference<SpatialRay?>? {
      val fnPtr = _696646895_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<SpatialRay?>>()
      val hr = fn.invokeHR(arrayOf(__696646895_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<SpatialRay?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_UpdateTimestamp(): PerceptionTimestamp? {
      val fnPtr = _696646895_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionTimestamp>()
      val hr = fn.invokeHR(arrayOf(__696646895_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionTimestamp>(result.getValue())
      return resultValue
    }
  }

  public class IEyesPose_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __696646895_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEyesPose, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("682a9b238a1e5b86a060906ffacb62a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEyesPose(ptr: Pointer?): WithDefault = IEyesPose_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEyesPose {
      val address = segment.toRawLongValue()
      return makeIEyesPose(Pointer(address))
    }

    public override fun toNative(obj: IEyesPose): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__696646895_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEyesPose): Array<IEyesPose?> = (elements as
        Array<IEyesPose?>).castToImpl<IEyesPose,IEyesPose_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEyesPose?> = arrayOfNulls<IEyesPose_Impl>(size)
        as Array<IEyesPose?>
  }
}
