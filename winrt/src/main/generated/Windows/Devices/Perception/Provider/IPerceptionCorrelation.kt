package Windows.Devices.Perception.Provider

import Windows.Foundation.Numerics.Quaternion
import Windows.Foundation.Numerics.Vector3
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPerceptionCorrelation.ABI::class)
@Signature("{b4131a82-dff5-4047-8a19-3b4d805f7176}")
@Guid("b4131a82dff540478a193b4d805f7176")
@WinRTInterface("b4131a82dff540478a193b4d805f7176")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionCorrelation.ByReference::class)
public interface IPerceptionCorrelation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetId(): String?

  @InterfaceMethod(1)
  public fun get_Position(): Vector3?

  @InterfaceMethod(2)
  public fun get_Orientation(): Quaternion?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionCorrelation> {
    public override fun getValue() = ABI.makeIPerceptionCorrelation(pointer.getPointer(0))

    public fun setValue(value: IPerceptionCorrelation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionCorrelation {
    public val __13459890_Ptr: Pointer?

    public val _13459890_VtblPtr: Pointer?
      get() = __13459890_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetId(): String? {
      val fnPtr = _13459890_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__13459890_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Position(): Vector3? {
      val fnPtr = _13459890_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__13459890_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Orientation(): Quaternion? {
      val fnPtr = _13459890_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Quaternion>()
      val hr = fn.invokeHR(arrayOf(__13459890_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Quaternion>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionCorrelation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __13459890_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionCorrelation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4131a82dff540478a193b4d805f7176")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionCorrelation(ptr: Pointer?): WithDefault =
        IPerceptionCorrelation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionCorrelation {
      val address = segment.toRawLongValue()
      return makeIPerceptionCorrelation(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionCorrelation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__13459890_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionCorrelation): Array<IPerceptionCorrelation?> =
        (elements as
        Array<IPerceptionCorrelation?>).castToImpl<IPerceptionCorrelation,IPerceptionCorrelation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionCorrelation?> =
        arrayOfNulls<IPerceptionCorrelation_Impl>(size) as Array<IPerceptionCorrelation?>
  }
}
