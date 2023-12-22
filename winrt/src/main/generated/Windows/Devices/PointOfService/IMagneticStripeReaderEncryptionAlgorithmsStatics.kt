package Windows.Devices.PointOfService

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMagneticStripeReaderEncryptionAlgorithmsStatics.ABI::class)
@Signature("{53b57350-c3db-4754-9c00-41392374a109}")
@Guid("53b57350c3db47549c0041392374a109")
@WinRTInterface("53b57350c3db47549c0041392374a109")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagneticStripeReaderEncryptionAlgorithmsStatics.ByReference::class)
public interface IMagneticStripeReaderEncryptionAlgorithmsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_None(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_TripleDesDukpt(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_ExtendedBase(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagneticStripeReaderEncryptionAlgorithmsStatics> {
    public override fun getValue() =
        ABI.makeIMagneticStripeReaderEncryptionAlgorithmsStatics(pointer.getPointer(0))

    public fun setValue(value: IMagneticStripeReaderEncryptionAlgorithmsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagneticStripeReaderEncryptionAlgorithmsStatics {
    public val __1065014987_Ptr: Pointer?

    public val _1065014987_VtblPtr: Pointer?
      get() = __1065014987_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_None(): WinDef.UINT {
      val fnPtr = _1065014987_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1065014987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_TripleDesDukpt(): WinDef.UINT {
      val fnPtr = _1065014987_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1065014987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ExtendedBase(): WinDef.UINT {
      val fnPtr = _1065014987_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1065014987_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IMagneticStripeReaderEncryptionAlgorithmsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1065014987_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagneticStripeReaderEncryptionAlgorithmsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53b57350c3db47549c0041392374a109")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagneticStripeReaderEncryptionAlgorithmsStatics(ptr: Pointer?): WithDefault =
        IMagneticStripeReaderEncryptionAlgorithmsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMagneticStripeReaderEncryptionAlgorithmsStatics {
      val address = segment.toRawLongValue()
      return makeIMagneticStripeReaderEncryptionAlgorithmsStatics(Pointer(address))
    }

    public override fun toNative(obj: IMagneticStripeReaderEncryptionAlgorithmsStatics):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1065014987_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagneticStripeReaderEncryptionAlgorithmsStatics):
        Array<IMagneticStripeReaderEncryptionAlgorithmsStatics?> = (elements as
        Array<IMagneticStripeReaderEncryptionAlgorithmsStatics?>).castToImpl<IMagneticStripeReaderEncryptionAlgorithmsStatics,IMagneticStripeReaderEncryptionAlgorithmsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagneticStripeReaderEncryptionAlgorithmsStatics?>
        = arrayOfNulls<IMagneticStripeReaderEncryptionAlgorithmsStatics_Impl>(size) as
        Array<IMagneticStripeReaderEncryptionAlgorithmsStatics?>
  }
}
