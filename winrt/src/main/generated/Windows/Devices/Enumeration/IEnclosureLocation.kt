package Windows.Devices.Enumeration

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

@ABIMarker(IEnclosureLocation.ABI::class)
@Signature("{42340a27-5810-459c-aabb-c65e1f813ecf}")
@Guid("42340a275810459caabbc65e1f813ecf")
@WinRTInterface("42340a275810459caabbc65e1f813ecf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEnclosureLocation.ByReference::class)
public interface IEnclosureLocation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InDock(): Boolean

  @InterfaceMethod(1)
  public fun get_InLid(): Boolean

  @InterfaceMethod(2)
  public fun get_Panel(): Panel?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEnclosureLocation> {
    public override fun getValue() = ABI.makeIEnclosureLocation(pointer.getPointer(0))

    public fun setValue(value: IEnclosureLocation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEnclosureLocation {
    public val __186011561_Ptr: Pointer?

    public val _186011561_VtblPtr: Pointer?
      get() = __186011561_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InDock(): Boolean {
      val fnPtr = _186011561_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__186011561_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_InLid(): Boolean {
      val fnPtr = _186011561_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__186011561_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Panel(): Panel? {
      val fnPtr = _186011561_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Panel>()
      val hr = fn.invokeHR(arrayOf(__186011561_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Panel>(result.getValue())
      return resultValue
    }
  }

  public class IEnclosureLocation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __186011561_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEnclosureLocation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("42340a275810459caabbc65e1f813ecf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEnclosureLocation(ptr: Pointer?): WithDefault = IEnclosureLocation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEnclosureLocation {
      val address = segment.toRawLongValue()
      return makeIEnclosureLocation(Pointer(address))
    }

    public override fun toNative(obj: IEnclosureLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__186011561_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEnclosureLocation): Array<IEnclosureLocation?> =
        (elements as
        Array<IEnclosureLocation?>).castToImpl<IEnclosureLocation,IEnclosureLocation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEnclosureLocation?> =
        arrayOfNulls<IEnclosureLocation_Impl>(size) as Array<IEnclosureLocation?>
  }
}
