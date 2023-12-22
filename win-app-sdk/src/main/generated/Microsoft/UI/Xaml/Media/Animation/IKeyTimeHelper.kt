package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IKeyTimeHelper.ABI::class)
@Signature("{e354da44-1f24-59c6-bc5b-d6b1ba267e9c}")
@Guid("e354da441f2459c6bc5bd6b1ba267e9c")
@WinRTInterface("e354da441f2459c6bc5bd6b1ba267e9c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyTimeHelper.ByReference::class)
public interface IKeyTimeHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IKeyTimeHelper>
      {
    public override fun getValue() = ABI.makeIKeyTimeHelper(pointer.getPointer(0))

    public fun setValue(value: IKeyTimeHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyTimeHelper {
    public val __375704961_Ptr: Pointer?

    public val _375704961_VtblPtr: Pointer?
      get() = __375704961_Ptr?.getPointer(0)
  }

  public class IKeyTimeHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __375704961_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyTimeHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e354da441f2459c6bc5bd6b1ba267e9c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyTimeHelper(ptr: Pointer?): WithDefault = IKeyTimeHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyTimeHelper {
      val address = segment.toRawLongValue()
      return makeIKeyTimeHelper(Pointer(address))
    }

    public override fun toNative(obj: IKeyTimeHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__375704961_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyTimeHelper): Array<IKeyTimeHelper?> = (elements as
        Array<IKeyTimeHelper?>).castToImpl<IKeyTimeHelper,IKeyTimeHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyTimeHelper?> =
        arrayOfNulls<IKeyTimeHelper_Impl>(size) as Array<IKeyTimeHelper?>
  }
}
