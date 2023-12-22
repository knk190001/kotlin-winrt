package Microsoft.UI.Input

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

@ABIMarker(IInputObjectFactory.ABI::class)
@Signature("{f7786bc2-b0b8-5961-9a57-ae199d452106}")
@Guid("f7786bc2b0b859619a57ae199d452106")
@WinRTInterface("f7786bc2b0b859619a57ae199d452106")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputObjectFactory.ByReference::class)
public interface IInputObjectFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputObjectFactory> {
    public override fun getValue() = ABI.makeIInputObjectFactory(pointer.getPointer(0))

    public fun setValue(value: IInputObjectFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputObjectFactory {
    public val __626332070_Ptr: Pointer?

    public val _626332070_VtblPtr: Pointer?
      get() = __626332070_Ptr?.getPointer(0)
  }

  public class IInputObjectFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __626332070_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputObjectFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7786bc2b0b859619a57ae199d452106")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputObjectFactory(ptr: Pointer?): WithDefault = IInputObjectFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputObjectFactory {
      val address = segment.toRawLongValue()
      return makeIInputObjectFactory(Pointer(address))
    }

    public override fun toNative(obj: IInputObjectFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__626332070_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputObjectFactory): Array<IInputObjectFactory?> =
        (elements as
        Array<IInputObjectFactory?>).castToImpl<IInputObjectFactory,IInputObjectFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputObjectFactory?> =
        arrayOfNulls<IInputObjectFactory_Impl>(size) as Array<IInputObjectFactory?>
  }
}
