package Windows.Security.Cryptography.Core

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

@ABIMarker(IKeyDerivationAlgorithmNamesStatics2.ABI::class)
@Signature("{57953fab-6044-466f-97f4-337b7808384d}")
@Guid("57953fab6044466f97f4337b7808384d")
@WinRTInterface("57953fab6044466f97f4337b7808384d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyDerivationAlgorithmNamesStatics2.ByReference::class)
public interface IKeyDerivationAlgorithmNamesStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CapiKdfMd5(): String?

  @InterfaceMethod(1)
  public fun get_CapiKdfSha1(): String?

  @InterfaceMethod(2)
  public fun get_CapiKdfSha256(): String?

  @InterfaceMethod(3)
  public fun get_CapiKdfSha384(): String?

  @InterfaceMethod(4)
  public fun get_CapiKdfSha512(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyDerivationAlgorithmNamesStatics2> {
    public override fun getValue() =
        ABI.makeIKeyDerivationAlgorithmNamesStatics2(pointer.getPointer(0))

    public fun setValue(value: IKeyDerivationAlgorithmNamesStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyDerivationAlgorithmNamesStatics2 {
    public val __1171878673_Ptr: Pointer?

    public val _1171878673_VtblPtr: Pointer?
      get() = __1171878673_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CapiKdfMd5(): String? {
      val fnPtr = _1171878673_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1171878673_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CapiKdfSha1(): String? {
      val fnPtr = _1171878673_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1171878673_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CapiKdfSha256(): String? {
      val fnPtr = _1171878673_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1171878673_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_CapiKdfSha384(): String? {
      val fnPtr = _1171878673_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1171878673_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CapiKdfSha512(): String? {
      val fnPtr = _1171878673_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1171878673_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKeyDerivationAlgorithmNamesStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1171878673_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyDerivationAlgorithmNamesStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("57953fab6044466f97f4337b7808384d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyDerivationAlgorithmNamesStatics2(ptr: Pointer?): WithDefault =
        IKeyDerivationAlgorithmNamesStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyDerivationAlgorithmNamesStatics2 {
      val address = segment.toRawLongValue()
      return makeIKeyDerivationAlgorithmNamesStatics2(Pointer(address))
    }

    public override fun toNative(obj: IKeyDerivationAlgorithmNamesStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1171878673_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyDerivationAlgorithmNamesStatics2):
        Array<IKeyDerivationAlgorithmNamesStatics2?> = (elements as
        Array<IKeyDerivationAlgorithmNamesStatics2?>).castToImpl<IKeyDerivationAlgorithmNamesStatics2,IKeyDerivationAlgorithmNamesStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyDerivationAlgorithmNamesStatics2?> =
        arrayOfNulls<IKeyDerivationAlgorithmNamesStatics2_Impl>(size) as
        Array<IKeyDerivationAlgorithmNamesStatics2?>
  }
}
