package Windows.UI.Input.Spatial

import Windows.Perception.People.HeadPose
import Windows.Perception.PerceptionTimestamp
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialPointerPose.ABI::class)
@Signature("{6953a42e-c17e-357d-97a1-7269d0ed2d10}")
@Guid("6953a42ec17e357d97a17269d0ed2d10")
@WinRTInterface("6953a42ec17e357d97a17269d0ed2d10")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialPointerPose.ByReference::class)
public interface ISpatialPointerPose : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): PerceptionTimestamp?

  @InterfaceMethod(1)
  public fun get_Head(): HeadPose?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialPointerPose> {
    public override fun getValue() = ABI.makeISpatialPointerPose(pointer.getPointer(0))

    public fun setValue(value: ISpatialPointerPose_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialPointerPose {
    public val __19652706_Ptr: Pointer?

    public val _19652706_VtblPtr: Pointer?
      get() = __19652706_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): PerceptionTimestamp? {
      val fnPtr = _19652706_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionTimestamp>()
      val hr = fn.invokeHR(arrayOf(__19652706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionTimestamp>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Head(): HeadPose? {
      val fnPtr = _19652706_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HeadPose>()
      val hr = fn.invokeHR(arrayOf(__19652706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HeadPose>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialPointerPose_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __19652706_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialPointerPose, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6953a42ec17e357d97a17269d0ed2d10")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialPointerPose(ptr: Pointer?): WithDefault = ISpatialPointerPose_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialPointerPose {
      val address = segment.toRawLongValue()
      return makeISpatialPointerPose(Pointer(address))
    }

    public override fun toNative(obj: ISpatialPointerPose): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__19652706_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialPointerPose): Array<ISpatialPointerPose?> =
        (elements as
        Array<ISpatialPointerPose?>).castToImpl<ISpatialPointerPose,ISpatialPointerPose_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialPointerPose?> =
        arrayOfNulls<ISpatialPointerPose_Impl>(size) as Array<ISpatialPointerPose?>
  }
}
