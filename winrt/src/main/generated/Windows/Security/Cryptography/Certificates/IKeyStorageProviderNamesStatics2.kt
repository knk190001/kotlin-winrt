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

@ABIMarker(IKeyStorageProviderNamesStatics2.ABI::class)
@Signature("{262d743d-9c2e-41cc-8812-c4d971dd7c60}")
@Guid("262d743d9c2e41cc8812c4d971dd7c60")
@WinRTInterface("262d743d9c2e41cc8812c4d971dd7c60")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKeyStorageProviderNamesStatics2.ByReference::class)
public interface IKeyStorageProviderNamesStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PassportKeyStorageProvider(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKeyStorageProviderNamesStatics2> {
    public override fun getValue() = ABI.makeIKeyStorageProviderNamesStatics2(pointer.getPointer(0))

    public fun setValue(value: IKeyStorageProviderNamesStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKeyStorageProviderNamesStatics2 {
    public val __1398555802_Ptr: Pointer?

    public val _1398555802_VtblPtr: Pointer?
      get() = __1398555802_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PassportKeyStorageProvider(): String? {
      val fnPtr = _1398555802_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1398555802_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKeyStorageProviderNamesStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1398555802_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKeyStorageProviderNamesStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("262d743d9c2e41cc8812c4d971dd7c60")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKeyStorageProviderNamesStatics2(ptr: Pointer?): WithDefault =
        IKeyStorageProviderNamesStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKeyStorageProviderNamesStatics2 {
      val address = segment.toRawLongValue()
      return makeIKeyStorageProviderNamesStatics2(Pointer(address))
    }

    public override fun toNative(obj: IKeyStorageProviderNamesStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1398555802_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKeyStorageProviderNamesStatics2):
        Array<IKeyStorageProviderNamesStatics2?> = (elements as
        Array<IKeyStorageProviderNamesStatics2?>).castToImpl<IKeyStorageProviderNamesStatics2,IKeyStorageProviderNamesStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKeyStorageProviderNamesStatics2?> =
        arrayOfNulls<IKeyStorageProviderNamesStatics2_Impl>(size) as
        Array<IKeyStorageProviderNamesStatics2?>
  }
}
