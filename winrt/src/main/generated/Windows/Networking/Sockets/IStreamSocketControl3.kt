package Windows.Networking.Sockets

import Windows.Security.Cryptography.Certificates.Certificate
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStreamSocketControl3.ABI::class)
@Signature("{c56a444c-4e74-403e-894c-b31cae5c7342}")
@Guid("c56a444c4e74403e894cb31cae5c7342")
@WinRTInterface("c56a444c4e74403e894cb31cae5c7342")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStreamSocketControl3.ByReference::class)
public interface IStreamSocketControl3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SerializeConnectionAttempts(): Boolean

  @InterfaceMethod(1)
  public fun put_SerializeConnectionAttempts(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_ClientCertificate(): Certificate?

  @InterfaceMethod(3)
  public fun put_ClientCertificate(value: Certificate?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStreamSocketControl3> {
    public override fun getValue() = ABI.makeIStreamSocketControl3(pointer.getPointer(0))

    public fun setValue(value: IStreamSocketControl3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStreamSocketControl3 {
    public val __1800417633_Ptr: Pointer?

    public val _1800417633_VtblPtr: Pointer?
      get() = __1800417633_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SerializeConnectionAttempts(): Boolean {
      val fnPtr = _1800417633_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1800417633_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_SerializeConnectionAttempts(value: Boolean): Unit {
      val fnPtr = _1800417633_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1800417633_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ClientCertificate(): Certificate? {
      val fnPtr = _1800417633_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Certificate>()
      val hr = fn.invokeHR(arrayOf(__1800417633_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Certificate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ClientCertificate(value: Certificate?): Unit {
      val fnPtr = _1800417633_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1800417633_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStreamSocketControl3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1800417633_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStreamSocketControl3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c56a444c4e74403e894cb31cae5c7342")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStreamSocketControl3(ptr: Pointer?): WithDefault =
        IStreamSocketControl3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStreamSocketControl3 {
      val address = segment.toRawLongValue()
      return makeIStreamSocketControl3(Pointer(address))
    }

    public override fun toNative(obj: IStreamSocketControl3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1800417633_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStreamSocketControl3): Array<IStreamSocketControl3?> =
        (elements as
        Array<IStreamSocketControl3?>).castToImpl<IStreamSocketControl3,IStreamSocketControl3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStreamSocketControl3?> =
        arrayOfNulls<IStreamSocketControl3_Impl>(size) as Array<IStreamSocketControl3?>
  }
}
