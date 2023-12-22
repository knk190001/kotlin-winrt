package Windows.Devices.Custom

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

@ABIMarker(IIOControlCodeFactory.ABI::class)
@Signature("{856a7cf0-4c11-44ae-afc6-b8d4a212788f}")
@Guid("856a7cf04c1144aeafc6b8d4a212788f")
@WinRTInterface("856a7cf04c1144aeafc6b8d4a212788f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIOControlCodeFactory.ByReference::class)
public interface IIOControlCodeFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateIOControlCode(
    deviceType: WinDef.USHORT,
    function: WinDef.USHORT,
    accessMode: IOControlAccessMode?,
    bufferingMethod: IOControlBufferingMethod?
  ): IOControlCode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIOControlCodeFactory> {
    public override fun getValue() = ABI.makeIIOControlCodeFactory(pointer.getPointer(0))

    public fun setValue(value: IIOControlCodeFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIOControlCodeFactory {
    public val __844977058_Ptr: Pointer?

    public val _844977058_VtblPtr: Pointer?
      get() = __844977058_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateIOControlCode(
      deviceType: WinDef.USHORT,
      function: WinDef.USHORT,
      accessMode: IOControlAccessMode?,
      bufferingMethod: IOControlBufferingMethod?
    ): IOControlCode? {
      val fnPtr = _844977058_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOControlCode>()
      val hr = fn.invokeHR(arrayOf(__844977058_Ptr, deviceType, function,
          marshalToNative(accessMode), marshalToNative(bufferingMethod), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOControlCode>(result.getValue())
      return resultValue
    }
  }

  public class IIOControlCodeFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __844977058_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIOControlCodeFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("856a7cf04c1144aeafc6b8d4a212788f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIOControlCodeFactory(ptr: Pointer?): WithDefault =
        IIOControlCodeFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIOControlCodeFactory {
      val address = segment.toRawLongValue()
      return makeIIOControlCodeFactory(Pointer(address))
    }

    public override fun toNative(obj: IIOControlCodeFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__844977058_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIOControlCodeFactory): Array<IIOControlCodeFactory?> =
        (elements as
        Array<IIOControlCodeFactory?>).castToImpl<IIOControlCodeFactory,IIOControlCodeFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIOControlCodeFactory?> =
        arrayOfNulls<IIOControlCodeFactory_Impl>(size) as Array<IIOControlCodeFactory?>
  }
}
