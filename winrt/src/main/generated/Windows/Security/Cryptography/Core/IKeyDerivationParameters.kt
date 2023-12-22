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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IKeyDerivationParameters.ABI::class)
@Signature("{7bf05967-047b-4a8c-964a-469ffd5522e2}")
@Guid("7bf05967047b4a8c964a469ffd5522e2")
@WinRTInterface("7bf05967047b4a8c964a469ffd5522e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyDerivationParameters.ByReference::class)
public interface IKeyDerivationParameters : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KdfGenericBinary(): IBuffer?

  @InterfaceMethod(1)
  public fun put_KdfGenericBinary(value: IBuffer?): Unit

  @InterfaceMethod(2)
  public fun get_IterationCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyDerivationParameters> {
    public override fun getValue() = ABI.makeIKeyDerivationParameters(pointer.getPointer(0))

    public fun setValue(value: IKeyDerivationParameters_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyDerivationParameters {
    public val __1487468853_Ptr: Pointer?

    public val _1487468853_VtblPtr: Pointer?
      get() = __1487468853_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KdfGenericBinary(): IBuffer? {
      val fnPtr = _1487468853_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__1487468853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_KdfGenericBinary(value: IBuffer?): Unit {
      val fnPtr = _1487468853_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1487468853_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IterationCount(): WinDef.UINT {
      val fnPtr = _1487468853_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1487468853_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IKeyDerivationParameters_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1487468853_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyDerivationParameters, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7bf05967047b4a8c964a469ffd5522e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyDerivationParameters(ptr: Pointer?): WithDefault =
        IKeyDerivationParameters_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyDerivationParameters {
      val address = segment.toRawLongValue()
      return makeIKeyDerivationParameters(Pointer(address))
    }

    public override fun toNative(obj: IKeyDerivationParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1487468853_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyDerivationParameters):
        Array<IKeyDerivationParameters?> = (elements as
        Array<IKeyDerivationParameters?>).castToImpl<IKeyDerivationParameters,IKeyDerivationParameters_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyDerivationParameters?> =
        arrayOfNulls<IKeyDerivationParameters_Impl>(size) as Array<IKeyDerivationParameters?>
  }
}
