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

@ABIMarker(IKeyStorageProviderNamesStatics.ABI::class)
@Signature("{af186ae0-5529-4602-bd94-0aab91957b5c}")
@Guid("af186ae055294602bd940aab91957b5c")
@WinRTInterface("af186ae055294602bd940aab91957b5c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyStorageProviderNamesStatics.ByReference::class)
public interface IKeyStorageProviderNamesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SoftwareKeyStorageProvider(): String?

  @InterfaceMethod(1)
  public fun get_SmartcardKeyStorageProvider(): String?

  @InterfaceMethod(2)
  public fun get_PlatformKeyStorageProvider(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyStorageProviderNamesStatics> {
    public override fun getValue() = ABI.makeIKeyStorageProviderNamesStatics(pointer.getPointer(0))

    public fun setValue(value: IKeyStorageProviderNamesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyStorageProviderNamesStatics {
    public val __1756000616_Ptr: Pointer?

    public val _1756000616_VtblPtr: Pointer?
      get() = __1756000616_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SoftwareKeyStorageProvider(): String? {
      val fnPtr = _1756000616_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1756000616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SmartcardKeyStorageProvider(): String? {
      val fnPtr = _1756000616_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1756000616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PlatformKeyStorageProvider(): String? {
      val fnPtr = _1756000616_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1756000616_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKeyStorageProviderNamesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1756000616_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyStorageProviderNamesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("af186ae055294602bd940aab91957b5c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyStorageProviderNamesStatics(ptr: Pointer?): WithDefault =
        IKeyStorageProviderNamesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyStorageProviderNamesStatics {
      val address = segment.toRawLongValue()
      return makeIKeyStorageProviderNamesStatics(Pointer(address))
    }

    public override fun toNative(obj: IKeyStorageProviderNamesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1756000616_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyStorageProviderNamesStatics):
        Array<IKeyStorageProviderNamesStatics?> = (elements as
        Array<IKeyStorageProviderNamesStatics?>).castToImpl<IKeyStorageProviderNamesStatics,IKeyStorageProviderNamesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyStorageProviderNamesStatics?> =
        arrayOfNulls<IKeyStorageProviderNamesStatics_Impl>(size) as
        Array<IKeyStorageProviderNamesStatics?>
  }
}
