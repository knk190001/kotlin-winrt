package Windows.Security.Cryptography.Core

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISymmetricKeyAlgorithmProvider.ABI::class)
@Signature("{3d7e4a33-3bd0-4902-8ac8-470d50d21376}")
@Guid("3d7e4a333bd049028ac8470d50d21376")
@WinRTInterface("3d7e4a333bd049028ac8470d50d21376")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISymmetricKeyAlgorithmProvider.ByReference::class)
public interface ISymmetricKeyAlgorithmProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlgorithmName(): String?

  @InterfaceMethod(1)
  public fun get_BlockLength(): WinDef.UINT

  @InterfaceMethod(2)
  public fun CreateSymmetricKey(keyMaterial: IBuffer?): CryptographicKey?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISymmetricKeyAlgorithmProvider> {
    public override fun getValue() = ABI.makeISymmetricKeyAlgorithmProvider(pointer.getPointer(0))

    public fun setValue(value: ISymmetricKeyAlgorithmProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISymmetricKeyAlgorithmProvider {
    public val __1644516141_Ptr: Pointer?

    public val _1644516141_VtblPtr: Pointer?
      get() = __1644516141_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlgorithmName(): String? {
      val fnPtr = _1644516141_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1644516141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_BlockLength(): WinDef.UINT {
      val fnPtr = _1644516141_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1644516141_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun CreateSymmetricKey(keyMaterial: IBuffer?): CryptographicKey? {
      val fnPtr = _1644516141_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CryptographicKey>()
      val hr = fn.invokeHR(arrayOf(__1644516141_Ptr, marshalToNative(keyMaterial), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CryptographicKey>(result.getValue())
      return resultValue
    }
  }

  public class ISymmetricKeyAlgorithmProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1644516141_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISymmetricKeyAlgorithmProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3d7e4a333bd049028ac8470d50d21376")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISymmetricKeyAlgorithmProvider(ptr: Pointer?): WithDefault =
        ISymmetricKeyAlgorithmProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISymmetricKeyAlgorithmProvider {
      val address = segment.toRawLongValue()
      return makeISymmetricKeyAlgorithmProvider(Pointer(address))
    }

    public override fun toNative(obj: ISymmetricKeyAlgorithmProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1644516141_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISymmetricKeyAlgorithmProvider):
        Array<ISymmetricKeyAlgorithmProvider?> = (elements as
        Array<ISymmetricKeyAlgorithmProvider?>).castToImpl<ISymmetricKeyAlgorithmProvider,ISymmetricKeyAlgorithmProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISymmetricKeyAlgorithmProvider?> =
        arrayOfNulls<ISymmetricKeyAlgorithmProvider_Impl>(size) as
        Array<ISymmetricKeyAlgorithmProvider?>
  }
}
