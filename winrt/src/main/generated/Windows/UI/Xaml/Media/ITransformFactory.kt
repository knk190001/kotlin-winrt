package Windows.UI.Xaml.Media

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

@ABIMarker(ITransformFactory.ABI::class)
@Signature("{1a955a66-7cf4-4320-b416-6181192fcc6d}")
@Guid("1a955a667cf44320b4166181192fcc6d")
@WinRTInterface("1a955a667cf44320b4166181192fcc6d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITransformFactory.ByReference::class)
public interface ITransformFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITransformFactory> {
    public override fun getValue() = ABI.makeITransformFactory(pointer.getPointer(0))

    public fun setValue(value: ITransformFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITransformFactory {
    public val __1092647430_Ptr: Pointer?

    public val _1092647430_VtblPtr: Pointer?
      get() = __1092647430_Ptr?.getPointer(0)
  }

  public class ITransformFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1092647430_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITransformFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a955a667cf44320b4166181192fcc6d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITransformFactory(ptr: Pointer?): WithDefault = ITransformFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITransformFactory {
      val address = segment.toRawLongValue()
      return makeITransformFactory(Pointer(address))
    }

    public override fun toNative(obj: ITransformFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1092647430_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITransformFactory): Array<ITransformFactory?> = (elements
        as Array<ITransformFactory?>).castToImpl<ITransformFactory,ITransformFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITransformFactory?> =
        arrayOfNulls<ITransformFactory_Impl>(size) as Array<ITransformFactory?>
  }
}
