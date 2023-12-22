package Windows.Security.Cryptography.Certificates

import Windows.Storage.Streams.IBuffer
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICmsDetachedSignatureFactory.ABI::class)
@Signature("{c4ab3503-ae7f-4387-ad19-00f150e48ebb}")
@Guid("c4ab3503ae7f4387ad1900f150e48ebb")
@WinRTInterface("c4ab3503ae7f4387ad1900f150e48ebb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICmsDetachedSignatureFactory.ByReference::class)
public interface ICmsDetachedSignatureFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCmsDetachedSignature(inputBlob: IBuffer?): CmsDetachedSignature?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICmsDetachedSignatureFactory> {
    public override fun getValue() = ABI.makeICmsDetachedSignatureFactory(pointer.getPointer(0))

    public fun setValue(value: ICmsDetachedSignatureFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICmsDetachedSignatureFactory {
    public val __1107818623_Ptr: Pointer?

    public val _1107818623_VtblPtr: Pointer?
      get() = __1107818623_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateCmsDetachedSignature(inputBlob: IBuffer?): CmsDetachedSignature? {
      val fnPtr = _1107818623_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CmsDetachedSignature>()
      val hr = fn.invokeHR(arrayOf(__1107818623_Ptr, marshalToNative(inputBlob), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CmsDetachedSignature>(result.getValue())
      return resultValue
    }
  }

  public class ICmsDetachedSignatureFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1107818623_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICmsDetachedSignatureFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4ab3503ae7f4387ad1900f150e48ebb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICmsDetachedSignatureFactory(ptr: Pointer?): WithDefault =
        ICmsDetachedSignatureFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICmsDetachedSignatureFactory {
      val address = segment.toRawLongValue()
      return makeICmsDetachedSignatureFactory(Pointer(address))
    }

    public override fun toNative(obj: ICmsDetachedSignatureFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1107818623_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICmsDetachedSignatureFactory):
        Array<ICmsDetachedSignatureFactory?> = (elements as
        Array<ICmsDetachedSignatureFactory?>).castToImpl<ICmsDetachedSignatureFactory,ICmsDetachedSignatureFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICmsDetachedSignatureFactory?> =
        arrayOfNulls<ICmsDetachedSignatureFactory_Impl>(size) as
        Array<ICmsDetachedSignatureFactory?>
  }
}
