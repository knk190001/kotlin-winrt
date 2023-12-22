package Windows.Foundation

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWwwFormUrlDecoderRuntimeClassFactory.ABI::class)
@Signature("{5b8c6b3d-24ae-41b5-a1bf-f0c3d544845b}")
@Guid("5b8c6b3d24ae41b5a1bff0c3d544845b")
@WinRTInterface("5b8c6b3d24ae41b5a1bff0c3d544845b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWwwFormUrlDecoderRuntimeClassFactory.ByReference::class)
public interface IWwwFormUrlDecoderRuntimeClassFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWwwFormUrlDecoder(query: String?): WwwFormUrlDecoder?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWwwFormUrlDecoderRuntimeClassFactory> {
    public override fun getValue() =
        ABI.makeIWwwFormUrlDecoderRuntimeClassFactory(pointer.getPointer(0))

    public fun setValue(value: IWwwFormUrlDecoderRuntimeClassFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWwwFormUrlDecoderRuntimeClassFactory {
    public val __608256379_Ptr: Pointer?

    public val _608256379_VtblPtr: Pointer?
      get() = __608256379_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWwwFormUrlDecoder(query: String?): WwwFormUrlDecoder? {
      val fnPtr = _608256379_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WwwFormUrlDecoder>()
      val hr = fn.invokeHR(arrayOf(__608256379_Ptr, marshalToNative(query), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WwwFormUrlDecoder>(result.getValue())
      return resultValue
    }
  }

  public class IWwwFormUrlDecoderRuntimeClassFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __608256379_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWwwFormUrlDecoderRuntimeClassFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b8c6b3d24ae41b5a1bff0c3d544845b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWwwFormUrlDecoderRuntimeClassFactory(ptr: Pointer?): WithDefault =
        IWwwFormUrlDecoderRuntimeClassFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWwwFormUrlDecoderRuntimeClassFactory {
      val address = segment.toRawLongValue()
      return makeIWwwFormUrlDecoderRuntimeClassFactory(Pointer(address))
    }

    public override fun toNative(obj: IWwwFormUrlDecoderRuntimeClassFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__608256379_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWwwFormUrlDecoderRuntimeClassFactory):
        Array<IWwwFormUrlDecoderRuntimeClassFactory?> = (elements as
        Array<IWwwFormUrlDecoderRuntimeClassFactory?>).castToImpl<IWwwFormUrlDecoderRuntimeClassFactory,IWwwFormUrlDecoderRuntimeClassFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWwwFormUrlDecoderRuntimeClassFactory?> =
        arrayOfNulls<IWwwFormUrlDecoderRuntimeClassFactory_Impl>(size) as
        Array<IWwwFormUrlDecoderRuntimeClassFactory?>
  }
}
