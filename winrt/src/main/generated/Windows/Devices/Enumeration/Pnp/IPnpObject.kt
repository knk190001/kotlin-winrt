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

@ABIMarker(IPnpObject.ABI::class)
@Signature("{95c66258-733b-4a8f-93a3-db078ac870c1}")
@Guid("95c66258733b4a8f93a3db078ac870c1")
@WinRTInterface("95c66258733b4a8f93a3db078ac870c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPnpObject.ByReference::class)
public interface IPnpObject : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): PnpObjectType?

  @InterfaceMethod(1)
  public fun get_Id(): String?

  @InterfaceMethod(2)
  public fun get_Properties(): IMapView<String?, IUnknown?>?

  @InterfaceMethod(3)
  public fun Update(updateInfo: PnpObjectUpdate?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPnpObject> {
    public override fun getValue() = ABI.makeIPnpObject(pointer.getPointer(0))

    public fun setValue(value: IPnpObject_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPnpObject {
    public val __1692552983_Ptr: Pointer?

    public val _1692552983_VtblPtr: Pointer?
      get() = __1692552983_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): PnpObjectType? {
      val fnPtr = _1692552983_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PnpObjectType>()
      val hr = fn.invokeHR(arrayOf(__1692552983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PnpObjectType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Id(): String? {
      val fnPtr = _1692552983_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1692552983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Properties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _1692552983_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1692552983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Update(updateInfo: PnpObjectUpdate?): Unit {
      val fnPtr = _1692552983_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1692552983_Ptr, marshalToNative(updateInfo),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPnpObject_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1692552983_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPnpObject, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95c66258733b4a8f93a3db078ac870c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPnpObject(ptr: Pointer?): WithDefault = IPnpObject_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPnpObject {
      val address = segment.toRawLongValue()
      return makeIPnpObject(Pointer(address))
    }

    public override fun toNative(obj: IPnpObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1692552983_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPnpObject): Array<IPnpObject?> = (elements as
        Array<IPnpObject?>).castToImpl<IPnpObject,IPnpObject_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPnpObject?> = arrayOfNulls<IPnpObject_Impl>(size)
        as Array<IPnpObject?>
  }
}
