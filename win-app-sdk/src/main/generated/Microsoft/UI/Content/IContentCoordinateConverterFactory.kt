package Microsoft.UI.Content

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

@ABIMarker(IContentCoordinateConverterFactory.ABI::class)
@Signature("{a4b216ee-0e26-56bd-9209-a75cf9d80f27}")
@Guid("a4b216ee0e2656bd9209a75cf9d80f27")
@WinRTInterface("a4b216ee0e2656bd9209a75cf9d80f27")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentCoordinateConverterFactory.ByReference::class)
public interface IContentCoordinateConverterFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentCoordinateConverterFactory> {
    public override fun getValue() =
        ABI.makeIContentCoordinateConverterFactory(pointer.getPointer(0))

    public fun setValue(value: IContentCoordinateConverterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentCoordinateConverterFactory {
    public val __702630225_Ptr: Pointer?

    public val _702630225_VtblPtr: Pointer?
      get() = __702630225_Ptr?.getPointer(0)
  }

  public class IContentCoordinateConverterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __702630225_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentCoordinateConverterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4b216ee0e2656bd9209a75cf9d80f27")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentCoordinateConverterFactory(ptr: Pointer?): WithDefault =
        IContentCoordinateConverterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentCoordinateConverterFactory {
      val address = segment.toRawLongValue()
      return makeIContentCoordinateConverterFactory(Pointer(address))
    }

    public override fun toNative(obj: IContentCoordinateConverterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__702630225_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentCoordinateConverterFactory):
        Array<IContentCoordinateConverterFactory?> = (elements as
        Array<IContentCoordinateConverterFactory?>).castToImpl<IContentCoordinateConverterFactory,IContentCoordinateConverterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentCoordinateConverterFactory?> =
        arrayOfNulls<IContentCoordinateConverterFactory_Impl>(size) as
        Array<IContentCoordinateConverterFactory?>
  }
}
