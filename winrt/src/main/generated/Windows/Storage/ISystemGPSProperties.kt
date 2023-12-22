package Windows.Storage

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

@ABIMarker(ISystemGPSProperties.ABI::class)
@Signature("{c0f46eb4-c174-481a-bc25-921986f6a6f3}")
@Guid("c0f46eb4c174481abc25921986f6a6f3")
@WinRTInterface("c0f46eb4c174481abc25921986f6a6f3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemGPSProperties.ByReference::class)
public interface ISystemGPSProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_LatitudeDecimal(): String?

  @InterfaceMethod(1)
  public fun get_LongitudeDecimal(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemGPSProperties> {
    public override fun getValue() = ABI.makeISystemGPSProperties(pointer.getPointer(0))

    public fun setValue(value: ISystemGPSProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemGPSProperties {
    public val __1956093525_Ptr: Pointer?

    public val _1956093525_VtblPtr: Pointer?
      get() = __1956093525_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_LatitudeDecimal(): String? {
      val fnPtr = _1956093525_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1956093525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LongitudeDecimal(): String? {
      val fnPtr = _1956093525_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1956093525_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISystemGPSProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1956093525_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemGPSProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0f46eb4c174481abc25921986f6a6f3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemGPSProperties(ptr: Pointer?): WithDefault = ISystemGPSProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemGPSProperties {
      val address = segment.toRawLongValue()
      return makeISystemGPSProperties(Pointer(address))
    }

    public override fun toNative(obj: ISystemGPSProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1956093525_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemGPSProperties): Array<ISystemGPSProperties?> =
        (elements as
        Array<ISystemGPSProperties?>).castToImpl<ISystemGPSProperties,ISystemGPSProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemGPSProperties?> =
        arrayOfNulls<ISystemGPSProperties_Impl>(size) as Array<ISystemGPSProperties?>
  }
}
