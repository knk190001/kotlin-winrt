package Windows.UI.Xaml

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

@ABIMarker(ISizeHelper.ABI::class)
@Signature("{e7225a94-5d03-4a03-ba94-967fc68fcefe}")
@Guid("e7225a945d034a03ba94967fc68fcefe")
@WinRTInterface("e7225a945d034a03ba94967fc68fcefe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISizeHelper.ByReference::class)
public interface ISizeHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISizeHelper> {
    public override fun getValue() = ABI.makeISizeHelper(pointer.getPointer(0))

    public fun setValue(value: ISizeHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISizeHelper {
    public val __1170170143_Ptr: Pointer?

    public val _1170170143_VtblPtr: Pointer?
      get() = __1170170143_Ptr?.getPointer(0)
  }

  public class ISizeHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1170170143_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISizeHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7225a945d034a03ba94967fc68fcefe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISizeHelper(ptr: Pointer?): WithDefault = ISizeHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISizeHelper {
      val address = segment.toRawLongValue()
      return makeISizeHelper(Pointer(address))
    }

    public override fun toNative(obj: ISizeHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1170170143_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISizeHelper): Array<ISizeHelper?> = (elements as
        Array<ISizeHelper?>).castToImpl<ISizeHelper,ISizeHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISizeHelper?> =
        arrayOfNulls<ISizeHelper_Impl>(size) as Array<ISizeHelper?>
  }
}
