package Windows.UI.Composition

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

@ABIMarker(ICompositionLightFactory.ABI::class)
@Signature("{069cf306-da3c-4b44-838a-5e03d51ace55}")
@Guid("069cf306da3c4b44838a5e03d51ace55")
@WinRTInterface("069cf306da3c4b44838a5e03d51ace55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionLightFactory.ByReference::class)
public interface ICompositionLightFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionLightFactory> {
    public override fun getValue() = ABI.makeICompositionLightFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionLightFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionLightFactory {
    public val __167095696_Ptr: Pointer?

    public val _167095696_VtblPtr: Pointer?
      get() = __167095696_Ptr?.getPointer(0)
  }

  public class ICompositionLightFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __167095696_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionLightFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("069cf306da3c4b44838a5e03d51ace55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionLightFactory(ptr: Pointer?): WithDefault =
        ICompositionLightFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionLightFactory {
      val address = segment.toRawLongValue()
      return makeICompositionLightFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionLightFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__167095696_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionLightFactory):
        Array<ICompositionLightFactory?> = (elements as
        Array<ICompositionLightFactory?>).castToImpl<ICompositionLightFactory,ICompositionLightFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionLightFactory?> =
        arrayOfNulls<ICompositionLightFactory_Impl>(size) as Array<ICompositionLightFactory?>
  }
}
