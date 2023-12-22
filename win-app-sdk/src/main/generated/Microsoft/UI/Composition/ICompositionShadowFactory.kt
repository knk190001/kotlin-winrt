package Microsoft.UI.Composition

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

@ABIMarker(ICompositionShadowFactory.ABI::class)
@Signature("{ff27546d-9750-54ae-ab8c-126cbe9158c3}")
@Guid("ff27546d975054aeab8c126cbe9158c3")
@WinRTInterface("ff27546d975054aeab8c126cbe9158c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionShadowFactory.ByReference::class)
public interface ICompositionShadowFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionShadowFactory> {
    public override fun getValue() = ABI.makeICompositionShadowFactory(pointer.getPointer(0))

    public fun setValue(value: ICompositionShadowFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionShadowFactory {
    public val __194364249_Ptr: Pointer?

    public val _194364249_VtblPtr: Pointer?
      get() = __194364249_Ptr?.getPointer(0)
  }

  public class ICompositionShadowFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __194364249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionShadowFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff27546d975054aeab8c126cbe9158c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionShadowFactory(ptr: Pointer?): WithDefault =
        ICompositionShadowFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionShadowFactory {
      val address = segment.toRawLongValue()
      return makeICompositionShadowFactory(Pointer(address))
    }

    public override fun toNative(obj: ICompositionShadowFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__194364249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionShadowFactory):
        Array<ICompositionShadowFactory?> = (elements as
        Array<ICompositionShadowFactory?>).castToImpl<ICompositionShadowFactory,ICompositionShadowFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionShadowFactory?> =
        arrayOfNulls<ICompositionShadowFactory_Impl>(size) as Array<ICompositionShadowFactory?>
  }
}
