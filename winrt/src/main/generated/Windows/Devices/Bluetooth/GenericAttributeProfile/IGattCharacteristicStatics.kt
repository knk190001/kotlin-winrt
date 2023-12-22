package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(IGattCharacteristicStatics.ABI::class)
@Signature("{59cb50c3-5934-4f68-a198-eb864fa44e6b}")
@Guid("59cb50c359344f68a198eb864fa44e6b")
@WinRTInterface("59cb50c359344f68a198eb864fa44e6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattCharacteristicStatics.ByReference::class)
public interface IGattCharacteristicStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ConvertShortIdToUuid(shortId: WinDef.USHORT): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattCharacteristicStatics> {
    public override fun getValue() = ABI.makeIGattCharacteristicStatics(pointer.getPointer(0))

    public fun setValue(value: IGattCharacteristicStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattCharacteristicStatics {
    public val __842097713_Ptr: Pointer?

    public val _842097713_VtblPtr: Pointer?
      get() = __842097713_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ConvertShortIdToUuid(shortId: WinDef.USHORT):
        com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _842097713_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__842097713_Ptr, shortId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IGattCharacteristicStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __842097713_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattCharacteristicStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59cb50c359344f68a198eb864fa44e6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattCharacteristicStatics(ptr: Pointer?): WithDefault =
        IGattCharacteristicStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattCharacteristicStatics {
      val address = segment.toRawLongValue()
      return makeIGattCharacteristicStatics(Pointer(address))
    }

    public override fun toNative(obj: IGattCharacteristicStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__842097713_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattCharacteristicStatics):
        Array<IGattCharacteristicStatics?> = (elements as
        Array<IGattCharacteristicStatics?>).castToImpl<IGattCharacteristicStatics,IGattCharacteristicStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattCharacteristicStatics?> =
        arrayOfNulls<IGattCharacteristicStatics_Impl>(size) as Array<IGattCharacteristicStatics?>
  }
}
