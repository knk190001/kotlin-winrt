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

@ABIMarker(ICertificateStore2.ABI::class)
@Signature("{c7e68e4a-417d-4d1a-babd-15687e549974}")
@Guid("c7e68e4a417d4d1ababd15687e549974")
@WinRTInterface("c7e68e4a417d4d1ababd15687e549974")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateStore2.ByReference::class)
public interface ICertificateStore2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateStore2> {
    public override fun getValue() = ABI.makeICertificateStore2(pointer.getPointer(0))

    public fun setValue(value: ICertificateStore2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateStore2 {
    public val __592649286_Ptr: Pointer?

    public val _592649286_VtblPtr: Pointer?
      get() = __592649286_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _592649286_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__592649286_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ICertificateStore2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __592649286_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateStore2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c7e68e4a417d4d1ababd15687e549974")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateStore2(ptr: Pointer?): WithDefault = ICertificateStore2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateStore2 {
      val address = segment.toRawLongValue()
      return makeICertificateStore2(Pointer(address))
    }

    public override fun toNative(obj: ICertificateStore2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__592649286_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateStore2): Array<ICertificateStore2?> =
        (elements as
        Array<ICertificateStore2?>).castToImpl<ICertificateStore2,ICertificateStore2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateStore2?> =
        arrayOfNulls<ICertificateStore2_Impl>(size) as Array<ICertificateStore2?>
  }
}
