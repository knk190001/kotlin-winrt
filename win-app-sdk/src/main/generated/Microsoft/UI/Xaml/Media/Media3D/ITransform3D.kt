package Microsoft.UI.Xaml.Media.Media3D

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

@ABIMarker(ITransform3D.ABI::class)
@Signature("{afea4941-2e49-533c-9f8f-2c126ef9893a}")
@Guid("afea49412e49533c9f8f2c126ef9893a")
@WinRTInterface("afea49412e49533c9f8f2c126ef9893a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransform3D.ByReference::class)
public interface ITransform3D : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITransform3D> {
    public override fun getValue() = ABI.makeITransform3D(pointer.getPointer(0))

    public fun setValue(value: ITransform3D_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransform3D {
    public val __2002731219_Ptr: Pointer?

    public val _2002731219_VtblPtr: Pointer?
      get() = __2002731219_Ptr?.getPointer(0)
  }

  public class ITransform3D_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2002731219_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransform3D, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("afea49412e49533c9f8f2c126ef9893a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransform3D(ptr: Pointer?): WithDefault = ITransform3D_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransform3D {
      val address = segment.toRawLongValue()
      return makeITransform3D(Pointer(address))
    }

    public override fun toNative(obj: ITransform3D): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2002731219_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransform3D): Array<ITransform3D?> = (elements as
        Array<ITransform3D?>).castToImpl<ITransform3D,ITransform3D_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransform3D?> =
        arrayOfNulls<ITransform3D_Impl>(size) as Array<ITransform3D?>
  }
}
