package Windows.UI.Input.Spatial

import Windows.Perception.People.EyesPose
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

@ABIMarker(ISpatialPointerPose3.ABI::class)
@Signature("{6342f3f0-ec49-5b4b-b8d1-d16cbb16be84}")
@Guid("6342f3f0ec495b4bb8d1d16cbb16be84")
@WinRTInterface("6342f3f0ec495b4bb8d1d16cbb16be84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialPointerPose3.ByReference::class)
public interface ISpatialPointerPose3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Eyes(): EyesPose?

  @InterfaceMethod(1)
  public fun get_IsHeadCapturedBySystem(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialPointerPose3> {
    public override fun getValue() = ABI.makeISpatialPointerPose3(pointer.getPointer(0))

    public fun setValue(value: ISpatialPointerPose3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialPointerPose3 {
    public val __609233937_Ptr: Pointer?

    public val _609233937_VtblPtr: Pointer?
      get() = __609233937_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Eyes(): EyesPose? {
      val fnPtr = _609233937_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EyesPose>()
      val hr = fn.invokeHR(arrayOf(__609233937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EyesPose>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsHeadCapturedBySystem(): Boolean {
      val fnPtr = _609233937_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__609233937_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISpatialPointerPose3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __609233937_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialPointerPose3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6342f3f0ec495b4bb8d1d16cbb16be84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialPointerPose3(ptr: Pointer?): WithDefault = ISpatialPointerPose3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialPointerPose3 {
      val address = segment.toRawLongValue()
      return makeISpatialPointerPose3(Pointer(address))
    }

    public override fun toNative(obj: ISpatialPointerPose3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__609233937_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialPointerPose3): Array<ISpatialPointerPose3?> =
        (elements as
        Array<ISpatialPointerPose3?>).castToImpl<ISpatialPointerPose3,ISpatialPointerPose3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialPointerPose3?> =
        arrayOfNulls<ISpatialPointerPose3_Impl>(size) as Array<ISpatialPointerPose3?>
  }
}
