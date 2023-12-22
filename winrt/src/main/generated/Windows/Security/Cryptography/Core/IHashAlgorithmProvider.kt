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

@ABIMarker(IHashAlgorithmProvider.ABI::class)
@Signature("{be9b3080-b2c3-422b-bce1-ec90efb5d7b5}")
@Guid("be9b3080b2c3422bbce1ec90efb5d7b5")
@WinRTInterface("be9b3080b2c3422bbce1ec90efb5d7b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHashAlgorithmProvider.ByReference::class)
public interface IHashAlgorithmProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AlgorithmName(): String?

  @InterfaceMethod(1)
  public fun get_HashLength(): WinDef.UINT

  @InterfaceMethod(2)
  public fun HashData(`data`: IBuffer?): IBuffer?

  @InterfaceMethod(3)
  public fun CreateHash(): CryptographicHash?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHashAlgorithmProvider> {
    public override fun getValue() = ABI.makeIHashAlgorithmProvider(pointer.getPointer(0))

    public fun setValue(value: IHashAlgorithmProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHashAlgorithmProvider {
    public val __786656377_Ptr: Pointer?

    public val _786656377_VtblPtr: Pointer?
      get() = __786656377_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AlgorithmName(): String? {
      val fnPtr = _786656377_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__786656377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HashLength(): WinDef.UINT {
      val fnPtr = _786656377_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__786656377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun HashData(`data`: IBuffer?): IBuffer? {
      val fnPtr = _786656377_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__786656377_Ptr, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateHash(): CryptographicHash? {
      val fnPtr = _786656377_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CryptographicHash>()
      val hr = fn.invokeHR(arrayOf(__786656377_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CryptographicHash>(result.getValue())
      return resultValue
    }
  }

  public class IHashAlgorithmProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __786656377_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHashAlgorithmProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("be9b3080b2c3422bbce1ec90efb5d7b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHashAlgorithmProvider(ptr: Pointer?): WithDefault =
        IHashAlgorithmProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHashAlgorithmProvider {
      val address = segment.toRawLongValue()
      return makeIHashAlgorithmProvider(Pointer(address))
    }

    public override fun toNative(obj: IHashAlgorithmProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__786656377_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHashAlgorithmProvider): Array<IHashAlgorithmProvider?> =
        (elements as
        Array<IHashAlgorithmProvider?>).castToImpl<IHashAlgorithmProvider,IHashAlgorithmProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHashAlgorithmProvider?> =
        arrayOfNulls<IHashAlgorithmProvider_Impl>(size) as Array<IHashAlgorithmProvider?>
  }
}
