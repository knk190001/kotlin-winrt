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

@ABIMarker(IRepeatBehaviorHelper.ABI::class)
@Signature("{4643f139-ffef-5c6a-8de6-142b41cd51a5}")
@Guid("4643f139ffef5c6a8de6142b41cd51a5")
@WinRTInterface("4643f139ffef5c6a8de6142b41cd51a5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRepeatBehaviorHelper.ByReference::class)
public interface IRepeatBehaviorHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRepeatBehaviorHelper> {
    public override fun getValue() = ABI.makeIRepeatBehaviorHelper(pointer.getPointer(0))

    public fun setValue(value: IRepeatBehaviorHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRepeatBehaviorHelper {
    public val __1936385642_Ptr: Pointer?

    public val _1936385642_VtblPtr: Pointer?
      get() = __1936385642_Ptr?.getPointer(0)
  }

  public class IRepeatBehaviorHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1936385642_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRepeatBehaviorHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4643f139ffef5c6a8de6142b41cd51a5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRepeatBehaviorHelper(ptr: Pointer?): WithDefault =
        IRepeatBehaviorHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRepeatBehaviorHelper {
      val address = segment.toRawLongValue()
      return makeIRepeatBehaviorHelper(Pointer(address))
    }

    public override fun toNative(obj: IRepeatBehaviorHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1936385642_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRepeatBehaviorHelper): Array<IRepeatBehaviorHelper?> =
        (elements as
        Array<IRepeatBehaviorHelper?>).castToImpl<IRepeatBehaviorHelper,IRepeatBehaviorHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRepeatBehaviorHelper?> =
        arrayOfNulls<IRepeatBehaviorHelper_Impl>(size) as Array<IRepeatBehaviorHelper?>
  }
}
