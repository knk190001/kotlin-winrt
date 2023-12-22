package Microsoft.UI.Composition.Scenes

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

@ABIMarker(ISceneObjectFactory.ABI::class)
@Signature("{ee797f7d-77db-5c4c-b6f5-c1930fad85c5}")
@Guid("ee797f7d77db5c4cb6f5c1930fad85c5")
@WinRTInterface("ee797f7d77db5c4cb6f5c1930fad85c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISceneObjectFactory.ByReference::class)
public interface ISceneObjectFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISceneObjectFactory> {
    public override fun getValue() = ABI.makeISceneObjectFactory(pointer.getPointer(0))

    public fun setValue(value: ISceneObjectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISceneObjectFactory {
    public val __424214723_Ptr: Pointer?

    public val _424214723_VtblPtr: Pointer?
      get() = __424214723_Ptr?.getPointer(0)
  }

  public class ISceneObjectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __424214723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISceneObjectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee797f7d77db5c4cb6f5c1930fad85c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISceneObjectFactory(ptr: Pointer?): WithDefault = ISceneObjectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISceneObjectFactory {
      val address = segment.toRawLongValue()
      return makeISceneObjectFactory(Pointer(address))
    }

    public override fun toNative(obj: ISceneObjectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__424214723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISceneObjectFactory): Array<ISceneObjectFactory?> =
        (elements as
        Array<ISceneObjectFactory?>).castToImpl<ISceneObjectFactory,ISceneObjectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISceneObjectFactory?> =
        arrayOfNulls<ISceneObjectFactory_Impl>(size) as Array<ISceneObjectFactory?>
  }
}
