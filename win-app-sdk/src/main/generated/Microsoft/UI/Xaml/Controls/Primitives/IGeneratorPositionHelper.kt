package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IGeneratorPositionHelper.ABI::class)
@Signature("{872a9f8f-0e0e-5089-92a9-dbced99ca86d}")
@Guid("872a9f8f0e0e508992a9dbced99ca86d")
@WinRTInterface("872a9f8f0e0e508992a9dbced99ca86d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeneratorPositionHelper.ByReference::class)
public interface IGeneratorPositionHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeneratorPositionHelper> {
    public override fun getValue() = ABI.makeIGeneratorPositionHelper(pointer.getPointer(0))

    public fun setValue(value: IGeneratorPositionHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeneratorPositionHelper {
    public val __369217657_Ptr: Pointer?

    public val _369217657_VtblPtr: Pointer?
      get() = __369217657_Ptr?.getPointer(0)
  }

  public class IGeneratorPositionHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __369217657_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeneratorPositionHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("872a9f8f0e0e508992a9dbced99ca86d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeneratorPositionHelper(ptr: Pointer?): WithDefault =
        IGeneratorPositionHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeneratorPositionHelper {
      val address = segment.toRawLongValue()
      return makeIGeneratorPositionHelper(Pointer(address))
    }

    public override fun toNative(obj: IGeneratorPositionHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__369217657_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeneratorPositionHelper):
        Array<IGeneratorPositionHelper?> = (elements as
        Array<IGeneratorPositionHelper?>).castToImpl<IGeneratorPositionHelper,IGeneratorPositionHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeneratorPositionHelper?> =
        arrayOfNulls<IGeneratorPositionHelper_Impl>(size) as Array<IGeneratorPositionHelper?>
  }
}
