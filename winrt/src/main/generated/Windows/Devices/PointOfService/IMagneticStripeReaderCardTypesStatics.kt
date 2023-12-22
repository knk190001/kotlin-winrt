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

@ABIMarker(IMagneticStripeReaderCardTypesStatics.ABI::class)
@Signature("{528f2c5d-2986-474f-8454-7ccd05928d5f}")
@Guid("528f2c5d2986474f84547ccd05928d5f")
@WinRTInterface("528f2c5d2986474f84547ccd05928d5f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMagneticStripeReaderCardTypesStatics.ByReference::class)
public interface IMagneticStripeReaderCardTypesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Unknown(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_Bank(): WinDef.UINT

  @InterfaceMethod(2)
  public fun get_Aamva(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_ExtendedBase(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMagneticStripeReaderCardTypesStatics> {
    public override fun getValue() =
        ABI.makeIMagneticStripeReaderCardTypesStatics(pointer.getPointer(0))

    public fun setValue(value: IMagneticStripeReaderCardTypesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMagneticStripeReaderCardTypesStatics {
    public val __203190159_Ptr: Pointer?

    public val _203190159_VtblPtr: Pointer?
      get() = __203190159_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Unknown(): WinDef.UINT {
      val fnPtr = _203190159_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__203190159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Bank(): WinDef.UINT {
      val fnPtr = _203190159_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__203190159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Aamva(): WinDef.UINT {
      val fnPtr = _203190159_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__203190159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_ExtendedBase(): WinDef.UINT {
      val fnPtr = _203190159_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__203190159_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IMagneticStripeReaderCardTypesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __203190159_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMagneticStripeReaderCardTypesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("528f2c5d2986474f84547ccd05928d5f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMagneticStripeReaderCardTypesStatics(ptr: Pointer?): WithDefault =
        IMagneticStripeReaderCardTypesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMagneticStripeReaderCardTypesStatics {
      val address = segment.toRawLongValue()
      return makeIMagneticStripeReaderCardTypesStatics(Pointer(address))
    }

    public override fun toNative(obj: IMagneticStripeReaderCardTypesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__203190159_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMagneticStripeReaderCardTypesStatics):
        Array<IMagneticStripeReaderCardTypesStatics?> = (elements as
        Array<IMagneticStripeReaderCardTypesStatics?>).castToImpl<IMagneticStripeReaderCardTypesStatics,IMagneticStripeReaderCardTypesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMagneticStripeReaderCardTypesStatics?> =
        arrayOfNulls<IMagneticStripeReaderCardTypesStatics_Impl>(size) as
        Array<IMagneticStripeReaderCardTypesStatics?>
  }
}
