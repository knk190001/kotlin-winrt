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

@ABIMarker(IGattDescriptorStatics.ABI::class)
@Signature("{92055f2d-8084-4344-b4c2-284de19a8506}")
@Guid("92055f2d80844344b4c2284de19a8506")
@WinRTInterface("92055f2d80844344b4c2284de19a8506")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattDescriptorStatics.ByReference::class)
public interface IGattDescriptorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ConvertShortIdToUuid(shortId: WinDef.USHORT): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattDescriptorStatics> {
    public override fun getValue() = ABI.makeIGattDescriptorStatics(pointer.getPointer(0))

    public fun setValue(value: IGattDescriptorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattDescriptorStatics {
    public val __155177477_Ptr: Pointer?

    public val _155177477_VtblPtr: Pointer?
      get() = __155177477_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ConvertShortIdToUuid(shortId: WinDef.USHORT):
        com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _155177477_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__155177477_Ptr, shortId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IGattDescriptorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __155177477_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattDescriptorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92055f2d80844344b4c2284de19a8506")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattDescriptorStatics(ptr: Pointer?): WithDefault =
        IGattDescriptorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattDescriptorStatics {
      val address = segment.toRawLongValue()
      return makeIGattDescriptorStatics(Pointer(address))
    }

    public override fun toNative(obj: IGattDescriptorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__155177477_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattDescriptorStatics): Array<IGattDescriptorStatics?> =
        (elements as
        Array<IGattDescriptorStatics?>).castToImpl<IGattDescriptorStatics,IGattDescriptorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattDescriptorStatics?> =
        arrayOfNulls<IGattDescriptorStatics_Impl>(size) as Array<IGattDescriptorStatics?>
  }
}
