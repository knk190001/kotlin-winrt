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

@ABIMarker(ICmsAttachedSignatureFactory.ABI::class)
@Signature("{d0c8fc15-f757-4c64-a362-52cc1c77cffb}")
@Guid("d0c8fc15f7574c64a36252cc1c77cffb")
@WinRTInterface("d0c8fc15f7574c64a36252cc1c77cffb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICmsAttachedSignatureFactory.ByReference::class)
public interface ICmsAttachedSignatureFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateCmsAttachedSignature(inputBlob: IBuffer?): CmsAttachedSignature?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICmsAttachedSignatureFactory> {
    public override fun getValue() = ABI.makeICmsAttachedSignatureFactory(pointer.getPointer(0))

    public fun setValue(value: ICmsAttachedSignatureFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICmsAttachedSignatureFactory {
    public val __1494530383_Ptr: Pointer?

    public val _1494530383_VtblPtr: Pointer?
      get() = __1494530383_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateCmsAttachedSignature(inputBlob: IBuffer?): CmsAttachedSignature? {
      val fnPtr = _1494530383_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CmsAttachedSignature>()
      val hr = fn.invokeHR(arrayOf(__1494530383_Ptr, marshalToNative(inputBlob), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CmsAttachedSignature>(result.getValue())
      return resultValue
    }
  }

  public class ICmsAttachedSignatureFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1494530383_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICmsAttachedSignatureFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d0c8fc15f7574c64a36252cc1c77cffb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICmsAttachedSignatureFactory(ptr: Pointer?): WithDefault =
        ICmsAttachedSignatureFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICmsAttachedSignatureFactory {
      val address = segment.toRawLongValue()
      return makeICmsAttachedSignatureFactory(Pointer(address))
    }

    public override fun toNative(obj: ICmsAttachedSignatureFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1494530383_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICmsAttachedSignatureFactory):
        Array<ICmsAttachedSignatureFactory?> = (elements as
        Array<ICmsAttachedSignatureFactory?>).castToImpl<ICmsAttachedSignatureFactory,ICmsAttachedSignatureFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICmsAttachedSignatureFactory?> =
        arrayOfNulls<ICmsAttachedSignatureFactory_Impl>(size) as
        Array<ICmsAttachedSignatureFactory?>
  }
}
