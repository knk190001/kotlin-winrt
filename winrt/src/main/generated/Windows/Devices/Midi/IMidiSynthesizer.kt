package Windows.Devices.Midi

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Devices.Midi.IMidiOutPort.ABI.IID
import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMidiSynthesizer.ABI::class)
@Signature("{f0da155e-db90-405f-b8ae-21d2e17f2e45}")
@Guid("f0da155edb90405fb8ae21d2e17f2e45")
@WinRTInterface("f0da155edb90405fb8ae21d2e17f2e45")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiSynthesizer.ByReference::class)
public interface IMidiSynthesizer : NativeMapped, IWinRTInterface, IMidiOutPort, IClosable {
  @InterfaceMethod(0)
  public fun get_AudioDevice(): DeviceInformation?

  @InterfaceMethod(1)
  public fun get_Volume(): Double

  @InterfaceMethod(2)
  public fun put_Volume(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiSynthesizer> {
    public override fun getValue() = ABI.makeIMidiSynthesizer(pointer.getPointer(0))

    public fun setValue(value: IMidiSynthesizer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiSynthesizer, IMidiOutPort.WithDefault, IClosable.WithDefault {
    public val __1743130213_Ptr: Pointer?

    public val _1743130213_VtblPtr: Pointer?
      get() = __1743130213_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AudioDevice(): DeviceInformation? {
      val fnPtr = _1743130213_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceInformation>()
      val hr = fn.invokeHR(arrayOf(__1743130213_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Volume(): Double {
      val fnPtr = _1743130213_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1743130213_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_Volume(value: Double): Unit {
      val fnPtr = _1743130213_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1743130213_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMidiSynthesizer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMidiOutPort, IClosable {
    public override val __1782702722_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1743130213_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1743130213_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1743130213_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiSynthesizer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f0da155edb90405fb8ae21d2e17f2e45")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiSynthesizer(ptr: Pointer?): WithDefault = IMidiSynthesizer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiSynthesizer {
      val address = segment.toRawLongValue()
      return makeIMidiSynthesizer(Pointer(address))
    }

    public override fun toNative(obj: IMidiSynthesizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1743130213_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiSynthesizer): Array<IMidiSynthesizer?> = (elements as
        Array<IMidiSynthesizer?>).castToImpl<IMidiSynthesizer,IMidiSynthesizer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiSynthesizer?> =
        arrayOfNulls<IMidiSynthesizer_Impl>(size) as Array<IMidiSynthesizer?>
  }
}
