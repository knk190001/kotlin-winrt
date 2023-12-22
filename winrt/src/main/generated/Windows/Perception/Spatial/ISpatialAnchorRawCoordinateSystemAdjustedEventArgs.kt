package Windows.Perception.Spatial

import Windows.Foundation.Numerics.Matrix4x4
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

@ABIMarker(ISpatialAnchorRawCoordinateSystemAdjustedEventArgs.ABI::class)
@Signature("{a1e81eb8-56c7-3117-a2e4-81e0fcf28e00}")
@Guid("a1e81eb856c73117a2e481e0fcf28e00")
@WinRTInterface("a1e81eb856c73117a2e481e0fcf28e00")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialAnchorRawCoordinateSystemAdjustedEventArgs.ByReference::class)
public interface ISpatialAnchorRawCoordinateSystemAdjustedEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_OldRawCoordinateSystemToNewRawCoordinateSystemTransform(): Matrix4x4?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialAnchorRawCoordinateSystemAdjustedEventArgs> {
    public override fun getValue() =
        ABI.makeISpatialAnchorRawCoordinateSystemAdjustedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISpatialAnchorRawCoordinateSystemAdjustedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialAnchorRawCoordinateSystemAdjustedEventArgs {
    public val __39238480_Ptr: Pointer?

    public val _39238480_VtblPtr: Pointer?
      get() = __39238480_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OldRawCoordinateSystemToNewRawCoordinateSystemTransform(): Matrix4x4? {
      val fnPtr = _39238480_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix4x4>()
      val hr = fn.invokeHR(arrayOf(__39238480_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix4x4>(result.getValue())
      return resultValue
    }
  }

  public class ISpatialAnchorRawCoordinateSystemAdjustedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __39238480_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialAnchorRawCoordinateSystemAdjustedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1e81eb856c73117a2e481e0fcf28e00")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialAnchorRawCoordinateSystemAdjustedEventArgs(ptr: Pointer?): WithDefault =
        ISpatialAnchorRawCoordinateSystemAdjustedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISpatialAnchorRawCoordinateSystemAdjustedEventArgs {
      val address = segment.toRawLongValue()
      return makeISpatialAnchorRawCoordinateSystemAdjustedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISpatialAnchorRawCoordinateSystemAdjustedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__39238480_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialAnchorRawCoordinateSystemAdjustedEventArgs):
        Array<ISpatialAnchorRawCoordinateSystemAdjustedEventArgs?> = (elements as
        Array<ISpatialAnchorRawCoordinateSystemAdjustedEventArgs?>).castToImpl<ISpatialAnchorRawCoordinateSystemAdjustedEventArgs,ISpatialAnchorRawCoordinateSystemAdjustedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<ISpatialAnchorRawCoordinateSystemAdjustedEventArgs?> =
        arrayOfNulls<ISpatialAnchorRawCoordinateSystemAdjustedEventArgs_Impl>(size) as
        Array<ISpatialAnchorRawCoordinateSystemAdjustedEventArgs?>
  }
}
