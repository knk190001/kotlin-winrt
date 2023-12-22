package Windows.Graphics

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGeometrySource2D.ABI::class)
@Signature("{caff7902-670c-4181-a624-da977203b845}")
@Guid("caff7902670c4181a624da977203b845")
@WinRTInterface("caff7902670c4181a624da977203b845")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeometrySource2D.ByReference::class)
public interface IGeometrySource2D : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeometrySource2D> {
    public override fun getValue() = ABI.makeIGeometrySource2D(pointer.getPointer(0))

    public fun setValue(value: IGeometrySource2D_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeometrySource2D {
    public val __397532782_Ptr: Pointer?

    public val _397532782_VtblPtr: Pointer?
      get() = __397532782_Ptr?.getPointer(0)
  }

  public class IGeometrySource2D_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __397532782_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeometrySource2D, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("caff7902670c4181a624da977203b845")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeometrySource2D(ptr: Pointer?): WithDefault = IGeometrySource2D_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeometrySource2D {
      val address = segment.toRawLongValue()
      return makeIGeometrySource2D(Pointer(address))
    }

    public override fun toNative(obj: IGeometrySource2D): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__397532782_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeometrySource2D): Array<IGeometrySource2D?> = (elements
        as Array<IGeometrySource2D?>).castToImpl<IGeometrySource2D,IGeometrySource2D_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeometrySource2D?> =
        arrayOfNulls<IGeometrySource2D_Impl>(size) as Array<IGeometrySource2D?>
  }
}
