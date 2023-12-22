package Windows.Storage.Provider

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageProviderPropertyCapabilities.ABI::class)
@Signature("{658d2f0e-63b7-4567-acf9-51abe301dda5}")
@Guid("658d2f0e63b74567acf951abe301dda5")
@WinRTInterface("658d2f0e63b74567acf951abe301dda5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderPropertyCapabilities.ByReference::class)
public interface IStorageProviderPropertyCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsPropertySupported(propertyCanonicalName: String?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderPropertyCapabilities> {
    public override fun getValue() =
        ABI.makeIStorageProviderPropertyCapabilities(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderPropertyCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderPropertyCapabilities {
    public val __1183663549_Ptr: Pointer?

    public val _1183663549_VtblPtr: Pointer?
      get() = __1183663549_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsPropertySupported(propertyCanonicalName: String?): Boolean {
      val fnPtr = _1183663549_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1183663549_Ptr, marshalToNative(propertyCanonicalName),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IStorageProviderPropertyCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1183663549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderPropertyCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("658d2f0e63b74567acf951abe301dda5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderPropertyCapabilities(ptr: Pointer?): WithDefault =
        IStorageProviderPropertyCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderPropertyCapabilities {
      val address = segment.toRawLongValue()
      return makeIStorageProviderPropertyCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderPropertyCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1183663549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderPropertyCapabilities):
        Array<IStorageProviderPropertyCapabilities?> = (elements as
        Array<IStorageProviderPropertyCapabilities?>).castToImpl<IStorageProviderPropertyCapabilities,IStorageProviderPropertyCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderPropertyCapabilities?> =
        arrayOfNulls<IStorageProviderPropertyCapabilities_Impl>(size) as
        Array<IStorageProviderPropertyCapabilities?>
  }
}
