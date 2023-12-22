package Windows.Perception.Spatial

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

@ABIMarker(ISpatialLocation2.ABI::class)
@Signature("{117f2416-38a7-4a18-b404-ab8fabe1d78b}")
@Guid("117f241638a74a18b404ab8fabe1d78b")
@WinRTInterface("117f241638a74a18b404ab8fabe1d78b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialLocation2.ByReference::class)
public interface ISpatialLocation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AbsoluteAngularVelocityAxisAngle(): Vector3?

  @InterfaceMethod(1)
  public fun get_AbsoluteAngularAccelerationAxisAngle(): Vector3?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialLocation2> {
    public override fun getValue() = ABI.makeISpatialLocation2(pointer.getPointer(0))

    public fun setValue(value: ISpatialLocation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialLocation2 {
    public val __1983916164_Ptr: Pointer?

    public val _1983916164_VtblPtr: Pointer?
      get() = __1983916164_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AbsoluteAngularVelocityAxisAngle(): Vector3? {
      val fnPtr = _1983916164_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1983916164_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AbsoluteAngularAccelerationAxisAngle(): Vector3? {
      val fnPtr = _1983916164_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector3>()
      val hr = fn.invokeHR(arrayOf(__1983916164_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector3>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialLocation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1983916164_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialLocation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("117f241638a74a18b404ab8fabe1d78b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialLocation2(ptr: Pointer?): WithDefault = ISpatialLocation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialLocation2 {
      val address = segment.toRawLongValue()
      return makeISpatialLocation2(Pointer(address))
    }

    public override fun toNative(obj: ISpatialLocation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1983916164_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialLocation2): Array<ISpatialLocation2?> = (elements
        as Array<ISpatialLocation2?>).castToImpl<ISpatialLocation2,ISpatialLocation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialLocation2?> =
        arrayOfNulls<ISpatialLocation2_Impl>(size) as Array<ISpatialLocation2?>
  }
}
