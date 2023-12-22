package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapModel3D.ABI::class)
@Signature("{f8c541a1-ca27-4968-a2bf-9c20f06a0468}")
@Guid("f8c541a1ca274968a2bf9c20f06a0468")
@WinRTInterface("f8c541a1ca274968a2bf9c20f06a0468")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapModel3D.ByReference::class)
public interface IMapModel3D : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapModel3D> {
    public override fun getValue() = ABI.makeIMapModel3D(pointer.getPointer(0))

    public fun setValue(value: IMapModel3D_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapModel3D {
    public val __775951761_Ptr: Pointer?

    public val _775951761_VtblPtr: Pointer?
      get() = __775951761_Ptr?.getPointer(0)
  }

  public class IMapModel3D_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __775951761_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapModel3D, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f8c541a1ca274968a2bf9c20f06a0468")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapModel3D(ptr: Pointer?): WithDefault = IMapModel3D_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapModel3D {
      val address = segment.toRawLongValue()
      return makeIMapModel3D(Pointer(address))
    }

    public override fun toNative(obj: IMapModel3D): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__775951761_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapModel3D): Array<IMapModel3D?> = (elements as
        Array<IMapModel3D?>).castToImpl<IMapModel3D,IMapModel3D_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapModel3D?> =
        arrayOfNulls<IMapModel3D_Impl>(size) as Array<IMapModel3D?>
  }
}
