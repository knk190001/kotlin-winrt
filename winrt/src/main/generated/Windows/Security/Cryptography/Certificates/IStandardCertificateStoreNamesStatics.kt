package Windows.Security.Cryptography.Certificates

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

@ABIMarker(IStandardCertificateStoreNamesStatics.ABI::class)
@Signature("{0c154adb-a496-41f8-8fe5-9e96f36efbf8}")
@Guid("0c154adba49641f88fe59e96f36efbf8")
@WinRTInterface("0c154adba49641f88fe59e96f36efbf8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStandardCertificateStoreNamesStatics.ByReference::class)
public interface IStandardCertificateStoreNamesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Personal(): String?

  @InterfaceMethod(1)
  public fun get_TrustedRootCertificationAuthorities(): String?

  @InterfaceMethod(2)
  public fun get_IntermediateCertificationAuthorities(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStandardCertificateStoreNamesStatics> {
    public override fun getValue() =
        ABI.makeIStandardCertificateStoreNamesStatics(pointer.getPointer(0))

    public fun setValue(value: IStandardCertificateStoreNamesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStandardCertificateStoreNamesStatics {
    public val __1371931218_Ptr: Pointer?

    public val _1371931218_VtblPtr: Pointer?
      get() = __1371931218_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Personal(): String? {
      val fnPtr = _1371931218_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1371931218_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TrustedRootCertificationAuthorities(): String? {
      val fnPtr = _1371931218_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1371931218_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IntermediateCertificationAuthorities(): String? {
      val fnPtr = _1371931218_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1371931218_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStandardCertificateStoreNamesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1371931218_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStandardCertificateStoreNamesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c154adba49641f88fe59e96f36efbf8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStandardCertificateStoreNamesStatics(ptr: Pointer?): WithDefault =
        IStandardCertificateStoreNamesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStandardCertificateStoreNamesStatics {
      val address = segment.toRawLongValue()
      return makeIStandardCertificateStoreNamesStatics(Pointer(address))
    }

    public override fun toNative(obj: IStandardCertificateStoreNamesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1371931218_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStandardCertificateStoreNamesStatics):
        Array<IStandardCertificateStoreNamesStatics?> = (elements as
        Array<IStandardCertificateStoreNamesStatics?>).castToImpl<IStandardCertificateStoreNamesStatics,IStandardCertificateStoreNamesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStandardCertificateStoreNamesStatics?> =
        arrayOfNulls<IStandardCertificateStoreNamesStatics_Impl>(size) as
        Array<IStandardCertificateStoreNamesStatics?>
  }
}
