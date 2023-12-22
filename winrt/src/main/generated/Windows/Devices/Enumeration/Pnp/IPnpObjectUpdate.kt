package Windows.Devices.Enumeration.Pnp

import Windows.Foundation.Collections.IMapView
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IPnpObjectUpdate.ABI::class)
@Signature("{6f59e812-001e-4844-bcc6-432886856a17}")
@Guid("6f59e812001e4844bcc6432886856a17")
@WinRTInterface("6f59e812001e4844bcc6432886856a17")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPnpObjectUpdate.ByReference::class)
public interface IPnpObjectUpdate : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): PnpObjectType?

  @InterfaceMethod(1)
  public fun get_Id(): String?

  @InterfaceMethod(2)
  public fun get_Properties(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPnpObjectUpdate> {
    public override fun getValue() = ABI.makeIPnpObjectUpdate(pointer.getPointer(0))

    public fun setValue(value: IPnpObjectUpdate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPnpObjectUpdate {
    public val __398427840_Ptr: Pointer?

    public val _398427840_VtblPtr: Pointer?
      get() = __398427840_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): PnpObjectType? {
      val fnPtr = _398427840_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PnpObjectType>()
      val hr = fn.invokeHR(arrayOf(__398427840_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PnpObjectType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Id(): String? {
      val fnPtr = _398427840_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__398427840_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Properties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _398427840_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__398427840_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IPnpObjectUpdate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __398427840_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPnpObjectUpdate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f59e812001e4844bcc6432886856a17")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPnpObjectUpdate(ptr: Pointer?): WithDefault = IPnpObjectUpdate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPnpObjectUpdate {
      val address = segment.toRawLongValue()
      return makeIPnpObjectUpdate(Pointer(address))
    }

    public override fun toNative(obj: IPnpObjectUpdate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__398427840_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPnpObjectUpdate): Array<IPnpObjectUpdate?> = (elements as
        Array<IPnpObjectUpdate?>).castToImpl<IPnpObjectUpdate,IPnpObjectUpdate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPnpObjectUpdate?> =
        arrayOfNulls<IPnpObjectUpdate_Impl>(size) as Array<IPnpObjectUpdate?>
  }
}
