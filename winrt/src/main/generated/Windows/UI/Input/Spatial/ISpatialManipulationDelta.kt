package Windows.UI.Input.Spatial

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialManipulationDelta.ABI::class)
@Signature("{a7ec967a-d123-3a81-a15b-992923dcbe91}")
@Guid("a7ec967ad1233a81a15b992923dcbe91")
@WinRTInterface("a7ec967ad1233a81a15b992923dcbe91")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialManipulationDelta.ByReference::class)
public interface ISpatialManipulationDelta : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Translation(): Vector3?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialManipulationDelta> {
    public override fun getValue() = ABI.makeISpatialManipulationDelta(pointer.getPointer(0))

    public fun setValue(value: ISpatialManipulationDelta_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialManipulationDelta {
    public val __480321295_Ptr: Pointer?

    public val _480321295_VtblPtr: Pointer?
      get() = __480321295_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Translation(): Vector3? {
      val fnPtr = _480321295_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__480321295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialManipulationDelta_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __480321295_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialManipulationDelta, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a7ec967ad1233a81a15b992923dcbe91")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialManipulationDelta(ptr: Pointer?): WithDefault =
        ISpatialManipulationDelta_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialManipulationDelta {
      val address = segment.toRawLongValue()
      return makeISpatialManipulationDelta(Pointer(address))
    }

    public override fun toNative(obj: ISpatialManipulationDelta): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__480321295_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialManipulationDelta):
        Array<ISpatialManipulationDelta?> = (elements as
        Array<ISpatialManipulationDelta?>).castToImpl<ISpatialManipulationDelta,ISpatialManipulationDelta_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialManipulationDelta?> =
        arrayOfNulls<ISpatialManipulationDelta_Impl>(size) as Array<ISpatialManipulationDelta?>
  }
}
