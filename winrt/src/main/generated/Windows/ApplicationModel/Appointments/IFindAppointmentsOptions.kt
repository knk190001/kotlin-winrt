package Windows.ApplicationModel.Appointments

import Windows.Foundation.Collections.IVector
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFindAppointmentsOptions.ABI::class)
@Signature("{55f7dc55-9942-3086-82b5-2cb29f64d5f5}")
@Guid("55f7dc559942308682b52cb29f64d5f5")
@WinRTInterface("55f7dc559942308682b52cb29f64d5f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFindAppointmentsOptions.ByReference::class)
public interface IFindAppointmentsOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CalendarIds(): IVector<String?>?

  @InterfaceMethod(1)
  public fun get_FetchProperties(): IVector<String?>?

  @InterfaceMethod(2)
  public fun get_IncludeHidden(): Boolean

  @InterfaceMethod(3)
  public fun put_IncludeHidden(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_MaxCount(): WinDef.UINT

  @InterfaceMethod(5)
  public fun put_MaxCount(value: WinDef.UINT): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFindAppointmentsOptions> {
    public override fun getValue() = ABI.makeIFindAppointmentsOptions(pointer.getPointer(0))

    public fun setValue(value: IFindAppointmentsOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFindAppointmentsOptions {
    public val __1128729914_Ptr: Pointer?

    public val _1128729914_VtblPtr: Pointer?
      get() = __1128729914_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CalendarIds(): IVector<String?>? {
      val fnPtr = _1128729914_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1128729914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FetchProperties(): IVector<String?>? {
      val fnPtr = _1128729914_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1128729914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IncludeHidden(): Boolean {
      val fnPtr = _1128729914_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1128729914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IncludeHidden(value: Boolean): Unit {
      val fnPtr = _1128729914_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1128729914_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MaxCount(): WinDef.UINT {
      val fnPtr = _1128729914_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1128729914_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MaxCount(value: WinDef.UINT): Unit {
      val fnPtr = _1128729914_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1128729914_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFindAppointmentsOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1128729914_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFindAppointmentsOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("55f7dc559942308682b52cb29f64d5f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFindAppointmentsOptions(ptr: Pointer?): WithDefault =
        IFindAppointmentsOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFindAppointmentsOptions {
      val address = segment.toRawLongValue()
      return makeIFindAppointmentsOptions(Pointer(address))
    }

    public override fun toNative(obj: IFindAppointmentsOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1128729914_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFindAppointmentsOptions):
        Array<IFindAppointmentsOptions?> = (elements as
        Array<IFindAppointmentsOptions?>).castToImpl<IFindAppointmentsOptions,IFindAppointmentsOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFindAppointmentsOptions?> =
        arrayOfNulls<IFindAppointmentsOptions_Impl>(size) as Array<IFindAppointmentsOptions?>
  }
}
