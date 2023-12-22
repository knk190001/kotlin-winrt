package Windows.Security.Cryptography.DataProtection

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

@ABIMarker(IDataProtectionProviderFactory.ABI::class)
@Signature("{adf33dac-4932-4cdf-ac41-7214333514ca}")
@Guid("adf33dac49324cdfac417214333514ca")
@WinRTInterface("adf33dac49324cdfac417214333514ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataProtectionProviderFactory.ByReference::class)
public interface IDataProtectionProviderFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateOverloadExplicit(protectionDescriptor: String?): DataProtectionProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataProtectionProviderFactory> {
    public override fun getValue() = ABI.makeIDataProtectionProviderFactory(pointer.getPointer(0))

    public fun setValue(value: IDataProtectionProviderFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataProtectionProviderFactory {
    public val __253069423_Ptr: Pointer?

    public val _253069423_VtblPtr: Pointer?
      get() = __253069423_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateOverloadExplicit(protectionDescriptor: String?):
        DataProtectionProvider? {
      val fnPtr = _253069423_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataProtectionProvider>()
      val hr = fn.invokeHR(arrayOf(__253069423_Ptr, marshalToNative(protectionDescriptor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataProtectionProvider>(result.getValue())
      return resultValue
    }
  }

  public class IDataProtectionProviderFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __253069423_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataProtectionProviderFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("adf33dac49324cdfac417214333514ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataProtectionProviderFactory(ptr: Pointer?): WithDefault =
        IDataProtectionProviderFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataProtectionProviderFactory {
      val address = segment.toRawLongValue()
      return makeIDataProtectionProviderFactory(Pointer(address))
    }

    public override fun toNative(obj: IDataProtectionProviderFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__253069423_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataProtectionProviderFactory):
        Array<IDataProtectionProviderFactory?> = (elements as
        Array<IDataProtectionProviderFactory?>).castToImpl<IDataProtectionProviderFactory,IDataProtectionProviderFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataProtectionProviderFactory?> =
        arrayOfNulls<IDataProtectionProviderFactory_Impl>(size) as
        Array<IDataProtectionProviderFactory?>
  }
}
