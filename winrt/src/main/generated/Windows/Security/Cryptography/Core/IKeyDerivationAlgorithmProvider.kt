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

@ABIMarker(IKeyDerivationAlgorithmProvider.ABI::class)
@Signature("{e1fba83b-4671-43b7-9158-763aaa98b6bf}")
@Guid("e1fba83b467143b79158763aaa98b6bf")
@WinRTInterface("e1fba83b467143b79158763aaa98b6bf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyDerivationAlgorithmProvider.ByReference::class)
public interface IKeyDerivationAlgorithmProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlgorithmName(): String?

  @InterfaceMethod(1)
  public fun CreateKey(keyMaterial: IBuffer?): CryptographicKey?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyDerivationAlgorithmProvider> {
    public override fun getValue() = ABI.makeIKeyDerivationAlgorithmProvider(pointer.getPointer(0))

    public fun setValue(value: IKeyDerivationAlgorithmProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyDerivationAlgorithmProvider {
    public val __212709931_Ptr: Pointer?

    public val _212709931_VtblPtr: Pointer?
      get() = __212709931_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlgorithmName(): String? {
      val fnPtr = _212709931_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__212709931_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateKey(keyMaterial: IBuffer?): CryptographicKey? {
      val fnPtr = _212709931_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CryptographicKey>()
      val hr = fn.invokeHR(arrayOf(__212709931_Ptr, marshalToNative(keyMaterial), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CryptographicKey>(result.getValue())
      return resultValue
    }
  }

  public class IKeyDerivationAlgorithmProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __212709931_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyDerivationAlgorithmProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e1fba83b467143b79158763aaa98b6bf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyDerivationAlgorithmProvider(ptr: Pointer?): WithDefault =
        IKeyDerivationAlgorithmProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyDerivationAlgorithmProvider {
      val address = segment.toRawLongValue()
      return makeIKeyDerivationAlgorithmProvider(Pointer(address))
    }

    public override fun toNative(obj: IKeyDerivationAlgorithmProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__212709931_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyDerivationAlgorithmProvider):
        Array<IKeyDerivationAlgorithmProvider?> = (elements as
        Array<IKeyDerivationAlgorithmProvider?>).castToImpl<IKeyDerivationAlgorithmProvider,IKeyDerivationAlgorithmProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyDerivationAlgorithmProvider?> =
        arrayOfNulls<IKeyDerivationAlgorithmProvider_Impl>(size) as
        Array<IKeyDerivationAlgorithmProvider?>
  }
}
