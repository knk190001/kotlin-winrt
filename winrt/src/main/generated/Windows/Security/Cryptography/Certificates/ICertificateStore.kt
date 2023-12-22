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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICertificateStore.ABI::class)
@Signature("{b0bff720-344e-4331-af14-a7f7a7ebc93a}")
@Guid("b0bff720344e4331af14a7f7a7ebc93a")
@WinRTInterface("b0bff720344e4331af14a7f7a7ebc93a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICertificateStore.ByReference::class)
public interface ICertificateStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Add(certificate: Certificate?): Unit

  @InterfaceMethod(1)
  public fun Delete(certificate: Certificate?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICertificateStore> {
    public override fun getValue() = ABI.makeICertificateStore(pointer.getPointer(0))

    public fun setValue(value: ICertificateStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICertificateStore {
    public val __535071608_Ptr: Pointer?

    public val _535071608_VtblPtr: Pointer?
      get() = __535071608_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Add(certificate: Certificate?): Unit {
      val fnPtr = _535071608_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__535071608_Ptr, marshalToNative(certificate),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Delete(certificate: Certificate?): Unit {
      val fnPtr = _535071608_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__535071608_Ptr, marshalToNative(certificate),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICertificateStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __535071608_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICertificateStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0bff720344e4331af14a7f7a7ebc93a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICertificateStore(ptr: Pointer?): WithDefault = ICertificateStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICertificateStore {
      val address = segment.toRawLongValue()
      return makeICertificateStore(Pointer(address))
    }

    public override fun toNative(obj: ICertificateStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__535071608_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICertificateStore): Array<ICertificateStore?> = (elements
        as Array<ICertificateStore?>).castToImpl<ICertificateStore,ICertificateStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICertificateStore?> =
        arrayOfNulls<ICertificateStore_Impl>(size) as Array<ICertificateStore?>
  }
}
