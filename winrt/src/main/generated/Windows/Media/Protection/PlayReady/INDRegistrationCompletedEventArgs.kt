package Windows.Media.Protection.PlayReady

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

@ABIMarker(INDRegistrationCompletedEventArgs.ABI::class)
@Signature("{9e39b64d-ab5b-4905-acdc-787a77c6374d}")
@Guid("9e39b64dab5b4905acdc787a77c6374d")
@WinRTInterface("9e39b64dab5b4905acdc787a77c6374d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INDRegistrationCompletedEventArgs.ByReference::class)
public interface INDRegistrationCompletedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResponseCustomData(): INDCustomData?

  @InterfaceMethod(1)
  public fun get_TransmitterProperties(): INDTransmitterProperties?

  @InterfaceMethod(2)
  public fun get_TransmitterCertificateAccepted(): Boolean

  @InterfaceMethod(3)
  public fun put_TransmitterCertificateAccepted(accept: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INDRegistrationCompletedEventArgs> {
    public override fun getValue() =
        ABI.makeINDRegistrationCompletedEventArgs(pointer.getPointer(0))

    public fun setValue(value: INDRegistrationCompletedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INDRegistrationCompletedEventArgs {
    public val __648166997_Ptr: Pointer?

    public val _648166997_VtblPtr: Pointer?
      get() = __648166997_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResponseCustomData(): INDCustomData? {
      val fnPtr = _648166997_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<INDCustomData>()
      val hr = fn.invokeHR(arrayOf(__648166997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<INDCustomData>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TransmitterProperties(): INDTransmitterProperties? {
      val fnPtr = _648166997_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<INDTransmitterProperties>()
      val hr = fn.invokeHR(arrayOf(__648166997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<INDTransmitterProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TransmitterCertificateAccepted(): Boolean {
      val fnPtr = _648166997_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__648166997_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_TransmitterCertificateAccepted(accept: Boolean): Unit {
      val fnPtr = _648166997_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__648166997_Ptr, accept,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class INDRegistrationCompletedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __648166997_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INDRegistrationCompletedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e39b64dab5b4905acdc787a77c6374d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINDRegistrationCompletedEventArgs(ptr: Pointer?): WithDefault =
        INDRegistrationCompletedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INDRegistrationCompletedEventArgs {
      val address = segment.toRawLongValue()
      return makeINDRegistrationCompletedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INDRegistrationCompletedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__648166997_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INDRegistrationCompletedEventArgs):
        Array<INDRegistrationCompletedEventArgs?> = (elements as
        Array<INDRegistrationCompletedEventArgs?>).castToImpl<INDRegistrationCompletedEventArgs,INDRegistrationCompletedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INDRegistrationCompletedEventArgs?> =
        arrayOfNulls<INDRegistrationCompletedEventArgs_Impl>(size) as
        Array<INDRegistrationCompletedEventArgs?>
  }
}
