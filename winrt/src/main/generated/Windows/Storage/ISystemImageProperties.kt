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

@ABIMarker(ISystemImageProperties.ABI::class)
@Signature("{011b2e30-8b39-4308-bea1-e8aa61e47826}")
@Guid("011b2e308b394308bea1e8aa61e47826")
@WinRTInterface("011b2e308b394308bea1e8aa61e47826")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemImageProperties.ByReference::class)
public interface ISystemImageProperties : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalSize(): String?

  @InterfaceMethod(1)
  public fun get_VerticalSize(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemImageProperties> {
    public override fun getValue() = ABI.makeISystemImageProperties(pointer.getPointer(0))

    public fun setValue(value: ISystemImageProperties_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemImageProperties {
    public val __1125350342_Ptr: Pointer?

    public val _1125350342_VtblPtr: Pointer?
      get() = __1125350342_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalSize(): String? {
      val fnPtr = _1125350342_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1125350342_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_VerticalSize(): String? {
      val fnPtr = _1125350342_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1125350342_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISystemImageProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1125350342_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemImageProperties, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("011b2e308b394308bea1e8aa61e47826")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemImageProperties(ptr: Pointer?): WithDefault =
        ISystemImageProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemImageProperties {
      val address = segment.toRawLongValue()
      return makeISystemImageProperties(Pointer(address))
    }

    public override fun toNative(obj: ISystemImageProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1125350342_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemImageProperties): Array<ISystemImageProperties?> =
        (elements as
        Array<ISystemImageProperties?>).castToImpl<ISystemImageProperties,ISystemImageProperties_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemImageProperties?> =
        arrayOfNulls<ISystemImageProperties_Impl>(size) as Array<ISystemImageProperties?>
  }
}
