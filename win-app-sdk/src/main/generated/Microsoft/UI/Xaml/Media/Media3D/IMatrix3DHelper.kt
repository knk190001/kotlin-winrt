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

@ABIMarker(IMatrix3DHelper.ABI::class)
@Signature("{d2909be1-9c28-5b38-b63c-88e838644533}")
@Guid("d2909be19c285b38b63c88e838644533")
@WinRTInterface("d2909be19c285b38b63c88e838644533")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMatrix3DHelper.ByReference::class)
public interface IMatrix3DHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMatrix3DHelper> {
    public override fun getValue() = ABI.makeIMatrix3DHelper(pointer.getPointer(0))

    public fun setValue(value: IMatrix3DHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMatrix3DHelper {
    public val __590621322_Ptr: Pointer?

    public val _590621322_VtblPtr: Pointer?
      get() = __590621322_Ptr?.getPointer(0)
  }

  public class IMatrix3DHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __590621322_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMatrix3DHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d2909be19c285b38b63c88e838644533")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMatrix3DHelper(ptr: Pointer?): WithDefault = IMatrix3DHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMatrix3DHelper {
      val address = segment.toRawLongValue()
      return makeIMatrix3DHelper(Pointer(address))
    }

    public override fun toNative(obj: IMatrix3DHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__590621322_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMatrix3DHelper): Array<IMatrix3DHelper?> = (elements as
        Array<IMatrix3DHelper?>).castToImpl<IMatrix3DHelper,IMatrix3DHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMatrix3DHelper?> =
        arrayOfNulls<IMatrix3DHelper_Impl>(size) as Array<IMatrix3DHelper?>
  }
}
