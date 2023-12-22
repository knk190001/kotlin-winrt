package Windows.Devices.Input

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Rect
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPointerDevice.ABI::class)
@Signature("{93c9bafc-ebcb-467e-82c6-276feae36b5a}")
@Guid("93c9bafcebcb467e82c6276feae36b5a")
@WinRTInterface("93c9bafcebcb467e82c6276feae36b5a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointerDevice.ByReference::class)
public interface IPointerDevice : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PointerDeviceType(): PointerDeviceType?

  @InterfaceMethod(1)
  public fun get_IsIntegrated(): Boolean

  @InterfaceMethod(2)
  public fun get_MaxContacts(): WinDef.UINT

  @InterfaceMethod(3)
  public fun get_PhysicalDeviceRect(): Rect?

  @InterfaceMethod(4)
  public fun get_ScreenRect(): Rect?

  @InterfaceMethod(5)
  public fun get_SupportedUsages(): IVectorView<PointerDeviceUsage?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPointerDevice>
      {
    public override fun getValue() = ABI.makeIPointerDevice(pointer.getPointer(0))

    public fun setValue(value: IPointerDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointerDevice {
    public val __2059780200_Ptr: Pointer?

    public val _2059780200_VtblPtr: Pointer?
      get() = __2059780200_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PointerDeviceType(): PointerDeviceType? {
      val fnPtr = _2059780200_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PointerDeviceType>()
      val hr = fn.invokeHR(arrayOf(__2059780200_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PointerDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsIntegrated(): Boolean {
      val fnPtr = _2059780200_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2059780200_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MaxContacts(): WinDef.UINT {
      val fnPtr = _2059780200_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2059780200_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_PhysicalDeviceRect(): Rect? {
      val fnPtr = _2059780200_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__2059780200_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ScreenRect(): Rect? {
      val fnPtr = _2059780200_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__2059780200_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SupportedUsages(): IVectorView<PointerDeviceUsage?>? {
      val fnPtr = _2059780200_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<PointerDeviceUsage?>>()
      val hr = fn.invokeHR(arrayOf(__2059780200_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<PointerDeviceUsage?>>(result.getValue())
      return resultValue
    }
  }

  public class IPointerDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2059780200_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointerDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("93c9bafcebcb467e82c6276feae36b5a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointerDevice(ptr: Pointer?): WithDefault = IPointerDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointerDevice {
      val address = segment.toRawLongValue()
      return makeIPointerDevice(Pointer(address))
    }

    public override fun toNative(obj: IPointerDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2059780200_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointerDevice): Array<IPointerDevice?> = (elements as
        Array<IPointerDevice?>).castToImpl<IPointerDevice,IPointerDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointerDevice?> =
        arrayOfNulls<IPointerDevice_Impl>(size) as Array<IPointerDevice?>
  }
}
